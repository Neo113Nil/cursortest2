package io.appmetrica.analytics.accessibilitysystemwrapper.internal;

import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0017\u0018\u00002\u00020\u0001B[\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\b¨\u0006\u001b"}, d2 = {"Lio/appmetrica/analytics/accessibilitysystemwrapper/internal/AccessibilityServices;", "", "", "toString", "", "a", "Ljava/util/List;", "getAudible", "()Ljava/util/List;", "audible", "b", "getGeneric", "generic", "c", "getHaptic", "haptic", "d", "getSpoken", "spoken", "e", "getVisual", "visual", "f", "getBraille", "braille", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "accessibility-system-wrapper_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class AccessibilityServices {

    /* renamed from: a, reason: from kotlin metadata */
    private final List audible;

    /* renamed from: b, reason: from kotlin metadata */
    private final List generic;

    /* renamed from: c, reason: from kotlin metadata */
    private final List haptic;

    /* renamed from: d, reason: from kotlin metadata */
    private final List spoken;

    /* renamed from: e, reason: from kotlin metadata */
    private final List visual;

    /* renamed from: f, reason: from kotlin metadata */
    private final List braille;

    public AccessibilityServices(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6) {
        this.audible = list;
        this.generic = list2;
        this.haptic = list3;
        this.spoken = list4;
        this.visual = list5;
        this.braille = list6;
    }

    public final List<String> getAudible() {
        return this.audible;
    }

    public final List<String> getBraille() {
        return this.braille;
    }

    public final List<String> getGeneric() {
        return this.generic;
    }

    public final List<String> getHaptic() {
        return this.haptic;
    }

    public final List<String> getSpoken() {
        return this.spoken;
    }

    public final List<String> getVisual() {
        return this.visual;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AccessabilityServices(audible=");
        sb.append(this.audible);
        sb.append(", generic=");
        sb.append(this.generic);
        sb.append(", haptic=");
        sb.append(this.haptic);
        sb.append(", spoken=");
        sb.append(this.spoken);
        sb.append(", visual=");
        sb.append(this.visual);
        sb.append(", braille=");
        return unr0.t(sb, this.braille, ')');
    }
}
