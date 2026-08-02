package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.relay.queue.api.commands.StartRelayQueueCommand;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.text.c;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.CardPlaybackScope;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes4.dex */
public final class dxl implements uyp, x2r, nwu, bmw, tqj {
    public static PlaybackScope a(Intent intent, cvl cvlVar) {
        intent.getClass();
        cvlVar.getClass();
        if ("414787002:1076".equals(cvlVar.e())) {
            return d.h(cvlVar);
        }
        PlaybackScope u = d.u(cvlVar);
        int i = np2.u;
        return sj2.w(intent, u);
    }

    public static g3s b(ByteArrayInputStream byteArrayInputStream) {
        byte[] bArr;
        if (byteArrayInputStream.available() < 2) {
            throw new my1(k5r.i(byteArrayInputStream.available(), "Error parsing data. Available bytes < 2 . Length="));
        }
        byteArrayInputStream.mark(0);
        int read = byteArrayInputStream.read();
        while (true) {
            byte b = (byte) read;
            if (read == -1 || !(b == -1 || b == 0)) {
                break;
            }
            byteArrayInputStream.mark(0);
            read = byteArrayInputStream.read();
        }
        byteArrayInputStream.reset();
        if (byteArrayInputStream.available() < 2) {
            throw new my1(k5r.i(byteArrayInputStream.available(), "Error parsing data. Available bytes < 2 . Length="));
        }
        byte[] k = k(byteArrayInputStream);
        byteArrayInputStream.mark(0);
        int available = byteArrayInputStream.available();
        int l = l(byteArrayInputStream);
        int available2 = byteArrayInputStream.available();
        byteArrayInputStream.reset();
        int i = available - available2;
        byte[] bArr2 = new byte[i];
        int i2 = 1;
        if (i < 1 || i > 4) {
            throw new my1(k5r.i(i, "Number of length bytes must be from 1 to 4. Found "));
        }
        byteArrayInputStream.read(bArr2, 0, i);
        int D = quj.D(bArr2);
        k6j m = m(k);
        if (D == 128) {
            byteArrayInputStream.mark(0);
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int read2 = byteArrayInputStream.read();
                if (read2 < 0) {
                    throw new my1(k5r.i(byteArrayInputStream.available(), "Error parsing data. TagAndLengthValue length byte indicated indefinite length, but EOS was reached before 0x0000 was found"));
                }
                if (i2 == 0 && read2 == 0) {
                    l = i3 - 1;
                    bArr = new byte[l];
                    byteArrayInputStream.reset();
                    byteArrayInputStream.read(bArr, 0, l);
                    break;
                }
                i3 = i4;
                i2 = read2;
            }
        } else {
            if (byteArrayInputStream.available() < l) {
                throw new my1(su4.o(dfi.l("Length byte(s) indicated ", l, byteArrayInputStream.available(), " value bytes, but only ", StringUtil.SPACE), byteArrayInputStream.available() > 1 ? "are" : "is", " available"));
            }
            bArr = new byte[l];
            byteArrayInputStream.read(bArr, 0, l);
        }
        byteArrayInputStream.mark(0);
        int read3 = byteArrayInputStream.read();
        while (true) {
            byte b2 = (byte) read3;
            if (read3 == -1 || !(b2 == -1 || b2 == 0)) {
                break;
            }
            byteArrayInputStream.mark(0);
            read3 = byteArrayInputStream.read();
        }
        byteArrayInputStream.reset();
        return new g3s(m, l, bArr2, bArr);
    }

    public static byte[] c(byte[] bArr, k6j... k6jVarArr) {
        int i;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] bArr2 = null;
        while (byteArrayInputStream.available() > 0) {
            g3s b = b(byteArrayInputStream);
            byte[] bArr3 = b.d;
            k6j k6jVar = b.a;
            if (k6j[].class.getComponentType().isInstance(k6jVar)) {
                i = 0;
                while (i < k6jVarArr.length) {
                    if (k6jVar.equals(k6jVarArr[i])) {
                        break;
                    }
                    i++;
                }
            }
            i = -1;
            if (!(i != -1)) {
                if ((k6jVar.e == a4s.b) && (bArr2 = c(bArr3, (k6j[]) Arrays.copyOf(k6jVarArr, k6jVarArr.length))) != null) {
                    break;
                }
            } else {
                return bArr3;
            }
        }
        return bArr2;
    }

    public static ArrayList e(byte[] bArr, k6j... k6jVarArr) {
        int i;
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (byteArrayInputStream.available() > 0) {
            g3s b = b(byteArrayInputStream);
            k6j k6jVar = b.a;
            if (k6j[].class.getComponentType().isInstance(k6jVar)) {
                i = 0;
                while (i < k6jVarArr.length) {
                    if (k6jVar.equals(k6jVarArr[i])) {
                        break;
                    }
                    i++;
                }
            }
            i = -1;
            if (i != -1) {
                arrayList.add(b);
            } else {
                if (k6jVar.e == a4s.b) {
                    arrayList.addAll(e(b.d, (k6j[]) Arrays.copyOf(k6jVarArr, k6jVarArr.length)));
                }
            }
        }
        return arrayList;
    }

    public static Intent f(Context context, cvl cvlVar, boolean z, String str, oxl oxlVar, PlaybackScope playbackScope) {
        lxl gxlVar;
        context.getClass();
        cvlVar.getClass();
        String t = ouj.t(op7.c(cvlVar).a);
        String str2 = cvlVar.a;
        long j = cvlVar.k;
        str2.getClass();
        if (str2.length() == 0 || c.v(str2, "FAKE_ID_", false)) {
            if (j == -1) {
                su4.s(2, null, "Can't open playlist " + cvlVar, null);
            }
            gxlVar = new gxl(j);
        } else {
            gxlVar = new jxl(cvlVar.c.a, str2);
        }
        return g(context, gxlVar, new aud(t), playbackScope, z, str, oxlVar);
    }

    public static Intent g(Context context, lxl lxlVar, dud dudVar, PlaybackScope playbackScope, boolean z, String str, oxl oxlVar) {
        context.getClass();
        oxlVar.getClass();
        Intent putExtra = new Intent(context, (Class<?>) PlaylistScreenActivity.class).putExtra("extra.playlist.navigate.from.global.playlists", z).putExtra("extra.playlist.id.arg", lxlVar).putExtra("extra.promo.info", str).putExtra("extra.screen.mode", oxlVar).putExtra("extra.playbackScope", playbackScope).putExtra("extra.playlist.cover.bg", dudVar);
        putExtra.getClass();
        return putExtra;
    }

    public static Intent h(Context context, eul eulVar, PlaybackScope playbackScope) {
        int i = PlaylistScreenActivity.B0;
        context.getClass();
        eulVar.getClass();
        return g(context, new jxl(eulVar.a, eulVar.b), hdg.k0(eulVar.d), playbackScope, false, null, nxl.a);
    }

    public static /* synthetic */ Intent i(Context context, cvl cvlVar, CardPlaybackScope cardPlaybackScope, int i) {
        boolean z = (i & 4) == 0;
        if ((i & 32) != 0) {
            cardPlaybackScope = null;
        }
        return f(context, cvlVar, z, null, nxl.a, cardPlaybackScope);
    }

    public static /* synthetic */ Intent j(Context context, lxl lxlVar, dud dudVar, PlaybackScope playbackScope, oxl oxlVar, int i) {
        if ((i & 64) != 0) {
            oxlVar = nxl.a;
        }
        return g(context, lxlVar, dudVar, playbackScope, false, null, oxlVar);
    }

    public static byte[] k(ByteArrayInputStream byteArrayInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte read = (byte) byteArrayInputStream.read();
        byteArrayOutputStream.write(read);
        if ((read & 31) == 31) {
            while (true) {
                int read2 = byteArrayInputStream.read();
                if (read2 >= 0) {
                    byte b = (byte) read2;
                    byteArrayOutputStream.write(b);
                    if (!quj.Z(b) || (quj.Z(b) && (b & Byte.MAX_VALUE) == 0)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static int l(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read();
        if (read < 0) {
            throw new my1(k5r.i(read, "Negative length: "));
        }
        if (read <= 127 || read == 128) {
            return read;
        }
        int i = read & 127;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int read2 = byteArrayInputStream.read();
            if (read2 < 0) {
                throw new my1("EOS when reading length bytes");
            }
            i2 = (i2 << 8) | read2;
        }
        return i2;
    }

    public static k6j m(byte[] bArr) {
        LinkedHashMap linkedHashMap = t5b.a;
        bArr.getClass();
        k6j k6jVar = (k6j) t5b.a.get(new jm3(bArr));
        return k6jVar == null ? new k6j(bArr, d4s.a, "[UNKNOWN TAG]") : k6jVar;
    }

    @Override // defpackage.uyp
    public Object A(StartRelayQueueCommand startRelayQueueCommand) {
        startRelayQueueCommand.getClass();
        throw new uej("not used in relay");
    }

    @Override // defpackage.uyp
    public Object C(StartGenerativeQueueCommand startGenerativeQueueCommand) {
        startGenerativeQueueCommand.getClass();
        return startGenerativeQueueCommand.getOnError();
    }

    @Override // defpackage.uyp
    public Object I(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand) {
        startVideoClipRadioQueueCommand.getClass();
        return startVideoClipRadioQueueCommand.getOnError();
    }

    @Override // defpackage.bmw
    public void onError(Throwable th) {
        th.getClass();
        v3w.l("Error on launch queue: ", th.getMessage(), 5, "YnisonLocalRestoreImpl", null);
    }

    @Override // defpackage.tqj
    public void onSuccess(Object obj) {
        lsq.H((Bundle) obj, "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES");
    }

    @Override // defpackage.uyp
    public Object p(StartYnisonQueueCommand startYnisonQueueCommand) {
        startYnisonQueueCommand.getClass();
        return startYnisonQueueCommand.getOnError();
    }

    @Override // defpackage.uyp
    public Object v(StartFmRadioQueueCommand startFmRadioQueueCommand) {
        startFmRadioQueueCommand.getClass();
        return startFmRadioQueueCommand.a();
    }

    @Override // defpackage.uyp
    public Object x(StartWaveQueueCommand startWaveQueueCommand) {
        startWaveQueueCommand.getClass();
        return startWaveQueueCommand.getOnError();
    }

    @Override // defpackage.nwu
    public void d() {
    }

    @Override // defpackage.nwu
    public void O(boolean z) {
    }
}
