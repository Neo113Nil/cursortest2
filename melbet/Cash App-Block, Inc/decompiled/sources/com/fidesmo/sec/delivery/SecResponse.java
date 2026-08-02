package com.fidesmo.sec.delivery;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ,\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/fidesmo/sec/delivery/SecResponse;", "", "commands", "", "", "keepOpen", "", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getCommands", "()Ljava/util/List;", "getKeepOpen", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/fidesmo/sec/delivery/SecResponse;", "equals", "other", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SecResponse {
    private final List<byte[]> commands;
    private final Boolean keepOpen;

    public /* synthetic */ SecResponse(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SecResponse copy$default(SecResponse secResponse, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = secResponse.commands;
        }
        if ((i & 2) != 0) {
            bool = secResponse.keepOpen;
        }
        return secResponse.copy(list, bool);
    }

    public final List<byte[]> component1() {
        return this.commands;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getKeepOpen() {
        return this.keepOpen;
    }

    public final SecResponse copy(List<byte[]> commands, Boolean keepOpen) {
        return new SecResponse(commands, keepOpen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecResponse)) {
            return false;
        }
        SecResponse secResponse = (SecResponse) other;
        return Intrinsics.areEqual(this.commands, secResponse.commands) && Intrinsics.areEqual(this.keepOpen, secResponse.keepOpen);
    }

    public final List<byte[]> getCommands() {
        return this.commands;
    }

    public final Boolean getKeepOpen() {
        return this.keepOpen;
    }

    public int hashCode() {
        List<byte[]> list = this.commands;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.keepOpen;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "SecResponse(commands=" + this.commands + ", keepOpen=" + this.keepOpen + ')';
    }

    public SecResponse(List<byte[]> list, Boolean bool) {
        this.commands = list;
        this.keepOpen = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SecResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
