package ru.yandex.video.m3.player.error_handling;

import defpackage.jl40;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingResult;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/error_handling/CompositeErrorHandlingRule;", "Lru/yandex/video/m3/player/PlayerObserver;", CA20Status.STATUS_CERTIFICATE_H, "Lru/yandex/video/m3/player/error_handling/ErrorHandlingRule;", "<init>", "()V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "", "canErrorBeHandled", "(Lru/yandex/video/m3/player/PlaybackException;)Z", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "apply", "(Lru/yandex/video/m3/player/PlaybackException;)Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "rule", "Lzy11;", "addRule", "(Lru/yandex/video/m3/player/error_handling/ErrorHandlingRule;)V", "observer", "addObserver", "(Lru/yandex/video/m3/player/PlayerObserver;)V", "", "_rules", "Ljava/util/List;", "observers", "", "getRules", "()Ljava/util/List;", "rules", "getRequiredObservers", "requiredObservers", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompositeErrorHandlingRule<H extends PlayerObserver<?>> implements ErrorHandlingRule {
    private final List<ErrorHandlingRule> _rules = new ArrayList();
    private final List<H> observers = new ArrayList();

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final void addObserver(H observer) {
        this.observers.add(observer);
    }

    public final void addRule(ErrorHandlingRule rule) {
        this._rules.add(rule);
    }

    @Override // ru.yandex.video.m3.player.error_handling.ErrorHandlingRule
    public ErrorHandlingResult apply(PlaybackException playbackException) {
        Object obj;
        ErrorHandlingResult apply;
        Iterator<T> it = getRules().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ErrorHandlingRule) obj).canErrorBeHandled(playbackException)) {
                break;
            }
        }
        ErrorHandlingRule errorHandlingRule = (ErrorHandlingRule) obj;
        return (errorHandlingRule == null || (apply = errorHandlingRule.apply(playbackException)) == null) ? ErrorHandlingResult.NotHandled.INSTANCE : apply;
    }

    @Override // ru.yandex.video.m3.player.error_handling.ErrorHandlingRule
    public boolean canErrorBeHandled(PlaybackException playbackException) {
        List<ErrorHandlingRule> rules = getRules();
        if ((rules instanceof Collection) && rules.isEmpty()) {
            return false;
        }
        Iterator<T> it = rules.iterator();
        while (it.hasNext()) {
            if (((ErrorHandlingRule) it.next()).canErrorBeHandled(playbackException)) {
                return true;
            }
        }
        return false;
    }

    public final List<H> getRequiredObservers() {
        return this.observers;
    }

    public final List<ErrorHandlingRule> getRules() {
        return this._rules;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u000b\u001a\u00020\n\"\u000e\b\u0001\u0010\u0005\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0004\"\b\b\u0002\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\t\u001a\u00028\u0002H\u0086\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/error_handling/CompositeErrorHandlingRule$Companion;", "", "<init>", "()V", "Lru/yandex/video/m3/player/PlayerObserver;", CA20Status.STATUS_CERTIFICATE_H, "Lru/yandex/video/m3/player/error_handling/ErrorHandlingRule;", "T", "Lru/yandex/video/m3/player/error_handling/CompositeErrorHandlingRule;", "rule", "Lzy11;", "add", "(Lru/yandex/video/m3/player/error_handling/CompositeErrorHandlingRule;Lru/yandex/video/m3/player/error_handling/ErrorHandlingRule;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <H extends PlayerObserver<?>, T extends ErrorHandlingRule> void add(CompositeErrorHandlingRule<H> compositeErrorHandlingRule, T t) {
            compositeErrorHandlingRule.addRule(t);
            jl40.P();
            throw null;
        }

        private Companion() {
        }
    }
}
