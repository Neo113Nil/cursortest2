package com.instagram.common.viewpoint.core;

import android.app.ActivityManager;
import android.content.Context;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1339Wp {
    public static byte[] A00;
    public static String[] A01 = {"vserbkQ71L70HeExkEksLvSV50Js9e5T", "kCtue8tdTX7Ntsd63evdhPLiI5GlGyVZ", "TwC9DE0UkCmO5xuA9ppRryz5QvyD", "4CWs1R6rr7PkkffzytFACCqk28rMKWqF", "DS0L0fcRoHYALrKB9SSkXSb7384LvFtu", "e8tzsRThNax4EAToJhNq21dAKBpwgTLo", "Q0BiPrkB2PSWzVDnLZTkEnIKaCsuaheD", "rbmY91JFcJMC4pCqNbunWn9nQrXHl54t"};

    public static String A02(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(20) == strArr[1].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "hlZJhcxljYiKc7UKHZyQNCRGeosS0rVV";
            strArr2[7] = "L6Z1FseRPLChQnX48wkOINplJZHgpjkr";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 49);
            i10++;
        }
    }

    public static void A03() {
        A00 = new byte[]{-37, -35, -18, -29, -16, -29, -18, -13, -1, 12, 2, 16, 13, 7, 2, -52, 7, 12, 18, 3, 12, 18, -52, 1, -1, 18, 3, 5, 13, 16, 23, -52, -22, -33, -13, -20, -31, -26, -29, -16};
    }

    static {
        A03();
    }

    public static EnumC1338Wo A00(Context context) {
        try {
            return A01(context);
        } catch (Exception unused) {
            return EnumC1338Wo.A05;
        }
    }

    public static EnumC1338Wo A01(Context context) {
        if (context == null) {
            return EnumC1338Wo.A0D;
        }
        ActivityManager mgr = (ActivityManager) context.getSystemService(A02(0, 8, 73));
        if (mgr == null) {
            EnumC1338Wo enumC1338Wo = EnumC1338Wo.A08;
            if (A01[0].charAt(27) == 'o') {
                throw new RuntimeException();
            }
            A01[2] = "W800VLcbCNBOE1f9F";
            return enumC1338Wo;
        }
        List<ActivityManager.AppTask> tasks = mgr.getAppTasks();
        if (tasks.isEmpty()) {
            return EnumC1338Wo.A0B;
        }
        Iterator<ActivityManager.AppTask> it = tasks.iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            if (taskInfo != null && taskInfo.baseIntent != null && taskInfo.baseIntent.getCategories() != null && taskInfo.baseIntent.getCategories().contains(A02(8, 32, a.f21756z))) {
                return EnumC1338Wo.A06;
            }
        }
        EnumC1338Wo enumC1338Wo2 = EnumC1338Wo.A09;
        String[] strArr = A01;
        if (strArr[3].charAt(22) == strArr[5].charAt(22)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "GyHEsdoLJV3XEjiFxTFX6orc2Mvnrd3k";
        strArr2[7] = "nU2m6dMK7qfy4atV1JxTmvIeg7zDsgbu";
        return enumC1338Wo2;
    }
}
