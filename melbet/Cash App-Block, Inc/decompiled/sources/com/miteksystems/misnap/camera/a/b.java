package com.miteksystems.misnap.camera.a;

import android.graphics.PointF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import app.cash.sqldelight.db.AfterVersion;
import com.google.mlkit.vision.text.internal.zzr;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.card.onboarding.core.instancing.GridCell;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db2.profile.documents.Document;
import com.squareup.cash.earnings.backend.api.model.AllocationDestination;
import com.squareup.cash.earnings.backend.api.model.EarningsAllocationDistribution;
import com.squareup.cash.family.familyhub.presenters.ManagedAccountTransferPresenter;
import com.squareup.cash.investing.components.sheets.MoreInfoSheetKt$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investing.viewmodels.SectionMoreInfoViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.applets.sections.AppletTileItem;
import com.squareup.cash.moneybot.backend.api.model.chat.MessageList;
import com.squareup.cash.nearby.views.RadialGridDot;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.common.presenters.UtilsKt;
import com.squareup.cash.paychecks.viewmodels.PaycheckIconModel;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class b {

    public final class a {
        public List a;

        /* renamed from: com.miteksystems.misnap.camera.a.b$a$a, reason: collision with other inner class name */
        public abstract /* synthetic */ class AbstractC0007a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[CameraSelector$$ExternalSyntheticOutline0.values(3).length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public a(List list, int i) {
            switch (i) {
                case 2:
                    list.getClass();
                    this.a = list;
                    break;
                default:
                    this.a = list;
                    break;
            }
        }

        public boolean a(int i) {
            List list = this.a;
            if (i == 0) {
                throw null;
            }
            int i2 = AbstractC0007a.a[CameraSelector$$ExternalSyntheticOutline0.ordinal(i)];
            if (i2 == 1) {
                return list.contains(1);
            }
            if (i2 == 2) {
                return list.contains(3);
            }
            if (i2 == 3) {
                return list.contains(4);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return false;
        }
    }

    public static final void MoreInfoSheet(SectionMoreInfoViewModel sectionMoreInfoViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        sectionMoreInfoViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1174138003);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(sectionMoreInfoViewModel) : gapComposer.changedInstance(sectionMoreInfoViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InviteErrorDialogKt$$ExternalSyntheticLambda0(10, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SheetKt.Sheet((Function0) rememberedValue, companion, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-265217174, new MoreInfoSheetKt$$ExternalSyntheticLambda1(sectionMoreInfoViewModel, function1), gapComposer), gapComposer, ((i3 >> 3) & 112) | 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(modifier2, (Object) sectionMoreInfoViewModel, function1, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb A[EDGE_INSN: B:29:0x00bb->B:30:0x00bb BREAK  A[LOOP:1: B:13:0x003b->B:33:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:1: B:13:0x003b->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Size a(List list, Size size, Rational rational) {
        Object obj;
        boolean z;
        list.getClass();
        size.getClass();
        rational.getClass();
        List sortedWith = CollectionsKt.sortedWith(list, new C0008b(0));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : sortedWith) {
            if (a((Size) obj2) <= a(size)) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Size size2 = (Size) obj;
            if (a(size2) >= a(new Size(640, 480))) {
                z = true;
                if (!rational.equals(new Rational(size2.getWidth(), size2.getHeight()))) {
                    int width = size2.getWidth();
                    int height = size2.getHeight();
                    Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
                    int i = width % 16;
                    if (i == 0 && height % 16 == 0) {
                        if (!a(Math.max(0, height - 16), width, rational)) {
                            if (a(Math.max(0, width - 16), height, rational2)) {
                            }
                        }
                    } else if (i == 0) {
                        z = a(height, width, rational);
                    } else if (height % 16 == 0) {
                        z = a(width, height, rational2);
                    }
                }
                if (!z) {
                    break;
                }
            }
            z = false;
            if (!z) {
            }
        }
        return (Size) obj;
    }

    public static List d(Camera2CameraInfo camera2CameraInfo) {
        List list;
        camera2CameraInfo.getClass();
        int[] iArr = (int[]) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        return (iArr == null || (list = ArraysKt___ArraysKt.toList(iArr)) == null) ? EmptyList.INSTANCE : list;
    }

    /* renamed from: com.miteksystems.misnap.camera.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public final class C0008b implements Comparator {
        public final /* synthetic */ int $r8$classId;

        public C0008b(zzr zzrVar) {
            this.$r8$classId = 22;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i = 1;
            switch (this.$r8$classId) {
                case 0:
                    Size size = (Size) obj2;
                    size.getClass();
                    Integer valueOf = Integer.valueOf(size.getHeight() * size.getWidth());
                    Size size2 = (Size) obj;
                    size2.getClass();
                    return ComparisonsKt__ComparisonsKt.compareValues(valueOf, Integer.valueOf(size2.getHeight() * size2.getWidth()));
                case 1:
                    return ComparisonsKt__ComparisonsKt.compareValues((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
                case 2:
                    return ((Comparable) obj).compareTo((Comparable) obj2);
                case 3:
                    return (int) (((PointF) obj).x - ((PointF) obj2).x);
                case 4:
                    Integer num = (Integer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    num.getClass();
                    return Intrinsics.compare(intValue, num.intValue());
                case 5:
                    return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((GridCell) obj2).opacity), Float.valueOf(((GridCell) obj).opacity));
                case 6:
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((AfterVersion) obj).afterVersion), Long.valueOf(((AfterVersion) obj2).afterVersion));
                case 7:
                    return ComparisonsKt__ComparisonsKt.compareValues(((Field) obj).getName(), ((Field) obj2).getName());
                case 8:
                    return ComparisonsKt__ComparisonsKt.compareValues(((Recipient) obj).fullName, ((Recipient) obj2).fullName);
                case 9:
                    Long l = ((Document) obj2).display_date;
                    Long valueOf2 = Long.valueOf(l != null ? l.longValue() : 0L);
                    Long l2 = ((Document) obj).display_date;
                    return ComparisonsKt__ComparisonsKt.compareValues(valueOf2, Long.valueOf(l2 != null ? l2.longValue() : 0L));
                case 10:
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((AfterVersion) obj).afterVersion), Long.valueOf(((AfterVersion) obj2).afterVersion));
                case 11:
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((AfterVersion) obj).afterVersion), Long.valueOf(((AfterVersion) obj2).afterVersion));
                case 12:
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((EarningsAllocationDistribution.DestinationAndShare) obj2).shareInBasisPoints), Long.valueOf(((EarningsAllocationDistribution.DestinationAndShare) obj).shareInBasisPoints));
                case 13:
                    return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(((EarningsAllocationDistribution.DestinationAndShare) obj).destination instanceof AllocationDestination.CashBalanceDestination), Boolean.valueOf(((EarningsAllocationDistribution.DestinationAndShare) obj2).destination instanceof AllocationDestination.CashBalanceDestination));
                case 14:
                    CashInstrumentType cashInstrumentType = ((Instrument) obj).cash_instrument_type;
                    int i2 = cashInstrumentType == null ? -1 : ManagedAccountTransferPresenter.WhenMappings.$EnumSwitchMapping$2[cashInstrumentType.ordinal()];
                    Integer valueOf3 = Integer.valueOf(i2 != 1 ? i2 != 2 ? i2 != 3 ? 3 : 1 : 2 : 0);
                    CashInstrumentType cashInstrumentType2 = ((Instrument) obj2).cash_instrument_type;
                    int i3 = cashInstrumentType2 != null ? ManagedAccountTransferPresenter.WhenMappings.$EnumSwitchMapping$2[cashInstrumentType2.ordinal()] : -1;
                    if (i3 == 1) {
                        i = 0;
                    } else if (i3 == 2) {
                        i = 2;
                    } else if (i3 != 3) {
                        i = 3;
                    }
                    return ComparisonsKt__ComparisonsKt.compareValues(valueOf3, Integer.valueOf(i));
                case 15:
                    return ComparisonsKt__ComparisonsKt.compareValues(((com.squareup.cash.recipients.data.Recipient) obj).displayName, ((com.squareup.cash.recipients.data.Recipient) obj2).displayName);
                case 16:
                    return ComparisonsKt__ComparisonsKt.compareValues(((Instrument) obj2).is_default_for_instrument_type, ((Instrument) obj).is_default_for_instrument_type);
                case 17:
                    return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(((InvestingHomeViewModel.InvestingHomeRow.Stock) obj).getContentModel().upcomingLabel == null), Boolean.valueOf(((InvestingHomeViewModel.InvestingHomeRow.Stock) obj2).getContentModel().upcomingLabel == null));
                case 18:
                    return ComparisonsKt__ComparisonsKt.compareValues(((InvestingHomeViewModel.InvestingHomeRow.Stock) obj2).getContentModel().metric, ((InvestingHomeViewModel.InvestingHomeRow.Stock) obj).getContentModel().metric);
                case 19:
                    return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(((InvestingStockSelectionViewModel.SearchResultItemModel) obj2).selected), Boolean.valueOf(((InvestingStockSelectionViewModel.SearchResultItemModel) obj).selected));
                case 20:
                    return ComparisonsKt__ComparisonsKt.compareValues(((InviteContactsViewModel.Contact) obj).getDisplayName(), ((InviteContactsViewModel.Contact) obj2).getDisplayName());
                case 21:
                    return ComparisonsKt__ComparisonsKt.compareValues(((InviteContactsViewModel.RecommendedContact) obj).contact.getDisplayName(), ((InviteContactsViewModel.RecommendedContact) obj2).contact.getDisplayName());
                case 22:
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(zzr.installedSectionSortValue(((AppletTileItem) ((Pair) obj).second).appletId)), Integer.valueOf(zzr.installedSectionSortValue(((AppletTileItem) ((Pair) obj2).second).appletId)));
                case 23:
                    return ComparisonsKt__ComparisonsKt.compareValues(((MessageList) obj).createdAt, ((MessageList) obj2).createdAt);
                case 24:
                    return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((RadialGridDot) obj).dist), Float.valueOf(((RadialGridDot) obj2).dist));
                case 25:
                    return ComparisonsKt__ComparisonsKt.compareValues(Countries.displayName((Country) obj), Countries.displayName((Country) obj2));
                case 26:
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((PaycheckAllocationDistribution.DestinationAndShare) obj2).shareInBasisPoints), Long.valueOf(((PaycheckAllocationDistribution.DestinationAndShare) obj).shareInBasisPoints));
                case 27:
                    return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(((PaycheckAllocationDistribution.DestinationAndShare) obj).destination instanceof AllocationDestination.CashBalanceDestination), Boolean.valueOf(((PaycheckAllocationDistribution.DestinationAndShare) obj2).destination instanceof AllocationDestination.CashBalanceDestination));
                case 28:
                    return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(((PaycheckIconModel) obj) instanceof PaycheckIconModel.Unknown), Boolean.valueOf(((PaycheckIconModel) obj2) instanceof PaycheckIconModel.Unknown));
                default:
                    return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(UtilsKt.sortOrderForDistributionWheel(((PaycheckAllocationDistribution.DestinationAndShare) obj).destination)), Boolean.valueOf(UtilsKt.sortOrderForDistributionWheel(((PaycheckAllocationDistribution.DestinationAndShare) obj2).destination)));
            }
        }

        public /* synthetic */ C0008b(int i) {
            this.$r8$classId = i;
        }
    }

    public static /* synthetic */ int a(Size size) {
        size.getClass();
        return size.getHeight() * size.getWidth();
    }

    public static /* synthetic */ String a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "EXTERNAL" : "BACK" : "FRONT";
    }

    public static /* synthetic */ Size a(List list, List list2) {
        Object obj;
        list2.getClass();
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (list.contains((Size) obj)) {
                break;
            }
        }
        return (Size) obj;
    }

    public static List a(Camera2CameraInfo camera2CameraInfo, int i) {
        camera2CameraInfo.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) camera2CameraInfo.getCameraCharacteristic(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            int[] outputFormats = streamConfigurationMap.getOutputFormats();
            outputFormats.getClass();
            if (!ArraysKt___ArraysKt.contains(outputFormats, i)) {
                return EmptyList.INSTANCE;
            }
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
            outputSizes.getClass();
            List list = ArraysKt___ArraysKt.toList(outputSizes);
            if (list != null) {
                return list;
            }
        }
        return EmptyList.INSTANCE;
    }

    public static /* synthetic */ boolean a(d dVar, List list) {
        if (CollectionsKt__CollectionsKt.listOf((Object[]) new d[]{d.d, d.f}).contains(dVar)) {
            return true;
        }
        return dVar == d.c && list.contains(6);
    }

    public static boolean a(int i, int i2, Rational rational) {
        if (i2 % 16 == 0) {
            double numerator = (rational.getNumerator() * i) / rational.getDenominator();
            if (numerator > Math.max(0, i2 - 16) && numerator < i2 + 16) {
                return true;
            }
        }
        return false;
    }
}
