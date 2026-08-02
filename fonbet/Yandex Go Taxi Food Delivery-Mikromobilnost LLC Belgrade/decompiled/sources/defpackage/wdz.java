package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import com.yandex.messaging.base.rights.OrganizationRightsFlag;
import java.util.Collections;
import java.util.Set;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.ByteString;

/* loaded from: classes10.dex */
public class wdz implements w7p, nf00, g2e0, n7j0, ml31, z78, muy {
    public wdz(vse vseVar) {
        vseVar.c(false);
        vseVar.a.getClass();
    }

    public static final String b(ByteString byteString, ByteString[] byteStringArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        ByteString byteString2 = PublicSuffixDatabase.b;
        int h = byteString.h();
        int i5 = 0;
        while (i5 < h) {
            int i6 = (i5 + h) / 2;
            while (i6 > -1 && byteString.m(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (byteString.m(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte m = byteStringArr[i10].m(i11);
                    byte[] bArr = yf61.a;
                    int i13 = m & 255;
                    z = z2;
                    i3 = i13;
                }
                byte m2 = byteString.m(i7 + i12);
                byte[] bArr2 = yf61.a;
                i4 = i3 - (m2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (byteStringArr[i10].h() != i11) {
                    z2 = z;
                } else {
                    if (i10 == byteStringArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int h2 = byteStringArr[i10].h() - i11;
                    int length = byteStringArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        h2 += byteStringArr[i15].h();
                    }
                    if (h2 >= i14) {
                        if (h2 <= i14) {
                            return byteString.s(i7, i9 + i7).r(uza.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            h = i6;
        }
        return null;
    }

    public static final int d(int i, long j) {
        int i2 = wyz0.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static int h() {
        int i = 0;
        for (by4 by4Var : (by4[]) OrganizationRightsFlag.a().toArray(new OrganizationRightsFlag[0])) {
            i |= 1 << by4Var.getOrdinalValue();
        }
        return i;
    }

    public static long i() {
        return wyz0.a;
    }

    public static long j(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    @Override // defpackage.g2e0
    public long a(int i) {
        return 1000L;
    }

    @Override // defpackage.n7j0
    public Set c() {
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.w7p
    public Object create() {
        return new xdz();
    }

    @Override // defpackage.muy
    public /* synthetic */ void e(Object obj) {
        throw oyr.d(obj);
    }

    @Override // defpackage.nf00
    public Object f(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        return Integer.valueOf(phonemetadata$PhoneMetadata.a());
    }

    @Override // defpackage.ml31
    public void g(MediaExtractor mediaExtractor, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // defpackage.ml31
    public void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    public iv20 l(Uri uri) {
        Uri uri2 = uri == null ? Uri.EMPTY : uri;
        zzs a = m7z.a(uri2, "start-lat", "start-lon");
        zzs a2 = m7z.a(uri2, "end-lat", "end-lon");
        boolean z = true;
        boolean booleanQueryParameter = uri != null ? uri.getBooleanQueryParameter("skip_taxi_main_on_back", true) : true;
        String queryParameter = uri != null ? uri.getQueryParameter("guaranteed_first_offer_type") : null;
        if (!booleanQueryParameter) {
            if (!jl40.l(uri != null ? uri.getQueryParameter("source") : null, "superapp_suggest")) {
                z = false;
            }
        }
        return new iv20(a, a2, queryParameter, z);
    }

    public tpr m() {
        return pvn.a;
    }

    public /* synthetic */ wdz(Object obj) {
    }

    public wdz(int i, boolean z) {
    }

    public wdz(Context context) {
        tje.u(11, context);
    }

    public /* synthetic */ wdz() {
    }
}
