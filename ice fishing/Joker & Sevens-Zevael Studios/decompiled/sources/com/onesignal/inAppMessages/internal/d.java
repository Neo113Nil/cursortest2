package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.internal.display.impl.n;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class d {
    public static final a Companion = new a(null);
    public static final String DISPLAY_DURATION = "display_duration";
    public static final String HTML = "html";
    public static final String REMOVE_HEIGHT_MARGIN = "remove_height_margin";
    public static final String REMOVE_WIDTH_MARGIN = "remove_width_margin";
    public static final String STYLES = "styles";
    private String contentHtml;
    private Double displayDuration;
    private n.c displayLocation;
    private boolean isFullBleed;
    private int pageHeight;
    private boolean useHeightMargin;
    private boolean useWidthMargin;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        private a() {
        }
    }

    public d(JSONObject jSONObject) {
        Boolean safeBool;
        Boolean safeBool2;
        pc.j.e(jSONObject, "jsonObject");
        this.useHeightMargin = true;
        this.useWidthMargin = true;
        this.contentHtml = com.onesignal.common.f.safeString(jSONObject, HTML);
        this.displayDuration = com.onesignal.common.f.safeDouble(jSONObject, DISPLAY_DURATION);
        JSONObject safeJSONObject = com.onesignal.common.f.safeJSONObject(jSONObject, STYLES);
        boolean z10 = false;
        this.useHeightMargin = !((safeJSONObject == null || (safeBool2 = com.onesignal.common.f.safeBool(safeJSONObject, REMOVE_HEIGHT_MARGIN)) == null) ? false : safeBool2.booleanValue());
        if (safeJSONObject != null && (safeBool = com.onesignal.common.f.safeBool(safeJSONObject, REMOVE_WIDTH_MARGIN)) != null) {
            z10 = safeBool.booleanValue();
        }
        this.useWidthMargin = !z10;
        this.isFullBleed = !this.useHeightMargin;
    }

    public final String getContentHtml() {
        return this.contentHtml;
    }

    public final Double getDisplayDuration() {
        return this.displayDuration;
    }

    public final n.c getDisplayLocation() {
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

    public final void setDisplayDuration(Double d10) {
        this.displayDuration = d10;
    }

    public final void setDisplayLocation(n.c cVar) {
        this.displayLocation = cVar;
    }

    public final void setFullBleed(boolean z10) {
        this.isFullBleed = z10;
    }

    public final void setPageHeight(int i10) {
        this.pageHeight = i10;
    }

    public final void setUseHeightMargin(boolean z10) {
        this.useHeightMargin = z10;
    }

    public final void setUseWidthMargin(boolean z10) {
        this.useWidthMargin = z10;
    }
}
