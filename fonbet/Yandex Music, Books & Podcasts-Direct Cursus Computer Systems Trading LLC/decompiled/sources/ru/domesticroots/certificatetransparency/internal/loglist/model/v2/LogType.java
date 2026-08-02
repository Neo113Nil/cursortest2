package ru.domesticroots.certificatetransparency.internal.loglist.model.v2;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.j66;
import defpackage.qdb;
import defpackage.t9f;
import defpackage.uif;
import defpackage.up6;
import defpackage.vhp;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/LogType;", "", "(Ljava/lang/String;I)V", "PROD", "TEST", "Companion", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final class LogType {
    private static final /* synthetic */ qdb $ENTRIES;
    private static final /* synthetic */ LogType[] $VALUES;

    @NotNull
    private static final arf $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final LogType PROD = new LogType("PROD", 0);
    public static final LogType TEST = new LogType("TEST", 1);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/LogType$Companion;", "", "<init>", "()V", "Lt9f;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/LogType;", "serializer", "()Lt9f;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        /* renamed from: ru.domesticroots.certificatetransparency.internal.loglist.model.v2.LogType$Companion$1, reason: invalid class name */
        public static final class AnonymousClass1 extends uif implements Function0<t9f> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final t9f invoke() {
                return up6.q("ru.domesticroots.certificatetransparency.internal.loglist.model.v2.LogType", LogType.values(), new String[]{"prod", "test"}, new Annotation[][]{null, null});
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ t9f get$cachedSerializer() {
            return (t9f) LogType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final t9f serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ LogType[] $values() {
        return new LogType[]{PROD, TEST};
    }

    static {
        LogType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = j66.Q($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = btf.a(bwf.b, Companion.AnonymousClass1.INSTANCE);
    }

    private LogType(String str, int i) {
    }

    @NotNull
    public static qdb getEntries() {
        return $ENTRIES;
    }

    public static LogType valueOf(String str) {
        return (LogType) Enum.valueOf(LogType.class, str);
    }

    public static LogType[] values() {
        return (LogType[]) $VALUES.clone();
    }
}
