package ru.yandex.video.m3.player.provider.model;

import defpackage.oyr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/provider/model/StartQuality;", "", "height", "", "constructor-impl", "(I)I", "getHeight", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StartQuality {
    private final int height;

    private /* synthetic */ StartQuality(int i) {
        this.height = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartQuality m804boximpl(int i) {
        return new StartQuality(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m805constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m806equalsimpl(int i, Object obj) {
        return (obj instanceof StartQuality) && i == ((StartQuality) obj).m810unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m807equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m808hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m809toStringimpl(int i) {
        return oyr.e(')', i, "StartQuality(height=");
    }

    public boolean equals(Object obj) {
        return m806equalsimpl(this.height, obj);
    }

    public final int getHeight() {
        return this.height;
    }

    public int hashCode() {
        return m808hashCodeimpl(this.height);
    }

    public String toString() {
        return m809toStringimpl(this.height);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m810unboximpl() {
        return this.height;
    }
}
