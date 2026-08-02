package com.bugsnag.android;

import android.app.ApplicationExitInfo;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public abstract class CodeDescriptionsKt {
    public static final String exitReasonOf(ApplicationExitInfo applicationExitInfo) {
        switch (applicationExitInfo.getReason()) {
            case 0:
                return "unknown reason (" + applicationExitInfo.getReason() + ')';
            case 1:
                return "exit self";
            case 2:
                return "signaled";
            case 3:
                return "low memory";
            case 4:
                return "crash";
            case 5:
                return "crash native";
            case 6:
                return "ANR";
            case 7:
                return "initialization failure";
            case 8:
                return "permission change";
            case 9:
                return "excessive resource usage";
            case 10:
                return "user requested";
            case 11:
                return "user stopped";
            case 12:
                return "dependency died";
            case 13:
                return "other";
            case 14:
                return "freezer";
            case 15:
                return "package state change";
            case 16:
                return "package updated";
            default:
                return "unknown reason (" + applicationExitInfo.getReason() + ')';
        }
    }

    public static final String importanceDescriptionOf(ApplicationExitInfo applicationExitInfo) {
        int importance = applicationExitInfo.getImportance();
        if (importance == 1) {
            return "provider in use";
        }
        if (importance == 2) {
            return "service in use";
        }
        switch (importance) {
            case 100:
                return "foreground";
            case 125:
                return "foreground service";
            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
            case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                return "perceptible";
            case 150:
            case SDK_ASSET_ICON_REPORT_VALUE:
                return "top sleeping";
            case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
            case 350:
                return "can't save state";
            case 200:
                return "visible";
            case SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE:
                return "service";
            case 400:
                return "cached/background";
            case 500:
                return "empty";
            case IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO /* 1000 */:
                return "gone";
            default:
                return "unknown importance (" + applicationExitInfo.getImportance() + ')';
        }
    }
}
