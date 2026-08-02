package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class ActivityCompat extends Strings {

    /* loaded from: classes.dex */
    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i);
    }

    public final class SharedElementCallback21Impl extends android.app.SharedElementCallback {
        public final SharedElementCallback mCallback;

        public SharedElementCallback21Impl(SharedElementCallback sharedElementCallback) {
            this.mCallback = sharedElementCallback;
        }

        @Override // android.app.SharedElementCallback
        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Parcelable parcelable;
            int round;
            Bitmap bitmap;
            SharedElementCallback sharedElementCallback = this.mCallback;
            sharedElementCallback.getClass();
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (drawable != null && background == null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                        parcelable = null;
                        bitmap = null;
                    } else {
                        float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
                            bitmap = ((BitmapDrawable) drawable).getBitmap();
                            parcelable = null;
                        } else {
                            int i = (int) (intrinsicWidth * min);
                            int i2 = (int) (intrinsicHeight * min);
                            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Rect bounds = drawable.getBounds();
                            int i3 = bounds.left;
                            int i4 = bounds.top;
                            int i5 = bounds.right;
                            int i6 = bounds.bottom;
                            parcelable = null;
                            drawable.setBounds(0, 0, i, i2);
                            drawable.draw(canvas);
                            drawable.setBounds(i3, i4, i5, i6);
                            bitmap = createBitmap;
                        }
                    }
                    if (bitmap != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("sharedElement:snapshot:bitmap", bitmap);
                        bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                        if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                            float[] fArr = new float[9];
                            imageView.getImageMatrix().getValues(fArr);
                            bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                        }
                        return bundle;
                    }
                    round = Math.round(rectF.width());
                    int round2 = Math.round(rectF.height());
                    if (round > 0 || round2 <= 0) {
                        return parcelable;
                    }
                    float min2 = Math.min(1.0f, 1048576.0f / (round * round2));
                    int i7 = (int) (round * min2);
                    int i8 = (int) (round2 * min2);
                    if (sharedElementCallback.mTempMatrix == null) {
                        sharedElementCallback.mTempMatrix = new Matrix();
                    }
                    sharedElementCallback.mTempMatrix.set(matrix);
                    sharedElementCallback.mTempMatrix.postTranslate(-rectF.left, -rectF.top);
                    sharedElementCallback.mTempMatrix.postScale(min2, min2);
                    Bitmap createBitmap2 = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.concat(sharedElementCallback.mTempMatrix);
                    view.draw(canvas2);
                    return createBitmap2;
                }
            }
            parcelable = null;
            round = Math.round(rectF.width());
            int round22 = Math.round(rectF.height());
            if (round > 0) {
            }
            return parcelable;
        }

        @Override // android.app.SharedElementCallback
        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            this.mCallback.getClass();
            if (!(parcelable instanceof Bundle)) {
                if (!(parcelable instanceof Bitmap)) {
                    return null;
                }
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap((Bitmap) parcelable);
                return imageView;
            }
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap == null) {
                return null;
            }
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap(bitmap);
            imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
            if (imageView2.getScaleType() == ImageView.ScaleType.MATRIX) {
                float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView2.setImageMatrix(matrix);
            }
            return imageView2;
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List list, Map map) {
            this.mCallback.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onRejectSharedElements(List list) {
            this.mCallback.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List list, List list2, List list3) {
            this.mCallback.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List list, List list2, List list3) {
            this.mCallback.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            Objects.requireNonNull(onSharedElementsReadyListener);
            this.mCallback.getClass();
            onSharedElementsReadyListener.onSharedElementsReady();
        }
    }

    public static void finishAffinity(AppCompatActivity appCompatActivity) {
        appCompatActivity.finishAffinity();
    }

    public static void finishAfterTransition(FragmentActivity fragmentActivity) {
        fragmentActivity.finishAfterTransition();
    }

    public static void postponeEnterTransition(FragmentActivity fragmentActivity) {
        fragmentActivity.postponeEnterTransition();
    }

    public static void recreate(Activity activity) {
        activity.recreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void requestPermissions(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof RequestPermissionsRequestCodeValidator) {
            ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i);
        }
        activity.requestPermissions(strArr, i);
    }

    public static void setEnterSharedElementCallback(FragmentActivity fragmentActivity, SharedElementCallback sharedElementCallback) {
        fragmentActivity.setEnterSharedElementCallback(sharedElementCallback != null ? new SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    public static void setExitSharedElementCallback(FragmentActivity fragmentActivity, SharedElementCallback sharedElementCallback) {
        fragmentActivity.setExitSharedElementCallback(sharedElementCallback != null ? new SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i < 32 && i == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void startIntentSenderForResult(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void startPostponedEnterTransition(FragmentActivity fragmentActivity) {
        fragmentActivity.startPostponedEnterTransition();
    }
}
