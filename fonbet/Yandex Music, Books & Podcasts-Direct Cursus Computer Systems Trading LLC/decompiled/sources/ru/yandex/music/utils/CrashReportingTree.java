package ru.yandex.music.utils;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.utils.ThrowablesKt;
import defpackage.bec;
import defpackage.cy1;
import defpackage.ezc;
import defpackage.kp6;
import defpackage.qf0;
import defpackage.u75;
import defpackage.vq6;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ,\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0014R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/yandex/music/utils/CrashReportingTree;", "Ltimber/log/Timber$Tree;", "mExceptionReporter", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "()V", "log", "priority", "", "tag", "", Constants.KEY_MESSAGE, "t", "Companion", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class CrashReportingTree extends Timber.Tree {

    @NotNull
    private static final List<Class<?>> IGNORABLE_CLASSES = u75.h(Assertions.class, Timber.class, CrashReportingTree.class);

    @NotNull
    private final Function1<Throwable, Unit> mExceptionReporter;

    public CrashReportingTree() {
        this(new AnonymousClass1(bec.a()));
    }

    @Override // timber.log.Timber.Tree
    public void log(int priority, String tag, @NotNull String message, Throwable t) {
        message.getClass();
        if (priority != 7) {
            return;
        }
        bec a = bec.a();
        if (tag == null) {
            tag = "";
        }
        kp6 kp6Var = a.a;
        ((vq6) kp6Var.o.a).d(new cy1(8, kp6Var, "nonFatalTag", tag));
        if (t != null) {
            this.mExceptionReporter.invoke(t);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(message);
        ThrowablesKt.trimStackTrace(illegalStateException, IGNORABLE_CLASSES);
        this.mExceptionReporter.invoke(illegalStateException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CrashReportingTree(@NotNull Function1<? super Throwable, Unit> function1) {
        function1.getClass();
        this.mExceptionReporter = function1;
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.yandex.music.utils.CrashReportingTree$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends ezc implements Function1<Throwable, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, 0, bec.class, obj, "recordException", "recordException(Ljava/lang/Throwable;)V");
        }

        public final void invoke(Throwable th) {
            th.getClass();
            kp6 kp6Var = ((bec) this.receiver).a;
            Map map = Collections.EMPTY_MAP;
            ((vq6) kp6Var.o.a).d(new qf0(kp6Var, th));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.a;
        }
    }
}
