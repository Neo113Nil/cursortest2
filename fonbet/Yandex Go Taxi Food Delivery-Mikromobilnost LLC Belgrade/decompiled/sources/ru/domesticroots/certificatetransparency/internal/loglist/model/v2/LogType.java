package ru.domesticroots.certificatetransparency.internal.loglist.model.v2;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.sls;
import defpackage.vez0;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/LogType;", "", "(Ljava/lang/String;I)V", "PROD", "TEST", "Companion", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LogType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final LogType PROD = new LogType("PROD", 0);
    public static final LogType TEST = new LogType("TEST", 1);

    private static final /* synthetic */ LogType[] $values() {
        return new LogType[]{PROD, TEST};
    }

    static {
        LogType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sls() { // from class: ru.domesticroots.certificatetransparency.internal.loglist.model.v2.LogType.Companion.1
            @Override // defpackage.sls
            public final KSerializer invoke() {
                return vez0.g("ru.domesticroots.certificatetransparency.internal.loglist.model.v2.LogType", LogType.values(), new String[]{"prod", "test"}, new Annotation[][]{null, null});
            }
        });
    }

    private LogType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static LogType valueOf(String str) {
        return (LogType) Enum.valueOf(LogType.class, str);
    }

    public static LogType[] values() {
        return (LogType[]) $VALUES.clone();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/LogType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/LogType;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) LogType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
