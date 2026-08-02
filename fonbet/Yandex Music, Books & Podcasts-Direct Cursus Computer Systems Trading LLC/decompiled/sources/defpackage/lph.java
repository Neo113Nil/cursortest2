package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class lph extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ mph c;

    public lph(mph mphVar, int i, Context context) {
        this.c = mphVar;
        this.a = i;
        this.b = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SparseArray sparseArray = mph.p;
        int i = this.a;
        if (((Drawable.ConstantState) sparseArray.get(i)) == null) {
            return y2x.w(this.b, i);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            mph.p.put(this.a, drawable.getConstantState());
        }
        this.c.g = null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        int i = this.a;
        mph mphVar = this.c;
        if (drawable != null) {
            mph.p.put(i, drawable.getConstantState());
            mphVar.g = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) mph.p.get(i);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            mphVar.g = null;
        }
        mphVar.setRemoteIndicatorDrawableInternal(drawable);
    }
}
