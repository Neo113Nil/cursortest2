package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.internal.display.impl.m;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {
    public static final a Companion = new a(null);
    public static final String DISPLAY_DURATION = "display_duration";
    public static final String HTML = "html";
    public static final String REMOVE_HEIGHT_MARGIN = "remove_height_margin";
    public static final String REMOVE_WIDTH_MARGIN = "remove_width_margin";
    public static final String STYLES = "styles";
    private String contentHtml;
    private Double displayDuration;
    private m.c displayLocation;
    private boolean isFullBleed;
    private int pageHeight;
    private boolean useHeightMargin;
    private boolean useWidthMargin;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public d(JSONObject jsonObject) {
        Boolean safeBool;
        Boolean safeBool2;
        kotlin.jvm.internal.h.e(jsonObject, "jsonObject");
        this.useHeightMargin = true;
        this.useWidthMargin = true;
        this.contentHtml = com.onesignal.common.e.safeString(jsonObject, HTML);
        this.displayDuration = com.onesignal.common.e.safeDouble(jsonObject, DISPLAY_DURATION);
        JSONObject safeJSONObject = com.onesignal.common.e.safeJSONObject(jsonObject, STYLES);
        boolean z6 = false;
        this.useHeightMargin = !((safeJSONObject == null || (safeBool2 = com.onesignal.common.e.safeBool(safeJSONObject, REMOVE_HEIGHT_MARGIN)) == null) ? false : safeBool2.booleanValue());
        if (safeJSONObject != null && (safeBool = com.onesignal.common.e.safeBool(safeJSONObject, REMOVE_WIDTH_MARGIN)) != null) {
            z6 = safeBool.booleanValue();
        }
        this.useWidthMargin = !z6;
        this.isFullBleed = !this.useHeightMargin;
    }

    public final String getContentHtml() {
        return this.contentHtml;
    }

    public final Double getDisplayDuration() {
        return this.displayDuration;
    }

    public final m.c getDisplayLocation() {
        return this.displayLocation;
    }

    public final int getPageHeight() {
        return this.pageHeight;
    }

    public final boolean getUseHeightMargin() {
        return this.useHeightMargin;
    }

    public final boolean getUseWidthMargin() {
        return this.useWidthMargin;
    }

    public final boolean isFullBleed() {
        return this.isFullBleed;
    }

    public final void setContentHtml(String str) {
        this.contentHtml = str;
    }

    public final void setDisplayDuration(Double d9) {
        this.displayDuration = d9;
    }

    public final void setDisplayLocation(m.c cVar) {
        this.displayLocation = cVar;
    }

    public final void setFullBleed(boolean z6) {
        this.isFullBleed = z6;
    }

    public final void setPageHeight(int i) {
        this.pageHeight = i;
    }

    public final void setUseHeightMargin(boolean z6) {
        this.useHeightMargin = z6;
    }

    public final void setUseWidthMargin(boolean z6) {
        this.useWidthMargin = z6;
    }
}
