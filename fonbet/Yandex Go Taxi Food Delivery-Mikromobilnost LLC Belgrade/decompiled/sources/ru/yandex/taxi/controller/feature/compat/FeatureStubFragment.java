package ru.yandex.taxi.controller.feature.compat;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.fje;
import defpackage.if4;
import defpackage.ihf;
import defpackage.jcs;
import defpackage.nmp;
import defpackage.omp;
import defpackage.ysl;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.ui.FragmentBackground;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0003 -.B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0007J\u000f\u0010\u0016\u001a\u00020\u0015H\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001dR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lru/yandex/taxi/controller/feature/compat/FeatureStubFragment;", "Lru/yandex/taxi/fragment/YandexTaxiFragment;", "Lzy11;", "Ljcs;", "Lif4;", "Lihf;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "autoPaddingGravity", "()I", "Lru/yandex/taxi/ui/FragmentBackground;", "getBackground", "()Lru/yandex/taxi/ui/FragmentBackground;", "", "canBackToActiveOrderStateBarBeVisible", "()Z", "canBackToActiveLinkedOrderStateBarBeVisible", "hasSettings", "Lomp;", ConfigConstants.CONFIG, "Lomp;", "Lcom/yandex/go/navigation/screen/api/Screen;", MetaDataField.SCREEN_FIELD, "Lcom/yandex/go/navigation/screen/api/Screen;", "Lfje;", "contentViewFactory", "Lfje;", "getTrackedScreen", "()Lcom/yandex/go/navigation/screen/api/Screen;", "trackedScreen", "Companion", "a", "nmp", "fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FeatureStubFragment extends YandexTaxiFragment<zy11, jcs> implements if4, ihf {
    public static final nmp Companion = new nmp();
    private omp config;
    private fje contentViewFactory;
    private Screen screen;

    public static final class a implements fje {
        @Override // defpackage.fje
        public final View a(Context context) {
            return new FrameLayout(context);
        }
    }

    private FeatureStubFragment() {
        this.contentViewFactory = new a();
    }

    public static final FeatureStubFragment newInstance(omp ompVar, Screen screen, fje fjeVar) {
        Companion.getClass();
        return nmp.a(ompVar, screen, fjeVar);
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public int autoPaddingGravity() {
        omp ompVar = this.config;
        if (ompVar == null) {
            ompVar = null;
        }
        return ((ysl) ompVar).a;
    }

    @Override // defpackage.if4
    public boolean canBackToActiveLinkedOrderStateBarBeVisible() {
        return true;
    }

    @Override // defpackage.if4
    public boolean canBackToActiveOrderStateBarBeVisible() {
        return true;
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment
    public FragmentBackground getBackground() {
        omp ompVar = this.config;
        if (ompVar == null) {
            ompVar = null;
        }
        return (FragmentBackground) ((ysl) ompVar).b;
    }

    @Override // defpackage.ihf
    /* renamed from: getTrackedScreen, reason: from getter */
    public Screen getScreen() {
        return this.screen;
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment
    public boolean hasSettings() {
        omp ompVar = this.config;
        if (ompVar == null) {
            ompVar = null;
        }
        ((ysl) ompVar).getClass();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return this.contentViewFactory.a(inflater.getContext());
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public /* synthetic */ FeatureStubFragment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
