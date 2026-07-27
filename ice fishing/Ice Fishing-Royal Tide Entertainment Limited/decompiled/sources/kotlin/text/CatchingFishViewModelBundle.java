package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishViewModelBundle {
    public int CatchingFishCoroutine;
    public String CatchingFishDaggerWebsocket;
    public boolean CatchingFishParcelableFAB = false;
    public float CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public int CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishViewModelBundle(CatchingFishViewModelBundle catchingFishViewModelBundle, Object obj) {
        catchingFishViewModelBundle.getClass();
        this.CatchingFishSnackbar = catchingFishViewModelBundle.CatchingFishSnackbar;
        CatchingFishSnackbar(obj);
    }

    public static void CatchingFishParcelableFAB(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), CatchingFishFluxAndroidX.CatchingFishReduxKtor);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z = false;
        Object obj = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (str != null && obj != null) {
            CatchingFishViewModelBundle catchingFishViewModelBundle = new CatchingFishViewModelBundle();
            catchingFishViewModelBundle.CatchingFishSnackbar = i;
            catchingFishViewModelBundle.CatchingFishParcelableFAB = z;
            catchingFishViewModelBundle.CatchingFishSnackbar(obj);
            hashMap.put(str, catchingFishViewModelBundle);
        }
        obtainStyledAttributes.recycle();
    }

    public final void CatchingFishSnackbar(Object obj) {
        switch (CatchingFishMVPLiveData.CatchingFishParcelableFlux(this.CatchingFishSnackbar)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                this.CatchingFishCoroutine = ((Integer) obj).intValue();
                break;
            case 1:
                this.CatchingFishReduxKtor = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.CatchingFishViewModelScope = ((Integer) obj).intValue();
                break;
            case 4:
                this.CatchingFishDaggerWebsocket = (String) obj;
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                this.CatchingFishWorkManager = ((Boolean) obj).booleanValue();
                break;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                this.CatchingFishReduxKtor = ((Float) obj).floatValue();
                break;
        }
    }
}
