package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.t;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.phonoteka.synchronization.data.PhonotekaSyncApi;
import com.yandex.music.shared.phonoteka.synchronization.data.model.AlbumIdDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedAlbumsBlockValuesDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedAlbumsSyncBlockChecksumDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedAlbumsSyncBlockInfoDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedArtistsBlockValuesDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedArtistsSyncBlockChecksumDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedArtistsSyncBlockInfoDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedPlaylistEntityDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedPlaylistInfoDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedPlaylistRevisionDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedPlaylistsBlockValuesDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedTracksBlockValuesDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedTracksSyncBlockChecksumDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedTracksSyncBlockInfoDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedVideoClipsBlockValuesDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedVideoClipsSyncBlockChecksumDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.LikedVideoClipsSyncBlockInfoDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.OwnPlaylistChecksumDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.OwnPlaylistEntityDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.OwnPlaylistInfoDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.OwnPlaylistRevisionDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.OwnPlaylistsBlockValuesDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.PhonotekaSyncException;
import com.yandex.music.shared.phonoteka.synchronization.data.model.PlaylistIdDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.PreSaveIdDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.PreSavesBlockValuesDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.SyncResponseBlockDto$LikedAlbumsResponseDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.SyncResponseBlockDto$LikedArtistsResponseDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.SyncResponseBlockDto$LikedPlaylistsResponseDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.SyncResponseBlockDto$LikedTracksResponseDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.SyncResponseBlockDto$LikedVideoClipsResponseDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.SyncResponseBlockDto$OwnPlaylistsResponseDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.SyncResponseBlockDto$PreSavesResponseDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.SyncResponseBlockListDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.SyncResponseDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.SyncTrackAvailabilityRequestDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.TrackAvailabilityDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.TracksAvailabilityDto;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import ru.yandex.video.m3.player.RepeatMode$Fixed;

/* loaded from: classes4.dex */
public final class g8c implements s4n, oa7, zxk, ljr, s03, adu, mqo, x7o {
    public Object a;

    public g8c(InputStream inputStream, z98 z98Var) {
        non nonVar = new non(inputStream, z98Var);
        this.a = nonVar;
        nonVar.mark(5242880);
    }

    public static Bundle e(mwk mwkVar, kfj kfjVar) {
        x85 f;
        jzb jzbVar = (jzb) dag.p(mwkVar, b3i.e);
        boolean booleanValue = ((Boolean) dag.p(mwkVar, ehv.d)).booleanValue();
        axk axkVar = (axk) dag.p(mwkVar, aaw.f);
        axkVar.getClass();
        int ordinal = axkVar.ordinal();
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2) {
                b6e.s();
                return null;
            }
            z = false;
        }
        mqs a = mwkVar.a();
        boolean D = a != null ? a4g.D(gys.NonMusicHolder, a) : false;
        qlv qlvVar = (qlv) dag.p(mwkVar, bs4.m);
        mqs a2 = mwkVar.a();
        String str = (a2 == null || (f = a2.f()) == null) ? null : f.a;
        Bundle bundle = new Bundle();
        if (jzbVar != null) {
            bundle.putLong("android.media.IS_EXPLICIT", 1L);
            bundle.putString("com.yandex.music.media.metadata.explicit_type", jzbVar.a);
        }
        bundle.putBoolean("com.yandex.music.media.metadata.seekable", z);
        if (!booleanValue) {
            bundle.putLong("com.yandex.music.media.metadata.duration", kfjVar.f * 1000);
        }
        bundle.putBoolean("com.yandex.music.media.metadata.is_podcast", D);
        bundle.putBoolean("com.yandex.music.media.metadata.dynamic", booleanValue);
        bundle.putBoolean("com.yandex.music.media.metadata.live", booleanValue);
        qlvVar.getClass();
        bundle.putString("com.yandex.music.media.metadata.widget_control_type", qlvVar.name());
        bundle.putString("com.yandex.music.media.metadata.color_palette", str);
        return bundle;
    }

    public static Integer l(iyn iynVar) {
        if (iynVar instanceof fyn) {
            return null;
        }
        if (iynVar instanceof eyn) {
            return 0;
        }
        if (iynVar instanceof RepeatMode$Fixed) {
            return Integer.valueOf(((RepeatMode$Fixed) iynVar).getWatched());
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:365:0x0175, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x02fa  */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m(g8c g8cVar, String str) {
        int i;
        int i2;
        char charAt;
        char c;
        int i3;
        ?? r20;
        int i4;
        long j;
        char c2;
        int i5;
        int i6;
        int i7;
        char c3;
        char c4;
        int i8;
        int i9;
        int i10;
        float[] fArr;
        int i11;
        int i12;
        long j2;
        boolean z;
        long j3;
        int floatToRawIntBits;
        long j4;
        int i13;
        int i14;
        int i15;
        long j5;
        long floatToRawIntBits2;
        char c5;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i16 = 0;
        while (true) {
            i = 32;
            if (i16 >= length || Intrinsics.e(str.charAt(i16), 32) > 0) {
                break;
            }
            i16++;
        }
        while (length > i16 && Intrinsics.e(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i17 = 0;
        while (i16 < length) {
            while (true) {
                i2 = i16 + 1;
                charAt = str.charAt(i16);
                int i18 = charAt | ' ';
                if ((i18 - 122) * (i18 - 97) > 0 || i18 == 101) {
                    if (i2 >= length) {
                        charAt = 0;
                    } else {
                        i16 = i2;
                    }
                }
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i17 = 0;
                    while (true) {
                        if (i2 >= length || Intrinsics.e(str.charAt(i2), i) > 0) {
                            float[] fArr2 = ltg.n;
                            if (i2 == length) {
                                i3 = i;
                                i4 = i17;
                                j4 = (Float.floatToRawIntBits(Float.NaN) & 4294967295L) | (i2 << i);
                                c = charAt;
                                j = 4294967295L;
                                r20 = 1;
                            } else {
                                i3 = i;
                                i4 = i17;
                                char charAt2 = str.charAt(i2);
                                boolean z2 = charAt2 == '-';
                                r20 = 1;
                                r20 = 1;
                                r20 = 1;
                                char c6 = '\n';
                                if (z2) {
                                    i5 = i2 + 1;
                                    if (i5 == length) {
                                        j4 = (i5 << i3) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
                                        c = charAt;
                                        j = 4294967295L;
                                    } else {
                                        j = 4294967295L;
                                        c2 = str.charAt(i5);
                                        if (((char) (c2 - '0')) >= '\n' && c2 != '.') {
                                            j5 = i5 << i3;
                                            floatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                            j4 = j5 | (floatToRawIntBits2 & j);
                                            c = charAt;
                                        }
                                    }
                                } else {
                                    j = 4294967295L;
                                    c2 = charAt2;
                                    i5 = i2;
                                }
                                int length2 = str.length();
                                int i19 = i5;
                                long j6 = 0;
                                while (i19 != length) {
                                    int i20 = c2 - '0';
                                    if (((char) i20) < c6) {
                                        j6 = (j6 * 10) + i20;
                                        i19++;
                                        c2 = i19 < length2 ? str.charAt(i19) : (char) 0;
                                        c6 = '\n';
                                    } else {
                                        i6 = i19 - i5;
                                        if (i19 == length && c2 == '.') {
                                            int i21 = i19 + 1;
                                            i9 = i21;
                                            c3 = 16;
                                            while (true) {
                                                c4 = '0';
                                                if (length - i9 >= 4) {
                                                    i7 = i19;
                                                    int i22 = i9;
                                                    long charAt3 = str.charAt(i9) | (str.charAt(i9 + 1) << 16) | (str.charAt(i22 + 2) << i3) | (str.charAt(i22 + 3) << 48);
                                                    long j7 = charAt3 - 13511005043687472L;
                                                    int i23 = (((charAt3 + 19703549022044230L) | j7) & (-35747867511423104L)) != 0 ? -1 : (int) ((j7 * 281475406208040961L) >>> 48);
                                                    if (i23 >= 0) {
                                                        j6 = (j6 * 10000) + i23;
                                                        i9 = i22 + 4;
                                                        i19 = i7;
                                                    } else {
                                                        i9 = i22;
                                                    }
                                                } else {
                                                    i7 = i19;
                                                }
                                            }
                                            if (i9 < length2) {
                                                c5 = str.charAt(i9);
                                                while (i9 != length) {
                                                    int i24 = c5 - '0';
                                                    if (((char) i24) < '\n') {
                                                        j6 = (j6 * 10) + i24;
                                                        i9++;
                                                        if (i9 < length2) {
                                                            c5 = str.charAt(i9);
                                                        }
                                                    } else {
                                                        i10 = i21 - i9;
                                                        i6 -= i10;
                                                        c2 = c5;
                                                        i8 = i21;
                                                    }
                                                }
                                                i10 = i21 - i9;
                                                i6 -= i10;
                                                c2 = c5;
                                                i8 = i21;
                                            }
                                            c5 = 0;
                                        } else {
                                            i7 = i19;
                                            c3 = 16;
                                            c4 = '0';
                                            i8 = i7;
                                            i9 = i8;
                                            i10 = 0;
                                        }
                                        if (i6 != 0) {
                                            j5 = i9 << i3;
                                            floatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                            j4 = j5 | (floatToRawIntBits2 & j);
                                            c = charAt;
                                        } else {
                                            if ((c2 | ' ') == 101) {
                                                i11 = i9 + 1;
                                                char charAt4 = i11 < length2 ? str.charAt(i11) : (char) 0;
                                                boolean z3 = charAt4 == '-';
                                                fArr = fArr2;
                                                if (z3 || charAt4 == '+') {
                                                    i11 = i9 + 2;
                                                }
                                                char charAt5 = str.charAt(i11);
                                                i12 = 0;
                                                while (true) {
                                                    if (i11 != length) {
                                                        int i25 = charAt5 - '0';
                                                        i15 = i10;
                                                        if (((char) i25) < '\n') {
                                                            if (i12 < 1024) {
                                                                i12 = (i12 * 10) + i25;
                                                            }
                                                            i11++;
                                                            charAt5 = i11 < length2 ? str.charAt(i11) : (char) 0;
                                                            i10 = i15;
                                                        }
                                                    } else {
                                                        i15 = i10;
                                                    }
                                                }
                                                if (z3) {
                                                    i12 = -i12;
                                                }
                                                i10 = i15 + i12;
                                            } else {
                                                fArr = fArr2;
                                                i11 = i9;
                                                i12 = 0;
                                            }
                                            int i26 = 19;
                                            if (i6 > 19) {
                                                char charAt6 = str.charAt(i5);
                                                int i27 = i5;
                                                while (true) {
                                                    if (i11 != length) {
                                                        if (charAt6 == c4 || charAt6 == '.') {
                                                            if (charAt6 == '0') {
                                                                i6--;
                                                            }
                                                            int i28 = i27 + 1;
                                                            charAt6 = i28 < length2 ? str.charAt(i28) : (char) 0;
                                                            i27 = i28;
                                                            i26 = 19;
                                                            c4 = '0';
                                                        } else {
                                                            i26 = 19;
                                                        }
                                                    }
                                                }
                                                if (i6 > i26) {
                                                    char charAt7 = str.charAt(i5);
                                                    long j8 = 0;
                                                    while (true) {
                                                        i13 = i7;
                                                        if (i5 != i13) {
                                                            met metVar = net.b;
                                                            char c7 = charAt7;
                                                            c = charAt;
                                                            if (Long.compare(j8 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                j8 = (j8 * 10) + (c7 - '0');
                                                                i5++;
                                                                charAt7 = i5 < length2 ? str.charAt(i5) : (char) 0;
                                                                i7 = i13;
                                                                charAt = c;
                                                            }
                                                        } else {
                                                            c = charAt;
                                                        }
                                                    }
                                                    met metVar2 = net.b;
                                                    if (Long.compare(j8 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                        i10 = (i13 - i5) + i12;
                                                    } else {
                                                        char charAt8 = str.charAt(i8);
                                                        int i29 = i8;
                                                        while (true) {
                                                            if (i29 != i9) {
                                                                char c8 = charAt8;
                                                                i14 = i29;
                                                                if (Long.compare(j8 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                    j8 = (j8 * 10) + (c8 - '0');
                                                                    i29 = i14 + 1;
                                                                    charAt8 = i29 < length2 ? str.charAt(i29) : (char) 0;
                                                                }
                                                            } else {
                                                                i14 = i29;
                                                            }
                                                        }
                                                        i10 = (i8 - i14) + i12;
                                                    }
                                                    z = true;
                                                    j2 = j8;
                                                    if (-10 <= i10 && i10 < 11 && !z) {
                                                        met metVar3 = net.b;
                                                        if (Long.compare(j2 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
                                                            float f = j2;
                                                            float f2 = i10 < 0 ? f / fArr[-i10] : f * fArr[i10];
                                                            if (z2) {
                                                                f2 = -f2;
                                                            }
                                                            j3 = i11 << i3;
                                                            floatToRawIntBits = Float.floatToRawIntBits(f2);
                                                            j4 = j3 | (floatToRawIntBits & j);
                                                        }
                                                    }
                                                    if (j2 != 0) {
                                                        j3 = i11 << i3;
                                                        floatToRawIntBits = Float.floatToRawIntBits(z2 ? -0.0f : 0.0f);
                                                    } else if (-126 > i10 || i10 >= 128) {
                                                        j3 = i11 << i3;
                                                        floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i11)));
                                                    } else {
                                                        long j9 = ltg.o[i10 + 325];
                                                        met metVar4 = net.b;
                                                        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
                                                        long j10 = j2 << numberOfLeadingZeros;
                                                        long j11 = j10 & j;
                                                        long j12 = j10 >>> i3;
                                                        long j13 = j9 & j;
                                                        long j14 = j9 >>> i3;
                                                        long j15 = j12 * j14;
                                                        long j16 = j14 * j11;
                                                        long j17 = j15 + ((((j12 * j13) + ((j11 * j13) >>> i3)) + (j16 & j)) >>> i3) + (j16 >>> i3);
                                                        int i30 = (int) (j17 >>> 63);
                                                        long j18 = j17 >>> (i30 + 9);
                                                        int i31 = numberOfLeadingZeros + (i30 ^ 1);
                                                        long j19 = j17 & 511;
                                                        if (j19 == 511 || (j19 == 0 && (j18 & 3) == 1)) {
                                                            j3 = i11 << i3;
                                                            floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i11)));
                                                        } else {
                                                            long j20 = (j18 + 1) >>> 1;
                                                            if (j20 >= 9007199254740992L) {
                                                                i31--;
                                                                j20 = 4503599627370496L;
                                                            }
                                                            long j21 = j20 & (-4503599627370497L);
                                                            long j22 = ((((i10 * 217706) >> c3) + 1024) + 63) - i31;
                                                            if (j22 < 1 || j22 > 2046) {
                                                                j3 = i11 << i3;
                                                                floatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i11)));
                                                            } else {
                                                                j3 = i11 << i3;
                                                                floatToRawIntBits = Float.floatToRawIntBits((float) Double.longBitsToDouble((j22 << 52) | j21 | (z2 ? Long.MIN_VALUE : 0L)));
                                                            }
                                                        }
                                                    }
                                                    j4 = j3 | (floatToRawIntBits & j);
                                                }
                                            }
                                            c = charAt;
                                            j2 = j6;
                                            z = false;
                                            if (-10 <= i10) {
                                                met metVar32 = net.b;
                                                if (Long.compare(j2 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
                                                }
                                            }
                                            if (j2 != 0) {
                                            }
                                            j4 = j3 | (floatToRawIntBits & j);
                                        }
                                    }
                                }
                                i6 = i19 - i5;
                                if (i19 == length) {
                                }
                                i7 = i19;
                                c3 = 16;
                                c4 = '0';
                                i8 = i7;
                                i9 = i8;
                                i10 = 0;
                                if (i6 != 0) {
                                }
                            }
                            int i32 = (int) (j4 >>> i3);
                            float intBitsToFloat = Float.intBitsToFloat((int) (j4 & j));
                            if (Float.isNaN(intBitsToFloat)) {
                                i2 = i32;
                                i17 = i4;
                            } else {
                                float[] fArr3 = (float[]) g8cVar.a;
                                i17 = i4 + 1;
                                fArr3[i4] = intBitsToFloat;
                                if (i17 >= fArr3.length) {
                                    float[] fArr4 = new float[i17 * 2];
                                    g8cVar.a = fArr4;
                                    System.arraycopy(fArr3, 0, fArr4, 0, fArr3.length);
                                }
                                i2 = i32;
                            }
                            while (i2 < length && str.charAt(i2) == ',') {
                                i2++;
                            }
                            if (i2 < length && !Float.isNaN(intBitsToFloat)) {
                                i = i3;
                                charAt = c;
                            }
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = charAt;
                    i3 = i;
                    r20 = 1;
                }
                i16 = i2;
                float[] fArr5 = (float[]) g8cVar.a;
                int i33 = 2;
                switch (c) {
                    case 'A':
                        int i34 = i17 - 7;
                        for (int i35 = 0; i35 <= i34; i35 += 7) {
                            arrayList.add(new lak(fArr5[i35], fArr5[i35 + 1], fArr5[i35 + 2], Float.compare(fArr5[i35 + 3], 0.0f) != 0 ? r20 : false, Float.compare(fArr5[i35 + 4], 0.0f) != 0 ? r20 : false, fArr5[i35 + 5], fArr5[i35 + 6]));
                        }
                        i = i3;
                        break;
                    case 'C':
                        int i36 = i17 - 6;
                        for (int i37 = 0; i37 <= i36; i37 += 6) {
                            arrayList.add(new nak(fArr5[i37], fArr5[i37 + 1], fArr5[i37 + 2], fArr5[i37 + 3], fArr5[i37 + 4], fArr5[i37 + 5]));
                        }
                        i = i3;
                        break;
                    case 'H':
                        int i38 = i17 - 1;
                        for (int i39 = 0; i39 <= i38; i39++) {
                            arrayList.add(new oak(fArr5[i39]));
                        }
                        i = i3;
                        break;
                    case 'L':
                        int i40 = i17 - 2;
                        for (int i41 = 0; i41 <= i40; i41 += 2) {
                            arrayList.add(new pak(fArr5[i41], fArr5[i41 + 1]));
                        }
                        i = i3;
                        break;
                    case 'M':
                        int i42 = i17 - 2;
                        if (i42 >= 0) {
                            arrayList.add(new qak(fArr5[0], fArr5[r20]));
                            while (i33 <= i42) {
                                arrayList.add(new pak(fArr5[i33], fArr5[i33 + 1]));
                                i33 += 2;
                            }
                            i = i3;
                            break;
                        }
                        i = i3;
                    case 'Q':
                        int i43 = i17 - 4;
                        for (int i44 = 0; i44 <= i43; i44 += 4) {
                            arrayList.add(new rak(fArr5[i44], fArr5[i44 + 1], fArr5[i44 + 2], fArr5[i44 + 3]));
                        }
                        i = i3;
                        break;
                    case 'S':
                        int i45 = i17 - 4;
                        for (int i46 = 0; i46 <= i45; i46 += 4) {
                            arrayList.add(new sak(fArr5[i46], fArr5[i46 + 1], fArr5[i46 + 2], fArr5[i46 + 3]));
                        }
                        i = i3;
                        break;
                    case 'T':
                        int i47 = i17 - 2;
                        for (int i48 = 0; i48 <= i47; i48 += 2) {
                            arrayList.add(new tak(fArr5[i48], fArr5[i48 + 1]));
                        }
                        i = i3;
                        break;
                    case 'V':
                        int i49 = i17 - 1;
                        for (int i50 = 0; i50 <= i49; i50++) {
                            arrayList.add(new dbk(fArr5[i50]));
                        }
                        i = i3;
                        break;
                    case 'Z':
                    case 'z':
                        arrayList.add(mak.c);
                        i = i3;
                        break;
                    case 'a':
                        int i51 = i17 - 7;
                        for (int i52 = 0; i52 <= i51; i52 += 7) {
                            arrayList.add(new uak(fArr5[i52], fArr5[i52 + 1], fArr5[i52 + 2], Float.compare(fArr5[i52 + 3], 0.0f) != 0 ? r20 : false, Float.compare(fArr5[i52 + 4], 0.0f) != 0 ? r20 : false, fArr5[i52 + 5], fArr5[i52 + 6]));
                        }
                        i = i3;
                        break;
                    case 'c':
                        int i53 = i17 - 6;
                        for (int i54 = 0; i54 <= i53; i54 += 6) {
                            arrayList.add(new vak(fArr5[i54], fArr5[i54 + 1], fArr5[i54 + 2], fArr5[i54 + 3], fArr5[i54 + 4], fArr5[i54 + 5]));
                        }
                        i = i3;
                        break;
                    case 'h':
                        int i55 = i17 - 1;
                        for (int i56 = 0; i56 <= i55; i56++) {
                            arrayList.add(new wak(fArr5[i56]));
                        }
                        i = i3;
                        break;
                    case 'l':
                        int i57 = i17 - 2;
                        for (int i58 = 0; i58 <= i57; i58 += 2) {
                            arrayList.add(new xak(fArr5[i58], fArr5[i58 + 1]));
                        }
                        i = i3;
                        break;
                    case 'm':
                        int i59 = i17 - 2;
                        if (i59 >= 0) {
                            arrayList.add(new yak(fArr5[0], fArr5[r20]));
                            while (i33 <= i59) {
                                arrayList.add(new xak(fArr5[i33], fArr5[i33 + 1]));
                                i33 += 2;
                            }
                        }
                        i = i3;
                        break;
                    case 'q':
                        int i60 = i17 - 4;
                        for (int i61 = 0; i61 <= i60; i61 += 4) {
                            arrayList.add(new zak(fArr5[i61], fArr5[i61 + 1], fArr5[i61 + 2], fArr5[i61 + 3]));
                        }
                        i = i3;
                        break;
                    case 's':
                        int i62 = i17 - 4;
                        for (int i63 = 0; i63 <= i62; i63 += 4) {
                            arrayList.add(new abk(fArr5[i63], fArr5[i63 + 1], fArr5[i63 + 2], fArr5[i63 + 3]));
                        }
                        i = i3;
                        break;
                    case BuildConfig.API_LEVEL /* 116 */:
                        int i64 = i17 - 2;
                        for (int i65 = 0; i65 <= i64; i65 += 2) {
                            arrayList.add(new bbk(fArr5[i65], fArr5[i65 + 1]));
                        }
                        i = i3;
                        break;
                    case 'v':
                        int i66 = i17 - 1;
                        for (int i67 = 0; i67 <= i66; i67++) {
                            arrayList.add(new cbk(fArr5[i67]));
                        }
                        i = i3;
                        break;
                    default:
                        xla.e(c, "Unknown command for: ");
                        return null;
                }
            } else {
                i16 = i2;
            }
        }
        return arrayList;
    }

    public static int n(InputStream inputStream, Socket socket, byte[] bArr, int i, long j) {
        u(j);
        socket.setSoTimeout(v(j));
        return inputStream.read(bArr, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0173, code lost:
    
        defpackage.kac.f("Malformed chunk terminator");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x017a, code lost:
    
        defpackage.kac.f("Truncated chunk data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0199, code lost:
    
        r0 = r1.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d5, code lost:
    
        return new defpackage.x0(r6, r12, (java.io.Serializable) r0, 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0181, code lost:
    
        defpackage.kac.f(defpackage.k5r.i(r2, "Negative chunk size: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x018c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0198, code lost:
    
        throw new java.io.IOException("Malformed chunk size: ".concat(r2), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0125, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0127, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x019e, code lost:
    
        if (r15 < 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01a0, code lost:
    
        r7 = new java.io.ByteArrayOutputStream(r15);
        r3 = java.lang.Math.min(r2.length, r15);
        r7.write(r2, 0, r3);
        r15 = r15 - r3;
        r2 = new byte[4096];
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01b3, code lost:
    
        if (r15 <= 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01b5, code lost:
    
        r3 = n(r0, r1, r2, java.lang.Math.min(4096, r15), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01bd, code lost:
    
        if (r3 >= 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c0, code lost:
    
        r7.write(r2, 0, r3);
        r15 = r15 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01c5, code lost:
    
        r0 = r7.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ca, code lost:
    
        r0 = q(r0, r2, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01d6, code lost:
    
        defpackage.kac.f(defpackage.dfi.c(r15, "Content-Length ", " exceeds 524288 bytes"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01ed, code lost:
    
        throw new java.io.IOException("Malformed HTTP status line: ".concat(r6), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01ee, code lost:
    
        defpackage.kac.f("Malformed HTTP status line: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01f7, code lost:
    
        defpackage.kac.f("Malformed HTTP response (no header terminator)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r8 < 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        r2 = java.util.Arrays.copyOf(r6.a(), r6.size());
        r3 = new java.lang.String(r2, 0, r8, java.nio.charset.StandardCharsets.ISO_8859_1).split("\r\n");
        r6 = r3[0];
        r12 = r6.split(com.connectsdk.service.webos.lgcast.common.utils.StringUtil.SPACE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (r12.length < 2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        r6 = java.lang.Integer.parseInt(r12[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        r12 = null;
        r16 = false;
        r14 = 1;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (r14 >= r3.length) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = r3[r14].indexOf(58);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        if (r7 >= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r13 = r3[r14].substring(r11, r7).trim();
        r11 = java.util.Locale.US;
        r13 = r13.toLowerCase(r11);
        r7 = r3[r14].substring(r7 + 1).trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
    
        if (r13.equals(com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser.TAG_LOCATION) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        if (r13.equals("content-length") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        if (r13.equals("transfer-encoding") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ef, code lost:
    
        if (r7.toLowerCase(r11).contains("chunked") == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d8, code lost:
    
        r15 = java.lang.Integer.parseInt(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fc, code lost:
    
        if (r15 > 524288) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fe, code lost:
    
        r2 = java.util.Arrays.copyOfRange(r2, r8 + 4, r2.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0105, code lost:
    
        if (r16 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0107, code lost:
    
        r0 = q(r0, r2, r1, r4);
        r1 = new java.io.ByteArrayOutputStream();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0112, code lost:
    
        if (r2 >= r0.length) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0114, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0115, code lost:
    
        r4 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0118, code lost:
    
        if (r4 >= r0.length) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011c, code lost:
    
        if (r0[r3] != 13) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0122, code lost:
    
        if (r0[r4] != 10) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0128, code lost:
    
        if (r3 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012c, code lost:
    
        r2 = new java.lang.String(r0, r2, r3 - r2, java.nio.charset.StandardCharsets.US_ASCII).trim();
        r4 = r2.indexOf(59);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013f, code lost:
    
        if (r4 < 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0141, code lost:
    
        r2 = r2.substring(0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0146, code lost:
    
        r2 = java.lang.Integer.parseInt(r2.trim(), 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0150, code lost:
    
        if (r2 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        r3 = r3 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0154, code lost:
    
        if (r2 != 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
    
        if (r2 > (r0.length - r3)) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015b, code lost:
    
        r4 = r3 + r2;
        r5 = r4 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0160, code lost:
    
        if (r5 > r0.length) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0164, code lost:
    
        if (r0[r4] != 13) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016c, code lost:
    
        if (r0[r4 + 1] != 10) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016e, code lost:
    
        r1.write(r0, r3, r2);
        r2 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x0 p(Socket socket, long j) {
        int i;
        Socket socket2;
        long j2;
        int max;
        InputStream inputStream = socket.getInputStream();
        nzb nzbVar = new nzb(1, (byte) 0);
        byte[] bArr = new byte[4096];
        loop0: while (true) {
            int i2 = -1;
            while (true) {
                i = 0;
                if (i2 >= 0) {
                    socket2 = socket;
                    j2 = j;
                    break loop0;
                }
                int size = nzbVar.size();
                socket2 = socket;
                j2 = j;
                int n = n(inputStream, socket2, bArr, 4096, j2);
                if (n < 0) {
                    break loop0;
                }
                nzbVar.write(bArr, 0, n);
                if (nzbVar.size() > 16384) {
                    kac.f("HTTP response headers exceed 16384 bytes");
                    return null;
                }
                byte[] a = nzbVar.a();
                max = Math.max(0, size - 3);
                int size2 = nzbVar.size();
                while (true) {
                    int i3 = max + 3;
                    if (i3 < size2) {
                        if (a[max] != 13 || a[max + 1] != 10 || a[max + 2] != 13 || a[i3] != 10) {
                            max++;
                        }
                    }
                }
                i2 = max;
            }
        }
        int i4 = i4 + 1;
        i = 0;
    }

    public static byte[] q(InputStream inputStream, byte[] bArr, Socket socket, long j) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[4096];
        do {
            int n = n(inputStream, socket, bArr2, 4096, j);
            if (n < 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr2, 0, n);
        } while (byteArrayOutputStream.size() <= 524288);
        kac.f("AIA response body exceeds 524288 bytes");
        return null;
    }

    public static void u(long j) {
        if (System.nanoTime() < j) {
            return;
        }
        kac.f("AIA fetch deadline exceeded");
    }

    public static int v(long j) {
        long nanoTime = j - System.nanoTime();
        if (nanoTime <= 0) {
            kac.f("AIA fetch deadline exceeded");
            return 0;
        }
        long j2 = nanoTime / 1000000;
        if (j2 == 0) {
            j2 = 1;
        }
        return (int) Math.min(ScreenMirroringConfig.Test.pcVideoUdpPort, Math.min(2147483647L, j2));
    }

    @Override // defpackage.s03
    public void A(x7o x7oVar) {
        ((tdk) ((f3j) this.a).k).h.a(x7oVar);
    }

    @Override // defpackage.oa7
    public Object a() {
        non nonVar = (non) this.a;
        nonVar.reset();
        return nonVar;
    }

    @Override // defpackage.oa7
    public void b() {
        ((non) this.a).b();
    }

    @Override // defpackage.zxk
    /* renamed from: c */
    public void mo3c(foc focVar) {
        focVar.getClass();
    }

    @Override // defpackage.s4n
    public void d(Object obj) {
        byte[] bArr = (byte[]) obj;
        j2j j2jVar = (j2j) this.a;
        if (j2jVar.b) {
            ((rzc) j2jVar.e).i.update(bArr, 0, 2);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ((t4n) j2jVar.d).a(rzc.i(bArr) & 65535, new pv9(7, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x016c, code lost:
    
        if (r11 == 2) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0176, code lost:
    
        if (r9 == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0182, code lost:
    
        if (r9 == 184) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012a, code lost:
    
        if (r9 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0130, code lost:
    
        if (r9 != 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013c, code lost:
    
        if (r11 != 19) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0146, code lost:
    
        if (r9 != 100) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0150, code lost:
    
        if (r9 != 113) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0154, code lost:
    
        if (r10 < 240) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] f(String str, int i, long j) {
        int i2;
        osg osgVar = (osg) this.a;
        u(j);
        URL url = new URL(str);
        String protocol = url.getProtocol();
        byte[] bArr = null;
        if (!"http".equalsIgnoreCase(protocol) && !"https".equalsIgnoreCase(protocol)) {
            new StringBuilder("Refusing AIA fetch over non-HTTP scheme from ").append(str);
            osgVar.getClass();
            return null;
        }
        u(j);
        boolean equalsIgnoreCase = "https".equalsIgnoreCase(url.getProtocol());
        int port = url.getPort() != -1 ? url.getPort() : equalsIgnoreCase ? 443 : 80;
        String file = url.getFile();
        if (file.isEmpty()) {
            file = "/";
        }
        String host = url.getHost();
        int i3 = 0;
        while (true) {
            byte[] bArr2 = bArr;
            if (i3 >= host.length()) {
                for (int i4 = 0; i4 < file.length(); i4++) {
                    char charAt = file.charAt(i4);
                    if (charAt > ' ' && charAt != 127) {
                    }
                }
                u(j);
                InetAddress byName = InetAddress.getByName(url.getHost());
                if (port == 80 || port == 443) {
                    byte[] address = byName.getAddress();
                    if (address.length != 4 || (address[0] & 255) != 100 || (i2 = address[1] & 255) < 64 || i2 > 127) {
                        byte[] address2 = byName.getAddress();
                        if (address2.length != 16 || (address2[0] & 254) != 252) {
                            byte[] address3 = byName.getAddress();
                            if (address3.length == 16) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 < 10) {
                                        if (address3[i5] != 0) {
                                            break;
                                        }
                                        i5++;
                                    } else if ((address3[10] & 255) == 255 && (address3[11] & 255) == 255) {
                                        address3 = new byte[]{address3[12], address3[13], address3[14], address3[15]};
                                    }
                                }
                            }
                            if (address3.length == 4) {
                                int i6 = address3[0] & 255;
                                int i7 = address3[1] & 255;
                                int i8 = address3[2] & 255;
                                if (i6 != 0) {
                                    if (i6 == 192) {
                                        if (i7 == 0) {
                                        }
                                    }
                                    if (i6 == 192) {
                                        if (i7 == 0) {
                                        }
                                    }
                                    if (i6 == 198) {
                                        if (i7 != 18) {
                                        }
                                    }
                                    if (i6 == 198) {
                                        if (i7 == 51) {
                                        }
                                    }
                                    if (i6 == 203) {
                                        if (i7 == 0) {
                                        }
                                    }
                                }
                            } else {
                                if (address3.length == 16) {
                                    int i9 = address3[0] & 255;
                                    int i10 = address3[1] & 255;
                                    int i11 = address3[2] & 255;
                                    int i12 = address3[3] & 255;
                                    if (i9 == 32) {
                                    }
                                    if (i9 == 32) {
                                        if (i10 == 1) {
                                            if (i11 == 0) {
                                            }
                                        }
                                    }
                                    if (i9 == 32) {
                                        if (i10 == 1) {
                                            if (i11 == 13) {
                                            }
                                        }
                                    }
                                }
                                if (!byName.isLoopbackAddress() && !byName.isAnyLocalAddress() && !byName.isLinkLocalAddress() && !byName.isSiteLocalAddress() && !byName.isMulticastAddress()) {
                                    Socket socket = new Socket();
                                    try {
                                        socket.connect(new InetSocketAddress(byName, port), v(j));
                                        socket.setSoTimeout(v(j));
                                        Socket createSocket = equalsIgnoreCase ? dag.z().createSocket(socket, url.getHost(), port, true) : socket;
                                        OutputStream outputStream = createSocket.getOutputStream();
                                        outputStream.write(("GET " + file + " HTTP/1.1\r\nHost: " + url.getHost() + "\r\nConnection: close\r\nAccept: */*\r\n\r\n").getBytes(StandardCharsets.US_ASCII));
                                        outputStream.flush();
                                        x0 p = p(createSocket, j);
                                        String str2 = (String) p.c;
                                        int i13 = p.b;
                                        socket.close();
                                        if (i13 >= 300 && i13 < 400 && str2 != null) {
                                            if (i > 0) {
                                                return f(new URL(url, str2).toString(), i - 1, j);
                                            }
                                            new StringBuilder("Too many redirects fetching AIA cert from ").append(str);
                                            osgVar.getClass();
                                            return bArr2;
                                        }
                                        if (i13 == 200) {
                                            return (byte[]) p.d;
                                        }
                                        StringBuilder sb = new StringBuilder("AIA fetch returned HTTP ");
                                        sb.append(i13);
                                        sb.append(" from ");
                                        sb.append(str);
                                        osgVar.getClass();
                                        return bArr2;
                                    } finally {
                                    }
                                }
                            }
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder("Refusing AIA fetch to disallowed destination ");
                sb2.append(url.getHost());
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(port);
                osgVar.getClass();
                kac.f("AIA destination not allowed");
                return null;
            }
            char charAt2 = host.charAt(i3);
            if (charAt2 <= ' ' || charAt2 == 127) {
                break;
            }
            i3++;
            bArr = bArr2;
        }
        kac.f("Illegal characters in AIA URL");
        return null;
    }

    @Override // defpackage.zxk
    /* renamed from: g */
    public void mo4g(faq faqVar) {
        t3g t3gVar = (t3g) this.a;
        faqVar.getClass();
        if (faqVar instanceof naq) {
            t3gVar.A(((naq) faqVar).e);
            return;
        }
        if (faqVar instanceof saq) {
            t3gVar.B(((saq) faqVar).e);
            return;
        }
        if (!(faqVar instanceof daq)) {
            if (faqVar instanceof qaq) {
                return;
            }
            b6e.s();
        } else {
            f4d f4dVar = (f4d) t3gVar.f.getValue();
            e5d e5dVar = ((daq) faqVar).e;
            f4dVar.getClass();
            e5dVar.getClass();
        }
    }

    @Override // defpackage.adu
    public View getRoot() {
        return (LinearLayout) ((g8c) this.a).a;
    }

    @Override // defpackage.zxk
    /* renamed from: h */
    public void mo5h(jzs jzsVar) {
        jzsVar.getClass();
        ((t3g) this.a).A(jzsVar.a);
    }

    @Override // defpackage.zxk
    /* renamed from: i */
    public void mo6i(m1q m1qVar) {
        t3g t3gVar = (t3g) this.a;
        m1qVar.getClass();
        if (m1qVar instanceof c2q) {
            t3gVar.A(((c2q) m1qVar).d);
            return;
        }
        if (m1qVar instanceof e2q) {
            return;
        }
        if (!(m1qVar instanceof j1q)) {
            b6e.s();
            return;
        }
        f4d f4dVar = (f4d) t3gVar.f.getValue();
        e5d e5dVar = ((j1q) m1qVar).d;
        f4dVar.getClass();
        e5dVar.getClass();
    }

    @Override // defpackage.zxk
    /* renamed from: j */
    public void mo7j(i5u i5uVar) {
        i5uVar.getClass();
        ((t3g) this.a).B(i5uVar.a);
    }

    @Override // defpackage.zxk
    /* renamed from: k */
    public void mo8k(k4d k4dVar) {
        k4dVar.getClass();
        f4d f4dVar = (f4d) ((t3g) this.a).f.getValue();
        e5d e5dVar = k4dVar.a;
        f4dVar.getClass();
        e5dVar.getClass();
    }

    @Override // defpackage.ljr
    public InputStream next() {
        InputStream inputStream = (InputStream) this.a;
        this.a = null;
        return inputStream;
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        mgk mgkVar = (mgk) obj;
        mgkVar.getClass();
        gdp gdpVar = (gdp) this.a;
        gdpVar.w = mgkVar;
        gdpVar.r.l(mgkVar);
        gdpVar.a(mgkVar);
    }

    public void r(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.B(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x038b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x043c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x05cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v32, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v36, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v40, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable s(List list, cg6 cg6Var) {
        zqk zqkVar;
        int i;
        a73 a73Var;
        a73 a73Var2;
        rj6 rj6Var;
        SyncResponseBlockListDto values;
        List<gxr> blocks;
        jwr jwrVar;
        g2g g2gVar;
        List disliked;
        List liked;
        kwr L;
        ?? r2;
        List<PreSaveIdDto> presaves;
        String preSaveId;
        qc7 timestamp;
        Date date;
        kwr L2;
        ?? r22;
        List<OwnPlaylistEntityDto> playlists;
        axr axrVar;
        PlaylistIdDto compositeData;
        String userUid;
        PlaylistIdDto compositeData2;
        String kind;
        Integer revision;
        OwnPlaylistChecksumDto checksum;
        qc7 timestamp2;
        kwr L3;
        ?? r23;
        List<LikedPlaylistEntityDto> liked2;
        owr owrVar;
        PlaylistIdDto compositeData3;
        String userUid2;
        PlaylistIdDto compositeData4;
        String kind2;
        Integer revision2;
        qc7 timestamp3;
        kwr L4;
        t1g t1gVar;
        List disliked2;
        List liked3;
        kwr L5;
        s1g s1gVar;
        ArrayList arrayList;
        List<AlbumIdDto> liked4;
        String albumId;
        qc7 timestamp4;
        Date date2;
        kwr L6;
        f2g f2gVar;
        List disliked3;
        List liked5;
        kwr L7;
        if (cg6Var instanceof zqk) {
            zqkVar = (zqk) cg6Var;
            int i2 = zqkVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zqkVar.l = i2 - Integer.MIN_VALUE;
                Object obj = zqkVar.j;
                nm6 nm6Var = nm6.a;
                i = zqkVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        k63 k63Var = (k63) it.next();
                        k63Var.getClass();
                        if (k63Var instanceof g63) {
                            g63 g63Var = (g63) k63Var;
                            final Integer num = g63Var.a;
                            final Boolean bool = g63Var.b;
                            a73Var = new a73(num, bool) { // from class: com.yandex.music.shared.phonoteka.synchronization.data.model.BlockRequestDto$LikedTracksRequestDto

                                @SerializedName("allValuesRequired")
                                private final Boolean allValuesRequired;

                                @SerializedName("revision")
                                private final Integer revision;

                                {
                                    this.revision = num;
                                    this.allValuesRequired = bool;
                                }

                                @Override // defpackage.a73
                                public final String getName() {
                                    return "likedTracks";
                                }
                            };
                        } else if (k63Var instanceof d63) {
                            d63 d63Var = (d63) k63Var;
                            final Integer num2 = d63Var.a;
                            final Boolean bool2 = d63Var.b;
                            a73Var = new a73(num2, bool2) { // from class: com.yandex.music.shared.phonoteka.synchronization.data.model.BlockRequestDto$LikedAlbumsRequestDto

                                @SerializedName("allValuesRequired")
                                private final Boolean allValuesRequired;

                                @SerializedName("revision")
                                private final Integer revision;

                                {
                                    this.revision = num2;
                                    this.allValuesRequired = bool2;
                                }

                                @Override // defpackage.a73
                                public final String getName() {
                                    return "likedAlbums";
                                }
                            };
                        } else if (k63Var instanceof e63) {
                            e63 e63Var = (e63) k63Var;
                            final Integer num3 = e63Var.a;
                            final Boolean bool3 = e63Var.b;
                            a73Var = new a73(num3, bool3) { // from class: com.yandex.music.shared.phonoteka.synchronization.data.model.BlockRequestDto$LikedArtistsRequestDto

                                @SerializedName("allValuesRequired")
                                private final Boolean allValuesRequired;

                                @SerializedName("revision")
                                private final Integer revision;

                                {
                                    this.revision = num3;
                                    this.allValuesRequired = bool3;
                                }

                                @Override // defpackage.a73
                                public final String getName() {
                                    return "likedArtists";
                                }
                            };
                        } else {
                            if (k63Var instanceof f63) {
                                ArrayList<z1g> arrayList3 = ((f63) k63Var).a;
                                final ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                                for (z1g z1gVar : arrayList3) {
                                    nvl nvlVar = z1gVar.a;
                                    arrayList4.add(new LikedPlaylistRevisionDto(nvlVar.a, nvlVar.b, Integer.valueOf(z1gVar.b), Integer.valueOf(z1gVar.c)));
                                }
                                a73Var2 = new a73(arrayList4) { // from class: com.yandex.music.shared.phonoteka.synchronization.data.model.BlockRequestDto$LikedPlaylistsRequestDto

                                    @SerializedName("playlists")
                                    @NotNull
                                    private final List<LikedPlaylistRevisionDto> playlistsRevisions;

                                    {
                                        arrayList4.getClass();
                                        this.playlistsRevisions = arrayList4;
                                    }

                                    @Override // defpackage.a73
                                    public final String getName() {
                                        return "likedPlaylists";
                                    }
                                };
                            } else if (k63Var instanceof i63) {
                                List<szj> list2 = ((i63) k63Var).a;
                                final ArrayList arrayList5 = new ArrayList(v75.o(list2, 10));
                                for (szj szjVar : list2) {
                                    nvl nvlVar2 = szjVar.a;
                                    arrayList5.add(new OwnPlaylistRevisionDto(nvlVar2.a, nvlVar2.b, Integer.valueOf(szjVar.b), Integer.valueOf(szjVar.c), szjVar.d));
                                }
                                a73Var2 = new a73(arrayList5) { // from class: com.yandex.music.shared.phonoteka.synchronization.data.model.BlockRequestDto$OwnPlaylistsRequestDto

                                    @SerializedName("playlists")
                                    @NotNull
                                    private final List<OwnPlaylistRevisionDto> playlistsRevisions;

                                    {
                                        arrayList5.getClass();
                                        this.playlistsRevisions = arrayList5;
                                    }

                                    @Override // defpackage.a73
                                    public final String getName() {
                                        return "ownPlaylists";
                                    }
                                };
                            } else if (k63Var instanceof j63) {
                                a73Var = new z63();
                            } else if (k63Var instanceof h63) {
                                h63 h63Var = (h63) k63Var;
                                final Integer num4 = h63Var.a;
                                final Boolean bool4 = h63Var.b;
                                a73Var = new a73(num4, bool4) { // from class: com.yandex.music.shared.phonoteka.synchronization.data.model.BlockRequestDto$LikedVideoClipsRequestDto

                                    @SerializedName("allValuesRequired")
                                    private final Boolean allValuesRequired;

                                    @SerializedName("revision")
                                    private final Integer revision;

                                    {
                                        this.revision = num4;
                                        this.allValuesRequired = bool4;
                                    }

                                    @Override // defpackage.a73
                                    public final String getName() {
                                        return "likedClips";
                                    }
                                };
                            } else {
                                if (!(k63Var instanceof c63)) {
                                    b6e.s();
                                    return null;
                                }
                                a73Var = null;
                            }
                            a73Var = a73Var2;
                        }
                        if (a73Var != null) {
                            arrayList2.add(a73Var);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        r7o r7oVar = z7o.b;
                        return c5b.a;
                    }
                    Call<MusicBackendResponse<SyncResponseDto>> a = ((PhonotekaSyncApi) this.a).a(new fxr(arrayList2));
                    zqkVar.l = 1;
                    obj = uwf.g(a, zqkVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    IOException a2 = ((pj6) rj6Var).a();
                    r7o r7oVar2 = z7o.b;
                    return new t7o(new PhonotekaSyncException(wpk.Network, a2));
                }
                SyncResponseDto syncResponseDto = (SyncResponseDto) jf0.F(rj6Var);
                if (syncResponseDto == null || (values = syncResponseDto.getValues()) == null || (blocks = values.getBlocks()) == null) {
                    r7o r7oVar3 = z7o.b;
                    return new t7o(new PhonotekaSyncException(wpk.Parse, null));
                }
                ArrayList arrayList6 = new ArrayList();
                for (gxr gxrVar : blocks) {
                    if (gxrVar != null) {
                        if (gxrVar instanceof SyncResponseBlockDto$LikedTracksResponseDto) {
                            SyncResponseBlockDto$LikedTracksResponseDto syncResponseBlockDto$LikedTracksResponseDto = (SyncResponseBlockDto$LikedTracksResponseDto) gxrVar;
                            if (syncResponseBlockDto$LikedTracksResponseDto.getError() != null) {
                                Integer errorCode = syncResponseBlockDto$LikedTracksResponseDto.getError().getErrorCode();
                                if (errorCode != null && (L7 = t7g.L(errorCode.intValue())) != null) {
                                    jwrVar = new bwr(j43.a, L7);
                                }
                            } else {
                                LikedTracksSyncBlockInfoDto info = syncResponseBlockDto$LikedTracksResponseDto.getInfo();
                                if (info == null) {
                                    f2gVar = new f2g(null, null, null);
                                } else {
                                    Integer revision3 = info.getRevision();
                                    LikedTracksSyncBlockChecksumDto checksum2 = info.getChecksum();
                                    String likedTracksMurMur2 = checksum2 != null ? checksum2.getLikedTracksMurMur2() : null;
                                    LikedTracksSyncBlockChecksumDto checksum3 = info.getChecksum();
                                    f2gVar = new f2g(revision3, likedTracksMurMur2, checksum3 != null ? checksum3.getDislikedTracksMurMur2() : null);
                                }
                                LikedTracksBlockValuesDto values2 = syncResponseBlockDto$LikedTracksResponseDto.getValues();
                                ArrayList M = (values2 == null || (liked5 = values2.getLiked()) == null) ? null : t7g.M(liked5);
                                LikedTracksBlockValuesDto values3 = syncResponseBlockDto$LikedTracksResponseDto.getValues();
                                jwrVar = new fwr(f2gVar, M, (values3 == null || (disliked3 = values3.getDisliked()) == null) ? null : t7g.M(disliked3));
                            }
                        } else if (gxrVar instanceof SyncResponseBlockDto$LikedAlbumsResponseDto) {
                            SyncResponseBlockDto$LikedAlbumsResponseDto syncResponseBlockDto$LikedAlbumsResponseDto = (SyncResponseBlockDto$LikedAlbumsResponseDto) gxrVar;
                            if (syncResponseBlockDto$LikedAlbumsResponseDto.getError() != null) {
                                Integer errorCode2 = syncResponseBlockDto$LikedAlbumsResponseDto.getError().getErrorCode();
                                if (errorCode2 != null && (L6 = t7g.L(errorCode2.intValue())) != null) {
                                    jwrVar = new bwr(g43.a, L6);
                                }
                            } else {
                                LikedAlbumsSyncBlockInfoDto info2 = syncResponseBlockDto$LikedAlbumsResponseDto.getInfo();
                                if (info2 == null) {
                                    s1gVar = new s1g(null, null);
                                } else {
                                    Integer revision4 = info2.getRevision();
                                    LikedAlbumsSyncBlockChecksumDto checksum4 = info2.getChecksum();
                                    s1gVar = new s1g(revision4, checksum4 != null ? checksum4.getLikedAlbumsMurMur2() : null);
                                }
                                LikedAlbumsBlockValuesDto values4 = syncResponseBlockDto$LikedAlbumsResponseDto.getValues();
                                if (values4 == null || (liked4 = values4.getLiked()) == null) {
                                    arrayList = null;
                                } else {
                                    arrayList = new ArrayList();
                                    for (AlbumIdDto albumIdDto : liked4) {
                                        yvr yvrVar = (albumIdDto == null || (albumId = albumIdDto.getAlbumId()) == null || (timestamp4 = albumIdDto.getTimestamp()) == null || (date2 = timestamp4.b) == null) ? null : new yvr(date2, albumId);
                                        if (yvrVar != null) {
                                            arrayList.add(yvrVar);
                                        }
                                    }
                                }
                                jwrVar = new cwr(s1gVar, arrayList);
                            }
                        } else if (gxrVar instanceof SyncResponseBlockDto$LikedArtistsResponseDto) {
                            SyncResponseBlockDto$LikedArtistsResponseDto syncResponseBlockDto$LikedArtistsResponseDto = (SyncResponseBlockDto$LikedArtistsResponseDto) gxrVar;
                            if (syncResponseBlockDto$LikedArtistsResponseDto.getError() != null) {
                                Integer errorCode3 = syncResponseBlockDto$LikedArtistsResponseDto.getError().getErrorCode();
                                if (errorCode3 != null && (L5 = t7g.L(errorCode3.intValue())) != null) {
                                    jwrVar = new bwr(h43.a, L5);
                                }
                            } else {
                                LikedArtistsSyncBlockInfoDto info3 = syncResponseBlockDto$LikedArtistsResponseDto.getInfo();
                                if (info3 == null) {
                                    t1gVar = new t1g(null, null, null);
                                } else {
                                    Integer revision5 = info3.getRevision();
                                    LikedArtistsSyncBlockChecksumDto checksum5 = info3.getChecksum();
                                    String likedArtistsMurMur2 = checksum5 != null ? checksum5.getLikedArtistsMurMur2() : null;
                                    LikedArtistsSyncBlockChecksumDto checksum6 = info3.getChecksum();
                                    t1gVar = new t1g(revision5, likedArtistsMurMur2, checksum6 != null ? checksum6.getDislikedArtistsMurMur2() : null);
                                }
                                LikedArtistsBlockValuesDto values5 = syncResponseBlockDto$LikedArtistsResponseDto.getValues();
                                ArrayList H = (values5 == null || (liked3 = values5.getLiked()) == null) ? null : t7g.H(liked3);
                                LikedArtistsBlockValuesDto values6 = syncResponseBlockDto$LikedArtistsResponseDto.getValues();
                                jwrVar = new dwr(t1gVar, H, (values6 == null || (disliked2 = values6.getDisliked()) == null) ? null : t7g.H(disliked2));
                            }
                        } else if (gxrVar instanceof SyncResponseBlockDto$LikedPlaylistsResponseDto) {
                            SyncResponseBlockDto$LikedPlaylistsResponseDto syncResponseBlockDto$LikedPlaylistsResponseDto = (SyncResponseBlockDto$LikedPlaylistsResponseDto) gxrVar;
                            if (syncResponseBlockDto$LikedPlaylistsResponseDto.getError() != null) {
                                Integer errorCode4 = syncResponseBlockDto$LikedPlaylistsResponseDto.getError().getErrorCode();
                                if (errorCode4 != null && (L4 = t7g.L(errorCode4.intValue())) != null) {
                                    jwrVar = new bwr(i43.a, L4);
                                }
                            } else {
                                LikedPlaylistsBlockValuesDto values7 = syncResponseBlockDto$LikedPlaylistsResponseDto.getValues();
                                if (values7 == null || (liked2 = values7.getLiked()) == null) {
                                    r23 = c5b.a;
                                } else {
                                    r23 = new ArrayList();
                                    for (LikedPlaylistEntityDto likedPlaylistEntityDto : liked2) {
                                        if (likedPlaylistEntityDto != null && (compositeData3 = likedPlaylistEntityDto.getCompositeData()) != null && (userUid2 = compositeData3.getUserUid()) != null && (compositeData4 = likedPlaylistEntityDto.getCompositeData()) != null && (kind2 = compositeData4.getKind()) != null) {
                                            nvl nvlVar3 = new nvl(userUid2, kind2);
                                            PlaylistIdDto compositeData5 = likedPlaylistEntityDto.getCompositeData();
                                            Date date3 = (compositeData5 == null || (timestamp3 = compositeData5.getTimestamp()) == null) ? null : timestamp3.b;
                                            LikedPlaylistInfoDto info4 = likedPlaylistEntityDto.getInfo();
                                            if (info4 != null && (revision2 = info4.getRevision()) != null) {
                                                int intValue = revision2.intValue();
                                                LikedPlaylistInfoDto info5 = likedPlaylistEntityDto.getInfo();
                                                owrVar = new owr(nvlVar3, date3, intValue, info5 != null ? info5.getSnapshot() : null);
                                                if (owrVar == null) {
                                                    r23.add(owrVar);
                                                }
                                            }
                                        }
                                        owrVar = null;
                                        if (owrVar == null) {
                                        }
                                    }
                                }
                                jwrVar = new ewr(r23);
                            }
                        } else if (gxrVar instanceof SyncResponseBlockDto$OwnPlaylistsResponseDto) {
                            SyncResponseBlockDto$OwnPlaylistsResponseDto syncResponseBlockDto$OwnPlaylistsResponseDto = (SyncResponseBlockDto$OwnPlaylistsResponseDto) gxrVar;
                            if (syncResponseBlockDto$OwnPlaylistsResponseDto.getError() != null) {
                                Integer errorCode5 = syncResponseBlockDto$OwnPlaylistsResponseDto.getError().getErrorCode();
                                if (errorCode5 != null && (L3 = t7g.L(errorCode5.intValue())) != null) {
                                    jwrVar = new bwr(l43.a, L3);
                                }
                            } else {
                                OwnPlaylistsBlockValuesDto values8 = syncResponseBlockDto$OwnPlaylistsResponseDto.getValues();
                                if (values8 == null || (playlists = values8.getPlaylists()) == null) {
                                    r22 = c5b.a;
                                } else {
                                    r22 = new ArrayList();
                                    for (OwnPlaylistEntityDto ownPlaylistEntityDto : playlists) {
                                        if (ownPlaylistEntityDto != null && (compositeData = ownPlaylistEntityDto.getCompositeData()) != null && (userUid = compositeData.getUserUid()) != null && (compositeData2 = ownPlaylistEntityDto.getCompositeData()) != null && (kind = compositeData2.getKind()) != null) {
                                            nvl nvlVar4 = new nvl(userUid, kind);
                                            PlaylistIdDto compositeData6 = ownPlaylistEntityDto.getCompositeData();
                                            Date date4 = (compositeData6 == null || (timestamp2 = compositeData6.getTimestamp()) == null) ? null : timestamp2.b;
                                            OwnPlaylistInfoDto info6 = ownPlaylistEntityDto.getInfo();
                                            if (info6 != null && (revision = info6.getRevision()) != null) {
                                                int intValue2 = revision.intValue();
                                                OwnPlaylistInfoDto info7 = ownPlaylistEntityDto.getInfo();
                                                Integer snapshot = info7 != null ? info7.getSnapshot() : null;
                                                List values9 = ownPlaylistEntityDto.getValues();
                                                ArrayList M2 = values9 != null ? t7g.M(values9) : null;
                                                OwnPlaylistInfoDto info8 = ownPlaylistEntityDto.getInfo();
                                                axrVar = new axr(nvlVar4, date4, intValue2, snapshot, M2, (info8 == null || (checksum = info8.getChecksum()) == null) ? null : checksum.getTracksMurMur2());
                                                if (axrVar == null) {
                                                    r22.add(axrVar);
                                                }
                                            }
                                        }
                                        axrVar = null;
                                        if (axrVar == null) {
                                        }
                                    }
                                }
                                jwrVar = new hwr(r22);
                            }
                        } else if (gxrVar instanceof SyncResponseBlockDto$PreSavesResponseDto) {
                            SyncResponseBlockDto$PreSavesResponseDto syncResponseBlockDto$PreSavesResponseDto = (SyncResponseBlockDto$PreSavesResponseDto) gxrVar;
                            if (syncResponseBlockDto$PreSavesResponseDto.getError() != null) {
                                Integer errorCode6 = syncResponseBlockDto$PreSavesResponseDto.getError().getErrorCode();
                                if (errorCode6 != null && (L2 = t7g.L(errorCode6.intValue())) != null) {
                                    jwrVar = new bwr(m43.a, L2);
                                }
                            } else {
                                PreSavesBlockValuesDto values10 = syncResponseBlockDto$PreSavesResponseDto.getValues();
                                if (values10 == null || (presaves = values10.getPresaves()) == null) {
                                    r2 = c5b.a;
                                } else {
                                    r2 = new ArrayList();
                                    for (PreSaveIdDto preSaveIdDto : presaves) {
                                        bxr bxrVar = (preSaveIdDto == null || (preSaveId = preSaveIdDto.getPreSaveId()) == null || (timestamp = preSaveIdDto.getTimestamp()) == null || (date = timestamp.b) == null) ? null : new bxr(date, preSaveId);
                                        if (bxrVar != null) {
                                            r2.add(bxrVar);
                                        }
                                    }
                                }
                                jwrVar = new iwr(r2);
                            }
                        } else {
                            if (!(gxrVar instanceof SyncResponseBlockDto$LikedVideoClipsResponseDto)) {
                                b6e.s();
                                return null;
                            }
                            SyncResponseBlockDto$LikedVideoClipsResponseDto syncResponseBlockDto$LikedVideoClipsResponseDto = (SyncResponseBlockDto$LikedVideoClipsResponseDto) gxrVar;
                            if (syncResponseBlockDto$LikedVideoClipsResponseDto.getError() != null) {
                                Integer errorCode7 = syncResponseBlockDto$LikedVideoClipsResponseDto.getError().getErrorCode();
                                if (errorCode7 != null && (L = t7g.L(errorCode7.intValue())) != null) {
                                    jwrVar = new bwr(k43.a, L);
                                }
                            } else {
                                LikedVideoClipsSyncBlockInfoDto info9 = syncResponseBlockDto$LikedVideoClipsResponseDto.getInfo();
                                if (info9 == null) {
                                    g2gVar = new g2g(null, null, null);
                                } else {
                                    Integer revision6 = info9.getRevision();
                                    LikedVideoClipsSyncBlockChecksumDto checksum7 = info9.getChecksum();
                                    String likedVideoClipsMurMur2 = checksum7 != null ? checksum7.getLikedVideoClipsMurMur2() : null;
                                    LikedVideoClipsSyncBlockChecksumDto checksum8 = info9.getChecksum();
                                    g2gVar = new g2g(revision6, likedVideoClipsMurMur2, checksum8 != null ? checksum8.getDislikedVideoClipsMurMur2() : null);
                                }
                                LikedVideoClipsBlockValuesDto values11 = syncResponseBlockDto$LikedVideoClipsResponseDto.getValues();
                                ArrayList N = (values11 == null || (liked = values11.getLiked()) == null) ? null : t7g.N(liked);
                                LikedVideoClipsBlockValuesDto values12 = syncResponseBlockDto$LikedVideoClipsResponseDto.getValues();
                                jwrVar = new gwr(g2gVar, N, (values12 == null || (disliked = values12.getDisliked()) == null) ? null : t7g.N(disliked));
                            }
                        }
                        if (jwrVar == null) {
                            arrayList6.add(jwrVar);
                        }
                    }
                    jwrVar = null;
                    if (jwrVar == null) {
                    }
                }
                r7o r7oVar4 = z7o.b;
                return arrayList6;
            }
        }
        zqkVar = new zqk(this, cg6Var);
        Object obj2 = zqkVar.j;
        nm6 nm6Var2 = nm6.a;
        i = zqkVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(List list, cg6 cg6Var) {
        ark arkVar;
        int i;
        bii biiVar;
        ArrayList arrayList;
        String trackId;
        rr5 t;
        Boolean available;
        if (cg6Var instanceof ark) {
            arkVar = (ark) cg6Var;
            int i2 = arkVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                arkVar.l = i2 - Integer.MIN_VALUE;
                Object obj = arkVar.j;
                nm6 nm6Var = nm6.a;
                i = arkVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    PhonotekaSyncApi phonotekaSyncApi = (PhonotekaSyncApi) this.a;
                    list.getClass();
                    List<drs> list2 = list;
                    ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                    for (drs drsVar : list2) {
                        arrayList2.add(new TrackAvailabilityDto(drsVar.a.e(), Boolean.valueOf(drsVar.b)));
                    }
                    Call<MusicBackendResponse<TracksAvailabilityDto>> b = phonotekaSyncApi.b(new SyncTrackAvailabilityRequestDto(arrayList2));
                    arkVar.l = 1;
                    obj = swf.N(b, arkVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    List<TrackAvailabilityDto> availabilities = ((TracksAvailabilityDto) ((aii) biiVar).a).getAvailabilities();
                    if (availabilities != null) {
                        arrayList = new ArrayList();
                        for (TrackAvailabilityDto trackAvailabilityDto : availabilities) {
                            drs drsVar2 = (trackAvailabilityDto == null || (trackId = trackAvailabilityDto.getTrackId()) == null || (t = q6k.t(trackId)) == null || (available = trackAvailabilityDto.getAvailable()) == null) ? null : new drs(t, available.booleanValue());
                            if (drsVar2 != null) {
                                arrayList.add(drsVar2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    return arrayList == null ? new nj6(null) : new qj6(arrayList);
                }
                if (!(biiVar instanceof xhi)) {
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        arkVar = new ark(this, cg6Var);
        Object obj2 = arkVar.j;
        nm6 nm6Var2 = nm6.a;
        i = arkVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        ((gdp) this.a).t.l(new tcp(bfkVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y(int i, cg6 cg6Var) {
        t5q t5qVar;
        int i2;
        pre preVar = ((u5q) this.a).b;
        if (cg6Var instanceof t5q) {
            t5qVar = (t5q) cg6Var;
            int i3 = t5qVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t5qVar.l = i3 - Integer.MIN_VALUE;
                Object obj = t5qVar.j;
                nm6 nm6Var = nm6.a;
                i2 = t5qVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    bal balVar = (bal) preVar.i.getValue();
                    t5qVar.l = 1;
                    if (balVar.a(i, t5qVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                preVar.t.invoke();
                return Unit.a;
            }
        }
        t5qVar = new t5q(this, cg6Var);
        Object obj2 = t5qVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = t5qVar.l;
        if (i2 != 0) {
        }
        preVar.t.invoke();
        return Unit.a;
    }

    public g8c(t tVar) {
        tVar.getClass();
        this.a = tVar;
    }

    public /* synthetic */ g8c(Object obj) {
        this.a = obj;
    }
}
