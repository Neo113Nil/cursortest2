package com.squareup.cash.shopping.views;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.views.search.SupportSearchView;
import com.squareup.util.android.Keyboards;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class BrandsSearchView$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ View f$0;

    public /* synthetic */ BrandsSearchView$$ExternalSyntheticLambda4(View view, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        final View view = this.f$0;
        switch (i) {
            case 0:
                ((KeyboardActionScope) obj).getClass();
                view.clearFocus();
                Keyboards.hideKeyboard(view);
                return Unit.INSTANCE;
            case 1:
                ((DisposableEffectScope) obj).getClass();
                final int i2 = 1;
                return new DisposableEffectResult() { // from class: com.squareup.cash.shopping.views.ProductSearchView$Content$lambda$8$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i3 = i2;
                        View view2 = view;
                        switch (i3) {
                            case 0:
                                Keyboards.hideKeyboard(view2);
                                break;
                            case 1:
                                Keyboards.hideKeyboard(view2);
                                break;
                            case 2:
                                Keyboards.hideKeyboard(view2);
                                view2.clearFocus();
                                break;
                            default:
                                Keyboards.hideKeyboard(view2);
                                break;
                        }
                    }
                };
            case 2:
                ((DisposableEffectScope) obj).getClass();
                final int i3 = 2;
                return new DisposableEffectResult() { // from class: com.squareup.cash.shopping.views.ProductSearchView$Content$lambda$8$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i3;
                        View view2 = view;
                        switch (i32) {
                            case 0:
                                Keyboards.hideKeyboard(view2);
                                break;
                            case 1:
                                Keyboards.hideKeyboard(view2);
                                break;
                            case 2:
                                Keyboards.hideKeyboard(view2);
                                view2.clearFocus();
                                break;
                            default:
                                Keyboards.hideKeyboard(view2);
                                break;
                        }
                    }
                };
            case 3:
                ((KeyboardActionScope) obj).getClass();
                view.clearFocus();
                Keyboards.hideKeyboard(view);
                return Unit.INSTANCE;
            case 4:
                ((DisposableEffectScope) obj).getClass();
                final int i4 = 0;
                return new DisposableEffectResult() { // from class: com.squareup.cash.shopping.views.ProductSearchView$Content$lambda$8$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i4;
                        View view2 = view;
                        switch (i32) {
                            case 0:
                                Keyboards.hideKeyboard(view2);
                                break;
                            case 1:
                                Keyboards.hideKeyboard(view2);
                                break;
                            case 2:
                                Keyboards.hideKeyboard(view2);
                                view2.clearFocus();
                                break;
                            default:
                                Keyboards.hideKeyboard(view2);
                                break;
                        }
                    }
                };
            case 5:
                ((KeyboardActionScope) obj).getClass();
                view.clearFocus();
                Keyboards.hideKeyboard(view);
                return Unit.INSTANCE;
            case 6:
                int i5 = SupportSearchView.$r8$clinit;
                ((DisposableEffectScope) obj).getClass();
                final int i6 = 3;
                return new DisposableEffectResult() { // from class: com.squareup.cash.shopping.views.ProductSearchView$Content$lambda$8$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i6;
                        View view2 = view;
                        switch (i32) {
                            case 0:
                                Keyboards.hideKeyboard(view2);
                                break;
                            case 1:
                                Keyboards.hideKeyboard(view2);
                                break;
                            case 2:
                                Keyboards.hideKeyboard(view2);
                                view2.clearFocus();
                                break;
                            default:
                                Keyboards.hideKeyboard(view2);
                                break;
                        }
                    }
                };
            default:
                WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) obj;
                windowInsetsCompat.getClass();
                WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
                Insets insetsIgnoringVisibility = impl.getInsetsIgnoringVisibility(519);
                insetsIgnoringVisibility.getClass();
                Insets insets = impl.getInsets(8);
                insets.getClass();
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), Integer.max(insetsIgnoringVisibility.bottom, insets.bottom));
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = insetsIgnoringVisibility.top;
                view.setLayoutParams(marginLayoutParams);
                return Unit.INSTANCE;
        }
    }
}
