package ru.yandex.video.m3.player.impl.load_control;

import defpackage.a9z0;
import defpackage.au1;
import defpackage.fyi0;
import defpackage.lk91;
import defpackage.loo;
import defpackage.nwy;
import defpackage.owy;
import defpackage.sf10;
import defpackage.vyc0;
import defpackage.yzz0;
import kotlin.Metadata;
import ru.yandex.video.m3.data.loadcontrol.LoadControlState;
import ru.yandex.video.m3.player.DependentLifecycleLoadControl;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "Lowy;", "Lru/yandex/video/m3/player/DependentLifecycleLoadControl;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface YandexLoadControl extends owy, DependentLifecycleLoadControl {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static LoadControlState getLoadControlState(YandexLoadControl yandexLoadControl) {
            return YandexLoadControl.super.getLoadControlState();
        }
    }

    @Override // defpackage.owy
    /* synthetic */ au1 getAllocator();

    @Override // defpackage.owy
    @Deprecated
    /* bridge */ /* synthetic */ default long getBackBufferDurationUs() {
        super.getBackBufferDurationUs();
        throw null;
    }

    @Override // defpackage.owy
    @Deprecated
    /* bridge */ /* synthetic */ default void onPrepared() {
        super.onPrepared();
        throw null;
    }

    @Override // defpackage.owy
    @Deprecated
    /* bridge */ /* synthetic */ default void onReleased() {
        super.onReleased();
        throw null;
    }

    @Override // defpackage.owy
    @Deprecated
    /* bridge */ /* synthetic */ default void onStopped() {
        super.onStopped();
        throw null;
    }

    @Deprecated
    default void onTracksSelected(vyc0 vyc0Var, a9z0 a9z0Var, sf10 sf10Var, fyi0[] fyi0VarArr, yzz0 yzz0Var, loo[] looVarArr) {
        onTracksSelected(a9z0Var, sf10Var, fyi0VarArr, yzz0Var, looVarArr);
    }

    @Override // defpackage.owy
    @Deprecated
    /* bridge */ /* synthetic */ default boolean retainBackBufferFromKeyframe() {
        super.retainBackBufferFromKeyframe();
        throw null;
    }

    @Override // defpackage.owy
    default boolean shouldContinueLoading(nwy nwyVar) {
        return shouldContinueLoading(nwyVar.d, nwyVar.e, nwyVar.f);
    }

    @Override // defpackage.owy
    default boolean shouldContinuePreloading(a9z0 a9z0Var, sf10 sf10Var, long j) {
        lk91.j("shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // defpackage.owy
    default boolean shouldStartPlayback(nwy nwyVar) {
        return shouldStartPlayback(nwyVar.b, nwyVar.c, nwyVar.e, nwyVar.f, nwyVar.g, nwyVar.h);
    }

    @Override // defpackage.owy
    default long getBackBufferDurationUs(vyc0 vyc0Var) {
        return getBackBufferDurationUs();
    }

    @Override // defpackage.owy
    default void onPrepared(vyc0 vyc0Var) {
        onPrepared();
    }

    @Override // defpackage.owy
    default void onReleased(vyc0 vyc0Var) {
        onReleased();
    }

    @Override // defpackage.owy
    default void onStopped(vyc0 vyc0Var) {
        onStopped();
    }

    @Override // defpackage.owy
    default boolean retainBackBufferFromKeyframe(vyc0 vyc0Var) {
        return retainBackBufferFromKeyframe();
    }

    @Override // defpackage.owy
    default void onTracksSelected(nwy nwyVar, yzz0 yzz0Var, loo[] looVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    @Override // defpackage.owy
    @Deprecated
    /* bridge */ /* synthetic */ default void onTracksSelected(fyi0[] fyi0VarArr, yzz0 yzz0Var, loo[] looVarArr) {
        super.onTracksSelected(fyi0VarArr, yzz0Var, looVarArr);
        throw null;
    }

    @Override // defpackage.owy
    @Deprecated
    default void onTracksSelected(a9z0 a9z0Var, sf10 sf10Var, fyi0[] fyi0VarArr, yzz0 yzz0Var, loo[] looVarArr) {
        onTracksSelected(fyi0VarArr, yzz0Var, looVarArr);
    }

    @Override // defpackage.owy
    @Deprecated
    /* bridge */ /* synthetic */ default boolean shouldContinueLoading(long j, long j2, float f) {
        super.shouldContinueLoading(j, j2, f);
        throw null;
    }

    @Override // defpackage.owy
    @Deprecated
    /* bridge */ /* synthetic */ default boolean shouldStartPlayback(long j, float f, boolean z, long j2) {
        super.shouldStartPlayback(j, f, z, j2);
        throw null;
    }

    @Override // defpackage.owy
    @Deprecated
    default boolean shouldStartPlayback(a9z0 a9z0Var, sf10 sf10Var, long j, float f, boolean z, long j2) {
        return shouldStartPlayback(j, f, z, j2);
    }
}
