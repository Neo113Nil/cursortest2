package ru.yandex.taxi.fragment;

import android.content.Context;
import defpackage.e0g;
import defpackage.gh00;
import defpackage.jcs;
import defpackage.ny61;
import defpackage.si00;
import defpackage.ti00;
import defpackage.ui00;
import defpackage.vj10;
import defpackage.wj10;
import defpackage.xj10;
import defpackage.xm00;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.ui.FragmentBackground;
import ru.yandex.taxi.viewholder.b;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0002&'B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0006J\u0019\u0010\u000f\u001a\u00028\u0002\"\n\b\u0002\u0010\u000e*\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/yandex/taxi/fragment/MapFragment;", CA20Status.STATUS_REQUEST_C, "Ljcs;", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/fragment/YandexTaxiFragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "onDetach", "Lti00;", "T", "getMapComponent", "()Lti00;", "injector", "()Ljcs;", "Lwj10;", "menuButton", "()Lwj10;", "Lru/yandex/taxi/ui/FragmentBackground;", "getBackground", "()Lru/yandex/taxi/ui/FragmentBackground;", "", "hasSettings", "()Z", "", "autoPaddingGravity", "()I", "mapFragmentComponent", "Lti00;", "Lxm00;", "mapObjectCollection", "Lxm00;", "menuButtonCoordinator", "Lwj10;", "si00", "a", "map_fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class MapFragment<C, I extends jcs> extends YandexTaxiFragment<C, I> {
    private ti00 mapFragmentComponent;
    private final xm00 mapObjectCollection = new xm00();
    private wj10 menuButtonCoordinator;

    /* loaded from: classes5.dex */
    public static abstract class a implements si00 {
    }

    public MapFragment() {
        wj10.a.getClass();
        this.menuButtonCoordinator = vj10.a();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public int autoPaddingGravity() {
        return 0;
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment
    public FragmentBackground getBackground() {
        return FragmentBackground.MAP;
    }

    public final <T extends ti00> T getMapComponent() {
        T t = (T) this.mapFragmentComponent;
        if (t != null) {
            return t;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment
    public boolean hasSettings() {
        return true;
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public I injector() {
        ti00 ti00Var = this.mapFragmentComponent;
        if (ti00Var != null) {
            return (I) ti00Var;
        }
        ny61.g("Required value was null.");
        return null;
    }

    /* renamed from: menuButton, reason: from getter */
    public final wj10 getMenuButtonCoordinator() {
        return this.menuButtonCoordinator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ui00) {
            ti00 ti00Var = this.mapFragmentComponent;
            if (ti00Var == null) {
                ti00Var = ((ui00) context).createMapFragmentComponent(this, this.mapObjectCollection);
                this.mapFragmentComponent = ti00Var;
            }
            e0g e0gVar = (e0g) ti00Var;
            this.mapObjectCollection.b(((gh00) ((b) e0gVar.f()).c).i);
            this.menuButtonCoordinator = new xj10(getMainMenuOwner(), e0gVar.e());
        }
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.mapObjectCollection.d();
        this.mapObjectCollection.m();
        this.mapFragmentComponent = null;
        wj10.a.getClass();
        this.menuButtonCoordinator = vj10.a();
    }
}
