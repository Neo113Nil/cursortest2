package ru.yandex.taxi.preorder.source.userposition.misc;

import android.location.Location;
import defpackage.jst;
import defpackage.unr0;
import defpackage.y6f0;
import kotlin.Metadata;
import kotlinx.coroutines.channels.b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/preorder/source/userposition/misc/MultipleLocationEmitter;", "Lru/yandex/taxi/preorder/source/userposition/misc/LocationListenerAdapter;", "Ly6f0;", "Landroid/location/Location;", "emitter", "<init>", "(Ly6f0;)V", "location", "Lzy11;", "onLocationChanged", "(Landroid/location/Location;)V", "Ly6f0;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
final class MultipleLocationEmitter extends LocationListenerAdapter {
    private final y6f0 emitter;

    public MultipleLocationEmitter(y6f0 y6f0Var) {
        this.emitter = y6f0Var;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        unr0.C(new Object[]{location}, 1, "Multiple location sources: Got location: %s", jst.e);
        b.c(this.emitter, location);
    }
}
