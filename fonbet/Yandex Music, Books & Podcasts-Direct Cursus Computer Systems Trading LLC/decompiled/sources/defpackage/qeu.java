package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qeu {
    public static Method b;
    public static final qeu c = new qeu();
    public static WeakReference a = new WeakReference(null);

    public static final View a(View view) {
        if (!bp6.a.contains(qeu.class)) {
            while (view != null) {
                try {
                    qeu qeuVar = c;
                    boolean z = false;
                    if (!bp6.a.contains(qeuVar)) {
                        try {
                            z = view.getClass().getName().equals("com.facebook.react.ReactRootView");
                        } catch (Throwable th) {
                            bp6.a(qeuVar, th);
                        }
                    }
                    if (!z) {
                        Object parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        return view;
                    }
                } catch (Throwable th2) {
                    bp6.a(qeu.class, th2);
                }
            }
        }
        return null;
    }

    public static final ArrayList b(View view) {
        if (bp6.a.contains(qeu.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            bp6.a(qeu.class, th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0066, code lost:
    
        if (r7.isInstance(r4) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0062 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:55:0x0027, B:59:0x0030, B:64:0x0047, B:67:0x0050, B:71:0x0062, B:33:0x005d, B:79:0x0041, B:75:0x003b), top: B:54:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(View view) {
        Class<?> cls;
        Class cls2;
        Set set = bp6.a;
        if (set.contains(qeu.class)) {
            return 0;
        }
        try {
            view.getClass();
            int i = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i |= 32;
            }
            boolean contains = set.contains(qeu.class);
            qeu qeuVar = c;
            if (!contains) {
                try {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof AdapterView)) {
                        if (!set.contains(qeuVar)) {
                            try {
                                cls = Class.forName("android.support.v4.view.NestedScrollingChild");
                            } catch (ClassNotFoundException unused) {
                            } catch (Throwable th) {
                                bp6.a(qeuVar, th);
                            }
                            if (cls != null || !cls.isInstance(parent)) {
                                cls2 = bp6.a.contains(qeuVar) ? null : kyi.class;
                                if (cls2 != null) {
                                }
                            }
                        }
                        cls = null;
                        if (cls != null) {
                        }
                        if (bp6.a.contains(qeuVar)) {
                        }
                        if (cls2 != null) {
                        }
                    }
                    i |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                } catch (Throwable th2) {
                    bp6.a(qeu.class, th2);
                }
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    return view instanceof RatingBar ? i | SQLiteDatabase.OPEN_FULLMUTEX : view instanceof RadioGroup ? i | 16384 : ((view instanceof ViewGroup) && qeuVar.m(view, (View) a.get())) ? i | 64 : i;
                }
                return i | 4096;
            }
            int i2 = i | 1025;
            if (view instanceof Button) {
                i2 = i | 1029;
                if (view instanceof Switch) {
                    i2 = i | 9221;
                } else if (view instanceof CheckBox) {
                    i2 = 33797 | i;
                }
            }
            int i3 = i2;
            return view instanceof EditText ? i3 | 2048 : i3;
        } catch (Throwable th3) {
            bp6.a(qeu.class, th3);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        if (bp6.a.contains(qeu.class)) {
            return null;
        }
        try {
            view.getClass();
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                a = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                n(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList b2 = b(view);
                int size = b2.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(d((View) b2.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
                return jSONObject;
            } catch (JSONException e) {
                Log.e("qeu", "Failed to create JSONObject for view.", e);
                return jSONObject;
            }
        } catch (Throwable th) {
            bp6.a(qeu.class, th);
            return null;
        }
    }

    public static final View.OnClickListener f(View view) {
        if (bp6.a.contains(qeu.class)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            declaredField.getClass();
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj != null) {
                Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                declaredField2.getClass();
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(obj);
                    if (obj2 != null) {
                        return (View.OnClickListener) obj2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
                }
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            bp6.a(qeu.class, th);
            return null;
        }
    }

    public static final View.OnTouchListener g(View view) {
        try {
            if (!bp6.a.contains(qeu.class)) {
                try {
                    try {
                        try {
                            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                            declaredField.getClass();
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(view);
                            if (obj != null) {
                                Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                                declaredField2.getClass();
                                declaredField2.setAccessible(true);
                                Object obj2 = declaredField2.get(obj);
                                if (obj2 != null) {
                                    return (View.OnTouchListener) obj2;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                            }
                        } catch (NoSuchFieldException unused) {
                            HashSet hashSet = j3c.a;
                        }
                    } catch (IllegalAccessException unused2) {
                        HashSet hashSet2 = j3c.a;
                    }
                } catch (ClassNotFoundException unused3) {
                    HashSet hashSet3 = j3c.a;
                }
            }
            return null;
        } catch (Throwable th) {
            bp6.a(qeu.class, th);
            return null;
        }
    }

    public static final String h(View view) {
        if (bp6.a.contains(qeu.class)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            if (hint == null) {
                return "";
            }
            String obj = hint.toString();
            return obj != null ? obj : "";
        } catch (Throwable th) {
            bp6.a(qeu.class, th);
            return null;
        }
    }

    public static final ViewGroup i(View view) {
        if (!bp6.a.contains(qeu.class)) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup) parent;
                }
            } catch (Throwable th) {
                bp6.a(qeu.class, th);
                return null;
            }
        }
        return null;
    }

    public static final String j(View view) {
        CharSequence valueOf;
        Object selectedItem;
        if (bp6.a.contains(qeu.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    valueOf = ((Switch) view).isChecked() ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else if (view instanceof DatePicker) {
                valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
            } else if (view instanceof TimePicker) {
                Integer currentHour = ((TimePicker) view).getCurrentHour();
                currentHour.getClass();
                currentHour.intValue();
                Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                currentMinute.getClass();
                currentMinute.intValue();
                valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{currentHour, currentMinute}, 2));
            } else if (view instanceof RadioGroup) {
                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                int childCount = ((RadioGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = ((RadioGroup) view).getChildAt(i);
                    childAt.getClass();
                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                        valueOf = ((RadioButton) childAt).getText();
                        break;
                    }
                }
                valueOf = null;
            } else {
                if (view instanceof RatingBar) {
                    valueOf = String.valueOf(((RatingBar) view).getRating());
                }
                valueOf = null;
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            return obj != null ? obj : "";
        } catch (Throwable th) {
            bp6.a(qeu.class, th);
            return null;
        }
    }

    public static final void n(View view, JSONObject jSONObject) {
        if (bp6.a.contains(qeu.class)) {
            return;
        }
        try {
            view.getClass();
            try {
                String j = j(view);
                String h = h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put(ConnectableDevice.KEY_ID, view.getId());
                if (ogp.x(view)) {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", gvt.e(gvt.Y(j)));
                }
                jSONObject.put("hint", gvt.e(gvt.Y(h)));
                if (tag != null) {
                    jSONObject.put("tag", gvt.e(gvt.Y(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put(DeviceService.KEY_DESC, gvt.e(gvt.Y(contentDescription.toString())));
                }
                jSONObject.put("dimension", c.e(view));
            } catch (JSONException unused) {
                HashSet hashSet = j3c.a;
            }
        } catch (Throwable th) {
            bp6.a(qeu.class, th);
        }
    }

    public final JSONObject e(View view) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put(CameraProperty.WIDTH, view.getWidth());
                jSONObject.put(CameraProperty.HEIGHT, view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException e) {
                Log.e("qeu", "Failed to create JSONObject for dimension.", e);
                return jSONObject;
            }
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final View k(View view, float[] fArr) {
        if (!bp6.a.contains(this)) {
            try {
                l();
                Method method = b;
                if (method != null && view != null) {
                    try {
                        try {
                            Object invoke = method.invoke(null, fArr, view);
                            if (invoke == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                            }
                            View view2 = (View) invoke;
                            if (view2.getId() > 0) {
                                Object parent = view2.getParent();
                                if (parent != null) {
                                    return (View) parent;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                            }
                        } catch (InvocationTargetException unused) {
                            HashSet hashSet = j3c.a;
                        }
                    } catch (IllegalAccessException unused2) {
                        HashSet hashSet2 = j3c.a;
                    }
                }
            } catch (Throwable th) {
                bp6.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final void l() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            if (b != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                b = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
                HashSet hashSet = j3c.a;
            } catch (NoSuchMethodException unused2) {
                HashSet hashSet2 = j3c.a;
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final boolean m(View view, View view2) {
        Set set = bp6.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            view.getClass();
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!set.contains(this)) {
                try {
                    view.getLocationOnScreen(new int[2]);
                    fArr = new float[]{r4[0], r4[1]};
                } catch (Throwable th) {
                    bp6.a(this, th);
                }
            }
            View k = k(view2, fArr);
            if (k != null) {
                return k.getId() == view.getId();
            }
            return false;
        } catch (Throwable th2) {
            bp6.a(this, th2);
            return false;
        }
    }
}
