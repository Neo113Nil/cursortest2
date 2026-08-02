package com.squareup.cash.qrcodes.presenters;

import android.graphics.Bitmap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.qrcodes.viewmodels.QrCodeArgs;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealQrCodesPresenter {
    public final RealFileDownloader fileDownloader;
    public final CoroutineContext ioDispatcher;
    public final AndroidStringManager stringManager;
    public final RealFileDownloader tempFileDownloader;

    public final class State {
        public final String errorMessage;
        public final boolean loading;
        public final Bitmap qrImage;

        public State(String str, Bitmap bitmap, boolean z) {
            this.loading = z;
            this.qrImage = bitmap;
            this.errorMessage = str;
        }

        public static State copy$default(State state, boolean z, Bitmap bitmap, String str, int i) {
            if ((i & 2) != 0) {
                bitmap = state.qrImage;
            }
            if ((i & 4) != 0) {
                str = state.errorMessage;
            }
            state.getClass();
            return new State(str, bitmap, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.loading == state.loading && Intrinsics.areEqual(this.qrImage, state.qrImage) && Intrinsics.areEqual(this.errorMessage, state.errorMessage);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.loading) * 31;
            Bitmap bitmap = this.qrImage;
            int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
            String str = this.errorMessage;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(loading=");
            sb.append(this.loading);
            sb.append(", qrImage=");
            sb.append(this.qrImage);
            sb.append(", errorMessage=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.errorMessage, ")");
        }
    }

    public RealQrCodesPresenter(RealFileDownloader realFileDownloader, RealFileDownloader realFileDownloader2, AndroidStringManager androidStringManager, CoroutineContext coroutineContext) {
        this.fileDownloader = realFileDownloader;
        this.tempFileDownloader = realFileDownloader2;
        this.stringManager = androidStringManager;
        this.ioDispatcher = coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadQrCodeImage(RealQrCodesPresenter realQrCodesPresenter, QrCodeArgs qrCodeArgs, String str, TabToolbarsKt$$ExternalSyntheticLambda10 tabToolbarsKt$$ExternalSyntheticLambda10, ContinuationImpl continuationImpl) {
        RealQrCodesPresenter$loadQrCodeImage$1 realQrCodesPresenter$loadQrCodeImage$1;
        int i;
        if (continuationImpl instanceof RealQrCodesPresenter$loadQrCodeImage$1) {
            realQrCodesPresenter$loadQrCodeImage$1 = (RealQrCodesPresenter$loadQrCodeImage$1) continuationImpl;
            int i2 = realQrCodesPresenter$loadQrCodeImage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realQrCodesPresenter$loadQrCodeImage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realQrCodesPresenter$loadQrCodeImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realQrCodesPresenter$loadQrCodeImage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState = tabToolbarsKt$$ExternalSyntheticLambda10.f$0;
                    State state = (State) mutableState.getValue();
                    state.getClass();
                    mutableState.setValue(State.copy$default(state, true, null, null, 2));
                    CoroutineContext coroutineContext = realQrCodesPresenter.ioDispatcher;
                    AndroidFileSaver$save$2 androidFileSaver$save$2 = new AndroidFileSaver$save$2(str, realQrCodesPresenter, qrCodeArgs, (Continuation) null);
                    realQrCodesPresenter$loadQrCodeImage$1.L$2 = tabToolbarsKt$$ExternalSyntheticLambda10;
                    realQrCodesPresenter$loadQrCodeImage$1.label = 1;
                    obj = JobKt.withContext(coroutineContext, androidFileSaver$save$2, realQrCodesPresenter$loadQrCodeImage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tabToolbarsKt$$ExternalSyntheticLambda10 = realQrCodesPresenter$loadQrCodeImage$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                MutableState mutableState2 = tabToolbarsKt$$ExternalSyntheticLambda10.f$0;
                State state2 = (State) mutableState2.getValue();
                state2.getClass();
                mutableState2.setValue(State.copy$default(state2, false, (Bitmap) obj, null, 4));
                return Unit.INSTANCE;
            }
        }
        realQrCodesPresenter$loadQrCodeImage$1 = new RealQrCodesPresenter$loadQrCodeImage$1(realQrCodesPresenter, continuationImpl);
        Object obj2 = realQrCodesPresenter$loadQrCodeImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realQrCodesPresenter$loadQrCodeImage$1.label;
        if (i != 0) {
        }
        MutableState mutableState22 = tabToolbarsKt$$ExternalSyntheticLambda10.f$0;
        State state22 = (State) mutableState22.getValue();
        state22.getClass();
        mutableState22.setValue(State.copy$default(state22, false, (Bitmap) obj2, null, 4));
        return Unit.INSTANCE;
    }

    public final QrCodeModel models(QrCodeArgs qrCodeArgs, String str, GapComposer gapComposer, int i) {
        QrCodeArgs qrCodeArgs2;
        String str2;
        gapComposer.startReplaceGroup(46040591);
        Object rememberedValue = gapComposer.rememberedValue();
        boolean z = true;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(new State(null, null, true));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(qrCodeArgs);
        if ((((i & 112) ^ 48) <= 32 || !gapComposer.changed(str)) && (i & 48) != 32) {
            z = false;
        }
        boolean z2 = changedInstance | z;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (z2 || rememberedValue2 == neverEqualPolicy) {
            qrCodeArgs2 = qrCodeArgs;
            str2 = str;
            RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$1 = new RealQrCodesPresenter$models$1$1(this, qrCodeArgs2, str2, mutableState, null, 0);
            gapComposer.updateRememberedValue(realQrCodesPresenter$models$1$1);
            rememberedValue2 = realQrCodesPresenter$models$1$1;
        } else {
            qrCodeArgs2 = qrCodeArgs;
            str2 = str;
        }
        Updater.LaunchedEffect(qrCodeArgs2, str2, (Function2) rememberedValue2, gapComposer);
        QrCodeModel qrCodeModel = new QrCodeModel(((State) mutableState.getValue()).errorMessage, ((State) mutableState.getValue()).qrImage, ((State) mutableState.getValue()).loading);
        gapComposer.end(false);
        return qrCodeModel;
    }
}
