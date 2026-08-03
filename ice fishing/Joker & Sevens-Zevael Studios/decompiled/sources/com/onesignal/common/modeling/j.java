package com.onesignal.common.modeling;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {
    private final i model;
    private final Object newValue;
    private final Object oldValue;
    private final String path;
    private final String property;

    public j(i iVar, String str, String str2, Object obj, Object obj2) {
        pc.j.e(iVar, "model");
        pc.j.e(str, "path");
        pc.j.e(str2, "property");
        this.model = iVar;
        this.path = str;
        this.property = str2;
        this.oldValue = obj;
        this.newValue = obj2;
    }

    public final i getModel() {
        return this.model;
    }

    public final Object getNewValue() {
        return this.newValue;
    }

    public final Object getOldValue() {
        return this.oldValue;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getProperty() {
        return this.property;
    }
}
