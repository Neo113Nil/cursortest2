package defpackage;

import com.adjust.sdk.Constants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.messaging.core.net.entities.UpdateOrganizationResult;
import com.ybsdk.rconfig.configs.QrScannerGuidelinesConfigSchema;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.ssl.cl_88;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.ott.data.net.impl.ConcurrencyArbiterApiImpl;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes11.dex */
public abstract class zm91 {
    public static final int[][] a = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, HProv.PP_CONTAINER_EXTENSION, 295, BuildConfig.API_LEVEL, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, 320, 803, HProv.PP_ENUM_CONTAINER_EXTENSION, 231, 390, 685, 330, 63, 410}, new int[]{cl_88.s, UpdateOrganizationResult.BaseError.UNPROCESSABLE_ENTITY, 6, 93, 862, 771, 453, 106, 610, 287, HProv.PP_SET_PIN, 505, 733, 877, 381, 612, 723, 476, 462, HProv.PP_EXPORT_CSP, 430, 609, 858, 822, 543, 376, 511, Constants.MINIMAL_ERROR_STATUS_CODE, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, HProv.PP_LICENSE, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, Constants.MINIMAL_ERROR_STATUS_CODE, 925, 749, 415, 822, 93, 217, 208, 928, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, 219, HProv.PP_SECURITY_LEVEL, 186, 236, 287, 192, 775, 278, 173, 40, 379, 712, 463, 646, 776, HProv.PP_REFCOUNT, 491, 297, 763, 156, 732, 95, SubsamplingScaleImageView.ORIENTATION_270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, NetworkRequestException.BANNED, 354, 130, 814, 587, 804, 34, 211, 330, cl_88.s, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, cl_88.s}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, HProv.PP_VERSION_EX, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, HProv.PP_ENUM_LOG, 439, ConcurrencyArbiterApiImpl.RESPONSE_CODE_418, 592, 668, 353, 859, 370, 694, 325, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, HProv.PP_LCD_QUERY, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, HProv.PP_CONTAINER_EXTENSION_DEL, 628, 320, 479, 130, 739, 71, 263, 318, 374, 601, 192, 605, 142, 673, 687, MSException.ERROR_MORE_DATA, 722, 384, 177, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, cl_88.n, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, HProv.PP_INFO, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, HProv.PP_DELETE_SAVED_PASSWD, 32, 681, 331, 792, 620, 60, 609, 441, SubsamplingScaleImageView.ORIENTATION_180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, HProv.PP_CONTAINER_EXTENSION_DEL, 54, 834, 299, 922, 191, 910, 532, 609, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, 599, 428, 207, 409, 574, HProv.PP_INFO, 498, HProv.ALG_SID_SHA_224, 380, 350, 492, 197, 265, 920, ModuleDescriptor.MODULE_VERSION, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, 666, 249, 346, 781, 621, 640, 268, 794, 534, cl_88.s, 781, 408, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, HProv.PP_SET_PIN, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, SubsamplingScaleImageView.ORIENTATION_180, 20, 297, NetworkRequestException.REGIONAL_RESTRICTION, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, 192, 516, 258, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, 518, 794, 395, 768, 848, 51, 610, 384, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 190, 826, 328, 596, 786, 303, 570, 381, 415, 641, 156, 237, 151, NetworkRequestException.TOO_MANY_REQUESTS, 531, 207, 676, 710, 89, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, lvj0.NOT_MODIFIED, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, HProv.PP_SAME_MEDIA, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, HProv.PP_LICENSE, 209, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, QrScannerGuidelinesConfigSchema.MIN_SCREEN_HEIGHT_TO_SHOW_GUIDELINES, 18, 66, 407, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, 905, 789, 420, 305, 441, 207, 300, 892, 827, 141, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, ModuleDescriptor.MODULE_VERSION, UpdateOrganizationResult.BaseError.UNPROCESSABLE_ENTITY, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, BuildConfig.API_LEVEL, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, 316, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, HProv.PP_REFCOUNT, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, HProv.PP_CONTAINER_EXTENSION_DEL, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, HProv.PP_VERSION_EX, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, 251, 366, lvj0.NOT_MODIFIED, 282, 738, 675, 410, 389, 244, 31, ru.cprocsp.NGate.tools.Constants.VPN_TRAFFIC, 303, 263}};
    public static final int b = 9;
    public static final int c = 6;
    public static final int d = 10;
    public static final int e = 5;
    public static final int f = 15;

    public static final void a(String str, String str2, ArrayList arrayList) {
        if (str2 != null) {
            arrayList.add(str);
            arrayList.add(str2);
        }
    }

    public static final void b(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
