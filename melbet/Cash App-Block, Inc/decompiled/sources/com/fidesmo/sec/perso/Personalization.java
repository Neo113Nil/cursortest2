package com.fidesmo.sec.perso;

import io.reactivex.rxjava3.core.Observable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\rR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/fidesmo/sec/perso/Personalization;", "PersonalizationParameters", "", "config", "Lcom/fidesmo/sec/perso/PersonalizationConfig;", "getConfig", "()Lcom/fidesmo/sec/perso/PersonalizationConfig;", "personalize", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/fidesmo/sec/perso/PersoStatus;", "parameters", "listener", "Lcom/fidesmo/sec/perso/PersonalizationListener;", "(Ljava/lang/Object;Lcom/fidesmo/sec/perso/PersonalizationListener;)Lio/reactivex/rxjava3/core/Observable;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Personalization<PersonalizationParameters> {
    PersonalizationConfig getConfig();

    Observable<PersoStatus> personalize(PersonalizationParameters parameters, PersonalizationListener listener);
}
