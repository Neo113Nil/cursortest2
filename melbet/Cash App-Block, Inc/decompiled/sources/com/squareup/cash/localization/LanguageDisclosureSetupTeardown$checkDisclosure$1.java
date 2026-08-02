package com.squareup.cash.localization;

import com.squareup.protos.franklin.common.LocalizationConfig;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class LanguageDisclosureSetupTeardown$checkDisclosure$1 extends ContinuationImpl {
    public Locale L$0;
    public LocalizationConfig L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LanguageDisclosureSetupTeardown this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageDisclosureSetupTeardown$checkDisclosure$1(LanguageDisclosureSetupTeardown languageDisclosureSetupTeardown, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = languageDisclosureSetupTeardown;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LanguageDisclosureSetupTeardown.access$checkDisclosure(this.this$0, this);
    }
}
