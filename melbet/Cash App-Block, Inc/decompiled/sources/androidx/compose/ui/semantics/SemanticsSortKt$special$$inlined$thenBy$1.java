package androidx.compose.ui.semantics;

import android.text.SpannableStringBuilder;
import android.util.Rational;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableLongIntMap;
import androidx.compose.ui.node.LayoutNode;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db2.profile.documents.AvailableAccountStatement;
import com.squareup.cash.instruments.utils.HasNotPassedIdvSortRanking;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter;
import com.squareup.cash.money.applets.sections.AppletTileItem;
import com.squareup.cash.profile.presenters.Month;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.wages.real.EmployerIdentity;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.protos.franklin.api.Instrument;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final class SemanticsSortKt$special$$inlined$thenBy$1 implements Comparator {
    public final /* synthetic */ int $r8$classId;
    public final Object $this_thenBy;

    public SemanticsSortKt$special$$inlined$thenBy$1(Comparator comparator) {
        this.$r8$classId = 0;
        this.$this_thenBy = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        StatementCoverage.Monthly monthly;
        StatementCoverage.Monthly monthly2;
        Class<?> cls;
        String str;
        String str2;
        int i = this.$r8$classId;
        Object obj3 = this.$this_thenBy;
        switch (i) {
            case 0:
                int compare = ((Comparator) obj3).compare(obj, obj2);
                return compare != 0 ? compare : LayoutNode.ZComparator.compare(((SemanticsNode) obj).layoutNode, ((SemanticsNode) obj2).layoutNode);
            case 1:
                ArrayList arrayList = ((StreamGraphImpl) obj3).streams;
                Iterator it = ((StreamGraphImpl.OutputConfig) obj).streamBuilder.iterator();
                if (it.hasNext()) {
                    Integer valueOf = Integer.valueOf(arrayList.indexOf((CameraStream) it.next()));
                    while (it.hasNext()) {
                        Integer valueOf2 = Integer.valueOf(arrayList.indexOf((CameraStream) it.next()));
                        if (valueOf.compareTo(valueOf2) > 0) {
                            valueOf = valueOf2;
                        }
                    }
                    Iterator it2 = ((StreamGraphImpl.OutputConfig) obj2).streamBuilder.iterator();
                    if (it2.hasNext()) {
                        Integer valueOf3 = Integer.valueOf(arrayList.indexOf((CameraStream) it2.next()));
                        while (it2.hasNext()) {
                            Integer valueOf4 = Integer.valueOf(arrayList.indexOf((CameraStream) it2.next()));
                            if (valueOf3.compareTo(valueOf4) > 0) {
                                valueOf3 = valueOf4;
                            }
                        }
                        return ComparisonsKt__ComparisonsKt.compareValues(valueOf, valueOf3);
                    }
                }
                a$$ExternalSyntheticBUOutline0.m();
                return 0;
            case 2:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) obj3;
                float floatValue = ((Rational) obj).floatValue();
                float floatValue2 = rational2.floatValue();
                float f = floatValue > floatValue2 ? floatValue2 / floatValue : floatValue / floatValue2;
                float floatValue3 = rational.floatValue();
                float floatValue4 = rational2.floatValue();
                return Float.compare(floatValue3 > floatValue4 ? floatValue4 / floatValue3 : floatValue3 / floatValue4, f);
            case 3:
                MutableLongIntMap mutableLongIntMap = (MutableLongIntMap) obj3;
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(mutableLongIntMap.get(((Number) obj).longValue())), Integer.valueOf(mutableLongIntMap.get(((Number) obj2).longValue())));
            case 4:
                int compare2 = ((SemanticsSortKt$special$$inlined$thenBy$1) obj3).compare(obj, obj2);
                return compare2 != 0 ? compare2 : ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((SemanticsNode) obj).id), Integer.valueOf(((SemanticsNode) obj2).id));
            case 5:
                int compare3 = ((b.C0008b) obj3).compare(obj, obj2);
                if (compare3 != 0) {
                    return compare3;
                }
                Comparable comparable = ((Instrument) obj2).occurred_at;
                if (comparable == null) {
                    comparable = r0;
                }
                Comparable comparable2 = ((Instrument) obj).occurred_at;
                return ComparisonsKt__ComparisonsKt.compareValues(comparable, comparable2 != null ? comparable2 : 0);
            case 6:
                HasNotPassedIdvSortRanking hasNotPassedIdvSortRanking = (HasNotPassedIdvSortRanking) obj3;
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(hasNotPassedIdvSortRanking.sortRank((SelectPaymentInstrumentOption) obj)), Integer.valueOf(hasNotPassedIdvSortRanking.sortRank((SelectPaymentInstrumentOption) obj2)));
            case 7:
                int compare4 = ((SemanticsSortKt$special$$inlined$thenBy$1) obj3).compare(obj, obj2);
                return compare4 != 0 ? compare4 : ComparisonsKt__ComparisonsKt.compareValues(((InvestingHomeViewModel.InvestingHomeRow.Stock) obj).getContentModel().title, ((InvestingHomeViewModel.InvestingHomeRow.Stock) obj2).getContentModel().title);
            case 8:
                int compare5 = ((b.C0008b) obj3).compare(obj, obj2);
                return compare5 != 0 ? compare5 : ComparisonsKt__ComparisonsKt.compareValues(((InvestingHomeViewModel.InvestingHomeRow.Stock) obj2).getContentModel().metric, ((InvestingHomeViewModel.InvestingHomeRow.Stock) obj).getContentModel().metric);
            case 9:
                int compare6 = ((b.C0008b) obj3).compare(obj, obj2);
                return compare6 != 0 ? compare6 : ComparisonsKt__ComparisonsKt.compareValues(((InvestingHomeViewModel.InvestingHomeRow.Stock) obj).getContentModel().title, ((InvestingHomeViewModel.InvestingHomeRow.Stock) obj2).getContentModel().title);
            case 10:
                int compare7 = ((b.C0008b) obj3).compare(obj, obj2);
                return compare7 != 0 ? compare7 : ComparisonsKt__ComparisonsKt.compareValues(((InvestingStockSelectionViewModel.SearchResultItemModel) obj).stockName, ((InvestingStockSelectionViewModel.SearchResultItemModel) obj2).stockName);
            case 11:
                BlockersScreens.InviteContactsScreen inviteContactsScreen = ((InviteContactsPresenter) obj3).args;
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(inviteContactsScreen.recommendedContactsHashedAliasIds.indexOf((String) obj)), Integer.valueOf(inviteContactsScreen.recommendedContactsHashedAliasIds.indexOf((String) obj2)));
            case 12:
                Map map = (Map) obj3;
                return ComparisonsKt__ComparisonsKt.compareValues((Integer) MapsKt__MapsKt.getValue(map, ((AppletTileItem) ((Pair) obj).second).appletId), (Integer) MapsKt__MapsKt.getValue(map, ((AppletTileItem) ((Pair) obj2).second).appletId));
            case 13:
                int compare8 = ((LinkedHashTreeMap.AnonymousClass1) obj3).compare(obj, obj2);
                if (compare8 != 0) {
                    return compare8;
                }
                StatementCoverage statementCoverage = ((AvailableAccountStatement) obj).statementCoverage;
                statementCoverage.getClass();
                zzko zzkoVar = statementCoverage.f1334type;
                Integer num = null;
                Month month = new Month((zzkoVar == null || (monthly2 = CurveFit.getMonthly(zzkoVar)) == null) ? null : monthly2.month);
                StatementCoverage statementCoverage2 = ((AvailableAccountStatement) obj2).statementCoverage;
                statementCoverage2.getClass();
                zzko zzkoVar2 = statementCoverage2.f1334type;
                if (zzkoVar2 != null && (monthly = CurveFit.getMonthly(zzkoVar2)) != null) {
                    num = monthly.month;
                }
                return ComparisonsKt__ComparisonsKt.compareValues(month, new Month(num));
            case 14:
                FullAccount fullAccount = (FullAccount) obj;
                String str3 = fullAccount.account_id;
                SessionManager sessionManager = ((ProfileNotificationsPresenter) obj3).sessionManager;
                FullAccount fullAccount2 = (FullAccount) obj2;
                return ComparisonsKt__ComparisonsKt.compareValues(Recorder$$ExternalSyntheticOutline2.m$1(Intrinsics.areEqual(str3, PlatformKt.activeAccountToken(sessionManager)) ? "0" : "1", fullAccount.title), (Intrinsics.areEqual(fullAccount2.account_id, PlatformKt.activeAccountToken(sessionManager)) ? "0" : "1") + fullAccount2.title);
            case 15:
                Function1 function1 = (Function1) obj3;
                return ComparisonsKt__ComparisonsKt.compareValues((Comparable) function1.invoke((ClockInOverlayViewModel.PickerItem) obj2), (Comparable) function1.invoke((ClockInOverlayViewModel.PickerItem) obj));
            case 16:
                int compare9 = ((SemanticsSortKt$special$$inlined$thenBy$1) obj3).compare(obj, obj2);
                return compare9 != 0 ? compare9 : String.CASE_INSENSITIVE_ORDER.compare(((ClockInOverlayViewModel.PickerItem) obj).name, ((ClockInOverlayViewModel.PickerItem) obj2).name);
            case 17:
                int compare10 = ((SemanticsSortKt$special$$inlined$thenBy$1) obj3).compare(obj, obj2);
                return compare10 != 0 ? compare10 : ComparisonsKt__ComparisonsKt.compareValues(((ClockInOverlayViewModel.PickerItem) obj).name, ((ClockInOverlayViewModel.PickerItem) obj2).name);
            case 18:
                int compare11 = ((LinkedHashTreeMap.AnonymousClass1) obj3).compare(obj, obj2);
                return compare11 != 0 ? compare11 : ComparisonsKt__ComparisonsKt.compareValues(((EmployerIdentity) obj).name, ((EmployerIdentity) obj2).name);
            case 19:
                int compare12 = ((SemanticsSortKt$special$$inlined$thenBy$1) obj3).compare(obj, obj2);
                return compare12 != 0 ? compare12 : ComparisonsKt__ComparisonsKt.compareValues(((EmployerIdentity) obj).token, ((EmployerIdentity) obj2).token);
            case 20:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj3;
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(spannableStringBuilder.getSpanStart(obj)), Integer.valueOf(spannableStringBuilder.getSpanStart(obj2)));
            default:
                String str4 = (String) obj3;
                KClassifier classifier = ((KType) obj).getClassifier();
                if (classifier == null) {
                    a$$ExternalSyntheticBUOutline0.m$1(str4, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
                    return 0;
                }
                if (classifier instanceof KClass) {
                    str = PapaEvent.getJavaClass((KClass) classifier).getName();
                } else {
                    if (!(classifier instanceof KTypeParameterBase)) {
                        cls = classifier.getClass();
                        a$$ExternalSyntheticBUOutline0.m(Reflection.factory.getOrCreateKotlinClass(cls), "Unknown upper bound classifier: ");
                        return 0;
                    }
                    str = ((KTypeParameterImpl) ((KTypeParameterBase) classifier)).name;
                }
                KClassifier classifier2 = ((KType) obj2).getClassifier();
                if (classifier2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1(str4, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
                    return 0;
                }
                if (classifier2 instanceof KClass) {
                    str2 = PapaEvent.getJavaClass((KClass) classifier2).getName();
                } else {
                    if (!(classifier2 instanceof KTypeParameterBase)) {
                        cls = classifier2.getClass();
                        a$$ExternalSyntheticBUOutline0.m(Reflection.factory.getOrCreateKotlinClass(cls), "Unknown upper bound classifier: ");
                        return 0;
                    }
                    str2 = ((KTypeParameterImpl) ((KTypeParameterBase) classifier2)).name;
                }
                return ComparisonsKt__ComparisonsKt.compareValues(str, str2);
        }
    }

    public /* synthetic */ SemanticsSortKt$special$$inlined$thenBy$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$this_thenBy = obj;
    }
}
