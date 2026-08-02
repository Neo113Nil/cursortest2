package com.squareup.cash.profile.presenters.searchprivacy;

import app.cash.local.presenters.LocalEditorialPresenter;
import com.squareup.cash.account.settings.viewmodels.SearchPrivacySectionViewEvent;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealSearchPrivacySettingsPresenter$handleSettingChanged$1 extends ContinuationImpl {
    public SearchPrivacySectionViewEvent.SettingToggled L$0;
    public ShiftNotePresenter$models$1$1 L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalEditorialPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSearchPrivacySettingsPresenter$handleSettingChanged$1(LocalEditorialPresenter localEditorialPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localEditorialPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalEditorialPresenter.access$handleSettingChanged(this.this$0, null, null, this);
    }
}
