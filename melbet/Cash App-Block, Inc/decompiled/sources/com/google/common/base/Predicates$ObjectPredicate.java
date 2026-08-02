package com.google.common.base;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class Predicates$ObjectPredicate implements Predicate {
    public static final /* synthetic */ Predicates$ObjectPredicate[] $VALUES;
    public static final AnonymousClass1 ALWAYS_TRUE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.base.Predicates$ObjectPredicate$1] */
    static {
        ?? r0 = new Predicates$ObjectPredicate() { // from class: com.google.common.base.Predicates$ObjectPredicate.1
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        };
        ALWAYS_TRUE = r0;
        $VALUES = new Predicates$ObjectPredicate[]{r0, new Predicates$ObjectPredicate() { // from class: com.google.common.base.Predicates$ObjectPredicate.2
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new Predicates$ObjectPredicate() { // from class: com.google.common.base.Predicates$ObjectPredicate.3
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new Predicates$ObjectPredicate() { // from class: com.google.common.base.Predicates$ObjectPredicate.4
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static Predicates$ObjectPredicate valueOf(String str) {
        return (Predicates$ObjectPredicate) Enum.valueOf(Predicates$ObjectPredicate.class, str);
    }

    public static Predicates$ObjectPredicate[] values() {
        return (Predicates$ObjectPredicate[]) $VALUES.clone();
    }
}
