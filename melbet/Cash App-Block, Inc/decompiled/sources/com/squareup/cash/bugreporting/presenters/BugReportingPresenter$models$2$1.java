package com.squareup.cash.bugreporting.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bugreporting.viewmodels.BugReport;
import com.squareup.cash.bugreporting.viewmodels.Screenshot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BugReportingPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $bugReport$delegate;
    public final /* synthetic */ MutableState $rawScreenshots$delegate;
    public final /* synthetic */ MutableState $screenshots$delegate;
    public int I$0;
    public int I$1;
    public LocalHomePresenter L$1;
    public Collection L$3;
    public Iterator L$4;
    public Screenshot L$6;
    public Collection L$7;
    public int label;
    public final /* synthetic */ LocalHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugReportingPresenter$models$2$1(MutableState mutableState, LocalHomePresenter localHomePresenter, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$rawScreenshots$delegate = mutableState;
        this.this$0 = localHomePresenter;
        this.$screenshots$delegate = mutableState2;
        this.$bugReport$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BugReportingPresenter$models$2$1(this.$rawScreenshots$delegate, this.this$0, this.$screenshots$delegate, this.$bugReport$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BugReportingPresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0067 -> B:6:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0086 -> B:5:0x0088). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int i;
        LocalHomePresenter localHomePresenter;
        Collection collection;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            List list = (List) this.$rawScreenshots$delegate.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            it = list.iterator();
            i = 0;
            localHomePresenter = this.this$0;
            collection = arrayList;
            i2 = 0;
            if (!it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$1;
            i2 = this.I$0;
            collection = this.L$7;
            Screenshot screenshot = this.L$6;
            it = this.L$4;
            Collection collection2 = this.L$3;
            LocalHomePresenter localHomePresenter2 = this.L$1;
            SafeTrace.throwOnFailure(obj);
            LocalHomePresenter localHomePresenter3 = localHomePresenter2;
            Collection collection3 = collection2;
            Object m1223access$resolveFileNameFromUri8YU3vEA = obj;
            screenshot = Screenshot.m3428copy5y75sic$default(screenshot, (String) m1223access$resolveFileNameFromUri8YU3vEA, false, 5);
            collection.add(screenshot);
            collection = collection3;
            localHomePresenter = localHomePresenter3;
            if (!it.hasNext()) {
                List list2 = (List) collection;
                this.$screenshots$delegate.setValue(list2);
                MutableState mutableState = this.$bugReport$delegate;
                mutableState.setValue(BugReport.copy$default((BugReport) mutableState.getValue(), null, null, list2, null, 23));
                return Unit.INSTANCE;
            }
            screenshot = (Screenshot) it.next();
            String str = screenshot.fileName;
            if (str == null || StringsKt.isBlank(str)) {
                String str2 = screenshot.uri;
                this.L$1 = localHomePresenter;
                Collection collection4 = collection;
                this.L$3 = collection4;
                this.L$4 = it;
                this.L$6 = screenshot;
                this.L$7 = collection4;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 1;
                m1223access$resolveFileNameFromUri8YU3vEA = LocalHomePresenter.m1223access$resolveFileNameFromUri8YU3vEA(localHomePresenter, str2, this);
                if (m1223access$resolveFileNameFromUri8YU3vEA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                localHomePresenter3 = localHomePresenter;
                collection3 = collection;
                screenshot = Screenshot.m3428copy5y75sic$default(screenshot, (String) m1223access$resolveFileNameFromUri8YU3vEA, false, 5);
                collection.add(screenshot);
                collection = collection3;
                localHomePresenter = localHomePresenter3;
                if (!it.hasNext()) {
                }
            } else {
                localHomePresenter3 = localHomePresenter;
                collection3 = collection;
                collection.add(screenshot);
                collection = collection3;
                localHomePresenter = localHomePresenter3;
                if (!it.hasNext()) {
                }
            }
        }
    }
}
