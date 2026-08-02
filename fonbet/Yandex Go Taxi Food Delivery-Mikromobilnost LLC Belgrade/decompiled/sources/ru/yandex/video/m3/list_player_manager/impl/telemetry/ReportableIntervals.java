package ru.yandex.video.m3.list_player_manager.impl.telemetry;

import defpackage.egx;
import defpackage.jl40;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.sls;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerInstanceProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u0000 \u00062\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals;", "", "()V", "BaseInterval", "BooleanInterval", "Collection", "Companion", "IntInterval", "ResetAfterEvent", "StringInterval", "TimeInterval", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReportableIntervals {
    public static final int $stable = 0;
    public static final int FLAG_RESET_AFTER_ENGINE_CHANGE = 4;
    public static final int FLAG_RESET_AFTER_PLAY_SESSION = 2;
    public static final int FLAG_RESET_AFTER_SET_SOURCE = 1;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002BY\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00020\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010\u0012R5\u0010\u0006\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R(\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00020\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R$\u0010&\u001a\u0004\u0018\u00018\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0012R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$BaseInterval;", "Data", "", "Type", "Legx;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableProperty;", "dest", "", "retainScopeFlags", "", "isFailFast", "", "waitingForDraw", "<init>", "(Legx;IZLjava/util/Set;)V", "newValue", "Lzy11;", "update", "(Ljava/lang/Object;)V", "Lkotlin/Function0;", "updateOnNextDraw", "(Lsls;)V", "onDraw", "()V", "isSet", "()Z", "isSetOrPending", "scopeFlags", "reset", "(I)V", "out", "report", "Legx;", "getDest", "()Legx;", CA20Status.STATUS_USER_I, "Z", "Ljava/util/Set;", "value", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "setValue", "pendingUpdate", "Lsls;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class BaseInterval<Data, Type> {
        public static final int $stable = 8;
        private final egx dest;
        private final boolean isFailFast;
        private sls pendingUpdate;
        private final int retainScopeFlags;
        private Type value;
        private final Set<BaseInterval<Data, ? extends Object>> waitingForDraw;

        public BaseInterval(egx egxVar, int i, boolean z, Set<BaseInterval<Data, ? extends Object>> set) {
            this.dest = egxVar;
            this.retainScopeFlags = i;
            this.isFailFast = z;
            this.waitingForDraw = set;
        }

        public final egx getDest() {
            return this.dest;
        }

        public final Type getValue() {
            return this.value;
        }

        public final boolean isSet() {
            return this.value != null;
        }

        public final boolean isSetOrPending() {
            return (this.value == null && this.pendingUpdate == null) ? false : true;
        }

        public final void onDraw() {
            sls slsVar = this.pendingUpdate;
            if (slsVar != null) {
                slsVar.invoke();
            }
            this.pendingUpdate = null;
        }

        public final void report(Data out) {
            Type type = this.value;
            if (type != null) {
                this.dest.set(out, type);
            }
        }

        public final void reset(int scopeFlags) {
            if ((scopeFlags & this.retainScopeFlags) != 0) {
                this.value = null;
                this.pendingUpdate = null;
            }
        }

        public final void setValue(Type type) {
            this.value = type;
        }

        public final void update(Type newValue) {
            if (this.isFailFast && isSet()) {
                ny61.r("Value is already set, probably some unhandled case in logger.");
            } else {
                this.value = newValue;
            }
        }

        public final void updateOnNextDraw(sls update) {
            this.pendingUpdate = update;
            this.waitingForDraw.add(this);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002BS\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u001a\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u000b0\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$BooleanInterval;", "Data", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$BaseInterval;", "", "Legx;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/BooleanProperty;", "dest", "", "retainScopeFlags", "isFailFast", "", "", "waitingForDraw", "<init>", "(Legx;IZLjava/util/Set;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BooleanInterval<Data> extends BaseInterval<Data, Boolean> {
        public static final int $stable = 0;

        public BooleanInterval(egx egxVar, int i, boolean z, Set<BaseInterval<Data, ? extends Object>> set) {
            super(egxVar, i, z, set);
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JU\u0010\f\u001a\u00020\u000b2(\u0010\u0007\u001a$\u0012\u0004\u0012\u00028\u0000\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0005j\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u0002`\u00062\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00162\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u001a2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u001f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\u0004J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0010¢\u0006\u0004\b)\u0010*R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R(\u0010.\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00020\t0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R(\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00020\t0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-¨\u00062"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$Collection;", "Data", "", "<init>", "()V", "Legx;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableProperty;", "dest", "", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$BaseInterval;", "collection", "Lzy11;", "checkNoDups", "(Legx;Ljava/util/Set;)V", "", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/TimeProperty;", "", "retainScopeFlags", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$TimeInterval;", "createTime", "(Legx;I)Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$TimeInterval;", "", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/StringProperty;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$StringInterval;", "createString", "(Legx;I)Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$StringInterval;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/IntProperty;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$IntInterval;", "createInt", "(Legx;I)Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$IntInterval;", "", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/BooleanProperty;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$BooleanInterval;", "createBoolean", "(Legx;I)Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$BooleanInterval;", "startPoint", "out", "report", "(JLjava/lang/Object;)V", "onDraw", "scopeFlags", "reset", "(I)V", "", "timeIntervals", "Ljava/util/Set;", "allIntervals", "isFailFast", "Z", "intervalsWaitDraw", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Collection<Data> {
        public static final int $stable = 8;
        private final Set<TimeInterval<Data>> timeIntervals = new LinkedHashSet();
        private final Set<BaseInterval<Data, ? extends Object>> allIntervals = new LinkedHashSet();
        private final boolean isFailFast = ListYandexPlayerManagerInstanceProvider.INSTANCE.isFailFast$video_player_internalRelease();
        private final Set<BaseInterval<Data, ? extends Object>> intervalsWaitDraw = new LinkedHashSet();

        private final void checkNoDups(egx dest, Set<? extends BaseInterval<Data, ? extends Object>> collection) {
            if (this.isFailFast) {
                Set<? extends BaseInterval<Data, ? extends Object>> set = collection;
                if ((set instanceof java.util.Collection) && set.isEmpty()) {
                    return;
                }
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (jl40.l(((BaseInterval) it.next()).getDest(), dest)) {
                        kbs.f(dest, "Duplicate property in collection: ");
                        return;
                    }
                }
            }
        }

        public final BooleanInterval<Data> createBoolean(egx dest, int retainScopeFlags) {
            BooleanInterval<Data> booleanInterval = new BooleanInterval<>(dest, retainScopeFlags, this.isFailFast, this.intervalsWaitDraw);
            checkNoDups(dest, this.allIntervals);
            this.allIntervals.add(booleanInterval);
            return booleanInterval;
        }

        public final IntInterval<Data> createInt(egx dest, int retainScopeFlags) {
            IntInterval<Data> intInterval = new IntInterval<>(dest, retainScopeFlags, this.isFailFast, this.intervalsWaitDraw);
            checkNoDups(dest, this.allIntervals);
            this.allIntervals.add(intInterval);
            return intInterval;
        }

        public final StringInterval<Data> createString(egx dest, int retainScopeFlags) {
            StringInterval<Data> stringInterval = new StringInterval<>(dest, retainScopeFlags, this.isFailFast, this.intervalsWaitDraw);
            checkNoDups(dest, this.allIntervals);
            this.allIntervals.add(stringInterval);
            return stringInterval;
        }

        public final TimeInterval<Data> createTime(egx dest, int retainScopeFlags) {
            TimeInterval<Data> timeInterval = new TimeInterval<>(dest, retainScopeFlags, this.isFailFast, this.intervalsWaitDraw);
            checkNoDups(dest, this.timeIntervals);
            this.timeIntervals.add(timeInterval);
            this.allIntervals.add(timeInterval);
            return timeInterval;
        }

        public final void onDraw() {
            List J0 = a.J0(this.intervalsWaitDraw);
            this.intervalsWaitDraw.clear();
            Iterator it = J0.iterator();
            while (it.hasNext()) {
                ((BaseInterval) it.next()).onDraw();
            }
        }

        public final void report(long startPoint, Data out) {
            Iterator<T> it = this.timeIntervals.iterator();
            while (it.hasNext()) {
                ((TimeInterval) it.next()).updateWithStartPoint(startPoint);
            }
            Iterator<T> it2 = this.allIntervals.iterator();
            while (it2.hasNext()) {
                ((BaseInterval) it2.next()).report(out);
            }
        }

        public final void reset(int scopeFlags) {
            Iterator<T> it = this.allIntervals.iterator();
            while (it.hasNext()) {
                ((BaseInterval) it.next()).reset(scopeFlags);
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002BS\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001a\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u000b0\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$IntInterval;", "Data", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$BaseInterval;", "", "Legx;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/IntProperty;", "dest", "retainScopeFlags", "", "isFailFast", "", "", "waitingForDraw", "<init>", "(Legx;IZLjava/util/Set;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IntInterval<Data> extends BaseInterval<Data, Integer> {
        public static final int $stable = 0;

        public IntInterval(egx egxVar, int i, boolean z, Set<BaseInterval<Data, ? extends Object>> set) {
            super(egxVar, i, z, set);
        }
    }

    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$ResetAfterEvent;", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResetAfterEvent {
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002BS\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\f0\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$StringInterval;", "Data", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$BaseInterval;", "", "Legx;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/StringProperty;", "dest", "", "retainScopeFlags", "", "isFailFast", "", "", "waitingForDraw", "<init>", "(Legx;IZLjava/util/Set;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StringInterval<Data> extends BaseInterval<Data, String> {
        public static final int $stable = 0;

        public StringInterval(egx egxVar, int i, boolean z, Set<BaseInterval<Data, ? extends Object>> set) {
            super(egxVar, i, z, set);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002BS\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\f0\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$TimeInterval;", "Data", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ReportableIntervals$BaseInterval;", "", "Legx;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/TimeProperty;", "dest", "", "retainScopeFlags", "", "isFailFast", "", "", "waitingForDraw", "<init>", "(Legx;IZLjava/util/Set;)V", "startPoint", "Lzy11;", "updateWithStartPoint", "(J)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TimeInterval<Data> extends BaseInterval<Data, Long> {
        public static final int $stable = 0;

        public TimeInterval(egx egxVar, int i, boolean z, Set<BaseInterval<Data, ? extends Object>> set) {
            super(egxVar, i, z, set);
        }

        public final void updateWithStartPoint(long startPoint) {
            Long l;
            Long value = getValue();
            if (value != null) {
                long longValue = value.longValue() - startPoint;
                if (longValue < 0) {
                    longValue = 0;
                }
                l = Long.valueOf(longValue);
            } else {
                l = null;
            }
            setValue(l);
        }
    }

    private ReportableIntervals() {
    }
}
