package com.fillr.browsersdk.model;

import com.fillr.browsersdk.model.FillrWidget;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class FillrWidget$PerformWidgetDownload$1 {
    public final /* synthetic */ FillrWidget.WidgetType val$type;

    public FillrWidget$PerformWidgetDownload$1(FillrWidget.WidgetType widgetType) {
        this.val$type = widgetType;
    }

    public final void onFailure() {
        Iterator it = this.val$type.storageListeners.iterator();
        while (it.hasNext()) {
            ((FillrWidget$PerformWidgetDownload$1) it.next()).onFailure();
        }
    }

    public final void onSuccess() {
        Iterator it = this.val$type.storageListeners.iterator();
        while (it.hasNext()) {
            ((FillrWidget$PerformWidgetDownload$1) it.next()).onSuccess();
        }
    }
}
