package b1;

import D1.n;
import a1.d;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.lumenpath.harispro.hrnavigator.databinding.FragmentCalculatorBinding;
import com.lumenpath.harispro.hrnavigator.ui.builder.BuilderFragment;
import com.lumenpath.harispro.hrnavigator.ui.calculators.CalculatorFragment;
import e1.e;
import f1.C0152a;
import f1.C0153b;
import f1.C0154c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;
import o1.C0317a;
import u1.i;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2336c;

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.f2334a = i;
        this.f2335b = obj;
        this.f2336c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String format;
        switch (this.f2334a) {
            case 0:
                ((C1.a) this.f2335b).c();
                BuilderFragment builderFragment = (BuilderFragment) this.f2336c;
                int i = builderFragment.f2781X;
                if (i < 5) {
                    builderFragment.f2781X = i + 1;
                    builderFragment.N();
                    break;
                }
                break;
            case 1:
                d dVar = (d) this.f2336c;
                CalculatorFragment calculatorFragment = (CalculatorFragment) this.f2335b;
                ArrayList arrayList = calculatorFragment.f2787X;
                ArrayList arrayList2 = new ArrayList(i.I(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    double d2 = 0.0d;
                    if (!it.hasNext()) {
                        int i2 = dVar.f1680a;
                        if (i2 == 1) {
                            double doubleValue = ((Number) arrayList2.get(0)).doubleValue();
                            double doubleValue2 = ((Number) arrayList2.get(1)).doubleValue();
                            format = doubleValue2 <= 0.0d ? "Enter valid headcount" : String.format("Turnover rate: %.1f%%", Arrays.copyOf(new Object[]{Double.valueOf((doubleValue / doubleValue2) * 100)}, 1));
                        } else if (i2 == 2) {
                            format = String.format("Estimated hiring cost: $%.0f", Arrays.copyOf(new Object[]{Double.valueOf(((Number) arrayList2.get(1)).doubleValue() * ((Number) arrayList2.get(0)).doubleValue())}, 1));
                        } else if (i2 == 3) {
                            format = String.format("Estimated termination cost: $%.0f", Arrays.copyOf(new Object[]{Double.valueOf(((Number) arrayList2.get(1)).doubleValue() * ((Number) arrayList2.get(0)).doubleValue())}, 1));
                        } else if (i2 == 4) {
                            format = String.format("Estimated onboarding cost: $%.0f", Arrays.copyOf(new Object[]{Double.valueOf((((Number) arrayList2.get(0)).doubleValue() * ((Number) arrayList2.get(1)).doubleValue()) + ((Number) arrayList2.get(2)).doubleValue())}, 1));
                        } else if (i2 != 5) {
                            format = "Unknown calculator";
                        } else {
                            double doubleValue3 = ((Number) arrayList2.get(0)).doubleValue();
                            double doubleValue4 = ((Number) arrayList2.get(1)).doubleValue();
                            format = doubleValue4 <= 0.0d ? "Enter valid total" : String.format("Engagement index: %.1f%%", Arrays.copyOf(new Object[]{Double.valueOf((doubleValue3 / doubleValue4) * 100)}, 1));
                        }
                        FragmentCalculatorBinding fragmentCalculatorBinding = calculatorFragment.f2786W;
                        D1.i.b(fragmentCalculatorBinding);
                        fragmentCalculatorBinding.resultText.setText(format);
                        break;
                    } else {
                        String valueOf = String.valueOf(((TextInputEditText) it.next()).getText());
                        Double d3 = null;
                        try {
                            n nVar = K1.c.f402a;
                            nVar.getClass();
                            if (((Pattern) nVar.f170b).matcher(valueOf).matches()) {
                                d3 = Double.valueOf(Double.parseDouble(valueOf));
                            }
                        } catch (NumberFormatException unused) {
                        }
                        if (d3 != null) {
                            d2 = d3.doubleValue();
                        }
                        arrayList2.add(Double.valueOf(d2));
                    }
                }
            case 2:
                ((e1.d) this.f2335b).e.g(Integer.valueOf(((e1.c) this.f2336c).b()));
                break;
            case 3:
                ((e1.d) this.f2335b).e.g(Integer.valueOf(((e) this.f2336c).b()));
                break;
            case 4:
                C0152a c0152a = (C0152a) this.f2335b;
                int b2 = c0152a.b();
                if (b2 != -1) {
                    C0153b c0153b = (C0153b) this.f2336c;
                    boolean contains = c0153b.f3031f.contains(Integer.valueOf(b2));
                    LinkedHashSet linkedHashSet = c0153b.f3031f;
                    if (contains) {
                        linkedHashSet.remove(Integer.valueOf(b2));
                    } else {
                        linkedHashSet.add(Integer.valueOf(b2));
                    }
                    c0153b.f3370a.c(b2);
                    ViewParent parent = c0152a.f3028u.getRoot().getParent();
                    RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                    if (recyclerView != null) {
                        recyclerView.requestLayout();
                        break;
                    }
                }
                break;
            case 5:
                C0154c c0154c = (C0154c) this.f2335b;
                int b3 = c0154c.b();
                if (b3 != -1) {
                    C0153b c0153b2 = (C0153b) this.f2336c;
                    boolean contains2 = c0153b2.f3031f.contains(Integer.valueOf(b3));
                    LinkedHashSet linkedHashSet2 = c0153b2.f3031f;
                    if (contains2) {
                        linkedHashSet2.remove(Integer.valueOf(b3));
                    } else {
                        linkedHashSet2.add(Integer.valueOf(b3));
                    }
                    c0153b2.f3370a.c(b3);
                    ViewParent parent2 = c0154c.f3032u.getRoot().getParent();
                    RecyclerView recyclerView2 = parent2 instanceof RecyclerView ? (RecyclerView) parent2 : null;
                    if (recyclerView2 != null) {
                        recyclerView2.requestLayout();
                        break;
                    }
                }
                break;
            default:
                C0317a c0317a = (C0317a) this.f2335b;
                int b4 = c0317a.b();
                if (b4 != -1) {
                    C0153b c0153b3 = (C0153b) this.f2336c;
                    boolean contains3 = c0153b3.f3031f.contains(Integer.valueOf(b4));
                    LinkedHashSet linkedHashSet3 = c0153b3.f3031f;
                    if (contains3) {
                        linkedHashSet3.remove(Integer.valueOf(b4));
                    } else {
                        linkedHashSet3.add(Integer.valueOf(b4));
                    }
                    c0153b3.f3370a.c(b4);
                    ViewParent parent3 = c0317a.f4128u.getRoot().getParent();
                    RecyclerView recyclerView3 = parent3 instanceof RecyclerView ? (RecyclerView) parent3 : null;
                    if (recyclerView3 != null) {
                        recyclerView3.requestLayout();
                        break;
                    }
                }
                break;
        }
    }
}
