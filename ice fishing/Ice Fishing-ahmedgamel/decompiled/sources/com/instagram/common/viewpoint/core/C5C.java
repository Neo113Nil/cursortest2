package com.instagram.common.viewpoint.core;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.anythink.basead.exoplayer.b;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.5C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C5C {
    public static byte[] A00;
    public static String[] A01 = {"0jhNC1Lyu0lVYVQP", "8o531PEVmArnbRMxdetuA21oKPXOiLv", "tOAQF6Pzc2RVYks8fQT2p1g882rTPCd1", "wz1og", "CbSxkJOpnDO18KCthbWuHDege0bytfRM", "NVorx5pvNTEUlNt2QwU2VxD5ww57Xut2", "eRRRkvRnvdqMQMmsSxWecKvTVYNexEDg", "GD5J9oYLAsqrZf6ewUEjnT79ojUC6XcO"};
    public static final int A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final byte[] A07;
    public static final Pattern A08;
    public static final Pattern A09;
    public static final Pattern A0A;
    public static final Pattern A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final String[] A0E;
    public static final String[] A0F;

    public static String A0i(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A0v() {
        A00 = new byte[]{-100, -92, -56, -27, -22, -15, -12, -73, -67, -22, -32, -18, -21, -27, -32, -100, -58, -55, -4, -30, -50, -25, 2, -50, 7, -47, -50, -38, -2, 28, -45, 30, -54, 30, 53, 48, 36, 32, 82, 36, 31, 53, 95, 105, 99, 98, 53, 30, 53, 48, 37, 30, 99, 87, 100, 95, 92, 91, 105, 106, 30, 36, 32, 31, 31, 53, 31, 53, 31, 83, 91, 83, 91, 83, 91, 83, 91, 32, 83, 36, 31, 83, 91, 83, 91, 32, 83, 36, 31, 83, 91, 83, 91, 32, 82, 75, 107, 84, 31, 83, 91, 83, 91, 32, 49, 31, 83, 91, 83, 91, 32, 49, 31, 83, 91, 83, 91, 32, 31, 82, 83, 37, 35, 84, 31, 83, 91, 34, 32, 32, 54, 31, 82, 81, 113, 84, 115, 31, 31, 83, 34, 115, 83, 36, 32, 31, 83, 91, 54, 83, 91, 32, 49, 54, 31, 83, 91, 83, 91, 32, 32, 32, 54, -83, -92, -46, 23, 11, -47, -19, -34, -18, -35, -14, -27, -35, -3, 48, 39, 8, 36, 25, 49, 29, 42, 4, 33, 26, -25, -22, -26, -16, -26, -23, 27, 54, 62, 65, 58, 57, -11, 73, 68, -11, 71, 58, 54, 57, -11, 72, 78, 72, 73, 58, 66, -11, 69, 71, 68, 69, 58, 71, 73, 78, -11, 45, 82, 90, 69, 80, 77, 72, 4, 72, 77, 87, 84, 80, 69, 93, 4, 87, 77, 94, 73, 30, 4, 10, 11, 61, 62, 78, 52, 71, 50, 52, 52, 51, 66, 78, 50, 48, c.f17105c, 48, 49, 56, 59, 56, 67, 56, 52, 66, 20, 21, 37, 27, 20, 25, 27, 22, 22, 21, 24, 26, 11, 10, 37, 10, 24, 19, 61, 62, 78, 68, 61, 66, 68, c.f17105c, c.f17105c, 62, 65, 67, 52, 51, 78, 67, 72, c.f17105c, 52, -47, -19, -20, -9, 62, 93, 82, 85, -6, -26, -12, 58, 4, 9, 5, 27, 44, 4, 4, 55, 12, 9, 21, 57, 6, 5, 53, 5, 27, 4, 4, 55, 12, 9, 21, 57, 6, 5, 41, 5, 27, 4, 4, 55, 12, 9, 21, 57, 6, 5, 32, 5, 27, 4, 48, 4, 4, 55, 12, 9, 21, 57, 6, 5, 36, 5, 27, 4, 4, 55, 12, 9, 21, 57, 6, 5, 41, 5, 27, 4, 4, 55, 12, 9, 21, 10, 57, 6, 5, 47, 5, 27, 5, 27, 0, 90, 100, 38, 109, 112, 98, 75, 86, 76, -4, 9, -1, 13, 10, 4, -1, -55, 3, -4, 13, -1, 18, -4, 13, 0, -55, 15, 20, 11, 0, -55, -4, 16, 15, 10, 8, 10, 15, 4, 17, 0, 5, 18, 8, 22, 19, 13, 8, -46, 19, 23, -46, -9, 29, 23, 24, 9, 17, -12, 22, 19, 20, 9, 22, 24, 13, 9, 23, c.f17104b, 79, 79, 75, 72, 66, c.f17104b, 83, 72, 78, 77, 14, 67, c.f17104b, 82, 71, 10, 87, 76, 75, 34, 49, 49, 45, 42, 36, 34, 53, 42, 48, 47, -16, 55, 47, 37, -17, 46, 52, -18, 52, 52, 53, 51, -20, 57, 46, 45, -23, -8, -8, -12, -15, -21, -23, -4, -15, -9, -10, -73, 0, -75, -11, -8, -19, -17, -35, -38, -44, 66, 81, 81, 77, 74, 68, 66, 85, 74, 80, 79, 16, 89, 14, 83, 85, 84, 81, 57, 74, 5, 57, 74, 58, 24, 41, 25, 11, 28, 23, 49, 48, c.f17104b, 54, 67, 81, 94, 98, 15, 32, -21, -2, -5, -9, -4, -3, 32, 42, 43, 39, 51, 49, -14, 55, 51, 50, 61, -14, 40, 56, 58, -14, 44, 37, 54, 40, 59, 37, 54, 41, -14, 52, 37, 50, 41, 48, -14, 53, 42, 44, 40, 51, 67, -21, 1, 22, 45, 24, 75, 76, 69, 74, 84, 81, 77, 66, 90, 72, 89, 88, 25, 32, -14, 2, -17, -22, 10, 13, 16, 9, 76, 85, 88, 83, 71, 90, 35, 83, 25, 91, 30, 19, 71, 71, 86, 82, 10, 19, 22, 17, 5, 24, -31, 17, 20, 8, -47, 24, 13, 17, 9, -47, 7, 23, 10, -30, -18, 7, 19, 6, 31, 29, 39, 26, 24, 37, 12, 10, 25, 62, 73, 60, 58, 51, 61, 76, 70, 87, 17, 70, 83, 87, -1, -7, 10, -60, -1, 9, 13, -1, -7, 10, -60, 10, 9, 7, c.f17105c, 60, 18, 15, 12, 93, 103, c.f17105c, 73, 77, 85, 96, 91, 29, 46, 76, 16, 75, 68, 78, 25, -35, 28, 37, 40, -5, -65, 0, -13, 8, -13, -4, 1, -1, -7, -5, -5, -10, 85, 90, 27, 32, 22, 65, 75, 32, 42, 36, 74, 84, 78, 77, 77, 91, 76, 75, 59, 49, 33, 23, 70, 12, 78, 17, 72, 60, 62, 11, -1, 13, 0, -12, 12, 17, 13, 36, 34, -9, -6, -18, 54, 60, 19, 25, -45, 15, 20, 10, 76, 88, 58, 45, 58, -22, -34, 87, 85, 85, 85, 65, 65, 66, -10, -9, -75, -22, -9, -13, -21, -20, -86, -21, -21, -20, c.f17105c, c.f17104b, -2, c.f17105c, c.f17104b, 51, 102, 103, 37, 102, 113, 102, 34, 35, 22, -22, -14, 91, 80, 93, 13, 10, 44, 46, 45, 42, 80, 83, 75, 14, -2, -2, 9, 1, 8, 1, 4, 102, 100, 7, 5, 0, -3, 8, -7, -13, 1, -11, 7, 8, -7, 6, 57, 56, 9, 8, 6, 62, 68, 62, -7, 47, 52, 62, 59, 55, 44, 68, -8, 62, 52, 69, 48, 54, 36, 46, 33, 48, 35, 47, 39, -30, -1, -30, 1, 9, -2, -9, 45, 48, 22, 25, 11, -13, -25, -21, -19, -30, -29, 13, -4, 5, -5, 6, 9, -59, -5, 0, 10, 7, 3, -8, 16, -60, 10, 0, 17, -4, 18, 0, 7, 85, 71, 76, 66, 77, 85, 98, 107, 91, -2, -20, 31, 13, -46, 8, 18, 19, 80, 62, 3, 61, 75, 69, 79, 75, 19, 1, -58, 1, -6, 4, 37, 19, -40, 19, 12, 22, 22, 12, 
        41, 23, -36, 23, 34, 29, -9, -27, -86, -22, -26, -21, -86, -21, -34, -21, 96, 78, 19, 84, 71, 84, 62, 44, -15, 60, 45, 37, 50, 43};
    }

    static {
        A0v();
        A02 = Build.VERSION.SDK_INT;
        A03 = Build.DEVICE;
        A05 = Build.MANUFACTURER;
        A06 = Build.MODEL;
        StringBuilder append = new StringBuilder().append(A03);
        String A0i = A0i(166, 2, 111);
        A04 = append.append(A0i).append(A06).append(A0i).append(A05).append(A0i).append(A02).toString();
        A07 = new byte[0];
        A0A = Pattern.compile(A0i(68, 95, 123));
        A0B = Pattern.compile(A0i(320, 84, 96));
        A08 = Pattern.compile(A0i(16, 17, 37));
        A09 = Pattern.compile(A0i(33, 35, 122), 2);
        A0E = new String[]{A0i(410, 3, 110), A0i(877, 2, 119), A0i(567, 3, 46), A0i(739, 2, 57), A0i(570, 3, 83), A0i(642, 2, 17), A0i(580, 3, 13), A0i(814, 2, 99), A0i(925, 3, 25), A0i(573, 2, 88), A0i(583, 3, 24), A0i(970, 2, 8), A0i(625, 3, 55), A0i(621, 2, 84), A0i(637, 3, 104), A0i(821, 2, a.f22543z), A0i(693, 3, 55), A0i(628, 2, 107), A0i(com.anythink.core.common.m.a.f15186m, 3, 91), A0i(640, 2, 56), A0i(687, 3, 37), A0i(685, 2, 0), A0i(690, 3, 60), A0i(782, 2, 84), A0i(759, 3, 26), A0i(769, 2, 92), A0i(790, 3, 95), A0i(801, 2, 59), A0i(793, 3, 34), A0i(799, 2, 40), A0i(796, 3, 23), A0i(806, 2, 77), A0i(857, 3, 111), A0i(644, 2, 13), A0i(866, 3, 98), A0i(860, 2, 31), A0i(869, 3, 31), A0i(719, 7, 27), A0i(874, 3, 25), A0i(872, 2, 26), A0i(958, 3, 31), A0i(623, 2, 12), A0i(762, 2, 22), A0i(808, 6, 42), A0i(778, 2, 104), A0i(726, 2, 91), A0i(728, 3, 46), A0i(726, 2, 91), A0i(780, 2, 102), A0i(968, 2, 118), A0i(564, 3, 59), A0i(558, 6, 92), A0i(764, 2, 112), A0i(808, 6, 42), A0i(766, 3, 54), A0i(808, 6, 42), A0i(819, 2, 0), A0i(840, 6, 85), A0i(852, 3, 56), A0i(840, 6, 85), A0i(823, 2, 107), A0i(834, 6, 1), A0i(825, 3, 87), A0i(834, 6, 1), A0i(928, 2, 61), A0i(404, 6, 125), A0i(930, 3, 38), A0i(404, 6, 125), A0i(578, 2, 49), A0i(705, 7, 104), A0i(575, 3, 115), A0i(705, 7, 104), A0i(731, 2, 121), A0i(712, 7, 27), A0i(733, 3, 91), A0i(712, 7, 27), A0i(892, 2, 74), A0i(719, 7, 27), A0i(894, 3, 26), A0i(719, 7, 27), A0i(586, 3, 65), A0i(972, 6, 41), A0i(702, 3, 86), A0i(986, 6, 29), A0i(816, 3, 80), A0i(1016, 6, 106), A0i(736, 3, 113), A0i(1000, 6, 51)};
        A0F = new String[]{A0i(746, 5, 52), A0i(784, 2, 57), A0i(741, 5, 103), A0i(986, 6, 29), A0i(751, 8, 22), A0i(855, 2, 0), A0i(828, 6, 12), A0i(840, 6, 85), A0i(846, 6, 124), A0i(834, 6, 1), A0i(978, 8, 90), A0i(972, 6, 41), A0i(992, 8, 47), A0i(986, 6, 29), A0i(1006, 10, 1), A0i(1016, 6, 106), A0i(1022, 8, 72), A0i(1000, 6, 51)};
        A0C = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        A0D = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, a.f22514Q, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, BaseATView.a.f10558H, 196, 195, 202, BaseATView.a.f10554D, 144, 151, 158, 153, 140, 139, a.f22518U, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, BaseATView.a.f10590z, BaseATView.a.f10555E, 219, 220, 213, BaseATView.a.f10559I, p.f9259b, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, a.f22517T, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, BaseATView.a.f10556F, 200, 221, 218, BaseATView.a.J, BaseATView.a.f10560K, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, a.f22515R, 106, a.f22543z, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, a.f22519V, 222, 217, BaseATView.a.f10557G, 215, 194, 197, BaseATView.a.f10553C, BaseATView.a.f10552B, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static float A00(float f2, float f9, float f10) {
        return Math.max(f9, Math.min(f2, f10));
    }

    public static int A01(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                String[] strArr = A01;
                if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
                    throw new RuntimeException();
                }
                A01[3] = "qx6Bj";
                return BaseATView.a.f10553C;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return (A02 < 23 && A02 < 21) ? 0 : 6396;
            case 9:
            case 10:
            case 11:
            default:
                return 0;
            case 12:
                if (A02 < 32) {
                    return 0;
                }
                return 743676;
        }
    }

    public static int A02(int i) {
        switch (i) {
            case 2:
            case 4:
            case 7:
            case 16:
            case 18:
                return 6005;
            case 3:
            case 5:
            case 6:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 23:
            default:
                String[] strArr = A01;
                if (strArr[7].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[2] = "jxwDVk5Xin8Qw09ydBb2VsJiyiTp54vB";
                strArr2[5] = "SYToZK6HQezNburr1bp2e1PUtswsXJGu";
                return 6006;
            case 8:
            case 15:
                return 6003;
            case 10:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                return 6002;
        }
    }

    public static int A03(int i) {
        switch (i) {
            case 8:
                return 3;
            case 16:
                return 2;
            case 24:
                return 536870912;
            case 32:
                return 805306368;
            default:
                return 0;
        }
    }

    public static int A04(int i) {
        switch (i) {
            case 1:
            case 12:
            case 14:
                return 3;
            case 2:
                return 0;
            case 3:
                String[] strArr = A01;
                if (strArr[7].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[7] = "Xwv9tgmCDWWECZ2rTxC05riy18CzxfIS";
                strArr2[1] = "vJ1JY8dVYpQ7RvuZirsFVuB4oK25CZB";
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int A05(int i, int i4) {
        return ((i + i4) - 1) / i4;
    }

    public static int A06(int i, int i4) {
        switch (i) {
            case 2:
            case 268435456:
                return i4 * 2;
            case 3:
                return i4;
            case 4:
            case 805306368:
                return i4 * 4;
            case 536870912:
                return i4 * 3;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int A07(int i, int i4, int i6) {
        return Math.max(i4, Math.min(i, i6));
    }

    public static int A08(long j6, long j9) {
        if (j6 < j9) {
            return -1;
        }
        return j6 == j9 ? 0 : 1;
    }

    public static int A09(Context context, String str, boolean z6) {
        if (A02 < 29 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) {
            return 1;
        }
        return 5;
    }

    public static int A0A(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            String scheme2 = A0i(862, 4, 62);
            if (AbstractC2055k7.A03(scheme2, scheme)) {
                return 3;
            }
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            int i = lastIndexOf + 1;
            String[] strArr = A01;
            String lastPathSegment2 = strArr[4];
            if (lastPathSegment2.charAt(18) != strArr[6].charAt(18)) {
                throw new RuntimeException();
            }
            A01[3] = "a9wHr";
            String scheme3 = lastPathSegment.substring(i);
            int A0E2 = A0E(scheme3);
            if (A0E2 != 4) {
                return A0E2;
            }
        }
        Pattern pattern = A09;
        String scheme4 = uri.getPath();
        Matcher matcher = pattern.matcher((CharSequence) AbstractC06443y.A01(scheme4));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            String scheme5 = A0i(666, 19, 40);
            if (group.contains(scheme5)) {
                return 0;
            }
            String scheme6 = A0i(650, 16, 106);
            if (group.contains(scheme6)) {
                return 2;
            }
            return 1;
        }
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A0B(Uri uri, String str) {
        char c9;
        if (str == null) {
            return A0A(uri);
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals(A0i(519, 21, 12))) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case -156749520:
                if (str.equals(A0i(492, 27, 69))) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 64194685:
                if (str.equals(A0i(472, 20, 99))) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1154777587:
                if (str.equals(A0i(540, 18, 101))) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                return 0;
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static int A0C(C06534h c06534h, long j6, boolean z6, boolean z9) {
        int i = 0;
        int lowIndex = c06534h.A02();
        int i4 = lowIndex - 1;
        while (i <= i4) {
            int lowIndex2 = i + i4;
            int i6 = lowIndex2 >>> 1;
            if (c06534h.A03(i6) < j6) {
                i = i6 + 1;
            } else {
                i4 = i6 - 1;
            }
        }
        if (z6) {
            int highIndex = i4 + 1;
            int lowIndex3 = c06534h.A02();
            if (highIndex < lowIndex3) {
                int lowIndex4 = i4 + 1;
                if (c06534h.A03(lowIndex4) == j6) {
                    return i4 + 1;
                }
            }
        }
        if (!z9 || i4 != -1) {
            return i4;
        }
        return 0;
    }

    public static int A0D(String str) {
        int length = str.length();
        AbstractC06443y.A07(length <= 4);
        int result = 0;
        for (int i = 0; i < length; i++) {
            int length2 = str.charAt(i);
            result = (result << 8) | length2;
        }
        return result;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A0E(String str) {
        char c9;
        String A012 = AbstractC2055k7.A01(str);
        switch (A012.hashCode()) {
            case 104579:
                if (A012.equals(A0i(771, 3, 59))) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 108321:
                if (A012.equals(A0i(803, 3, 14))) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 3242057:
                if (A012.equals(A0i(774, 4, 101))) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 3299913:
                if (A012.equals(A0i(786, 4, 93))) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                return 0;
            case 1:
                return 2;
            case 2:
            case 3:
                return 1;
            default:
                return 4;
        }
    }

    public static int A0F(ByteBuffer byteBuffer, int i) {
        int i4 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i4 : Integer.reverseBytes(i4);
    }

    public static <T extends Comparable<? super T>> int A0G(List<? extends Comparable<? super T>> list, T t6, boolean z6, boolean z9) {
        int index;
        int binarySearch = Collections.binarySearch(list, t6);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        } else {
            int listSize = list.size();
            do {
                binarySearch++;
                if (binarySearch >= listSize) {
                    break;
                }
                index = list.get(binarySearch).compareTo(t6);
            } while (index == 0);
            if (z6) {
                binarySearch--;
            }
        }
        if (!z9) {
            return binarySearch;
        }
        int index2 = list.size();
        int i = index2 - 1;
        String[] strArr = A01;
        String str = strArr[4];
        String str2 = strArr[6];
        int charAt = str.charAt(18);
        int index3 = str2.charAt(18);
        if (charAt != index3) {
            throw new RuntimeException();
        }
        A01[0] = "AVDkOIGrSYkQO6";
        return Math.min(i, binarySearch);
    }

    public static <T extends Comparable<? super T>> int A0H(List<? extends Comparable<? super T>> list, T t6, boolean z6, boolean z9) {
        int index;
        int binarySearch = Collections.binarySearch(list, t6);
        if (binarySearch < 0) {
            int index2 = binarySearch + 2;
            binarySearch = -index2;
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
                Comparable<? super T> comparable = list.get(binarySearch);
                if (A01[0].length() == 0) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[7] = "7wt3cZrGAy9gNsgF7PLcTg6oSzn5VQ1a";
                strArr[1] = "U87bGfnBcGjZypJnFtFTdrSmy7sh89Q";
                index = comparable.compareTo(t6);
            } while (index == 0);
            if (z6) {
                binarySearch++;
            }
        }
        return z9 ? Math.max(0, binarySearch) : binarySearch;
    }

    public static int A0I(byte[] bArr, int i, int i4, int i6) {
        while (i < i4) {
            int[] iArr = A0C;
            int i9 = bArr[i];
            i6 = (i6 << 8) ^ iArr[((i6 >>> 24) ^ (i9 & p.f9259b)) & p.f9259b];
            i++;
        }
        return i6;
    }

    public static int A0J(byte[] bArr, int i, int i4, int i6) {
        while (i < i4) {
            int[] iArr = A0D;
            int i9 = bArr[i];
            i6 = iArr[(i9 & p.f9259b) ^ i6];
            i++;
        }
        return i6;
    }

    public static int A0K(long[] jArr, long j6, boolean z6, boolean z9) {
        int binarySearch = Arrays.binarySearch(jArr, j6);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        } else {
            do {
                binarySearch++;
                int index = jArr.length;
                if (binarySearch >= index) {
                    break;
                }
            } while (jArr[binarySearch] == j6);
            if (z6) {
                binarySearch--;
            }
        }
        if (!z9) {
            return binarySearch;
        }
        int index2 = jArr.length;
        return Math.min(index2 - 1, binarySearch);
    }

    public static int A0L(long[] jArr, long j6, boolean z6, boolean z9) {
        int binarySearch = Arrays.binarySearch(jArr, j6);
        if (binarySearch < 0) {
            int index = binarySearch + 2;
            binarySearch = -index;
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j6);
            if (z6) {
                binarySearch++;
            }
        }
        return z9 ? Math.max(0, binarySearch) : binarySearch;
    }

    public static long A0M(int i) {
        return i & 4294967295L;
    }

    public static long A0N(int i, int i4) {
        return (A0M(i) << 32) | A0M(i4);
    }

    public static long A0O(long j6) {
        return (j6 == b.f7168b || j6 == Long.MIN_VALUE) ? j6 : j6 * 1000;
    }

    public static long A0P(long j6) {
        return (j6 == b.f7168b || j6 == Long.MIN_VALUE) ? j6 : j6 / 1000;
    }

    public static long A0Q(long j6, float f2) {
        if (f2 == 1.0f) {
            return j6;
        }
        long round = Math.round(j6 * f2);
        String[] strArr = A01;
        if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "9GRIvgtOgBa9bXM6PfbvjJ8DWw6epVtI";
        strArr2[1] = "tkq8pPym2INMgxVxZaKpNGxpJRL95Qh";
        return round;
    }

    public static long A0R(long j6, float f2) {
        if (f2 == 1.0f) {
            return j6;
        }
        return Math.round(j6 / f2);
    }

    public static long A0S(long j6, long j9, long j10) {
        long j11 = j6 + j9;
        if (((j6 ^ j11) & (j9 ^ j11)) < 0) {
            return j10;
        }
        return j11;
    }

    public static long A0T(long j6, long j9, long j10) {
        return Math.max(j9, Math.min(j6, j10));
    }

    public static long A0U(long j6, long j9, long j10) {
        if (j10 >= j9) {
            long j11 = j10 % j9;
            String[] strArr = A01;
            if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "tvym1rnXFHBFa5iZecmBaZkH1F6VWGFv";
            strArr2[1] = "ooOjiywY7MfdEFCffLHAs2l8GTiel20";
            if (j11 == 0) {
                return j6 / (j10 / j9);
            }
        }
        if (j10 < j9 && j9 % j10 == 0) {
            return j6 * (j9 / j10);
        }
        return (long) (j6 * (j9 / j10));
    }

    public static long A0V(long j6, long j9, long j10) {
        long j11 = j6 - j9;
        if (((j6 ^ j9) & (j6 ^ j11)) < 0) {
            return j10;
        }
        return j11;
    }

    public static Point A0W(Context context) {
        DisplayManager displayManager;
        Display display = null;
        if (A02 >= 17 && (displayManager = (DisplayManager) context.getSystemService(A0i(630, 7, 101))) != null) {
            display = displayManager.getDisplay(0);
        }
        if (display == null) {
            display = ((WindowManager) AbstractC06443y.A01((WindowManager) context.getSystemService(A0i(961, 6, 98)))).getDefaultDisplay();
        }
        return A0X(context, display);
    }

    public static Point A0X(Context context, Display display) {
        String A0m;
        if (display.getDisplayId() == 0 && A18(context)) {
            if (A02 < 28) {
                A0m = A0m(A0i(897, 16, 79));
            } else {
                String displaySize = A0i(939, 19, 27);
                A0m = A0m(displaySize);
            }
            if (!TextUtils.isEmpty(A0m)) {
                try {
                    String trim = A0m.trim();
                    String displaySize2 = A0i(967, 1, 110);
                    String[] A1O = A1O(trim, displaySize2);
                    if (A1O.length == 2) {
                        String displaySize3 = A1O[0];
                        int width = Integer.parseInt(displaySize3);
                        String displaySize4 = A1O[1];
                        int parseInt = Integer.parseInt(displaySize4);
                        if (width > 0 && parseInt > 0) {
                            return new Point(width, parseInt);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                StringBuilder sb = new StringBuilder();
                String displaySize5 = A0i(225, 22, 104);
                String sb2 = sb.append(displaySize5).append(A0m).toString();
                String displaySize6 = A0i(313, 4, a.f22543z);
                AbstractC06524g.A05(displaySize6, sb2);
            }
            String A0i = A0i(309, 4, 2);
            String displaySize7 = A05;
            if (A0i.equals(displaySize7)) {
                String str = A06;
                String displaySize8 = A0i(170, 6, 32);
                if (str.startsWith(displaySize8)) {
                    PackageManager packageManager = context.getPackageManager();
                    String displaySize9 = A0i(589, 32, 72);
                    if (packageManager.hasSystemFeature(displaySize9)) {
                        return new Point(3840, 2160);
                    }
                }
            }
        }
        Point point = new Point();
        if (A02 >= 23) {
            A0z(display, point);
        } else if (A02 >= 17) {
            A0y(display, point);
        } else {
            A0x(display, point);
        }
        return point;
    }

    public static Handler A0Y() {
        return A0a(null);
    }

    public static Handler A0Z() {
        return A0b(null);
    }

    public static Handler A0a(Handler.Callback callback) {
        return A0c((Looper) AbstractC06443y.A02(Looper.myLooper()), callback);
    }

    public static Handler A0b(Handler.Callback callback) {
        return A0c(A0d(), callback);
    }

    public static Handler A0c(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Looper A0d() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static CharSequence A0e(CharSequence charSequence, int i) {
        return charSequence.length() <= i ? charSequence : charSequence.subSequence(0, i);
    }

    @EnsuresNonNull({"#1"})
    public static <T> T A0f(T value) {
        return value;
    }

    public static String A0g(int i) {
        switch (i) {
            case 0:
                return A0i(247, 2, 64);
            case 1:
                return A0i(290, 19, 115);
            case 2:
                return A0i(272, 18, 74);
            case 3:
                return A0i(249, 23, 115);
            case 4:
                return A0i(317, 3, 37);
            default:
                throw new IllegalStateException();
        }
    }

    public static String A0h(int i) {
        return Integer.toString(i, 36);
    }

    public static String A0j(Context context, String str) {
        String A0i;
        try {
            A0i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            A0i = A0i(169, 1, 50);
        }
        StringBuilder append = new StringBuilder().append(str);
        String versionName = A0i(168, 1, 38);
        StringBuilder append2 = append.append(versionName).append(A0i);
        String versionName2 = A0i(0, 16, 0);
        StringBuilder append3 = append2.append(versionName2);
        String versionName3 = Build.VERSION.RELEASE;
        StringBuilder append4 = append3.append(versionName3);
        String versionName4 = A0i(163, 2, 8);
        StringBuilder append5 = append4.append(versionName4);
        String versionName5 = A0i(176, 18, 60);
        return append5.append(versionName5).toString();
    }

    public static String A0k(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return AbstractC2055k7.A01(str);
        }
    }

    public static String A0l(String str) {
        int length = str.length();
        int i = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int percentCharacterCount = str.charAt(i4);
            if (percentCharacterCount == 37) {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        int length2 = i * 2;
        int startOfNotEscaped = length - length2;
        StringBuilder sb = new StringBuilder(startOfNotEscaped);
        Matcher matcher = A08.matcher(str);
        int i6 = 0;
        while (i > 0 && matcher.find()) {
            int parseInt = Integer.parseInt((String) AbstractC06443y.A01(matcher.group(1)), 16);
            int percentCharacterCount2 = A01[0].length();
            if (percentCharacterCount2 == 0) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "PqPC6PEskzx9UdoEWhWT1LElayhySamU";
            strArr[6] = "px5MwBeS5rIOQRTPGFWWURcMVY777XUi";
            int length3 = matcher.start();
            sb.append((CharSequence) str, i6, length3).append((char) parseInt);
            i6 = matcher.end();
            i--;
        }
        if (i6 < length) {
            sb.append((CharSequence) str, i6, length);
        }
        int length4 = sb.length();
        if (length4 != startOfNotEscaped) {
            return null;
        }
        return sb.toString();
    }

    public static String A0m(String str) {
        try {
            Class<?> cls = Class.forName(A0i(445, 27, 40));
            Method getMethod = cls.getMethod(A0i(696, 3, 41), String.class);
            return (String) getMethod.invoke(cls, str);
        } catch (Exception e9) {
            AbstractC06524g.A08(A0i(313, 4, a.f22543z), A0i(194, 31, 89) + str, e9);
            return null;
        }
    }

    public static String A0n(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String A0o(Locale locale) {
        return A02 >= 21 ? A0p(locale) : locale.toString();
    }

    public static String A0p(Locale locale) {
        return locale.toLanguageTag();
    }

    public static String A0q(byte[] bArr) {
        return new String(bArr, AbstractC2057k9.A05);
    }

    public static String A0r(byte[] bArr, int i, int i4) {
        return new String(bArr, i, i4, AbstractC2057k9.A05);
    }

    public static String A0s(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                String[] strArr = A01;
                String str = strArr[7];
                String str2 = strArr[1];
                int i4 = str.length();
                if (i4 == str2.length()) {
                    throw new RuntimeException();
                }
                A01[0] = "5BfmCuqMgNYZqTYtdlZRTWg2c";
                sb.append(A0i(166, 2, 111));
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ Thread A0t(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static ExecutorService A0u(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.facebook.ads.redexgen.X.5A
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C5C.A0t(str, runnable);
            }
        });
    }

    public static void A0w(Parcel parcel, boolean z6) {
        parcel.writeInt(z6 ? 1 : 0);
    }

    public static void A0x(Display display, Point point) {
        display.getSize(point);
    }

    public static void A0y(Display display, Point point) {
        display.getRealSize(point);
    }

    public static void A0z(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static void A10(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A11(Throwable th) {
        A12(th);
        throw null;
    }

    public static <T extends Throwable> void A12(Throwable th) throws Throwable {
        throw th;
    }

    public static void A13(long[] jArr, long j6, long j9) {
        if (j9 >= j6 && j9 % j6 == 0) {
            long j10 = j9 / j6;
            for (int i = 0; i < jArr.length; i++) {
                long divisionFactor = jArr[i];
                jArr[i] = divisionFactor / j10;
            }
            return;
        }
        if (j9 < j6 && j6 % j9 == 0) {
            long j11 = j6 / j9;
            for (int i4 = 0; i4 < jArr.length; i4++) {
                long multiplicationFactor = jArr[i4];
                jArr[i4] = multiplicationFactor * j11;
            }
            return;
        }
        double d9 = j6 / j9;
        int i6 = 0;
        while (true) {
            int length = jArr.length;
            String[] strArr = A01;
            if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "BjGW37zAqxCLsW2nWmt2hw1kAHbIQbLh";
            strArr2[5] = "BHp6YnoeM2z0KYM9Il82lktneq2CMX6s";
            if (i6 < length) {
                double multiplicationFactor2 = (long) (jArr[i6] * d9);
                jArr[i6] = multiplicationFactor2;
                i6++;
            } else {
                return;
            }
        }
    }

    public static boolean A14(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    public static boolean A15(int i) {
        if (i != 3 && i != 2) {
            String[] strArr = A01;
            if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "sEVRoy0udJ8XOlLumIW6NYr3k1TbE2j9";
            strArr2[6] = "fWOu24VM8azkAehbfbWIlWwimjJiblYr";
            if (i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
                return false;
            }
        }
        return true;
    }

    public static boolean A16(int i) {
        return i == 10 || i == 13;
    }

    public static boolean A17(Context context) {
        return A02 >= 23 && context.getPackageManager().hasSystemFeature(A0i(413, 32, 31));
    }

    public static boolean A18(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService(A0i(933, 6, 2));
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean A19(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, A0i(879, 13, 24), A0i(913, 12, 70), new String[]{str}) > 0;
    }

    public static boolean A1A(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String scheme2 = A0i(646, 4, 40);
            if (!scheme2.equals(scheme)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A1B(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        Looper looper2 = handler.getLooper();
        Looper looper3 = Looper.myLooper();
        if (looper2 == looper3) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static boolean A1C(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean A1D(C06674v c06674v, C06674v c06674v2, Inflater inflater) {
        if (c06674v.A07() <= 0) {
            return false;
        }
        if (c06674v2.A08() < c06674v.A07()) {
            c06674v2.A0c(c06674v.A07() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c06674v.A0l(), c06674v.A09(), c06674v.A07());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(c06674v2.A0l(), i, c06674v2.A08() - i);
                if (inflater.finished()) {
                    c06674v2.A0e(i);
                    inflater.reset();
                    return true;
                }
                if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                }
                if (i == c06674v2.A08()) {
                    c06674v2.A0c(c06674v2.A08() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean A1E(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static byte[] A1F(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] buffer = byteArrayOutputStream.toByteArray();
                return buffer;
            }
        }
    }

    public static byte[] A1G(String str) {
        return str.getBytes(AbstractC2057k9.A05);
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] A1H(T[] value) {
        return value;
    }

    public static <T> T[] A1I(T[] tArr, int i) {
        AbstractC06443y.A07(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    public static <T> T[] A1J(T[] tArr, int i, int i4) {
        boolean z6 = true;
        AbstractC06443y.A07(i >= 0);
        if (i4 > tArr.length) {
            z6 = false;
        }
        AbstractC06443y.A07(z6);
        return (T[]) Arrays.copyOfRange(tArr, i, i4);
    }

    public static <T> T[] A1K(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static String[] A1L() {
        String[] A1M = A1M();
        for (int i = 0; i < A1M.length; i++) {
            A1M[i] = A0k(A1M[i]);
        }
        return A1M;
    }

    public static String[] A1M() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (A02 >= 24) {
            return A1N(configuration);
        }
        return new String[]{A0o(configuration.locale)};
    }

    public static String[] A1N(Configuration configuration) {
        return A1O(configuration.getLocales().toLanguageTags(), A0i(165, 1, 42));
    }

    public static String[] A1O(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] A1P(String str, String str2) {
        return str.split(str2, 2);
    }
}
