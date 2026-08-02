package ru.CryptoPro.JCP.Util;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import com.ybsdk.widgets.common.BlendingGradientView;
import com.ybsdk.widgets.common.CodeInputView;
import java.io.UnsupportedEncodingException;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes4.dex */
public class ConverterCP1251 {
    private static SymCode[] CodeTable = {new SymCode(128, 1026), new SymCode(HProv.PP_SECURITY_LEVEL, 1027), new SymCode(130, 8218), new SymCode(HProv.PP_FAST_CODE, 1107), new SymCode(HProv.PP_CONTAINER_EXTENSION, 8222), new SymCode(HProv.PP_ENUM_CONTAINER_EXTENSION, 8230), new SymCode(HProv.PP_CONTAINER_EXTENSION_DEL, 8224), new SymCode(HProv.PP_CONTAINER_DEFAULT, 8225), new SymCode(HProv.PP_LCD_QUERY, 8364), new SymCode(HProv.PP_ENUM_LOG, 8240), new SymCode(HProv.PP_VERSION_EX, 1033), new SymCode(139, 8249), new SymCode(PollMessageDraft.MAX_ANSWER_LENGTH, 1034), new SymCode(141, 1036), new SymCode(142, 1035), new SymCode(143, 1039), new SymCode(144, 1106), new SymCode(145, 8216), new SymCode(HProv.PP_CONTAINER_STATUS, 8217), new SymCode(147, 8220), new SymCode(148, 8221), new SymCode(149, CodeInputView.PLACEHOLDER), new SymCode(150, 8211), new SymCode(151, 8212), new SymCode(BlendingGradientView.BASE_ALPHA, 8482), new SymCode(154, 1113), new SymCode(ModuleDescriptor.MODULE_VERSION, 8250), new SymCode(156, 1114), new SymCode(157, 1116), new SymCode(HProv.PP_LICENSE, 1115), new SymCode(159, 1119), new SymCode(160, 160), new SymCode(161, 1038), new SymCode(162, 1118), new SymCode(HProv.PP_HANDLE_COUNT, 1032), new SymCode(164, 164), new SymCode(165, 1168), new SymCode(166, 166), new SymCode(167, 167), new SymCode(JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 1025), new SymCode(169, 169), new SymCode(MSException.ERROR_BUSY, 1028), new SymCode(HProv.PP_REFCOUNT, 171), new SymCode(HProv.PP_EXPORT_CSP, 172), new SymCode(173, 173), new SymCode(174, 174), new SymCode(175, 1031), new SymCode(176, 176), new SymCode(177, 177), new SymCode(178, 1030), new SymCode(179, 1110), new SymCode(SubsamplingScaleImageView.ORIENTATION_180, 1169), new SymCode(181, 181), new SymCode(182, 182), new SymCode(183, 183), new SymCode(184, 1105), new SymCode(185, 8470), new SymCode(186, 1108), new SymCode(187, 187), new SymCode(188, 1112), new SymCode(189, 1029), new SymCode(190, 1109), new SymCode(191, 1111), new SymCode(192, 1040), new SymCode(193, 1041), new SymCode(194, 1042), new SymCode(195, 1043), new SymCode(196, 1044), new SymCode(197, 1045), new SymCode(198, 1046), new SymCode(199, 1047), new SymCode(200, 1048), new SymCode(201, 1049), new SymCode(202, 1050), new SymCode(203, 1051), new SymCode(204, 1052), new SymCode(205, 1053), new SymCode(206, 1054), new SymCode(207, 1055), new SymCode(208, 1056), new SymCode(209, 1057), new SymCode(210, 1058), new SymCode(211, 1059), new SymCode(212, 1060), new SymCode(213, 1061), new SymCode(214, 1062), new SymCode(215, 1063), new SymCode(216, 1064), new SymCode(217, 1065), new SymCode(HProv.PP_AUTH_INFO, 1066), new SymCode(219, 1067), new SymCode(220, 1068), new SymCode(221, 1069), new SymCode(222, 1070), new SymCode(223, 1071), new SymCode(224, 1072), new SymCode(225, 1073), new SymCode(226, 1074), new SymCode(227, 1075), new SymCode(228, 1076), new SymCode(229, 1077), new SymCode(230, 1078), new SymCode(231, 1079), new SymCode(232, 1080), new SymCode(233, 1081), new SymCode(MSException.ERROR_MORE_DATA, 1082), new SymCode(235, 1083), new SymCode(236, 1084), new SymCode(237, 1085), new SymCode(238, 1086), new SymCode(239, 1087), new SymCode(PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, 1088), new SymCode(241, 1089), new SymCode(242, 1090), new SymCode(243, 1091), new SymCode(244, 1092), new SymCode(245, 1093), new SymCode(246, 1094), new SymCode(247, 1095), new SymCode(248, 1096), new SymCode(249, 1097), new SymCode(250, 1098), new SymCode(251, 1099), new SymCode(252, 1100), new SymCode(253, 1101), new SymCode(254, 1102), new SymCode(255, 1103)};

    public static class SymCode {
        byte AscCode;
        char UniCode;

        public SymCode(int i, char c) {
            this.AscCode = (byte) (i & 255);
            this.UniCode = c;
        }

        public byte getAscii() {
            return this.AscCode;
        }

        public char getUnicode() {
            return this.UniCode;
        }
    }

    private static char performA2U(byte b) throws UnsupportedEncodingException {
        byte[] bArr = {b, 0};
        int i = 0;
        while (true) {
            SymCode[] symCodeArr = CodeTable;
            if (i >= symCodeArr.length) {
                return new String(bArr, "UTF-16LE").charAt(0);
            }
            if (b == symCodeArr[i].getAscii()) {
                return CodeTable[i].getUnicode();
            }
            i++;
        }
    }

    private static char performU2A(char c) throws UnsupportedEncodingException {
        int i = 0;
        while (true) {
            SymCode[] symCodeArr = CodeTable;
            if (i >= symCodeArr.length) {
                return c;
            }
            if (c == symCodeArr[i].getUnicode()) {
                return new String(new byte[]{CodeTable[i].getAscii(), 0}, "UTF-16LE").charAt(0);
            }
            i++;
        }
    }

    public static String toAscii(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            try {
                str2 = str2 + performU2A(str.charAt(i));
            } catch (UnsupportedEncodingException unused) {
                return str;
            }
        }
        return str2;
    }

    public static String toUnicode(String str) {
        StringBuilder sb;
        try {
            byte[] bytes = str.getBytes("UTF-16LE");
            String str2 = "";
            for (int i = 0; i < bytes.length - 1; i += 2) {
                byte b = bytes[i + 1];
                if (b == 0 && bytes[i] <= 0) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(performA2U(bytes[i]));
                    str2 = sb.toString();
                }
                byte[] bArr = {bytes[i], b};
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(new String(bArr, "UTF-16LE"));
                str2 = sb.toString();
            }
            return str2;
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }
}
