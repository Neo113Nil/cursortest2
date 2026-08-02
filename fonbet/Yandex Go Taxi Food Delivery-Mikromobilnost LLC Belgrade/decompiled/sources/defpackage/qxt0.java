package defpackage;

import android.util.Base64;
import androidx.media3.exoplayer.smoothstreaming.manifest.a;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class qxt0 extends a {
    public boolean e;
    public UUID f;
    public byte[] g;

    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final Object b() {
        UUID uuid = this.f;
        byte[] c = vaa1.c(uuid, null, this.g);
        byte[] bArr = this.g;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        byte b = decode[0];
        decode[0] = decode[3];
        decode[3] = b;
        byte b2 = decode[1];
        decode[1] = decode[2];
        decode[2] = b2;
        byte b3 = decode[4];
        decode[4] = decode[5];
        decode[5] = b3;
        byte b4 = decode[6];
        decode[6] = decode[7];
        decode[7] = b4;
        return new nxt0(uuid, c, new vzz0[]{new vzz0(true, null, 8, decode, 0, 0, null)});
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.e = false;
        }
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final void j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && g8e.a(1, attributeValue) == '}') {
                attributeValue = oyr.g(1, 1, attributeValue);
            }
            this.f = UUID.fromString(attributeValue);
        }
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final void k(XmlPullParser xmlPullParser) {
        if (this.e) {
            this.g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
