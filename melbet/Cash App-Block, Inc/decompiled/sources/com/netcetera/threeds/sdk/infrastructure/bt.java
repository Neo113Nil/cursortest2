package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public abstract class bt<T extends View> extends bs<T> {
    private static int get = 0;
    private static int getWarnings = 1;
    private setScroller ThreeDS2Service;

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object initialize(Object[] objArr) {
        bt btVar = (bt) objArr[0];
        setScroller setscroller = (setScroller) objArr[1];
        int i = get;
        int i2 = ((i ^ 121) | (i & 121)) << 1;
        int i3 = -(((~i) & 121) | (i & (-122)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getWarnings = i4 % 128;
        if (i4 % 2 == 0) {
            btVar.ThreeDS2Service = setscroller;
            btVar.ThreeDS2ServiceInstance();
            throw null;
        }
        btVar.ThreeDS2Service = setscroller;
        if (btVar.ThreeDS2ServiceInstance() != null) {
            int i5 = getWarnings;
            int i6 = i5 & 3;
            int i7 = (i6 - (~(-(-((i5 ^ 3) | i6))))) - 1;
            get = i7 % 128;
            if (i7 % 2 != 0) {
                btVar.getWarnings(setscroller, btVar.ThreeDS2ServiceInstance());
                throw null;
            }
            btVar.getWarnings(setscroller, btVar.ThreeDS2ServiceInstance());
        }
        int i8 = getWarnings;
        get = (((i8 & (-6)) | ((~i8) & 5)) + ((i8 & 5) << 1)) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bs
    public T get(Context context) {
        int i = get;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 100) << 1, i ^ 100, 1, 128);
        T t = (T) super.get(context);
        setScroller setscroller = this.ThreeDS2Service;
        if (setscroller != null) {
            int i2 = getWarnings;
            int i3 = i2 & 85;
            int i4 = (i3 - (~(-(-((i2 ^ 85) | i3))))) - 1;
            get = i4 % 128;
            if (i4 % 2 != 0) {
                getWarnings(setscroller, t);
                throw null;
            }
            getWarnings(setscroller, t);
        }
        int i5 = get;
        getWarnings = ((i5 ^ 39) + ((i5 & 39) << 1)) % 128;
        return t;
    }

    public final void getWarnings(setScroller setscroller) {
        getWarnings(new Object[]{this, setscroller}, 1112145242, -1112145242, System.identityHashCode(this));
    }

    public abstract void getWarnings(setScroller setscroller, T t);

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        return initialize(objArr);
    }
}
