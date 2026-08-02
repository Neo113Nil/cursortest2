package androidx.media3.common.util;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.tracing.Trace;
import com.google.common.base.Ascii;
import com.google.common.math.DoubleMath;
import com.google.common.math.DoubleUtils;
import com.plaid.internal.EnumC0170g;
import dagger.internal.Providers;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.utils.ColorUtils;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class Util {
    public static final int[] CRC16_BYTES_MSBF;
    public static final int[] CRC32_BYTES_MSBF;
    public static final int[] CRC8_BYTES_MSBF;
    public static final String DEVICE_DEBUG_INFO;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Pattern ISM_PATH_PATTERN;
    public static final String[] additionalIsoLanguageReplacements;
    public static final String[] isoLegacyTagReplacements;
    public static HashMap languageTagReplacementMap;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        DEVICE_DEBUG_INFO = str + ", " + Build.MODEL + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        EMPTY_BYTE_ARRAY = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        ISM_PATH_PATTERN = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        additionalIsoLanguageReplacements = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        isoLegacyTagReplacements = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        CRC32_BYTES_MSBF = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        CRC16_BYTES_MSBF = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        CRC8_BYTES_MSBF = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, EnumC0170g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ICON_PIN_VALUE, EnumC0170g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC0170g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, EnumC0170g.SDK_ASSET_ICON_CLIPBOARD_VALUE, 144, 151, EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 153, 140, EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE, 192, EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, EnumC0170g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC0170g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC0170g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 255, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, 185, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 165, EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 136, EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, 147, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 128, EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE, EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC0170g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE, 200, EnumC0170g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC0170g.SDK_ASSET_ICON_QUESTION_VALUE, 211, EnumC0170g.SDK_ASSET_ICON_OVERRIDE_VALUE, 105, 110, 103, 96, 117, 114, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 167, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, 188, EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, 150, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 131, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE, EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC0170g.SDK_ASSET_ICON_INCOME_VALUE, EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC0170g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 239, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE};
    }

    public static int binarySearchCeil(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i = binarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            binarySearch = i;
        }
        return z ? binarySearch : i;
    }

    public static int binarySearchFloor(LongArray longArray, long j) {
        int i = longArray.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (longArray.get(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 < longArray.size && longArray.get(i4) == j) {
            return i4;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static int ceilDivide(int i, int i2) {
        return Fragment$5$$ExternalSyntheticOutline0.m(i, i2, 1, i2);
    }

    public static int constrainValue(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static boolean contains(SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static boolean contentEquals(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static int contentHashCode(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int i = 17;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            i = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (i * 31)) * 31);
        }
        return i;
    }

    public static int crc32(int i, int i2, int i3, byte[] bArr) {
        while (i < i2) {
            i3 = CRC32_BYTES_MSBF[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static Handler createHandlerForCurrentLooper(MediaCodecVideoRenderer.OnFrameRenderedListener onFrameRenderedListener) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, onFrameRenderedListener);
    }

    public static int getApiLevelThatAudioFormatIntroducedAudioEncoding(int i) {
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return Integer.MAX_VALUE;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    public static int getAudioTrackChannelConfig(int i) {
        if (i == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                switch (i) {
                    case 13:
                        if (Build.VERSION.SDK_INT >= 32) {
                        }
                        break;
                    case 14:
                        if (Build.VERSION.SDK_INT >= 32) {
                        }
                        break;
                }
        }
        return 0;
    }

    public static int getByteDepth(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    if (i == 1879048192) {
                                        return 8;
                                    }
                                    Path$$ExternalSyntheticBUOutline0.m$3();
                                    return 0;
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static Point getCurrentDisplayModeSize(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        String str = null;
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && isTv(context)) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                str = (String) cls.getMethod("get", String.class).invoke(cls, "vendor.display-size");
            } catch (Exception e) {
                Log.e("Util", "Failed to read system property vendor.display-size", e);
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] split = str.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.e("Util", "Invalid display size: " + str);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static int getErrorCodeForMediaDrmErrorCode(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int getErrorCodeFromPlatformDiagnosticsInfo(String str) {
        String[] split;
        int length;
        int i = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            i = Integer.parseInt(str2);
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    public static long getMediaDurationForPlayoutDuration(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    public static int getPcmEncoding(int i, ByteOrder byteOrder) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static String getStringForTime(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        String str = j < 0 ? "-" : "";
        long abs = (Math.abs(j) + 500) / 1000;
        long j2 = abs % 60;
        long j3 = (abs / 60) % 60;
        long j4 = abs / 3600;
        sb.setLength(0);
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
    }

    public static String getTrackTypeString(int i) {
        switch (i) {
            case TiffDirectoryConstants.DIRECTORY_TYPE_EXIF /* -2 */:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i >= 10000 ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean handlePlayButtonAction(Player player) {
        boolean z = false;
        if (player == null) {
            return false;
        }
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
        int playbackState = exoPlayerImpl.getPlaybackState();
        if (playbackState != 1 || !exoPlayerImpl.isCommandAvailable(2)) {
            if (playbackState == 4 && exoPlayerImpl.isCommandAvailable(4)) {
                exoPlayerImpl.seekTo(-9223372036854775807L, exoPlayerImpl.getCurrentMediaItemIndex(), false);
            }
            if (exoPlayerImpl.isCommandAvailable(1)) {
                return z;
            }
            exoPlayerImpl.setPlayWhenReady(true);
            return true;
        }
        exoPlayerImpl.prepare();
        z = true;
        if (exoPlayerImpl.isCommandAvailable(1)) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int inferContentTypeForUriAndMimeType(Uri uri, String str) {
        int i;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme == null || (!Ascii.equalsIgnoreCase("rtsp", scheme) && !Ascii.equalsIgnoreCase("rtspt", scheme))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        String lowerCase = Ascii.toLowerCase(lastPathSegment.substring(lastIndexOf + 1));
                        lowerCase.getClass();
                        switch (lowerCase) {
                            case "ism":
                            case "isml":
                                i = 1;
                                break;
                            case "mpd":
                                i = 0;
                                break;
                            case "m3u8":
                                i = 2;
                                break;
                            default:
                                i = 4;
                                break;
                        }
                        if (i != 4) {
                            return i;
                        }
                    }
                    String path = uri.getPath();
                    path.getClass();
                    Matcher matcher = ISM_PATH_PATTERN.matcher(path);
                    if (matcher.matches()) {
                        String group = matcher.group(2);
                        if (group != null) {
                            if (!group.contains("format=mpd-time-csf")) {
                                if (group.contains("format=m3u8-aapl")) {
                                    return 2;
                                }
                            }
                            return 0;
                        }
                        return 1;
                    }
                }
                return 4;
            }
            return 3;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    break;
                }
                break;
        }
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Switch insn not found in header
            	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.inferContentTypeForUriAndMimeType(android.net.Uri, java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean inflate(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, Inflater inflater) {
        if (parsableByteArray.bytesLeft() == 0) {
            return false;
        }
        if (parsableByteArray2.data.length < parsableByteArray.bytesLeft()) {
            parsableByteArray2.ensureCapacity(parsableByteArray.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(parsableByteArray.data, parsableByteArray.position, parsableByteArray.bytesLeft());
        int i = 0;
        while (true) {
            try {
                byte[] bArr = parsableByteArray2.data;
                i += inflater.inflate(bArr, i, bArr.length - i);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    byte[] bArr2 = parsableByteArray2.data;
                    if (i == bArr2.length) {
                        parsableByteArray2.ensureCapacity(bArr2.length * 2);
                    }
                } else {
                    parsableByteArray2.setLimit(i);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
    }

    public static void intToStringMaxRadix(int i) {
        Integer.toString(i, 36);
    }

    public static boolean isEncodingHighResolutionPcm(int i) {
        return i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192;
    }

    public static boolean isEncodingLinearPcm(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192;
    }

    public static boolean isFrameDropAllowedOnSurfaceInput(Context context) {
        if (context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        if (i == 30) {
            String str = Build.MODEL;
            if (Ascii.equalsIgnoreCase(str, "moto g(20)") || Ascii.equalsIgnoreCase(str, "rmx3231")) {
                return true;
            }
        }
        return i == 34 && Ascii.equalsIgnoreCase(Build.MODEL, "sm-x200");
    }

    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long msToUs(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static String normalizeLanguageCode(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String lowerCase = Ascii.toLowerCase(str);
        int i = 0;
        String str2 = lowerCase.split("-", 2)[0];
        if (languageTagReplacementMap == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = additionalIsoLanguageReplacements;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                hashMap.put(strArr[i2], strArr[i2 + 1]);
            }
            languageTagReplacementMap = hashMap;
        }
        String str4 = (String) languageTagReplacementMap.get(str2);
        if (str4 != null) {
            lowerCase = str4.concat(lowerCase.substring(str2.length()));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return lowerCase;
        }
        while (true) {
            String[] strArr2 = isoLegacyTagReplacements;
            if (i >= strArr2.length) {
                return lowerCase;
            }
            if (lowerCase.startsWith(strArr2[i])) {
                return strArr2[i + 1] + lowerCase.substring(strArr2[i].length());
            }
            i += 2;
        }
    }

    public static Object[] nullSafeArrayCopy(int i, Object[] objArr) {
        Trace.checkArgument(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    public static void postOrRun(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static long sampleCountToDurationUs(int i, long j) {
        return scaleLargeValue(j, 1000000L, i, RoundingMode.DOWN);
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j) {
        long j2;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long divide = Providers.divide(j, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = Providers.divide(jArr[i], divide, roundingMode);
                i++;
            }
            return;
        }
        if (j < 1000000 && 1000000 % j == 0) {
            long divide2 = Providers.divide(1000000L, j, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = Providers.saturatedMultiply(jArr[i], divide2);
                i++;
            }
            return;
        }
        int i2 = 0;
        while (i2 < jArr.length) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j >= j3 && j % j3 == 0) {
                    jArr[i2] = Providers.divide(1000000L, Providers.divide(j, j3, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j >= j3 || j3 % j != 0) {
                    j2 = j;
                    jArr[i2] = scaleLargeValueFallback(j3, 1000000L, j2, roundingMode);
                    i2++;
                    j = j2;
                } else {
                    jArr[i2] = Providers.saturatedMultiply(1000000L, Providers.divide(j3, j, RoundingMode.UNNECESSARY));
                }
            }
            j2 = j;
            i2++;
            j = j2;
        }
    }

    public static long scaleLargeValue(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? scaleLargeValueFallback(j, j2, j3, roundingMode) : Providers.saturatedMultiply(j2, Providers.divide(j, j3, RoundingMode.UNNECESSARY)) : Providers.divide(j2, Providers.divide(j3, j, RoundingMode.UNNECESSARY), roundingMode) : Providers.saturatedMultiply(j, Providers.divide(j2, j3, RoundingMode.UNNECESSARY)) : Providers.divide(j, Providers.divide(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (java.lang.Math.abs(r0 - r7) == 0.5d) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long scaleLargeValueFallback(long j, long j2, long j3, RoundingMode roundingMode) {
        double d;
        long j4;
        long saturatedMultiply = Providers.saturatedMultiply(j, j2);
        if (saturatedMultiply != Long.MAX_VALUE && saturatedMultiply != Long.MIN_VALUE) {
            return Providers.divide(saturatedMultiply, j3, roundingMode);
        }
        long gcd = Providers.gcd(Math.abs(j2), Math.abs(j3));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long divide = Providers.divide(j2, gcd, roundingMode2);
        long divide2 = Providers.divide(j3, gcd, roundingMode2);
        long gcd2 = Providers.gcd(Math.abs(j), Math.abs(divide2));
        long divide3 = Providers.divide(j, gcd2, roundingMode2);
        long divide4 = Providers.divide(divide2, gcd2, roundingMode2);
        long saturatedMultiply2 = Providers.saturatedMultiply(divide3, divide);
        if (saturatedMultiply2 != Long.MAX_VALUE && saturatedMultiply2 != Long.MIN_VALUE) {
            return Providers.divide(saturatedMultiply2, divide4, roundingMode);
        }
        double d2 = divide3 * (divide / divide4);
        if (d2 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d2 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i = DoubleMath.$r8$clinit;
        if (!DoubleUtils.isFinite(d2)) {
            Mod$$ExternalSyntheticBUOutline0.m$2("input is infinite or NaN");
            return 0L;
        }
        switch (DoubleMath.AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                ColorUtils.checkRoundingUnnecessary(DoubleMath.isMathematicalInteger(d2));
                d = d2;
                if (!((-9.223372036854776E18d) - d >= 1.0d) || !(d < 9.223372036854776E18d)) {
                    return (long) d;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d2 + " and rounding mode " + roundingMode);
            case 2:
                if (d2 < 0.0d && !DoubleMath.isMathematicalInteger(d2)) {
                    j4 = ((long) d2) - 1;
                    d = j4;
                    if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                    }
                }
                d = d2;
                if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d2 > 0.0d && !DoubleMath.isMathematicalInteger(d2)) {
                    j4 = ((long) d2) + 1;
                    d = j4;
                    if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                    }
                }
                d = d2;
                if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d = d2;
                if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!DoubleMath.isMathematicalInteger(d2)) {
                    j4 = ((long) d2) + (d2 > 0.0d ? 1 : -1);
                    d = j4;
                    if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                    }
                }
                d = d2;
                if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d = Math.rint(d2);
                if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d = Math.rint(d2);
                if (Math.abs(d2 - d) == 0.5d) {
                    d = Math.copySign(0.5d, d2) + d2;
                }
                if (!(((-9.223372036854776E18d) - d >= 1.0d) & (d < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d = Math.rint(d2);
                break;
            default:
                Path$$ExternalSyntheticBUOutline0.m$2();
                return 0L;
        }
    }

    public static boolean shouldShowPlayButton(Player player, boolean z) {
        if (player != null) {
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
            if (exoPlayerImpl.getPlayWhenReady() && exoPlayerImpl.getPlaybackState() != 1 && exoPlayerImpl.getPlaybackState() != 4 && (!z || exoPlayerImpl.getPlaybackSuppressionReason() == 0 || exoPlayerImpl.getPlaybackSuppressionReason() == 4)) {
                return false;
            }
        }
        return true;
    }

    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i = 0;
        for (int i2 : iArr) {
            bArr[i] = (byte) (i2 >> 24);
            bArr[i + 1] = (byte) (i2 >> 16);
            int i3 = i + 3;
            bArr[i + 2] = (byte) (i2 >> 8);
            i += 4;
            bArr[i3] = (byte) i2;
        }
        return bArr;
    }

    public static long usToMs(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long constrainValue(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static float constrainValue(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static int binarySearchFloor(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                i2 = binarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                binarySearch = i2;
            }
            i3 = z ? binarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static int binarySearchFloor(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            while (true) {
                int i2 = binarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                binarySearch = i2;
            }
            i = binarySearch;
        }
        return z ? Math.max(0, i) : i;
    }
}
