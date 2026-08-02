package ru.yandex.yandexmaps.multiplatform.core.geometry;

import android.os.Parcelable;
import defpackage.flt0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\bf\u0018\u0000 \t2\u00060\u0001j\u0002`\u0002:\u0001\nR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/yandexmaps/multiplatform/core/geometry/Span;", "Landroid/os/Parcelable;", "Lkotlinx/parcelize/Parcelable;", "", "getLatDelta", "()D", "latDelta", "getLonDelta", "lonDelta", "Factory", "flt0", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Span extends Parcelable {
    public static final flt0 Factory = flt0.a;

    double getLatDelta();

    double getLonDelta();
}
