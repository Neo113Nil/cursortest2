package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Base64;
import android.view.View;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.g;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import androidx.camera.core.j;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.yandex.payment.divkit.bind.b;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.payment.sdk.core.data.SbpChallengeResultInfo$SbpChallengeStatus;
import com.yandex.runtime.image.ImageProvider;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.a;
import ru.yandex.taxi.delivery.analytics.DeliveryAddressCorrectionAnalytics$FieldType;
import ru.yandex.taxi.web.view.WebProgressViewHolder$LayoutType;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes2.dex */
public final class zgf implements ryj0, fbr, hno, adh, qi51, xi51, lj41, kdi {
    public final /* synthetic */ int a;
    public final Object b;

    public zgf(Context context, int i) {
        this.a = i;
        switch (i) {
            case 23:
                this.b = new CircularProgressBar(context, null, 0, 6, null);
                break;
            default:
                this.b = new ImageProvider[]{ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_1), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_2), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_3), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_4), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_5), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_6), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_7), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_8), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_9), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_10), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_11), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_12), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_13), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_14), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_15), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_16), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_17), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_18), ImageProvider.fromResource(context, d0h0.sharing_loaction_circle_19)};
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (r6 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        return new defpackage.emp(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r3 == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static emp g(b3u b3uVar, List list) {
        boolean z;
        String useCaseType;
        List<j> list2 = list;
        boolean z2 = list2 instanceof Collection;
        boolean z3 = false;
        if (!z2 || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((j) it.next()) instanceof w8v) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z2 || !list2.isEmpty()) {
            for (j jVar : list2) {
                if ((jVar instanceof g) || qt7.C(jVar)) {
                    z3 = true;
                    break;
                }
            }
        }
        int i = mbh.a[b3uVar.a().ordinal()];
        if (i == 1) {
            useCaseType = UseCaseType.IMAGE_CAPTURE.toString();
        } else {
            if (i != 2 && i != 3 && i != 4) {
                w511.b();
                return null;
            }
            useCaseType = UseCaseType.PREVIEW + " or " + UseCaseType.VIDEO_CAPTURE;
        }
    }

    public long a() {
        int i = ldc.n;
        long readLong = ((Parcel) this.b).readLong();
        long j = 63 & readLong;
        return j < 16 ? readLong : (readLong & (-64)) | (j + 1);
    }

    @Override // defpackage.adh
    public int b(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.b).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        return i2;
    }

    @Override // defpackage.adh
    public int c() {
        return d() | (d() << 8);
    }

    @Override // defpackage.adh
    public short d() {
        int read = ((InputStream) this.b).read();
        if (read != -1) {
            return (short) read;
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    public long e() {
        Parcel parcel = (Parcel) this.b;
        byte readByte = parcel.readByte();
        long j = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        return tty0.a(j, 0L) ? sty0.c : uh6.K(parcel.readFloat(), j);
    }

    public fmp f(pbj pbjVar, ArrayList arrayList, int i, List list) {
        if (i < arrayList.size()) {
            int i2 = i + 1;
            fmp f = f(pbjVar, arrayList, i2, a.o0(list, arrayList.get(i)));
            return f instanceof bmp ? f : f(pbjVar, arrayList, i2, list);
        }
        LinkedHashSet h = v4r0.h((Set) pbjVar.y, list);
        h.toString();
        Objects.toString((List) pbjVar.A);
        sgb1.g(3, "DefaultFeatureGroupResolver");
        ar7 ar7Var = (ar7) this.b;
        int i3 = 1;
        ddf ddfVar = new ddf(i3, h);
        Iterator it = h.iterator();
        while (true) {
            if (!it.hasNext()) {
                try {
                    wp81.d(ar7Var, pbjVar, ddfVar);
                    return new bmp(new ddf(i3, h));
                } catch (CameraUseCaseAdapter$CameraException | IllegalArgumentException unused) {
                    sgb1.g(3, "CameraInfoInternal");
                    return cmp.a;
                }
            }
            b3u b3uVar = (b3u) it.next();
            if (!b3uVar.b(ar7Var, pbjVar)) {
                b3uVar.toString();
                sgb1.g(3, "CameraInfoInternal");
                break;
            }
        }
    }

    @Override // defpackage.lj41
    public WebProgressViewHolder$LayoutType getLayoutType() {
        return WebProgressViewHolder$LayoutType.WRAP_CONTENT;
    }

    @Override // defpackage.lj41
    public View getView() {
        return (CircularProgressBar) this.b;
    }

    public ijj0 h() {
        w3i w3iVar = (w3i) this.b;
        com.yandex.go.taxi.tariffs.repository.g gVar = (com.yandex.go.taxi.tariffs.repository.g) w3iVar.x;
        q5z.h(gVar);
        cq40 cq40Var = (cq40) w3iVar.y;
        q5z.h(cq40Var);
        rqo rqoVar = (rqo) w3iVar.B;
        q5z.h(rqoVar);
        return new ijj0(gVar, cq40Var, new hct(new dxf0(new gmx0(rqoVar))));
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        int i = this.a;
        kl41 kl41Var = kl41.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                zbq0 zbq0Var = (zbq0) ((raq0) obj2);
                zbq0Var.f();
                zbq0Var.q((PaymentKitError) obj);
                break;
            case 2:
                b bVar = (b) obj2;
                bVar.B.m(kl41Var);
                bVar.C.m(new in8((PaymentKitError) obj));
                new Handler(Looper.getMainLooper()).postDelayed(new uz(23, bVar), 1500L);
                break;
            case 3:
                ((psf) obj2).y.m(new lsf((PaymentKitError) obj));
                break;
            default:
                kvf kvfVar = (kvf) obj2;
                kvfVar.N.l(kl41Var);
                kvfVar.L.l(new in8((PaymentKitError) obj));
                break;
        }
    }

    public void j(DeliveryAddressCorrectionAnalytics$FieldType deliveryAddressCorrectionAnalytics$FieldType) {
        pj pjVar = (pj) this.b;
        String analyticsName = deliveryAddressCorrectionAnalytics$FieldType.getAnalyticsName();
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("field", analyticsName);
        }
        pjVar.a.a("CopypastApprovalCard.AddressDetailsEditorField", hashMap, 1, new HashMap());
    }

    public void k(Object obj) {
        ((vqh) this.b).k(obj);
    }

    public void l(Exception exc) {
        ((vqh) this.b).l(exc);
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        ksf ksfVar;
        int i = this.a;
        kl41 kl41Var = kl41.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                zbq0 zbq0Var = (zbq0) ((raq0) obj2);
                zbq0Var.f();
                zbq0Var.r(zbq0Var.J().a);
                break;
            case 2:
                b bVar = (b) obj2;
                bVar.C.m(new ln8((BoundCard) obj));
                bVar.B.m(kl41Var);
                new Handler(Looper.getMainLooper()).postDelayed(new uz(23, bVar), 1500L);
                break;
            case 3:
                ffm0 ffm0Var = (ffm0) obj;
                psf psfVar = (psf) obj2;
                g99 g99Var = psfVar.w;
                rwo rwoVar = psfVar.c;
                dy40 dy40Var = psfVar.y;
                SbpChallengeResultInfo$SbpChallengeStatus sbpChallengeResultInfo$SbpChallengeStatus = ffm0Var.a;
                if (ffm0Var.b == 0 && !sbpChallengeResultInfo$SbpChallengeStatus.a()) {
                    sv90 sv90Var = qv90.a;
                    String W = psfVar.W();
                    sv90Var.getClass();
                    ((y22) rwoVar).a(sv90.h0(W));
                    g99Var.getClass();
                    dy40Var.m(new msf(ryh0.paymentsdk_challenger_payment_error_title, ryh0.paymentsdk_challenger_no_attempts_error_desc));
                    break;
                } else {
                    sv90 sv90Var2 = qv90.a;
                    boolean a = sbpChallengeResultInfo$SbpChallengeStatus.a();
                    String W2 = psfVar.W();
                    sv90Var2.getClass();
                    ((y22) rwoVar).a(sv90.k0(W2, a));
                    psfVar.E.m(sbpChallengeResultInfo$SbpChallengeStatus);
                    if (!sbpChallengeResultInfo$SbpChallengeStatus.a()) {
                        SbpChallengeInfo sbpChallengeInfo = psfVar.C;
                        if (n891.o(sbpChallengeInfo != null ? Boolean.valueOf(sbpChallengeInfo.isSmsChallenge()) : null)) {
                            g99Var.getClass();
                            ksfVar = new ksf(ryh0.paymentsdk_challenger_wrong_sms);
                        } else {
                            g99Var.getClass();
                            ksfVar = new ksf(ryh0.paymentsdk_challenger_wrong_amount);
                        }
                        dy40Var.m(ksfVar);
                        break;
                    } else {
                        dy40Var.m(nsf.a);
                        break;
                    }
                }
                break;
            default:
                avv avvVar = (avv) obj;
                kvf kvfVar = (kvf) obj2;
                zuv zuvVar = avvVar.d;
                kvfVar.z = zuvVar.a;
                kvfVar.A = avvVar.a;
                kvfVar.B = avvVar.b;
                kvfVar.N.l(kl41Var);
                kvfVar.L.l(kn8.a);
                if (zuvVar.c) {
                    jly jlyVar = avvVar.c;
                    rf8 rf8Var = new rf8(jlyVar.c, jlyVar.b, jlyVar.a);
                    fvf fvfVar = kvfVar.D;
                    if (fvfVar != null) {
                        fvfVar.invoke(rf8Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.adh
    public long skip(long j) {
        InputStream inputStream = (InputStream) this.b;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j - j2;
    }

    public /* synthetic */ zgf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ zgf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public zgf(String str) {
        this.a = 14;
        Parcel obtain = Parcel.obtain();
        this.b = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }
}
