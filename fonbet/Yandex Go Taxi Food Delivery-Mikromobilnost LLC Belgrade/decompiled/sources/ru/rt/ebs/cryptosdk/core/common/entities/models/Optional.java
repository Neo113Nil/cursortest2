package ru.rt.ebs.cryptosdk.core.common.entities.models;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.wf70;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001aB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/common/entities/models/Optional;", "T", "", "value", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "extractValue", "", "hasValue", "()Z", "isNone", "copy", "(Ljava/lang/Object;)Lru/rt/ebs/cryptosdk/core/common/entities/models/Optional;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "Companion", "wf70", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Optional<T> {
    public static final wf70 Companion = new wf70();
    private final T value;

    public Optional(T t) {
        this.value = t;
    }

    private final T component1() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Optional copy$default(Optional optional, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = optional.value;
        }
        return optional.copy(obj);
    }

    public final Optional<T> copy(T value) {
        return new Optional<>(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Optional) && jl40.l(this.value, ((Optional) other).value);
    }

    public final T extractValue() {
        return this.value;
    }

    public final boolean hasValue() {
        return this.value != null;
    }

    public int hashCode() {
        T t = this.value;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final boolean isNone() {
        return this.value == null;
    }

    public String toString() {
        return qv10.p("Optional(value=", Extension.C_BRAKE, this.value);
    }
}
