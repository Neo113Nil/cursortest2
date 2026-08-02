package ru.yandex.taxi.widget.due_timetable;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aub;
import defpackage.gym;
import defpackage.j2n;
import defpackage.jzm;
import defpackage.k2n;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.lds0;
import defpackage.lzm;
import defpackage.mzm;
import defpackage.nwy0;
import defpackage.oym;
import defpackage.s1n;
import defpackage.t1n;
import defpackage.tje;
import defpackage.tls;
import defpackage.tzy0;
import defpackage.usg0;
import defpackage.v1n;
import defpackage.v8e;
import defpackage.x1n;
import defpackage.xw31;
import defpackage.y6i0;
import defpackage.yzh;
import defpackage.zp1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.due_timetable.DueTimetableView;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003.BCB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lru/yandex/taxi/widget/due_timetable/DueTimetableView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "selectedPosition", "Lzy11;", "onTimeSlotClick", "(I)V", "position", "notifyItemSelected", "setupDefaultPadding", "()V", "", "Llzm;", "items", "setTimetableItems", "(Ljava/util/List;)V", "setSelectedPosition", "getSelectedPosition", "()I", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "minTimeSlotWidthPx", CA20Status.STATUS_USER_I, "Lt1n;", "dueTimetableSlotSizeCalculator", "Lt1n;", "availableSlotSidePadding", "unavailableSlotSidePadding", "defaultAvailableSlotWidth", "defaultUnavailableSlotWidth", "Ltzy0;", "throttle", "Ltzy0;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lk2n;", "interactionDelegate", "Lk2n;", "Loym;", "adapter", "Loym;", "Lmzm;", "onItemClickListener", "Lmzm;", "getOnItemClickListener", "()Lmzm;", "setOnItemClickListener", "(Lmzm;)V", "Lv1n;", "slotWidthModifier", "Lv1n;", "getSlotWidthModifier", "()Lv1n;", "setSlotWidthModifier", "(Lv1n;)V", "yzh", "gym", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DueTimetableView extends RecyclerView implements nwy0 {
    public static final int $stable = 8;
    private final oym adapter;
    private final int availableSlotSidePadding;
    private final int defaultAvailableSlotWidth;
    private final int defaultUnavailableSlotWidth;
    private final t1n dueTimetableSlotSizeCalculator;
    private final k2n interactionDelegate;
    private final LinearLayoutManager layoutManager;
    private final int minTimeSlotWidthPx;
    private mzm onItemClickListener;
    private v1n slotWidthModifier;
    private final tzy0 throttle;
    private final int unavailableSlotSidePadding;

    public DueTimetableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t1n zp1Var;
        k2n k2nVar;
        int r = tje.r(usg0.due_timetable_min_slot_width, getContext());
        this.minTimeSlotWidthPx = r;
        if (DateFormat.is24HourFormat(context)) {
            zp1Var = new s1n(context, getContext().getString(kyh0.due_chart_ondemand_slot), getContext().getString(kyh0.due_chart_unavailable_slot), r);
        } else {
            zp1Var = new zp1(context, getContext().getString(kyh0.due_chart_ondemand_slot), getContext().getString(kyh0.due_chart_unavailable_slot), r);
        }
        t1n t1nVar = zp1Var;
        this.dueTimetableSlotSizeCalculator = t1nVar;
        int r2 = tje.r(usg0.due_timetable_available_slot_side_padding, getContext());
        this.availableSlotSidePadding = r2;
        int r3 = tje.r(usg0.due_timetable_unavailable_slot_side_padding, getContext());
        this.unavailableSlotSidePadding = r3;
        int a = (r2 * 2) + t1nVar.a();
        this.defaultAvailableSlotWidth = a;
        int d = (r3 * 2) + t1nVar.d();
        this.defaultUnavailableSlotWidth = d;
        this.throttle = new tzy0(300, new DueTimetableView$throttle$1(1, this, DueTimetableView.class, "onTimeSlotClick", "onTimeSlotClick(I)V", 0));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.layoutManager = linearLayoutManager;
        oym oymVar = new oym(t1nVar, new j2n(0, this), a, d, new v8e(28, this));
        this.adapter = oymVar;
        setupDefaultPadding();
        setLayoutManager(linearLayoutManager);
        setAdapter(oymVar);
        setClipToPadding(false);
        setItemAnimator(null);
        if (tje.L(context)) {
            k2nVar = new gym(this);
        } else {
            yzh yzhVar = new yzh();
            x1n x1nVar = new x1n();
            yzhVar.a = x1nVar;
            final int i2 = 0;
            x1nVar.o = new tls(this) { // from class: l2n
                public final /* synthetic */ DueTimetableView b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i3 = i2;
                    zy11 zy11Var = zy11.a;
                    DueTimetableView dueTimetableView = this.b;
                    int intValue = ((Integer) obj).intValue();
                    switch (i3) {
                        case 0:
                            dueTimetableView.notifyItemSelected(intValue);
                            qke.E(dueTimetableView.getContext(), HapticController$Effect.CLICK_LIGHT, false, 8);
                            break;
                        default:
                            dueTimetableView.post(new xm2(dueTimetableView, intValue, 7));
                            break;
                    }
                    return zy11Var;
                }
            };
            final int i3 = 1;
            x1nVar.n = new tls(this) { // from class: l2n
                public final /* synthetic */ DueTimetableView b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i32 = i3;
                    zy11 zy11Var = zy11.a;
                    DueTimetableView dueTimetableView = this.b;
                    int intValue = ((Integer) obj).intValue();
                    switch (i32) {
                        case 0:
                            dueTimetableView.notifyItemSelected(intValue);
                            qke.E(dueTimetableView.getContext(), HapticController$Effect.CLICK_LIGHT, false, 8);
                            break;
                        default:
                            dueTimetableView.post(new xm2(dueTimetableView, intValue, 7));
                            break;
                    }
                    return zy11Var;
                }
            };
            x1nVar.b(this);
            k2nVar = yzhVar;
        }
        this.interactionDelegate = k2nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void adapter$lambda$1(DueTimetableView dueTimetableView, int i, lzm lzmVar) {
        dueTimetableView.throttle.a(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyItemSelected(int position) {
        lzm lzmVar;
        mzm mzmVar;
        oym oymVar = this.adapter;
        if (position < 0) {
            oymVar.getClass();
        } else if (position < oymVar.A.size()) {
            lzmVar = (lzm) oymVar.A.get(position);
            if (lzmVar != null || (mzmVar = this.onItemClickListener) == null) {
            }
            mzmVar.e(position, lzmVar);
            return;
        }
        lzmVar = null;
        if (lzmVar != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimeSlotClick(int selectedPosition) {
        this.adapter.j(selectedPosition, true);
        this.interactionDelegate.k(selectedPosition);
    }

    private final void setupDefaultPadding() {
        int v = ((xw31.v() - this.defaultAvailableSlotWidth) / 2) - this.availableSlotSidePadding;
        setPadding(v, 0, v, 0);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.adapter.applyTheme(themeType);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final mzm getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public final int getSelectedPosition() {
        return this.adapter.B;
    }

    public final v1n getSlotWidthModifier() {
        return this.slotWidthModifier;
    }

    public final void setOnItemClickListener(mzm mzmVar) {
        this.onItemClickListener = mzmVar;
    }

    public final void setSelectedPosition(int selectedPosition) {
        int size = this.adapter.A.size();
        if (size > 0) {
            int d = y6i0.d(selectedPosition, 0, size - 1);
            this.adapter.j(d, false);
            this.interactionDelegate.i(selectedPosition);
            notifyItemSelected(d);
        }
    }

    public final void setSlotWidthModifier(v1n v1nVar) {
        this.slotWidthModifier = v1nVar;
    }

    public final void setTimetableItems(List<? extends lzm> items) {
        Object obj;
        oym oymVar = this.adapter;
        List list = oymVar.A;
        oymVar.A = items;
        if (oymVar.C == -1) {
            Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                lzm lzmVar = (lzm) obj;
                if ((lzmVar instanceof jzm) && ((jzm) lzmVar).f) {
                    break;
                }
            }
            lzm lzmVar2 = (lzm) obj;
            if (lzmVar2 != null) {
                oymVar.C = oymVar.c.e(lzmVar2.getLabel());
            }
        }
        kp50.f(new lds0(list, items, new aub(8)), true).b(oymVar);
    }

    public DueTimetableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DueTimetableView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DueTimetableView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
