package ru.yandex.taxi.surge.models.dto;

import defpackage.gsq0;
import defpackage.jrw0;
import defpackage.zza;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/z0;", "Lru/yandex/taxi/surge/models/dto/j1;", "Companion", "irw0", "jrw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class z0 extends j1 {
    public static final jrw0 Companion = new jrw0();
    public final zza a;

    public z0(int i, zza zzaVar) {
        if ((i & 1) == 0) {
            this.a = new zza(0);
        } else {
            this.a = zzaVar;
        }
    }

    public z0() {
        this.a = new zza(0);
    }
}
