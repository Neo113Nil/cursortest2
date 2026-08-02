package com.google.android.play.core.splitinstall.internal;

import android.text.StaticLayout;
import android.util.Pair;
import android.widget.TextView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.internal.UtilsKt;
import com.squareup.cash.genericelements.presenters.mappers.GenericActionType;
import com.squareup.cash.genericelements.presenters.mappers.GenericElementTreeActionMapperKt$WhenMappings;
import com.squareup.cash.genericelements.viewmodels.GenericAnalyticsData;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.Action$Action$Dismiss;
import com.squareup.protos.cash.genericelements.ui.Action$Action$OpenUrl;
import com.squareup.protos.cash.genericelements.ui.Action$Action$Overlay;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class zzj {
    public static final int calculateLines(TextView textView) {
        int width;
        CharSequence text = textView.getText();
        if (text == null || (width = textView.getWidth()) == 0 || StringsKt.isBlank(text)) {
            return 0;
        }
        StaticLayout build = StaticLayout.Builder.obtain(text, 0, text.length(), textView.getPaint(), width).build();
        build.getClass();
        return build.getLineCount();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final GenericTreeElementsViewEvent toViewEvent(Action action) {
        Action.OpenUrlAction openUrlAction;
        Action.DismissAction dismissAction;
        Action.OverlayAction overlayAction;
        GenericActionType genericActionType;
        int i;
        action.getClass();
        AnalyticsEvent analyticsEvent = action.analytics_event;
        UtilsKt utilsKt = action.action;
        GenericAnalyticsData analyticsData = analyticsEvent != null ? zzi.toAnalyticsData(analyticsEvent) : null;
        if (utilsKt != null) {
            Action$Action$OpenUrl action$Action$OpenUrl = utilsKt instanceof Action$Action$OpenUrl ? (Action$Action$OpenUrl) utilsKt : null;
            if (action$Action$OpenUrl != null) {
                openUrlAction = action$Action$OpenUrl.value;
                if (openUrlAction == null) {
                    genericActionType = GenericActionType.OPEN_URL;
                } else {
                    if (utilsKt != null) {
                        Action$Action$Dismiss action$Action$Dismiss = utilsKt instanceof Action$Action$Dismiss ? (Action$Action$Dismiss) utilsKt : null;
                        if (action$Action$Dismiss != null) {
                            dismissAction = action$Action$Dismiss.value;
                            if (dismissAction == null) {
                                genericActionType = GenericActionType.DISMISS;
                            } else {
                                if (utilsKt != null) {
                                    Action$Action$Overlay action$Action$Overlay = utilsKt instanceof Action$Action$Overlay ? (Action$Action$Overlay) utilsKt : null;
                                    if (action$Action$Overlay != null) {
                                        overlayAction = action$Action$Overlay.value;
                                        genericActionType = overlayAction == null ? GenericActionType.OVERLAY : null;
                                    }
                                }
                                overlayAction = null;
                                if (overlayAction == null) {
                                }
                            }
                        }
                    }
                    dismissAction = null;
                    if (dismissAction == null) {
                    }
                }
                i = genericActionType != null ? -1 : GenericElementTreeActionMapperKt$WhenMappings.$EnumSwitchMapping$0[genericActionType.ordinal()];
                if (i != -1) {
                    return null;
                }
                if (i == 1) {
                    utilsKt.getClass();
                    Action$Action$OpenUrl action$Action$OpenUrl2 = utilsKt instanceof Action$Action$OpenUrl ? (Action$Action$OpenUrl) utilsKt : null;
                    Action.OpenUrlAction openUrlAction2 = action$Action$OpenUrl2 != null ? action$Action$OpenUrl2.value : null;
                    openUrlAction2.getClass();
                    String str = openUrlAction2.url;
                    str.getClass();
                    return new GenericTreeElementsViewEvent.OpenUrlEvent(str, analyticsData);
                }
                if (i == 2) {
                    utilsKt.getClass();
                    Action$Action$Dismiss action$Action$Dismiss2 = utilsKt instanceof Action$Action$Dismiss ? (Action$Action$Dismiss) utilsKt : null;
                    (action$Action$Dismiss2 != null ? action$Action$Dismiss2.value : null).getClass();
                    return new GenericTreeElementsViewEvent.DismissEvent(analyticsData);
                }
                if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                utilsKt.getClass();
                Action$Action$Overlay action$Action$Overlay2 = utilsKt instanceof Action$Action$Overlay ? (Action$Action$Overlay) utilsKt : null;
                Action.OverlayAction overlayAction2 = action$Action$Overlay2 != null ? action$Action$Overlay2.value : null;
                overlayAction2.getClass();
                String str2 = overlayAction2.get_elements_context;
                if (str2 == null) {
                    str2 = "required_context";
                }
                return new GenericTreeElementsViewEvent.PromptOverlayEvent(str2, overlayAction2.overlay_element_tree, overlayAction2.error_element_tree, analyticsData);
            }
        }
        openUrlAction = null;
        if (openUrlAction == null) {
        }
        if (genericActionType != null) {
        }
        if (i != -1) {
        }
    }

    public static Pair zzf(RandomAccessFile randomAccessFile, int i) {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        zzg(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            for (int i4 = 0; i4 < min; i4++) {
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                    break;
                }
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i2));
    }

    public static void zzg(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("ByteBuffer byte order must be little endian");
    }
}
