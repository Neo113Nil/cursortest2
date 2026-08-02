package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.StreetViewPanoramaView;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;

/* loaded from: classes11.dex */
public final class x691 implements udy {
    public final ViewGroup a;
    public final IStreetViewPanoramaViewDelegate b;
    public View c;

    public x691(StreetViewPanoramaView streetViewPanoramaView, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
        cvw.l(iStreetViewPanoramaViewDelegate);
        this.b = iStreetViewPanoramaViewDelegate;
        cvw.l(streetViewPanoramaView);
        this.a = streetViewPanoramaView;
    }

    @Override // defpackage.udy
    public final void a(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // defpackage.udy
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup = this.a;
        IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate = this.b;
        try {
            Bundle bundle2 = new Bundle();
            qb91.g(bundle, bundle2);
            iStreetViewPanoramaViewDelegate.onCreate(bundle2);
            qb91.g(bundle2, bundle);
            this.c = (View) ObjectWrapper.unwrap(iStreetViewPanoramaViewDelegate.getView());
            viewGroup.removeAllViews();
            viewGroup.addView(this.c);
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // defpackage.udy
    public final void onDestroy() {
        try {
            this.b.onDestroy();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onDestroyView() {
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // defpackage.udy
    public final void onLowMemory() {
        try {
            this.b.onLowMemory();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onPause() {
        try {
            this.b.onPause();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onResume() {
        try {
            this.b.onResume();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            qb91.g(bundle, bundle2);
            this.b.onSaveInstanceState(bundle2);
            qb91.g(bundle2, bundle);
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onStart() {
        try {
            this.b.onStart();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }

    @Override // defpackage.udy
    public final void onStop() {
        try {
            this.b.onStop();
        } catch (RemoteException e) {
            su71.e(e);
        }
    }
}
