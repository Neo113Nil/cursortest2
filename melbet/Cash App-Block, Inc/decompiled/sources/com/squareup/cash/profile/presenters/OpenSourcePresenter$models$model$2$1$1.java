package com.squareup.cash.profile.presenters;

import android.content.Context;
import androidx.compose.runtime.ProduceStateScope;
import com.squareup.cash.profile.presenters.OpenSourcePresenter$Artifact;
import com.squareup.cash.profile.viewmodels.OpenSourceViewModel;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppUpdateData;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class OpenSourcePresenter$models$model$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ProduceStateScope $$this$produceState;
    public final /* synthetic */ WorkHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenSourcePresenter$models$model$2$1$1(WorkHomePresenter workHomePresenter, ProduceStateScope produceStateScope, Continuation continuation) {
        super(2, continuation);
        this.this$0 = workHomePresenter;
        this.$$this$produceState = produceStateScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OpenSourcePresenter$models$model$2$1$1(this.this$0, this.$$this$produceState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OpenSourcePresenter$models$model$2$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ProduceStateScope produceStateScope = this.$$this$produceState;
        WorkHomePresenter workHomePresenter = this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        try {
            InputStream open = ((Context) workHomePresenter.payPresenter).getAssets().open("app/cash/licensee/artifacts.json");
            open.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), PKIFailureInfo.certRevoked);
            try {
                String readText = AppUpdateData.readText(bufferedReader);
                bufferedReader.close();
                Object fromJson = ((Moshi) workHomePresenter.titleBarPresenter).adapter(Types.newParameterizedType(List.class, OpenSourcePresenter$Artifact.class)).fromJson(readText);
                fromJson.getClass();
                List<OpenSourcePresenter$Artifact> list = (List) fromJson;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (OpenSourcePresenter$Artifact openSourcePresenter$Artifact : list) {
                    String str = openSourcePresenter$Artifact.groupId;
                    String str2 = openSourcePresenter$Artifact.artifactId;
                    String str3 = openSourcePresenter$Artifact.name;
                    List list2 = openSourcePresenter$Artifact.spdxLicenses;
                    String str4 = null;
                    if (list2 != null) {
                        List list3 = list2;
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((OpenSourcePresenter$Artifact.SpdxLicense) it.next()).identifier);
                        }
                    } else {
                        arrayList = null;
                    }
                    List list4 = openSourcePresenter$Artifact.unknownLicenses;
                    if (list4 != null) {
                        List list5 = list4;
                        arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((OpenSourcePresenter$Artifact.UnknownLicense) it2.next()).name);
                        }
                    } else {
                        arrayList2 = null;
                    }
                    OpenSourcePresenter$Artifact.Scm scm = openSourcePresenter$Artifact.scm;
                    if (scm != null) {
                        str4 = scm.url;
                    }
                    arrayList3.add(new OpenSourceViewModel.ArtifactViewModel(str, str2, str3, str4, arrayList, arrayList2));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    String str5 = ((OpenSourceViewModel.ArtifactViewModel) next).groupId;
                    Object obj2 = linkedHashMap.get(str5);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(str5, obj2);
                    }
                    ((List) obj2).add(next);
                }
                produceStateScope.setValue(new OpenSourceViewModel.Ready(linkedHashMap));
            } finally {
            }
        } catch (FileNotFoundException unused) {
            produceStateScope.setValue(OpenSourceViewModel.Error.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
