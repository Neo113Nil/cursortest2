package com.squareup.cash.family.familyhub.backend.real;

import app.cash.api.ApiResult;
import app.cash.badging.backend.FormattedResources;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.family.familyhub.backend.api.SponseeCashAppTag;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.protos.cash.clientsync.service.ClientSyncAppApiService;
import com.squareup.protos.cash.clientsync.service.GetSyncEntitiesByTargetRequest;
import com.squareup.protos.cash.clientsync.service.GetSyncEntitiesByTargetResponse;
import com.squareup.protos.cash.clientsync.service.SyncTopic;
import com.squareup.protos.cash.clientsync.service.TargetEntities;
import com.squareup.protos.cash.clientsync.service.TargetSpecifications;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.syncentity.DomainType;
import com.squareup.protos.cash.taply.syncvalues.CashAppTag;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinition;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinitions;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncValue;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SponseeWalletSnapshotFetcher {
    public volatile Pair cached;
    public final ClientSyncAppApiService service;
    public final SyncValueReader syncValueReader;

    public SponseeWalletSnapshotFetcher(ClientSyncAppApiService clientSyncAppApiService, SyncValueReader syncValueReader) {
        this.service = clientSyncAppApiService;
        this.syncValueReader = syncValueReader;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:? A[LOOP:1: B:18:0x009c->B:116:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2 A[EDGE_INSN: B:31:0x00c2->B:32:0x00c2 BREAK  A[LOOP:1: B:18:0x009c->B:116:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doFetch(String str, TagThemeDefinitions tagThemeDefinitions, ContinuationImpl continuationImpl) {
        SponseeWalletSnapshotFetcher$doFetch$1 sponseeWalletSnapshotFetcher$doFetch$1;
        int i;
        ApiResult apiResult;
        CashAppCard cashAppCard;
        List list;
        SponseeCashAppTag sponseeCashAppTag;
        TagThemeDefinition.TagFormFactor tagFormFactor;
        LocalizedString localizedString;
        Map map;
        CashAppTag cashAppTag;
        SyncValue.Value value;
        SyncValue.Value value2;
        if (continuationImpl instanceof SponseeWalletSnapshotFetcher$doFetch$1) {
            sponseeWalletSnapshotFetcher$doFetch$1 = (SponseeWalletSnapshotFetcher$doFetch$1) continuationImpl;
            int i2 = sponseeWalletSnapshotFetcher$doFetch$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                sponseeWalletSnapshotFetcher$doFetch$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = sponseeWalletSnapshotFetcher$doFetch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sponseeWalletSnapshotFetcher$doFetch$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetSyncEntitiesByTargetRequest getSyncEntitiesByTargetRequest = new GetSyncEntitiesByTargetRequest(str, CollectionsKt__CollectionsKt.listOf((Object[]) new TargetSpecifications[]{new TargetSpecifications(SyncTopic.CASH_APP_CARD, CollectionsKt__CollectionsJVMKt.listOf(DomainType.CASH_APP_CARD)), new TargetSpecifications(SyncTopic.CASH_APP_TAG, CollectionsKt__CollectionsJVMKt.listOf(DomainType.CASH_APP_TAG))}), null, 28);
                    sponseeWalletSnapshotFetcher$doFetch$1.L$1 = tagThemeDefinitions;
                    sponseeWalletSnapshotFetcher$doFetch$1.label = 1;
                    obj = this.service.getSyncEntitiesByTarget("TODO", getSyncEntitiesByTargetRequest, sponseeWalletSnapshotFetcher$doFetch$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tagThemeDefinitions = sponseeWalletSnapshotFetcher$doFetch$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List list2 = ((GetSyncEntitiesByTargetResponse) ((ApiResult.Success) apiResult).response).target_entities;
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((TargetEntities) it.next()).entities, arrayList);
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        cashAppCard = null;
                        break;
                    }
                    SyncValue syncValue = ((SyncEntity) it2.next()).sync_value;
                    if (syncValue != null && (value2 = syncValue.value) != null) {
                        SyncValue.Value.CashAppCard cashAppCard2 = value2 instanceof SyncValue.Value.CashAppCard ? (SyncValue.Value.CashAppCard) value2 : null;
                        if (cashAppCard2 != null) {
                            cashAppCard = cashAppCard2.value;
                            if (cashAppCard == null) {
                                break;
                            }
                        }
                    }
                    cashAppCard = null;
                    if (cashAppCard == null) {
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    SyncValue syncValue2 = ((SyncEntity) it3.next()).sync_value;
                    if (syncValue2 != null && (value = syncValue2.value) != null) {
                        SyncValue.Value.CashAppTag cashAppTag2 = value instanceof SyncValue.Value.CashAppTag ? (SyncValue.Value.CashAppTag) value : null;
                        if (cashAppTag2 != null) {
                            cashAppTag = cashAppTag2.value;
                            if (cashAppTag == null) {
                                arrayList2.add(cashAppTag);
                            }
                        }
                    }
                    cashAppTag = null;
                    if (cashAppTag == null) {
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((CashAppTag) it4.next()).tags, arrayList3);
                }
                ArrayList<CashAppTag.Tag> arrayList4 = new ArrayList();
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    if (((CashAppTag.Tag) next).lifecycle_state != CashAppTag.TagLifecycleState.INACTIVE) {
                        arrayList4.add(next);
                    }
                }
                if (arrayList4.isEmpty()) {
                    list = EmptyList.INSTANCE;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    for (CashAppTag.Tag tag : arrayList4) {
                        String str2 = tag.device_id;
                        if (str2 == null) {
                            sponseeCashAppTag = null;
                        } else {
                            TagThemeDefinition tagThemeDefinition = (tagThemeDefinitions == null || (map = tagThemeDefinitions.tag_theme_definitions) == null) ? null : (TagThemeDefinition) map.get(tag.tag_theme_token);
                            String str3 = (tagThemeDefinition == null || (localizedString = tagThemeDefinition.name) == null) ? null : localizedString.translated_value;
                            TagFormFactor appTagFormFactor = (tagThemeDefinition == null || (tagFormFactor = tagThemeDefinition.form_factor) == null) ? null : FormattedResources.toAppTagFormFactor(tagFormFactor);
                            Boolean bool = tag.is_sponsor_locked;
                            sponseeCashAppTag = new SponseeCashAppTag(str2, str3, appTagFormFactor, bool != null ? bool.booleanValue() : false);
                        }
                        if (sponseeCashAppTag != null) {
                            arrayList5.add(sponseeCashAppTag);
                        }
                    }
                    list = arrayList5;
                }
                return new SponseeWalletSnapshot(cashAppCard, cashAppCard != null ? Intrinsics.areEqual(cashAppCard.sponsor_locked, Boolean.TRUE) : false, cashAppCard != null ? Intrinsics.areEqual(cashAppCard.activated, Boolean.TRUE) : false, list);
            }
        }
        sponseeWalletSnapshotFetcher$doFetch$1 = new SponseeWalletSnapshotFetcher$doFetch$1(this, continuationImpl);
        Object obj2 = sponseeWalletSnapshotFetcher$doFetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sponseeWalletSnapshotFetcher$doFetch$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r9 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(String str, boolean z, ContinuationImpl continuationImpl) {
        SponseeWalletSnapshotFetcher$fetch$1 sponseeWalletSnapshotFetcher$fetch$1;
        int i;
        Pair pair;
        if (continuationImpl instanceof SponseeWalletSnapshotFetcher$fetch$1) {
            sponseeWalletSnapshotFetcher$fetch$1 = (SponseeWalletSnapshotFetcher$fetch$1) continuationImpl;
            int i2 = sponseeWalletSnapshotFetcher$fetch$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                sponseeWalletSnapshotFetcher$fetch$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = sponseeWalletSnapshotFetcher$fetch$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sponseeWalletSnapshotFetcher$fetch$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z && (pair = this.cached) != null) {
                        if (!Intrinsics.areEqual(pair.first, str)) {
                            pair = null;
                        }
                        if (pair != null) {
                            return pair.second;
                        }
                    }
                    StateFlow allValues = this.syncValueReader.getAllValues(AndroidSyncValueSpecs.TagThemeDefinitions);
                    sponseeWalletSnapshotFetcher$fetch$1.L$0 = str;
                    sponseeWalletSnapshotFetcher$fetch$1.Z$0 = z;
                    sponseeWalletSnapshotFetcher$fetch$1.label = 1;
                    obj = FlowKt.first(allValues, sponseeWalletSnapshotFetcher$fetch$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = sponseeWalletSnapshotFetcher$fetch$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        SponseeWalletSnapshot sponseeWalletSnapshot = (SponseeWalletSnapshot) obj;
                        if (sponseeWalletSnapshot == null) {
                            return null;
                        }
                        this.cached = new Pair(str, sponseeWalletSnapshot);
                        return sponseeWalletSnapshot;
                    }
                    z = sponseeWalletSnapshotFetcher$fetch$1.Z$0;
                    str = sponseeWalletSnapshotFetcher$fetch$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                TagThemeDefinitions tagThemeDefinitions = (TagThemeDefinitions) CollectionsKt.firstOrNull((List) obj);
                sponseeWalletSnapshotFetcher$fetch$1.L$0 = str;
                sponseeWalletSnapshotFetcher$fetch$1.Z$0 = z;
                sponseeWalletSnapshotFetcher$fetch$1.label = 2;
                obj = doFetch(str, tagThemeDefinitions, sponseeWalletSnapshotFetcher$fetch$1);
            }
        }
        sponseeWalletSnapshotFetcher$fetch$1 = new SponseeWalletSnapshotFetcher$fetch$1(this, continuationImpl);
        Object obj3 = sponseeWalletSnapshotFetcher$fetch$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sponseeWalletSnapshotFetcher$fetch$1.label;
        if (i != 0) {
        }
        TagThemeDefinitions tagThemeDefinitions2 = (TagThemeDefinitions) CollectionsKt.firstOrNull((List) obj3);
        sponseeWalletSnapshotFetcher$fetch$1.L$0 = str;
        sponseeWalletSnapshotFetcher$fetch$1.Z$0 = z;
        sponseeWalletSnapshotFetcher$fetch$1.label = 2;
        obj3 = doFetch(str, tagThemeDefinitions2, sponseeWalletSnapshotFetcher$fetch$1);
    }
}
