package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.util.Log;
import android.view.KeyEvent;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.m;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.domain.entities.PartnerWithActionEntity;
import defpackage.awk0;
import defpackage.g131;
import defpackage.sls;
import defpackage.v2w;
import defpackage.zy11;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class q791 {
    public static final f530 a(f530 f530Var, zx40 zx40Var, jrv jrvVar, boolean z, String str, awk0 awk0Var, sls slsVar) {
        f530 k;
        if (jrvVar instanceof prv) {
            k = new s1c(zx40Var, (prv) jrvVar, false, z, str, awk0Var, slsVar);
        } else if (jrvVar == null) {
            k = new s1c(zx40Var, null, false, z, str, awk0Var, slsVar);
        } else {
            c530 c530Var = c530.a;
            k = zx40Var != null ? lrv.a(c530Var, zx40Var, jrvVar).k(new s1c(zx40Var, null, false, z, str, awk0Var, slsVar)) : b.a(c530Var, m.a(), new y1c(jrvVar, z, str, awk0Var, slsVar));
        }
        return f530Var.k(k);
    }

    public static /* synthetic */ f530 b(f530 f530Var, zx40 zx40Var, jrv jrvVar, boolean z, String str, awk0 awk0Var, sls slsVar, int i) {
        awk0 awk0Var2;
        f530 f530Var2;
        zx40 zx40Var2;
        jrv jrvVar2;
        sls slsVar2;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        String str2 = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            awk0Var2 = null;
            zx40Var2 = zx40Var;
            jrvVar2 = jrvVar;
            slsVar2 = slsVar;
            f530Var2 = f530Var;
        } else {
            awk0Var2 = awk0Var;
            f530Var2 = f530Var;
            zx40Var2 = zx40Var;
            jrvVar2 = jrvVar;
            slsVar2 = slsVar;
        }
        return a(f530Var2, zx40Var2, jrvVar2, z2, str2, awk0Var2, slsVar2);
    }

    public static f530 c(f530 f530Var, final sls slsVar) {
        return b.a(f530Var, m.b ? new tls() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
            final /* synthetic */ boolean $enabled$inlined = true;
            final /* synthetic */ String $onClickLabel$inlined = null;
            final /* synthetic */ awk0 $role$inlined = null;

            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                g131Var.b(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(this.$enabled$inlined));
                g131Var.b("onClickLabel", this.$onClickLabel$inlined);
                g131Var.b("role", this.$role$inlined);
                g131Var.b("onClick", sls.this);
                return zy11.a;
            }
        } : m.a(), new wu40(2, slsVar));
    }

    public static f530 d(f530 f530Var, boolean z, String str, awk0 awk0Var, sls slsVar, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return f530Var.k(new s1c(null, null, true, z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : awk0Var, slsVar));
    }

    public static final f530 e(f530 f530Var, zx40 zx40Var, jrv jrvVar, awk0 awk0Var, String str, sls slsVar, sls slsVar2, sls slsVar3) {
        f530 k;
        if (jrvVar instanceof prv) {
            k = new wic(zx40Var, (prv) jrvVar, false, true, awk0Var, slsVar3, str, slsVar, slsVar2);
        } else if (jrvVar == null) {
            k = new wic(zx40Var, null, false, true, awk0Var, slsVar3, str, slsVar, slsVar2);
        } else {
            c530 c530Var = c530.a;
            k = zx40Var != null ? lrv.a(c530Var, zx40Var, jrvVar).k(new wic(zx40Var, null, false, true, awk0Var, slsVar3, str, slsVar, slsVar2)) : b.a(c530Var, m.a(), new z1c(jrvVar, awk0Var, slsVar3, str, slsVar, slsVar2));
        }
        return f530Var.k(k);
    }

    public static /* synthetic */ f530 f(f530 f530Var, zx40 zx40Var, awk0 awk0Var, String str, sls slsVar, sls slsVar2, sls slsVar3, int i) {
        if ((i & 16) != 0) {
            awk0Var = null;
        }
        if ((i & 32) != 0) {
            str = null;
        }
        if ((i & 64) != 0) {
            slsVar = null;
        }
        if ((i & 128) != 0) {
            slsVar2 = null;
        }
        return e(f530Var, zx40Var, null, awk0Var, str, slsVar, slsVar2, slsVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static syr g(Context context) {
        ProviderInfo providerInfo;
        pyr pyrVar;
        ApplicationInfo applicationInfo;
        new xah();
        PackageManager packageManager = context.getPackageManager();
        d6z.v(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                pyrVar = new pyr(str, str2, "emojicompat-emoji-font", null, null, Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
            if (pyrVar != null) {
                return null;
            }
            return new syr(context, pyrVar);
        }
        pyrVar = null;
        if (pyrVar != null) {
        }
    }

    public static String i(int i, int i2, ByteBuffer byteBuffer) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (b2 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                int i8 = i6;
                while (i8 < i3) {
                    byte b3 = byteBuffer.get(i8);
                    if (b3 < 0) {
                        break;
                    }
                    i8++;
                    cArr[i7] = (char) b3;
                    i7++;
                }
                i5 = i7;
                i = i8;
            } else if (o791.e(b2)) {
                if (i6 >= i3) {
                    throw InvalidProtocolBufferException.f();
                }
                i += 2;
                o791.f(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (o791.g(b2)) {
                if (i6 >= i3 - 1) {
                    throw InvalidProtocolBufferException.f();
                }
                int i9 = i + 2;
                i += 3;
                o791.h(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.f();
                }
                byte b4 = byteBuffer.get(i6);
                int i10 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                o791.b(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static final boolean l(KeyEvent keyEvent) {
        long c = c9y.c(keyEvent);
        int i = mhx.O;
        return mhx.a(c, mhx.h) || mhx.a(c, mhx.r) || mhx.a(c, mhx.E) || mhx.a(c, mhx.q);
    }

    public static final ti90 n(PartnerWithActionEntity partnerWithActionEntity) {
        return new ti90(partnerWithActionEntity.getTitle(), partnerWithActionEntity.getDescription(), partnerWithActionEntity.getThemedImage(), partnerWithActionEntity.getAction());
    }

    public abstract String h(int i, int i2, byte[] bArr);

    public abstract String j(int i, int i2, ByteBuffer byteBuffer);

    public abstract int k(int i, int i2, String str, byte[] bArr);

    public abstract int m(int i, int i2, byte[] bArr);
}
