package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Action;", "", "<init>", "(Ljava/lang/String;I)V", "PROCESSING", "SUCCESSFUL_VERIFICATION", "RETRY", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Action[] $VALUES;
    public static final Action PROCESSING = new Action("PROCESSING", 0);
    public static final Action SUCCESSFUL_VERIFICATION = new Action("SUCCESSFUL_VERIFICATION", 1);
    public static final Action RETRY = new Action("RETRY", 2);

    private static final /* synthetic */ Action[] $values() {
        return new Action[]{PROCESSING, SUCCESSFUL_VERIFICATION, RETRY};
    }

    static {
        Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private Action(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) $VALUES.clone();
    }
}
