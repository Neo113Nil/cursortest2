package com.squareup.cash.maps.presenter;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import app.cash.broadway.presenter.molecule.StableCoroutineScope;
import com.squareup.cash.education.stories.presenters.EducationStoryPresenter;
import com.squareup.cash.moneybot.presenters.plugins.TemplateCardPresenter;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* loaded from: classes6.dex */
public final /* synthetic */ class CashMapPresenter$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;

    public /* synthetic */ CashMapPresenter$$ExternalSyntheticLambda4(EducationStoryPresenter educationStoryPresenter, StableCoroutineScope stableCoroutineScope, MutableState mutableState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState2, MutableState mutableState3, HttpUrl httpUrl, MutableState mutableState4) {
        this.$r8$classId = 3;
        this.f$0 = educationStoryPresenter;
        this.f$1 = stableCoroutineScope;
        this.f$2 = mutableState;
        this.f$6 = parcelableSnapshotMutableIntState;
        this.f$3 = mutableState2;
        this.f$4 = mutableState3;
        this.f$7 = httpUrl;
        this.f$5 = mutableState4;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public /* synthetic */ CashMapPresenter$$ExternalSyntheticLambda4(TemplateCardPresenter templateCardPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, CoroutineScope coroutineScope, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        this.$r8$classId = 4;
        this.f$0 = templateCardPresenter;
        this.f$2 = mutableState;
        this.f$3 = mutableState2;
        this.f$4 = mutableState3;
        this.f$1 = coroutineScope;
        this.f$5 = mutableState4;
        this.f$6 = mutableState5;
        this.f$7 = mutableState6;
    }

    public /* synthetic */ CashMapPresenter$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = obj7;
        this.f$7 = obj8;
    }
}
