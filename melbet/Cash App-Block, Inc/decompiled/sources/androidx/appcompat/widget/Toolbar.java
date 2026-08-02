package androidx.appcompat.widget;

import android.app.Dialog;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Magnifier;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.ToolbarActionBar;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.CascadingMenuPopup;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.pipe.compat.Camera2CaptureSequence;
import androidx.camera.camera2.pipe.compat.SessionSequencer$State;
import androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.SingleCloseImageProxy;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.view.PreviewView;
import androidx.compose.animation.SharedBoundsNode;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.AnimationResult;
import androidx.compose.foundation.gestures.snapping.ApproachAnimation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.DefaultIntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicsMeasureScope;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.window.Api33Impl$$ExternalSyntheticLambda0;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.PopBackStackState;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mkv.VarintReader;
import androidx.media3.extractor.text.Subtitle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n3$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import com.bugsnag.android.Client;
import com.bugsnag.android.TraceParser;
import com.fillr.core.BaseFragment;
import com.fillr.embedded.profile.FEMainActivity;
import com.fillr.embedded.settings.FESettingsFragment;
import com.fillr.infopages.AboutFragment;
import com.fillr.m1;
import com.fillr.profile.ProfileDetailedViewFragment;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.google.android.libraries.places.internal.zzqg;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.zzz;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.cash.R;
import com.squareup.wire.GrpcMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.atomicfu.AtomicRef;
import net.oneformapp.ProfileStore_;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.Schema_;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public class Toolbar extends ViewGroup implements MenuHost {
    public MenuPresenter.Callback mActionMenuPresenterCallback;
    public OnBackInvokedCallback mBackInvokedCallback;
    public boolean mBackInvokedCallbackEnabled;
    public OnBackInvokedDispatcher mBackInvokedDispatcher;
    public final int mButtonGravity;
    public AppCompatImageButton mCollapseButtonView;
    public final CharSequence mCollapseDescription;
    public final Drawable mCollapseIcon;
    public boolean mCollapsible;
    public int mContentInsetEndWithActions;
    public int mContentInsetStartWithNavigation;
    public RtlSpacingHelper mContentInsets;
    public boolean mEatingHover;
    public boolean mEatingTouch;
    public View mExpandedActionView;
    public ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    public final int mGravity;
    public final ArrayList mHiddenViews;
    public AppCompatImageView mLogoView;
    public final int mMaxButtonHeight;
    public MenuBuilder.Callback mMenuBuilderCallback;
    public final MenuHostHelper mMenuHostHelper;
    public ActionMenuView mMenuView;
    public final AnonymousClass1 mMenuViewItemClickListener;
    public AppCompatImageButton mNavButtonView;
    public OnMenuItemClickListener mOnMenuItemClickListener;
    public ActionMenuPresenter mOuterActionMenuPresenter;
    public Context mPopupContext;
    public int mPopupTheme;
    public ArrayList mProvidedMenuItems;
    public final Client.AnonymousClass7 mShowOverflowMenuRunnable;
    public CharSequence mSubtitleText;
    public int mSubtitleTextAppearance;
    public ColorStateList mSubtitleTextColor;
    public AppCompatTextView mSubtitleTextView;
    public final int[] mTempMargins;
    public final ArrayList mTempViews;
    public int mTitleMarginBottom;
    public int mTitleMarginEnd;
    public int mTitleMarginStart;
    public int mTitleMarginTop;
    public CharSequence mTitleText;
    public int mTitleTextAppearance;
    public ColorStateList mTitleTextColor;
    public AppCompatTextView mTitleTextView;
    public ToolbarWidgetWrapper mWrapper;

    /* renamed from: androidx.appcompat.widget.Toolbar$4, reason: invalid class name */
    public final class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass4(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:78:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0184  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            InputMethodManager inputMethodManager;
            Object[] objArr;
            int i = this.$r8$classId;
            String str = null;
            r2 = null;
            Message obtain = null;
            int i2 = 0;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = ((Toolbar) obj).mExpandedMenuPresenter;
                    MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter != null ? expandedActionViewMenuPresenter.mCurrentExpandedItem : null;
                    if (menuItemImpl != null) {
                        menuItemImpl.collapseActionView();
                        break;
                    }
                    break;
                case 1:
                    AlertController alertController = (AlertController) obj;
                    if (view == alertController.mButtonPositive && (message3 = alertController.mButtonPositiveMessage) != null) {
                        obtain = Message.obtain(message3);
                    } else if (view == alertController.mButtonNegative && (message2 = alertController.mButtonNegativeMessage) != null) {
                        obtain = Message.obtain(message2);
                    } else if (view == alertController.mButtonNeutral && (message = alertController.mButtonNeutralMessage) != null) {
                        obtain = Message.obtain(message);
                    }
                    if (obtain != null) {
                        obtain.sendToTarget();
                    }
                    alertController.mHandler.obtainMessage(1, alertController.mDialog).sendToTarget();
                    break;
                case 2:
                    ((ActionMode) obj).finish();
                    break;
                case 3:
                    ((Dialog) obj).dismiss();
                    break;
                case 4:
                    FEMainActivity fEMainActivity = (FEMainActivity) obj;
                    int backStackEntryCount = fEMainActivity.fragmentManager.getBackStackEntryCount();
                    if (backStackEntryCount == 0) {
                        fEMainActivity.finish();
                        break;
                    } else if (backStackEntryCount > 0) {
                        try {
                            BaseFragment baseFragment = (BaseFragment) fEMainActivity.getSupportFragmentManager().findFragmentByTag("profile_detailed_view_2");
                            if (baseFragment instanceof ProfileDetailedViewFragment) {
                                ProfileDetailedViewFragment profileDetailedViewFragment = (ProfileDetailedViewFragment) baseFragment;
                                if (profileDetailedViewFragment.isAdded() && profileDetailedViewFragment.isVisible()) {
                                    profileDetailedViewFragment.isChildElementCollapsed();
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        FragmentManager fragmentManager = fEMainActivity.fragmentManager;
                        fragmentManager.getClass();
                        fragmentManager.enqueueAction(fragmentManager.new PopBackStackState(null, -1, 0), false);
                        View currentFocus = fEMainActivity.getCurrentFocus();
                        if (currentFocus != null && (inputMethodManager = (InputMethodManager) fEMainActivity.getSystemService("input_method")) != null) {
                            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                            break;
                        }
                    }
                    break;
                case 5:
                    m1 m1Var = (m1) obj;
                    m1Var.getClass();
                    int intValue = ((Integer) view.getTag()).intValue();
                    FESettingsFragment fESettingsFragment = (FESettingsFragment) m1Var.a;
                    if (intValue != 0) {
                        String[] stringArray = fESettingsFragment.getResources().getStringArray(R.array.com_fillr_package_priority);
                        if (stringArray != null && stringArray.length > 0) {
                            for (String str2 : stringArray) {
                                try {
                                    fESettingsFragment.getContext().getPackageManager().getPackageInfo(str2, 1);
                                    objArr = true;
                                    str = str2;
                                    if (objArr != false) {
                                        Intent intent = new Intent("android.intent.action.MAIN");
                                        intent.addCategory("android.intent.category.LAUNCHER");
                                        intent.addFlags(65536);
                                        Iterator<ResolveInfo> it = fESettingsFragment.getActivity().getPackageManager().queryIntentActivities(intent, 0).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                ResolveInfo next = it.next();
                                                if (next.activityInfo.packageName.equalsIgnoreCase(str)) {
                                                    ActivityInfo activityInfo = next.activityInfo;
                                                    String str3 = activityInfo.packageName;
                                                    String str4 = activityInfo.name;
                                                    Intent intent2 = new Intent("android.intent.action.MAIN");
                                                    intent2.addCategory("android.intent.category.LAUNCHER");
                                                    intent2.setComponent(new ComponentName(str3, str4));
                                                    intent2.setFlags(268435456);
                                                    fESettingsFragment.startActivity(intent2);
                                                }
                                            }
                                        }
                                    }
                                    if (objArr != false) {
                                        if (intValue == 1) {
                                            fESettingsFragment.showProfile();
                                            break;
                                        } else if (intValue == 2) {
                                            fESettingsFragment.getMainActivity().pushFragmentOntoStack(new AboutFragment(), "about_fragment");
                                            break;
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                            }
                        }
                        objArr = false;
                        if (objArr != false) {
                        }
                        if (objArr != false) {
                        }
                    } else if (intValue == 1) {
                        fESettingsFragment.showProfile();
                        break;
                    } else if (intValue == 2) {
                        fESettingsFragment.getMainActivity().pushFragmentOntoStack(new AboutFragment(), "about_fragment");
                        break;
                    }
                    break;
                case 6:
                    ProfileDetailedViewFragment profileDetailedViewFragment2 = (ProfileDetailedViewFragment) obj;
                    Element element = profileDetailedViewFragment2.root;
                    if (element != null && profileDetailedViewFragment2.profileManager != null && (profileDetailedViewFragment2.parent != null || element.isAddress())) {
                        profileDetailedViewFragment2.profileManager.addNamespaceToProfile(profileDetailedViewFragment2.parent, true);
                    }
                    profileDetailedViewFragment2.readAllArrayElements();
                    ProfileAdapter profileAdapter = profileDetailedViewFragment2.viewCreator;
                    List list = profileAdapter.groupElements;
                    if (list != null && list.size() > 0) {
                        List list2 = profileAdapter.groupElements;
                        Element element2 = (Element) list2.get(list2.size() - 1);
                        if (element2 != null && element2.isAddress()) {
                            profileAdapter.showAddressAutocompletionDialog(element2);
                            break;
                        } else {
                            int size = profileAdapter.groupElements.size() - 1;
                            SparseArray sparseArray = profileAdapter.allTitleViews;
                            if (size >= 0 && size < sparseArray.size()) {
                                profileAdapter.onGroupClicked.onClick((View) sparseArray.get(size));
                                break;
                            }
                        }
                    }
                    break;
                case 7:
                    BaseAutocompleteImplFragment baseAutocompleteImplFragment = (BaseAutocompleteImplFragment) obj;
                    baseAutocompleteImplFragment.zzu = true;
                    Context requireContext = baseAutocompleteImplFragment.requireContext();
                    int i3 = baseAutocompleteImplFragment.zzv;
                    ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                    zzqg zzqgVar = new zzqg(requireContext, i3, RegularImmutableList.EMPTY);
                    zzqgVar.setOnDismissListener(new zzz(baseAutocompleteImplFragment, i2));
                    zzqgVar.show();
                    break;
                case 8:
                    BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) obj;
                    if (bottomSheetDialog.cancelable && bottomSheetDialog.isShowing()) {
                        if (!bottomSheetDialog.canceledOnTouchOutsideSet) {
                            TypedArray obtainStyledAttributes = bottomSheetDialog.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                            bottomSheetDialog.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                            bottomSheetDialog.canceledOnTouchOutsideSet = true;
                        }
                        if (bottomSheetDialog.canceledOnTouchOutside) {
                            bottomSheetDialog.cancel();
                            break;
                        }
                    }
                    break;
                default:
                    MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                    int i4 = materialCalendar.calendarSelector;
                    if (i4 == 2) {
                        materialCalendar.setSelector$1(1);
                    } else if (i4 == 1) {
                        materialCalendar.setSelector$1(2);
                    }
                    materialCalendar.updateAccessibilityPaneTitle(materialCalendar.getView());
                    break;
            }
        }
    }

    public abstract class Api33Impl {
        public static OnBackInvokedDispatcher findOnBackInvokedDispatcher(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback newOnBackInvokedCallback(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new Api33Impl$$ExternalSyntheticLambda0(runnable, 2);
        }

        public static void tryRegisterOnBackInvokedCallback(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void tryUnregisterOnBackInvokedCallback(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public final class ExpandedActionViewMenuPresenter implements MenuPresenter {
        public MenuItemImpl mCurrentExpandedItem;
        public MenuBuilder mMenu;

        public ExpandedActionViewMenuPresenter() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean collapseItemActionView(MenuItemImpl menuItemImpl) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.mExpandedActionView;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.mExpandedActionView);
            toolbar.removeView(toolbar.mCollapseButtonView);
            toolbar.mExpandedActionView = null;
            ArrayList arrayList = toolbar.mHiddenViews;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                toolbar.addView((View) arrayList.get(size));
            }
            arrayList.clear();
            this.mCurrentExpandedItem = null;
            toolbar.requestLayout();
            menuItemImpl.mIsActionViewExpanded = false;
            menuItemImpl.mMenu.onItemsChanged(false);
            toolbar.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean expandItemActionView(MenuItemImpl menuItemImpl) {
            Toolbar toolbar = Toolbar.this;
            toolbar.ensureCollapseButtonView();
            ViewParent parent = toolbar.mCollapseButtonView.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                toolbar.addView(toolbar.mCollapseButtonView);
            }
            View actionView = menuItemImpl.getActionView();
            toolbar.mExpandedActionView = actionView;
            this.mCurrentExpandedItem = menuItemImpl;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.mExpandedActionView);
                }
                LayoutParams layoutParams = new LayoutParams();
                layoutParams.gravity = (toolbar.mButtonGravity & 112) | 8388611;
                layoutParams.mViewType = 2;
                toolbar.mExpandedActionView.setLayoutParams(layoutParams);
                toolbar.addView(toolbar.mExpandedActionView);
            }
            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar.getChildAt(childCount);
                if (((LayoutParams) childAt.getLayoutParams()).mViewType != 2 && childAt != toolbar.mMenuView) {
                    toolbar.removeViewAt(childCount);
                    toolbar.mHiddenViews.add(childAt);
                }
            }
            toolbar.requestLayout();
            menuItemImpl.mIsActionViewExpanded = true;
            menuItemImpl.mMenu.onItemsChanged(false);
            KeyEvent.Callback callback = toolbar.mExpandedActionView;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).onActionViewExpanded();
            }
            toolbar.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void initForMenu(Context context, MenuBuilder menuBuilder) {
            MenuItemImpl menuItemImpl;
            MenuBuilder menuBuilder2 = this.mMenu;
            if (menuBuilder2 != null && (menuItemImpl = this.mCurrentExpandedItem) != null) {
                menuBuilder2.collapseItemActionView(menuItemImpl);
            }
            this.mMenu = menuBuilder;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public final void updateMenuView() {
            if (this.mCurrentExpandedItem != null) {
                MenuBuilder menuBuilder = this.mMenu;
                if (menuBuilder != null) {
                    int size = menuBuilder.mItems.size();
                    for (int i = 0; i < size; i++) {
                        if (this.mMenu.getItem(i) == this.mCurrentExpandedItem) {
                            return;
                        }
                    }
                }
                collapseItemActionView(this.mCurrentExpandedItem);
            }
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(2);
        public int expandedMenuItemId;
        public boolean isOverflowOpen;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.expandedMenuItemId = parcel.readInt();
            this.isOverflowOpen = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.expandedMenuItemId);
            parcel.writeInt(this.isOverflowOpen ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList();
        this.mHiddenViews = new ArrayList();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new MenuHostHelper(new Toolbar$$ExternalSyntheticLambda0(this, 1));
        this.mProvidedMenuItems = new ArrayList();
        this.mMenuViewItemClickListener = new AnonymousClass1(this);
        this.mShowOverflowMenuRunnable = new Client.AnonymousClass7(this, 3);
        Context context2 = getContext();
        int[] iArr = R$styleable.Toolbar;
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(i, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) obtainStyledAttributes.requestAdapter;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api29Impl.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArray, i, 0);
        TypedArray typedArray2 = (TypedArray) obtainStyledAttributes.requestAdapter;
        this.mTitleTextAppearance = typedArray2.getResourceId(28, 0);
        this.mSubtitleTextAppearance = typedArray2.getResourceId(19, 0);
        this.mGravity = typedArray2.getInteger(0, 8388627);
        this.mButtonGravity = typedArray2.getInteger(2, 48);
        int dimensionPixelOffset = typedArray2.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray2.hasValue(27) ? typedArray2.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray2.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray2.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray2.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray2.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset5;
        }
        this.mMaxButtonHeight = typedArray2.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray2.getDimensionPixelOffset(9, PKIFailureInfo.systemUnavail);
        int dimensionPixelOffset7 = typedArray2.getDimensionPixelOffset(5, PKIFailureInfo.systemUnavail);
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(8, 0);
        ensureContentInsets();
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        rtlSpacingHelper.mIsRelative = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            rtlSpacingHelper.mExplicitLeft = dimensionPixelSize;
            rtlSpacingHelper.mLeft = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            rtlSpacingHelper.mExplicitRight = dimensionPixelSize2;
            rtlSpacingHelper.mRight = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            rtlSpacingHelper.setRelative(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.mContentInsetStartWithNavigation = typedArray2.getDimensionPixelOffset(10, PKIFailureInfo.systemUnavail);
        this.mContentInsetEndWithActions = typedArray2.getDimensionPixelOffset(6, PKIFailureInfo.systemUnavail);
        this.mCollapseIcon = obtainStyledAttributes.getDrawable(4);
        this.mCollapseDescription = typedArray2.getText(3);
        CharSequence text = typedArray2.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray2.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(typedArray2.getResourceId(17, 0));
        Drawable drawable = obtainStyledAttributes.getDrawable(16);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        CharSequence text3 = typedArray2.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(11);
        if (drawable2 != null) {
            setLogo(drawable2);
        }
        CharSequence text4 = typedArray2.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray2.hasValue(29)) {
            setTitleTextColor(obtainStyledAttributes.getColorStateList(29));
        }
        if (typedArray2.hasValue(20)) {
            setSubtitleTextColor(obtainStyledAttributes.getColorStateList(20));
        }
        if (typedArray2.hasValue(14)) {
            inflateMenu(typedArray2.getResourceId(14, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public static LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.mViewType = 0;
            layoutParams3.mViewType = layoutParams2.mViewType;
            return layoutParams3;
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ActionBar.LayoutParams) layoutParams);
            layoutParams4.mViewType = 0;
            return layoutParams4;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            LayoutParams layoutParams5 = new LayoutParams(layoutParams);
            layoutParams5.mViewType = 0;
            return layoutParams5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        LayoutParams layoutParams6 = new LayoutParams(marginLayoutParams);
        layoutParams6.mViewType = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = marginLayoutParams.bottomMargin;
        return layoutParams6;
    }

    public static int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void addCustomViewsWithGravity(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mViewType == 0 && shouldLayout(childAt)) {
                    int i3 = layoutParams.gravity;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.mViewType == 0 && shouldLayout(childAt2)) {
                int i5 = layoutParams2.gravity;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider) {
        MenuHostHelper menuHostHelper = this.mMenuHostHelper;
        menuHostHelper.mMenuProviders.add(menuProvider);
        menuHostHelper.mOnInvalidateMenuCallback.run();
    }

    public final void addSystemView(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams layoutParams2 = layoutParams == null ? new LayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        layoutParams2.mViewType = 1;
        if (!z || this.mExpandedActionView == null) {
            addView(view, layoutParams2);
        } else {
            view.setLayoutParams(layoutParams2);
            this.mHiddenViews.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public final void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.gravity = (this.mButtonGravity & 112) | 8388611;
            layoutParams.mViewType = 2;
            this.mCollapseButtonView.setLayoutParams(layoutParams);
            this.mCollapseButtonView.setOnClickListener(new AnonymousClass4(this, 0));
        }
    }

    public final void ensureContentInsets() {
        if (this.mContentInsets == null) {
            RtlSpacingHelper rtlSpacingHelper = new RtlSpacingHelper();
            rtlSpacingHelper.mLeft = 0;
            rtlSpacingHelper.mRight = 0;
            rtlSpacingHelper.mStart = PKIFailureInfo.systemUnavail;
            rtlSpacingHelper.mEnd = PKIFailureInfo.systemUnavail;
            rtlSpacingHelper.mExplicitLeft = 0;
            rtlSpacingHelper.mExplicitRight = 0;
            rtlSpacingHelper.mIsRtl = false;
            rtlSpacingHelper.mIsRelative = false;
            this.mContentInsets = rtlSpacingHelper;
        }
    }

    public final void ensureMenu() {
        ensureMenuView();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView.mMenu == null) {
            MenuBuilder menu = actionMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            menu.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    public final void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.setMenuCallbacks(this.mActionMenuPresenterCallback, new Recorder.AnonymousClass6(this, 5));
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.gravity = (this.mButtonGravity & 112) | 8388613;
            this.mMenuView.setLayoutParams(layoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    public final void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.gravity = (this.mButtonGravity & 112) | 8388611;
            this.mNavButtonView.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final int getChildTop(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = layoutParams.gravity & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.mGravity & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final int getCurrentContentInsetEnd() {
        MenuBuilder menuBuilder;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && (menuBuilder = actionMenuView.mMenu) != null && menuBuilder.hasVisibleItems()) {
            RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
            return Math.max(rtlSpacingHelper != null ? rtlSpacingHelper.mIsRtl ? rtlSpacingHelper.mLeft : rtlSpacingHelper.mRight : 0, Math.max(this.mContentInsetEndWithActions, 0));
        }
        RtlSpacingHelper rtlSpacingHelper2 = this.mContentInsets;
        if (rtlSpacingHelper2 != null) {
            return rtlSpacingHelper2.mIsRtl ? rtlSpacingHelper2.mLeft : rtlSpacingHelper2.mRight;
        }
        return 0;
    }

    public final int getCurrentContentInsetStart() {
        Drawable navigationIcon = getNavigationIcon();
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (navigationIcon != null) {
            return Math.max(rtlSpacingHelper != null ? rtlSpacingHelper.mIsRtl ? rtlSpacingHelper.mRight : rtlSpacingHelper.mLeft : 0, Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.mIsRtl ? rtlSpacingHelper.mRight : rtlSpacingHelper.mLeft;
        }
        return 0;
    }

    public final ArrayList getCurrentMenuItems() {
        ArrayList arrayList = new ArrayList();
        MenuBuilder menu = getMenu();
        for (int i = 0; i < menu.mItems.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    public final MenuBuilder getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public final Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.mNavButtonView;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public void inflateMenu(int i) {
        new SupportMenuInflater(getContext()).inflate(i, getMenu());
    }

    public final boolean isChildOrHidden(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public final boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.mPresenter) == null || !actionMenuPresenter.isOverflowMenuShowing()) ? false : true;
    }

    public final int layoutChildLeft(View view, int i, int i2, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, childTop, max + measuredWidth, view.getMeasuredHeight() + childTop);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + max;
    }

    public final int layoutChildRight(View view, int i, int i2, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, childTop, max, view.getMeasuredHeight() + childTop);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public final int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void measureChildConstrained(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.mEatingHover = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a5 A[LOOP:0: B:52:0x02a3->B:53:0x02a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02be A[LOOP:1: B:56:0x02bc->B:57:0x02be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02df A[LOOP:2: B:60:0x02dd->B:61:0x02df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x032f A[LOOP:3: B:69:0x032d->B:70:0x032f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z2;
        int min;
        boolean shouldLayout;
        boolean shouldLayout2;
        int i7;
        int i8;
        int i9;
        int paddingTop;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int size;
        int i15;
        int i16;
        int size2;
        int i17;
        int size3;
        int i18;
        int i19;
        int size4;
        int i20;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i21 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        int minimumHeight = getMinimumHeight();
        int min2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (shouldLayout(this.mNavButtonView)) {
            AppCompatImageButton appCompatImageButton = this.mNavButtonView;
            if (z3) {
                i6 = layoutChildRight(appCompatImageButton, i21, min2, iArr);
                i5 = paddingLeft;
                if (shouldLayout(this.mCollapseButtonView)) {
                    AppCompatImageButton appCompatImageButton2 = this.mCollapseButtonView;
                    if (z3) {
                        i6 = layoutChildRight(appCompatImageButton2, i6, min2, iArr);
                    } else {
                        i5 = layoutChildLeft(appCompatImageButton2, i5, min2, iArr);
                    }
                }
                if (shouldLayout(this.mMenuView)) {
                    ActionMenuView actionMenuView = this.mMenuView;
                    if (z3) {
                        i5 = layoutChildLeft(actionMenuView, i5, min2, iArr);
                    } else {
                        i6 = layoutChildRight(actionMenuView, i6, min2, iArr);
                    }
                }
                int currentContentInsetEnd = getLayoutDirection() != 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
                int currentContentInsetStart = getLayoutDirection() != 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
                z2 = z3;
                iArr[0] = Math.max(0, currentContentInsetEnd - i5);
                iArr[1] = Math.max(0, currentContentInsetStart - (i21 - i6));
                int max = Math.max(i5, currentContentInsetEnd);
                min = Math.min(i6, i21 - currentContentInsetStart);
                if (shouldLayout(this.mExpandedActionView)) {
                    View view = this.mExpandedActionView;
                    if (z2) {
                        min = layoutChildRight(view, min, min2, iArr);
                    } else {
                        max = layoutChildLeft(view, max, min2, iArr);
                    }
                }
                if (shouldLayout(this.mLogoView)) {
                    AppCompatImageView appCompatImageView = this.mLogoView;
                    if (z2) {
                        min = layoutChildRight(appCompatImageView, min, min2, iArr);
                    } else {
                        max = layoutChildLeft(appCompatImageView, max, min2, iArr);
                    }
                }
                shouldLayout = shouldLayout(this.mTitleTextView);
                shouldLayout2 = shouldLayout(this.mSubtitleTextView);
                if (shouldLayout) {
                    i7 = 0;
                } else {
                    LayoutParams layoutParams = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                }
                if (shouldLayout2) {
                    i8 = max;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) this.mSubtitleTextView.getLayoutParams();
                    i8 = max;
                    i7 += this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                if (!shouldLayout || shouldLayout2) {
                    AppCompatTextView appCompatTextView = !shouldLayout ? this.mTitleTextView : this.mSubtitleTextView;
                    AppCompatTextView appCompatTextView2 = !shouldLayout2 ? this.mSubtitleTextView : this.mTitleTextView;
                    LayoutParams layoutParams3 = (LayoutParams) appCompatTextView.getLayoutParams();
                    LayoutParams layoutParams4 = (LayoutParams) appCompatTextView2.getLayoutParams();
                    boolean z4 = (!shouldLayout && this.mTitleTextView.getMeasuredWidth() > 0) || (shouldLayout2 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                    int i22 = min;
                    i9 = this.mGravity & 112;
                    if (i9 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + this.mTitleMarginTop;
                    } else if (i9 != 80) {
                        int i23 = (((height - paddingTop2) - paddingBottom) - i7) / 2;
                        int i24 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + this.mTitleMarginTop;
                        if (i23 < i24) {
                            i23 = i24;
                        } else {
                            int i25 = (((height - paddingBottom) - i7) - i23) - paddingTop2;
                            int i26 = ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                            int i27 = this.mTitleMarginBottom;
                            if (i25 < i26 + i27) {
                                i23 = Math.max(0, i23 - ((((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + i27) - i25));
                            }
                        }
                        paddingTop = paddingTop2 + i23;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin) - this.mTitleMarginBottom) - i7;
                    }
                    if (z2) {
                        int i28 = (z4 ? this.mTitleMarginStart : 0) - iArr[0];
                        int max2 = Math.max(0, i28) + i8;
                        iArr[0] = Math.max(0, -i28);
                        if (shouldLayout) {
                            LayoutParams layoutParams5 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + max2;
                            int measuredHeight = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(max2, paddingTop, measuredWidth, measuredHeight);
                            i10 = measuredWidth + this.mTitleMarginEnd;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                        } else {
                            i10 = max2;
                        }
                        if (shouldLayout2) {
                            int i29 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.mSubtitleTextView.getMeasuredWidth() + max2;
                            this.mSubtitleTextView.layout(max2, i29, measuredWidth2, this.mSubtitleTextView.getMeasuredHeight() + i29);
                            i11 = measuredWidth2 + this.mTitleMarginEnd;
                        } else {
                            i11 = max2;
                        }
                        if (z4) {
                            i12 = Math.max(i10, i11);
                            min = i22;
                        } else {
                            min = i22;
                            i12 = max2;
                        }
                        ArrayList arrayList = this.mTempViews;
                        addCustomViewsWithGravity(3, arrayList);
                        size = arrayList.size();
                        i15 = i12;
                        for (i16 = 0; i16 < size; i16++) {
                            i15 = layoutChildLeft((View) arrayList.get(i16), i15, min2, iArr);
                        }
                        addCustomViewsWithGravity(5, arrayList);
                        size2 = arrayList.size();
                        int i30 = min;
                        for (i17 = 0; i17 < size2; i17++) {
                            i30 = layoutChildRight((View) arrayList.get(i17), i30, min2, iArr);
                        }
                        addCustomViewsWithGravity(1, arrayList);
                        int i31 = iArr[0];
                        int i32 = iArr[1];
                        size3 = arrayList.size();
                        int i33 = i32;
                        int i34 = i31;
                        i18 = 0;
                        int i35 = 0;
                        while (i18 < size3) {
                            View view2 = (View) arrayList.get(i18);
                            LayoutParams layoutParams6 = (LayoutParams) view2.getLayoutParams();
                            int i36 = i18;
                            int i37 = ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin - i34;
                            int i38 = ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin - i33;
                            int max3 = Math.max(0, i37);
                            int max4 = Math.max(0, i38);
                            int max5 = Math.max(0, -i37);
                            int max6 = Math.max(0, -i38);
                            i35 += view2.getMeasuredWidth() + max3 + max4;
                            i33 = max6;
                            i34 = max5;
                            i18 = i36 + 1;
                        }
                        i19 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i35 / 2);
                        int i39 = i35 + i19;
                        if (i19 >= i15) {
                            i15 = i39 > i30 ? i19 - (i39 - i30) : i19;
                        }
                        size4 = arrayList.size();
                        for (i20 = 0; i20 < size4; i20++) {
                            i15 = layoutChildLeft((View) arrayList.get(i20), i15, min2, iArr);
                        }
                        arrayList.clear();
                        return;
                    }
                    int i40 = (z4 ? this.mTitleMarginStart : 0) - iArr[1];
                    int max7 = i22 - Math.max(0, i40);
                    iArr[1] = Math.max(0, -i40);
                    if (shouldLayout) {
                        LayoutParams layoutParams7 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                        int measuredWidth3 = max7 - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth3, paddingTop, max7, measuredHeight2);
                        i13 = measuredWidth3 - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin;
                    } else {
                        i13 = max7;
                    }
                    if (shouldLayout2) {
                        int i41 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(max7 - this.mSubtitleTextView.getMeasuredWidth(), i41, max7, this.mSubtitleTextView.getMeasuredHeight() + i41);
                        i14 = max7 - this.mTitleMarginEnd;
                    } else {
                        i14 = max7;
                    }
                    min = z4 ? Math.min(i13, i14) : max7;
                }
                i12 = i8;
                ArrayList arrayList2 = this.mTempViews;
                addCustomViewsWithGravity(3, arrayList2);
                size = arrayList2.size();
                i15 = i12;
                while (i16 < size) {
                }
                addCustomViewsWithGravity(5, arrayList2);
                size2 = arrayList2.size();
                int i302 = min;
                while (i17 < size2) {
                }
                addCustomViewsWithGravity(1, arrayList2);
                int i312 = iArr[0];
                int i322 = iArr[1];
                size3 = arrayList2.size();
                int i332 = i322;
                int i342 = i312;
                i18 = 0;
                int i352 = 0;
                while (i18 < size3) {
                }
                i19 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i352 / 2);
                int i392 = i352 + i19;
                if (i19 >= i15) {
                }
                size4 = arrayList2.size();
                while (i20 < size4) {
                }
                arrayList2.clear();
                return;
            }
            i5 = layoutChildLeft(appCompatImageButton, paddingLeft, min2, iArr);
        } else {
            i5 = paddingLeft;
        }
        i6 = i21;
        if (shouldLayout(this.mCollapseButtonView)) {
        }
        if (shouldLayout(this.mMenuView)) {
        }
        if (getLayoutDirection() != 1) {
        }
        if (getLayoutDirection() != 1) {
        }
        z2 = z3;
        iArr[0] = Math.max(0, currentContentInsetEnd - i5);
        iArr[1] = Math.max(0, currentContentInsetStart - (i21 - i6));
        int max8 = Math.max(i5, currentContentInsetEnd);
        min = Math.min(i6, i21 - currentContentInsetStart);
        if (shouldLayout(this.mExpandedActionView)) {
        }
        if (shouldLayout(this.mLogoView)) {
        }
        shouldLayout = shouldLayout(this.mTitleTextView);
        shouldLayout2 = shouldLayout(this.mSubtitleTextView);
        if (shouldLayout) {
        }
        if (shouldLayout2) {
        }
        if (!shouldLayout) {
        }
        if (!shouldLayout) {
        }
        if (!shouldLayout2) {
        }
        LayoutParams layoutParams32 = (LayoutParams) appCompatTextView.getLayoutParams();
        LayoutParams layoutParams42 = (LayoutParams) appCompatTextView2.getLayoutParams();
        if (shouldLayout) {
        }
        int i222 = min;
        i9 = this.mGravity & 112;
        if (i9 != 48) {
        }
        if (z2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i, 0, i2, this.mMaxButtonHeight);
            i3 = getHorizontalMargins(this.mNavButtonView) + this.mNavButtonView.getMeasuredWidth();
            i4 = Math.max(0, getVerticalMargins(this.mNavButtonView) + this.mNavButtonView.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i, 0, i2, this.mMaxButtonHeight);
            i3 = getHorizontalMargins(this.mCollapseButtonView) + this.mCollapseButtonView.getMeasuredWidth();
            i4 = Math.max(i4, getVerticalMargins(this.mCollapseButtonView) + this.mCollapseButtonView.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.mTempMargins;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i, max, i2, this.mMaxButtonHeight);
            i6 = getHorizontalMargins(this.mMenuView) + this.mMenuView.getMeasuredWidth();
            i4 = Math.max(i4, getVerticalMargins(this.mMenuView) + this.mMenuView.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.mMenuView.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (shouldLayout(this.mExpandedActionView)) {
            max3 += measureChildCollapseMargins(this.mExpandedActionView, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, getVerticalMargins(this.mExpandedActionView) + this.mExpandedActionView.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            max3 += measureChildCollapseMargins(this.mLogoView, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, getVerticalMargins(this.mLogoView) + this.mLogoView.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((LayoutParams) childAt.getLayoutParams()).mViewType == 0 && shouldLayout(childAt)) {
                max3 += measureChildCollapseMargins(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, getVerticalMargins(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i14 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i, i12 + i14, i2, i13, iArr);
            int horizontalMargins = getHorizontalMargins(this.mTitleTextView) + this.mTitleTextView.getMeasuredWidth();
            i7 = getVerticalMargins(this.mTitleTextView) + this.mTitleTextView.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.mTitleTextView.getMeasuredState());
            i9 = horizontalMargins;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            i9 = Math.max(i9, measureChildCollapseMargins(this.mSubtitleTextView, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += getVerticalMargins(this.mSubtitleTextView) + this.mSubtitleTextView.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.mSubtitleTextView.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.mCollapsible) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!shouldLayout(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        ActionMenuView actionMenuView = this.mMenuView;
        MenuBuilder menuBuilder = actionMenuView != null ? actionMenuView.mMenu : null;
        int i = savedState.expandedMenuItemId;
        if (i != 0 && this.mExpandedMenuPresenter != null && menuBuilder != null && (findItem = menuBuilder.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.isOverflowOpen) {
            Client.AnonymousClass7 anonymousClass7 = this.mShowOverflowMenuRunnable;
            removeCallbacks(anonymousClass7);
            post(anonymousClass7);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        ensureContentInsets();
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        boolean z = i == 1;
        if (z == rtlSpacingHelper.mIsRtl) {
            return;
        }
        rtlSpacingHelper.mIsRtl = z;
        if (!rtlSpacingHelper.mIsRelative) {
            rtlSpacingHelper.mLeft = rtlSpacingHelper.mExplicitLeft;
            rtlSpacingHelper.mRight = rtlSpacingHelper.mExplicitRight;
            return;
        }
        if (z) {
            int i2 = rtlSpacingHelper.mEnd;
            if (i2 == Integer.MIN_VALUE) {
                i2 = rtlSpacingHelper.mExplicitLeft;
            }
            rtlSpacingHelper.mLeft = i2;
            int i3 = rtlSpacingHelper.mStart;
            if (i3 == Integer.MIN_VALUE) {
                i3 = rtlSpacingHelper.mExplicitRight;
            }
            rtlSpacingHelper.mRight = i3;
            return;
        }
        int i4 = rtlSpacingHelper.mStart;
        if (i4 == Integer.MIN_VALUE) {
            i4 = rtlSpacingHelper.mExplicitLeft;
        }
        rtlSpacingHelper.mLeft = i4;
        int i5 = rtlSpacingHelper.mEnd;
        if (i5 == Integer.MIN_VALUE) {
            i5 = rtlSpacingHelper.mExplicitRight;
        }
        rtlSpacingHelper.mRight = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        MenuItemImpl menuItemImpl;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        if (expandedActionViewMenuPresenter != null && (menuItemImpl = expandedActionViewMenuPresenter.mCurrentExpandedItem) != null) {
            savedState.expandedMenuItemId = menuItemImpl.mId;
        }
        savedState.isOverflowOpen = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.mEatingTouch = false;
        return true;
    }

    @Override // androidx.core.view.MenuHost
    public final void removeMenuProvider(MenuProvider menuProvider) {
        this.mMenuHostHelper.removeMenuProvider(menuProvider);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.mBackInvokedCallbackEnabled != z) {
            this.mBackInvokedCallbackEnabled = z;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        AppCompatImageButton appCompatImageButton = this.mCollapseButtonView;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.mCollapseButtonView;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = PKIFailureInfo.systemUnavail;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = PKIFailureInfo.systemUnavail;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ensureContentInsets();
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        rtlSpacingHelper.mIsRelative = false;
        if (i != Integer.MIN_VALUE) {
            rtlSpacingHelper.mExplicitLeft = i;
            rtlSpacingHelper.mLeft = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            rtlSpacingHelper.mExplicitRight = i2;
            rtlSpacingHelper.mRight = i2;
        }
    }

    public void setContentInsetsRelative(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.setRelative(i, i2);
    }

    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.mLogoView;
        if (drawable != null) {
            if (appCompatImageView == null) {
                this.mLogoView = new AppCompatImageView(getContext());
            }
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else if (appCompatImageView != null && isChildOrHidden(appCompatImageView)) {
            removeView(this.mLogoView);
            this.mHiddenViews.remove(this.mLogoView);
        }
        AppCompatImageView appCompatImageView2 = this.mLogoView;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.mLogoView;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setMenu(MenuBuilder menuBuilder, ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        MenuBuilder menuBuilder2 = this.mMenuView.mMenu;
        if (menuBuilder2 == menuBuilder) {
            return;
        }
        if (menuBuilder2 != null) {
            menuBuilder2.removeMenuPresenter(this.mOuterActionMenuPresenter);
            menuBuilder2.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
        }
        actionMenuPresenter.mExpandedActionViewsExclusive = true;
        Context context = this.mPopupContext;
        if (menuBuilder != null) {
            menuBuilder.addMenuPresenter(actionMenuPresenter, context);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            actionMenuPresenter.initForMenu(context, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            actionMenuPresenter.updateMenuView();
            this.mExpandedMenuPresenter.updateMenuView();
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(actionMenuPresenter);
        this.mOuterActionMenuPresenter = actionMenuPresenter;
        updateBackInvokedCallbackState();
    }

    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(callback, callback2);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        AppCompatImageButton appCompatImageButton = this.mNavButtonView;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            TooltipCompat$Api26Impl.setTooltipText(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.mNavButtonView;
            if (appCompatImageButton != null && isChildOrHidden(appCompatImageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.mNavButtonView;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.mSubtitleTextView;
        if (!isEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else if (appCompatTextView != null && isChildOrHidden(appCompatTextView)) {
            removeView(this.mSubtitleTextView);
            this.mHiddenViews.remove(this.mSubtitleTextView);
        }
        AppCompatTextView appCompatTextView3 = this.mSubtitleTextView;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.mSubtitleTextAppearance = i;
        AppCompatTextView appCompatTextView = this.mSubtitleTextView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        AppCompatTextView appCompatTextView = this.mSubtitleTextView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.mTitleTextView;
        if (!isEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else if (appCompatTextView != null && isChildOrHidden(appCompatTextView)) {
            removeView(this.mTitleTextView);
            this.mHiddenViews.remove(this.mTitleTextView);
        }
        AppCompatTextView appCompatTextView3 = this.mTitleTextView;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.mTitleTextAppearance = i;
        AppCompatTextView appCompatTextView = this.mTitleTextView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        AppCompatTextView appCompatTextView = this.mTitleTextView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public final boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.mPresenter) == null || !actionMenuPresenter.showOverflowMenu()) ? false : true;
    }

    public final void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher = Api33Impl.findOnBackInvokedDispatcher(this);
            ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
            int i = 0;
            boolean z = (expandedActionViewMenuPresenter == null || expandedActionViewMenuPresenter.mCurrentExpandedItem == null || findOnBackInvokedDispatcher == null || !isAttachedToWindow() || !this.mBackInvokedCallbackEnabled) ? false : true;
            if (z && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = Api33Impl.newOnBackInvokedCallback(new Toolbar$$ExternalSyntheticLambda0(this, i));
                }
                Api33Impl.tryRegisterOnBackInvokedCallback(findOnBackInvokedDispatcher, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = findOnBackInvokedDispatcher;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            Api33Impl.tryUnregisterOnBackInvokedCallback(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$1, reason: invalid class name */
    public final class AnonymousClass1 implements MenuBuilder.Callback, MenuItemHoverListener, ActionMenuView.OnMenuItemClickListener, ExtendableBuilder, FutureCallback, AsyncFunction, ApproachAnimation, MediaCodecBufferEnqueuer, Subtitle {
        public Object this$0;

        public AnonymousClass1(int i) {
            switch (i) {
                case 5:
                    this.this$0 = MutableOptionsBundle.create();
                    break;
                case 21:
                    this.this$0 = LazyKt.lazy(new TextKt$$ExternalSyntheticLambda0(this));
                    break;
                default:
                    Quirks quirks = DeviceQuirks.all;
                    this.this$0 = (SmallDisplaySizeQuirk) DeviceQuirks.getAll().get(SmallDisplaySizeQuirk.class);
                    break;
            }
        }

        public static boolean arrayHasData(ProfileStore_ profileStore_, Element element) {
            String str;
            if (element == null) {
                return false;
            }
            if (!element.actingElement().isArrayType && !element.actingElement().isFieldArray) {
                return false;
            }
            if (element.hasChildElements()) {
                Iterator it = element.actingElement().children.iterator();
                while (it.hasNext()) {
                    if (arrayHasData(profileStore_, (Element) it.next())) {
                        return true;
                    }
                }
                return false;
            }
            String data = profileStore_.getData(element.actingElement().pathKey);
            if (data == null || data.trim().equals("")) {
                return false;
            }
            Element actingElement = element.actingElement();
            if (actingElement == null || (str = actingElement.pathKey) == null) {
                return true;
            }
            String str2 = element.actingElement().pathKey;
            if (str2 != null && str2.startsWith("Passwords") && str.endsWith(".NickName")) {
                return false;
            }
            if (element.isCreditcard() && (str.endsWith("NameOnCard") || str.endsWith(".NickName"))) {
                return false;
            }
            String str3 = element.actingElement().pathKey;
            return (str3 != null && str3.startsWith("Usernames.Username") && str.endsWith(".NickName")) ? false : true;
        }

        public static int extractIndex(String str) {
            Matcher matcher = Pattern.compile("\\[(.*?)\\]").matcher(str);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
            return -1;
        }

        public static Element findChildElementRecursively(String str, Element element) {
            String formattedPathKey = getFormattedPathKey(str);
            Element element2 = null;
            if (element == null || !element.hasChildElements()) {
                if (element.getFormattedPathKey().equals(formattedPathKey)) {
                    return element;
                }
                return null;
            }
            Iterator it = element.actingElement().children.iterator();
            while (it.hasNext() && (element2 = findChildElementRecursively(str, (Element) it.next())) == null) {
            }
            return element2;
        }

        public static String getArrayElementCountPath(Element element) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), element.actingElement().parentPathKey, ".Count");
        }

        public static String getFormattedPathKey(String str) {
            if (str != null) {
                return str.replaceAll("\\[\\d+\\]|\\.$|", "");
            }
            return null;
        }

        public static Element isFieldArrayElement(Schema_ schema_, String str) {
            String formattedPathKey = getFormattedPathKey(str);
            if (formattedPathKey == null) {
                return null;
            }
            int length = formattedPathKey.split("\\.").length;
            Element element = schema_.getElement(formattedPathKey);
            if (element != null) {
                for (int i = 1; i < length; i++) {
                    if (element != null) {
                        if (element.actingElement().isArrayType) {
                            break;
                        }
                        element = schema_.getElement(element.getFormattedParentPathKey());
                    }
                }
            }
            return element;
        }

        public static AnonymousClass1 obtain(int i, int i2, int i3) {
            return new AnonymousClass1(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
        }

        public static AnonymousClass1 wrap(InputContentInfo inputContentInfo) {
            if (inputContentInfo == null) {
                return null;
            }
            PreviewView.AnonymousClass1 anonymousClass1 = new PreviewView.AnonymousClass1();
            anonymousClass1.this$0 = inputContentInfo;
            return new AnonymousClass1(anonymousClass1);
        }

        public void acquire(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        }

        public int addNamespaceToProfile(Element element, boolean z) {
            ProfileStore_ profileStore_ = (ProfileStore_) this.this$0;
            if (z) {
                profileStore_.load();
            }
            Element firstChildElement = element.getFirstChildElement();
            if (firstChildElement == null) {
                Log.e(AnonymousClass1.class.toString(), "Ciritical error, could not find element");
                return -1;
            }
            String arrayElementCountPath = getArrayElementCountPath(firstChildElement);
            String data = profileStore_.getData(getArrayElementCountPath(firstChildElement));
            int i = 0;
            int parseInt = data != null ? Integer.parseInt(data) : 0;
            int i2 = parseInt + 1;
            profileStore_.setData(arrayElementCountPath, String.valueOf(i2));
            String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), element.actingElement().pathKey, ".All");
            String data2 = profileStore_.getData(m);
            if (data2 == null) {
                data2 = "";
            }
            StringBuilder sb = new StringBuilder(data2);
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(parseInt);
            String sb2 = sb.toString();
            profileStore_.setData(m, sb2);
            if (!TextUtils.isEmpty(sb2) && !TextUtils.isEmpty(",")) {
                int i3 = 0;
                while (true) {
                    int indexOf = sb2.toString().indexOf(",", i);
                    if (indexOf == -1) {
                        break;
                    }
                    i3++;
                    i = indexOf + 1;
                }
                i = i3;
            }
            String str = firstChildElement.actingElement().pathKey;
            if (str != null) {
                if (str.contains("CreditCards.CreditCard") || str.contains("IdentificationDetails.Licenses.License") || str.contains("IdentificationDetails.Passports.Passport")) {
                    String data3 = profileStore_.getData("PersonalDetails.FirstName");
                    String data4 = profileStore_.getData("PersonalDetails.LastName");
                    StringBuilder sb3 = new StringBuilder();
                    if (data3 == null) {
                        data3 = "";
                    }
                    sb3.append(data3);
                    sb3.append(" ");
                    sb3.append(data4 != null ? data4 : "");
                    String sb4 = sb3.toString();
                    if (sb4.trim().length() > 0) {
                        if (str.contains("CreditCards.CreditCard")) {
                            profileStore_.setData("CreditCards.CreditCard[{index}].NameOnCard".replace("{index}", Integer.toString(parseInt)), sb4);
                        }
                        if (str.contains("IdentificationDetails.Licenses.License")) {
                            String replace = "IdentificationDetails.Licenses.License[{index}].Name".replace("{index}", Integer.toString(parseInt));
                            profileStore_.setData(replace, sb4);
                            Log.d("pop_generic", replace + "|" + sb4);
                        }
                        if (str.contains("IdentificationDetails.Passports.Passport")) {
                            profileStore_.setData("IdentificationDetails.Passports.Passport[{index}].Name".replace("{index}", Integer.toString(parseInt)), sb4);
                        }
                    }
                } else if (str.contains("Passwords.Password")) {
                    profileStore_.setData("Passwords.Password[{index}].NickName".replace("{index}", Integer.toString(parseInt)), "Password " + Integer.toString(i + 1));
                } else if (str.contains("Usernames.Username")) {
                    profileStore_.setData("Usernames.Username[{index}].NickName".replace("{index}", Integer.toString(parseInt)), "Username " + Integer.toString(i + 1));
                }
            }
            if (z) {
                profileStore_.store();
            }
            return i2;
        }

        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
        public ListenableFuture apply(Object obj) {
            return Futures.immediateFuture(((Function) this.this$0).mo103apply(obj));
        }

        @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
        public Object approachAnimation(ScrollScope scrollScope, Float f, Float f2, Function1 function1, SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$1) {
            float floatValue = f.floatValue();
            float floatValue2 = f2.floatValue();
            Object access$animateWithTarget = zzacp.access$animateWithTarget(scrollScope, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, AnimatableKt.AnimationState$default(RecyclerView.DECELERATION_RATE, floatValue2, 28), (AnimationSpec) this.this$0, function1, snapFlingBehavior$tryApproach$1);
            return access$animateWithTarget == CoroutineSingletons.COROUTINE_SUSPENDED ? access$animateWithTarget : (AnimationResult) access$animateWithTarget;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object awaitSessionLock(ContinuationImpl continuationImpl) {
            SessionSequencer$awaitSessionLock$1 sessionSequencer$awaitSessionLock$1;
            int i;
            if (continuationImpl instanceof SessionSequencer$awaitSessionLock$1) {
                sessionSequencer$awaitSessionLock$1 = (SessionSequencer$awaitSessionLock$1) continuationImpl;
                int i2 = sessionSequencer$awaitSessionLock$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    sessionSequencer$awaitSessionLock$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = sessionSequencer$awaitSessionLock$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sessionSequencer$awaitSessionLock$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        throw null;
                    }
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    if (((AtomicRef) this.this$0).compareAndSet(SessionSequencer$State.PENDING, SessionSequencer$State.CREATING)) {
                        return Unit.INSTANCE;
                    }
                    throw null;
                }
            }
            sessionSequencer$awaitSessionLock$1 = new SessionSequencer$awaitSessionLock$1(this, continuationImpl);
            Object obj2 = sessionSequencer$awaitSessionLock$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = sessionSequencer$awaitSessionLock$1.label;
            if (i != 0) {
            }
        }

        public void binaryElement(int i, int i2, ExtractorInput extractorInput) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            long j;
            int i9;
            int i10;
            int[] iArr;
            int i11;
            int i12;
            MatroskaExtractor matroskaExtractor = (MatroskaExtractor) this.this$0;
            VarintReader varintReader = matroskaExtractor.varintReader;
            SparseArray sparseArray = matroskaExtractor.tracks;
            ParsableByteArray parsableByteArray = matroskaExtractor.seekEntryIdBytes;
            ParsableByteArray parsableByteArray2 = matroskaExtractor.scratch;
            int i13 = 2;
            int i14 = 0;
            if (i != 161 && i != 163) {
                if (i == 165) {
                    if (matroskaExtractor.blockState != 2) {
                        return;
                    }
                    MatroskaExtractor.Track track = (MatroskaExtractor.Track) sparseArray.get(matroskaExtractor.blockTrackNumber);
                    int i15 = matroskaExtractor.blockAdditionalId;
                    ParsableByteArray parsableByteArray3 = matroskaExtractor.supplementalData;
                    if (i15 != 4 || !"V_VP9".equals(track.codecId)) {
                        extractorInput.skipFully(i2);
                        return;
                    } else {
                        parsableByteArray3.reset(i2);
                        extractorInput.readFully(parsableByteArray3.data, 0, i2);
                        return;
                    }
                }
                if (i == 16877) {
                    matroskaExtractor.assertInTrackEntry(i);
                    MatroskaExtractor.Track track2 = matroskaExtractor.currentTrack;
                    int i16 = track2.blockAddIdType;
                    if (i16 != 1685485123 && i16 != 1685480259) {
                        extractorInput.skipFully(i2);
                        return;
                    }
                    byte[] bArr = new byte[i2];
                    track2.dolbyVisionConfigBytes = bArr;
                    extractorInput.readFully(bArr, 0, i2);
                    return;
                }
                if (i == 16981) {
                    matroskaExtractor.assertInTrackEntry(i);
                    byte[] bArr2 = new byte[i2];
                    matroskaExtractor.currentTrack.sampleStrippedBytes = bArr2;
                    extractorInput.readFully(bArr2, 0, i2);
                    return;
                }
                if (i == 18402) {
                    byte[] bArr3 = new byte[i2];
                    extractorInput.readFully(bArr3, 0, i2);
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.cryptoData = new TrackOutput.CryptoData(1, bArr3, 0, 0);
                    return;
                }
                if (i == 21419) {
                    Arrays.fill(parsableByteArray.data, (byte) 0);
                    extractorInput.readFully(parsableByteArray.data, 4 - i2, i2);
                    parsableByteArray.setPosition(0);
                    matroskaExtractor.seekEntryId = (int) parsableByteArray.readUnsignedInt();
                    return;
                }
                if (i == 25506) {
                    matroskaExtractor.assertInTrackEntry(i);
                    byte[] bArr4 = new byte[i2];
                    matroskaExtractor.currentTrack.codecPrivate = bArr4;
                    extractorInput.readFully(bArr4, 0, i2);
                    return;
                }
                if (i != 30322) {
                    throw ParserException.createForMalformedContainer(null, "Unexpected id: " + i);
                }
                matroskaExtractor.assertInTrackEntry(i);
                byte[] bArr5 = new byte[i2];
                matroskaExtractor.currentTrack.projectionData = bArr5;
                extractorInput.readFully(bArr5, 0, i2);
                return;
            }
            int i17 = 8;
            if (matroskaExtractor.blockState == 0) {
                matroskaExtractor.blockTrackNumber = (int) varintReader.readUnsignedVarint(extractorInput, false, true, 8);
                matroskaExtractor.blockTrackNumberLength = varintReader.length;
                matroskaExtractor.blockDurationUs = -9223372036854775807L;
                matroskaExtractor.blockState = 1;
                parsableByteArray2.reset(0);
            }
            MatroskaExtractor.Track track3 = (MatroskaExtractor.Track) sparseArray.get(matroskaExtractor.blockTrackNumber);
            if (track3 == null) {
                extractorInput.skipFully(i2 - matroskaExtractor.blockTrackNumberLength);
                matroskaExtractor.blockState = 0;
                return;
            }
            track3.output.getClass();
            if (matroskaExtractor.blockState == 1) {
                matroskaExtractor.readScratch(extractorInput, 3);
                int i18 = (parsableByteArray2.data[2] & 6) >> 1;
                if (i18 == 0) {
                    matroskaExtractor.blockSampleCount = 1;
                    int[] iArr2 = matroskaExtractor.blockSampleSizes;
                    if (iArr2 == null) {
                        iArr2 = new int[1];
                    } else if (iArr2.length < 1) {
                        iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                    }
                    matroskaExtractor.blockSampleSizes = iArr2;
                    iArr2[0] = (i2 - matroskaExtractor.blockTrackNumberLength) - 3;
                } else {
                    matroskaExtractor.readScratch(extractorInput, 4);
                    int i19 = (parsableByteArray2.data[3] & 255) + 1;
                    matroskaExtractor.blockSampleCount = i19;
                    int[] iArr3 = matroskaExtractor.blockSampleSizes;
                    if (iArr3 == null) {
                        iArr3 = new int[i19];
                        i3 = 4;
                    } else {
                        i3 = 4;
                        if (iArr3.length < i19) {
                            iArr3 = new int[Math.max(iArr3.length * 2, i19)];
                        }
                    }
                    matroskaExtractor.blockSampleSizes = iArr3;
                    if (i18 == 2) {
                        int i20 = (i2 - matroskaExtractor.blockTrackNumberLength) - 4;
                        int i21 = matroskaExtractor.blockSampleCount;
                        Arrays.fill(iArr3, 0, i21, i20 / i21);
                    } else {
                        if (i18 != 1) {
                            if (i18 != 3) {
                                throw ParserException.createForMalformedContainer(null, "Unexpected lacing value: " + i18);
                            }
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = i3;
                            while (true) {
                                int i25 = matroskaExtractor.blockSampleCount - 1;
                                int[] iArr4 = matroskaExtractor.blockSampleSizes;
                                if (i22 >= i25) {
                                    i4 = i13;
                                    i5 = i14;
                                    iArr4[i25] = ((i2 - matroskaExtractor.blockTrackNumberLength) - i24) - i23;
                                    break;
                                }
                                iArr4[i22] = i14;
                                int i26 = i24 + 1;
                                matroskaExtractor.readScratch(extractorInput, i26);
                                if (parsableByteArray2.data[i24] == 0) {
                                    throw ParserException.createForMalformedContainer(null, "No valid varint length mask found");
                                }
                                int i27 = i14;
                                while (true) {
                                    if (i27 >= i17) {
                                        i6 = i17;
                                        i7 = i13;
                                        i8 = i14;
                                        j = 0;
                                        i9 = i26;
                                        break;
                                    }
                                    i6 = i17;
                                    int i28 = 1 << (7 - i27);
                                    i8 = i14;
                                    if ((parsableByteArray2.data[i24] & i28) != 0) {
                                        i9 = i26 + i27;
                                        matroskaExtractor.readScratch(extractorInput, i9);
                                        i7 = i13;
                                        j = (~i28) & parsableByteArray2.data[i24] & 255;
                                        while (i26 < i9) {
                                            j = (j << i6) | (parsableByteArray2.data[i26] & 255);
                                            i26++;
                                        }
                                        if (i22 > 0) {
                                            j -= (1 << ((i27 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i27++;
                                        i14 = i8;
                                        i17 = i6;
                                    }
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    break;
                                }
                                int i29 = (int) j;
                                int[] iArr5 = matroskaExtractor.blockSampleSizes;
                                if (i22 != 0) {
                                    i29 += iArr5[i22 - 1];
                                }
                                iArr5[i22] = i29;
                                i23 += i29;
                                i22++;
                                i24 = i9;
                                i14 = i8;
                                i17 = i6;
                                i13 = i7;
                            }
                            throw ParserException.createForMalformedContainer(null, "EBML lacing sample size out of range.");
                        }
                        int i30 = 0;
                        int i31 = 0;
                        int i32 = i3;
                        while (true) {
                            i10 = matroskaExtractor.blockSampleCount - 1;
                            iArr = matroskaExtractor.blockSampleSizes;
                            if (i30 >= i10) {
                                break;
                            }
                            iArr[i30] = 0;
                            while (true) {
                                i11 = i32 + 1;
                                matroskaExtractor.readScratch(extractorInput, i11);
                                int i33 = parsableByteArray2.data[i32] & 255;
                                int[] iArr6 = matroskaExtractor.blockSampleSizes;
                                i12 = iArr6[i30] + i33;
                                iArr6[i30] = i12;
                                if (i33 != 255) {
                                    break;
                                } else {
                                    i32 = i11;
                                }
                            }
                            i31 += i12;
                            i30++;
                            i32 = i11;
                        }
                        iArr[i10] = ((i2 - matroskaExtractor.blockTrackNumberLength) - i32) - i31;
                    }
                }
                i4 = 2;
                i5 = 0;
                byte[] bArr6 = parsableByteArray2.data;
                matroskaExtractor.blockTimeUs = matroskaExtractor.scaleTimecodeToUs((bArr6[1] & 255) | (bArr6[i5] << 8)) + matroskaExtractor.clusterTimecodeUs;
                matroskaExtractor.blockFlags = (track3.f891type == 1 || (i == 163 && (parsableByteArray2.data[i4] & 128) == 128)) ? 1 : i5;
                matroskaExtractor.blockState = i4;
                matroskaExtractor.blockSampleIndex = i5;
            }
            if (i == 163) {
                while (true) {
                    int i34 = matroskaExtractor.blockSampleIndex;
                    if (i34 >= matroskaExtractor.blockSampleCount) {
                        matroskaExtractor.blockState = 0;
                        return;
                    } else {
                        matroskaExtractor.commitSampleToOutput(track3, ((matroskaExtractor.blockSampleIndex * track3.defaultSampleDurationNs) / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) + matroskaExtractor.blockTimeUs, matroskaExtractor.blockFlags, matroskaExtractor.writeSampleData(extractorInput, track3, matroskaExtractor.blockSampleSizes[i34], false), 0);
                        matroskaExtractor.blockSampleIndex++;
                    }
                }
            } else {
                while (true) {
                    int i35 = matroskaExtractor.blockSampleIndex;
                    if (i35 >= matroskaExtractor.blockSampleCount) {
                        return;
                    }
                    int[] iArr7 = matroskaExtractor.blockSampleSizes;
                    iArr7[i35] = matroskaExtractor.writeSampleData(extractorInput, track3, iArr7[i35], true);
                    matroskaExtractor.blockSampleIndex++;
                }
            }
        }

        public Camera2ImplConfig build() {
            return new Camera2ImplConfig(OptionsBundle.from((MutableOptionsBundle) this.this$0));
        }

        public void deleteProfileData(Element element, Context context) {
            ProfileStore_ profileStore_ = (ProfileStore_) this.this$0;
            List list = element.actingElement().children;
            for (int i = 0; i < list.size(); i++) {
                Element element2 = (Element) list.get(i);
                if (element2 != null && element2.hasChildElements()) {
                    deleteProfileData(element2, context);
                    profileStore_.deleteData(element2.actingElement().pathKey);
                    profileStore_.deleteData(getArrayElementCountPath(element2));
                } else if (element2 != null && element2.actingElement().pathKey != null) {
                    profileStore_.deleteData(element2.actingElement().pathKey);
                    profileStore_.deleteData(getArrayElementCountPath(element2));
                    if (element2.actingElement().pathKey.contains("ImageData")) {
                        String str = element2.actingElement().pathKey;
                        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(new ContextWrapper(context).getFilesDir().getPath(), "/");
                        m108m.append(str + ".jpg");
                        File file = new File(m108m.toString());
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                }
            }
        }

        public void dismiss() {
            ((Magnifier) this.this$0).dismiss();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
        public void flush() {
        }

        public int[] getAllArrayElements(Element element) {
            String str = element.actingElement().parentPathKey;
            String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(str, ".All");
            ProfileStore_ profileStore_ = (ProfileStore_) this.this$0;
            String data = profileStore_.getData(m$1);
            if (data == null) {
                int profileElementCount = getProfileElementCount(str);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < profileElementCount; i++) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(i);
                }
                data = sb.toString();
                profileStore_.setData(m$1, data);
            }
            String[] split = data.split(",");
            ArrayList arrayList = new ArrayList();
            for (String str2 : split) {
                if (str2.length() > 0) {
                    arrayList.add(str2);
                }
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = Integer.parseInt((String) arrayList.get(i2));
            }
            return iArr;
        }

        public Uri getContentUri() {
            return ((InputContentInfo) ((PreviewView.AnonymousClass1) this.this$0).this$0).getContentUri();
        }

        public FrameworkCryptoConfig getCryptoConfig() {
            return null;
        }

        @Override // androidx.media3.extractor.text.Subtitle
        public List getCues(long j) {
            return j >= 0 ? (List) this.this$0 : Collections.EMPTY_LIST;
        }

        public ClipDescription getDescription() {
            return ((InputContentInfo) ((PreviewView.AnonymousClass1) this.this$0).this$0).getDescription();
        }

        public DrmSession$DrmSessionException getError() {
            return (DrmSession$DrmSessionException) this.this$0;
        }

        @Override // androidx.media3.extractor.text.Subtitle
        public long getEventTime(int i) {
            Trace.checkArgument(i == 0);
            return 0L;
        }

        @Override // androidx.media3.extractor.text.Subtitle
        public int getEventTimeCount() {
            return 1;
        }

        public Uri getLinkUri() {
            return ((InputContentInfo) ((PreviewView.AnonymousClass1) this.this$0).this$0).getLinkUri();
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public MutableOptionsBundle getMutableConfig() {
            return (MutableOptionsBundle) this.this$0;
        }

        @Override // androidx.media3.extractor.text.Subtitle
        public int getNextEventTimeIndex(long j) {
            return j < 0 ? 0 : -1;
        }

        public int getProfileElementCount(String str) {
            String data = ((ProfileStore_) this.this$0).getData(Recorder$$ExternalSyntheticOutline2.m$1(str, ".Count"));
            if (data != null) {
                return Integer.parseInt(data);
            }
            return 0;
        }

        public UUID getSchemeUuid() {
            return C.UUID_NIL;
        }

        /* renamed from: getSize-YbymL2g, reason: not valid java name */
        public long m7getSizeYbymL2g() {
            Magnifier magnifier = (Magnifier) this.this$0;
            return (magnifier.getWidth() << 32) | (magnifier.getHeight() & BodyPartID.bodyIdMax);
        }

        public int getState() {
            return 1;
        }

        public void insertAllOptions(Config config) {
            config.getClass();
            for (AutoValue_Config_Option autoValue_Config_Option : config.listOptions()) {
                autoValue_Config_Option.getClass();
                ((MutableOptionsBundle) this.this$0).insertOption(autoValue_Config_Option, config.getOptionPriority(autoValue_Config_Option), config.retrieveOption(autoValue_Config_Option));
            }
        }

        public void integerElement(int i, long j) {
            MatroskaExtractor matroskaExtractor = (MatroskaExtractor) this.this$0;
            if (i == 240) {
                if (matroskaExtractor.sentSeekMap) {
                    return;
                }
                matroskaExtractor.assertInCues(i);
                if (matroskaExtractor.currentCueRelativePosition == -1) {
                    matroskaExtractor.currentCueRelativePosition = j;
                    return;
                }
                return;
            }
            if (i == 241) {
                if (matroskaExtractor.sentSeekMap) {
                    return;
                }
                matroskaExtractor.assertInCues(i);
                if (matroskaExtractor.currentCueClusterPosition == -1) {
                    matroskaExtractor.currentCueClusterPosition = j;
                    return;
                }
                return;
            }
            if (i == 20529) {
                if (j == 0) {
                    return;
                }
                throw ParserException.createForMalformedContainer(null, "ContentEncodingOrder " + j + " not supported");
            }
            if (i == 20530) {
                if (j == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer(null, "ContentEncodingScope " + j + " not supported");
            }
            switch (i) {
                case 131:
                    int i2 = (int) j;
                    if (i2 == 1) {
                        matroskaExtractor.assertInTrackEntry(i);
                        matroskaExtractor.currentTrack.f891type = 2;
                        return;
                    }
                    if (i2 == 2) {
                        matroskaExtractor.assertInTrackEntry(i);
                        matroskaExtractor.currentTrack.f891type = 1;
                        return;
                    } else if (i2 == 17) {
                        matroskaExtractor.assertInTrackEntry(i);
                        matroskaExtractor.currentTrack.f891type = 3;
                        return;
                    } else if (i2 != 33) {
                        matroskaExtractor.assertInTrackEntry(i);
                        matroskaExtractor.currentTrack.f891type = -1;
                        return;
                    } else {
                        matroskaExtractor.assertInTrackEntry(i);
                        matroskaExtractor.currentTrack.f891type = 5;
                        return;
                    }
                case 136:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.flagDefault = j == 1;
                    return;
                case SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE:
                    matroskaExtractor.blockDurationUs = matroskaExtractor.scaleTimecodeToUs(j);
                    return;
                case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.channelCount = (int) j;
                    return;
                case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.width = (int) j;
                    return;
                case SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE:
                    if (matroskaExtractor.sentSeekMap) {
                        return;
                    }
                    matroskaExtractor.assertInCues(i);
                    matroskaExtractor.currentCueTimeUs = matroskaExtractor.scaleTimecodeToUs(j);
                    return;
                case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.height = (int) j;
                    return;
                case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.number = (int) j;
                    return;
                case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                    matroskaExtractor.clusterTimecodeUs = matroskaExtractor.scaleTimecodeToUs(j);
                    return;
                case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                    matroskaExtractor.blockAdditionalId = (int) j;
                    return;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                    if (matroskaExtractor.sentSeekMap) {
                        return;
                    }
                    matroskaExtractor.assertInCues(i);
                    matroskaExtractor.currentCueTrackNumber = (int) j;
                    return;
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                    matroskaExtractor.blockHasReferenceBlock = true;
                    return;
                case 16871:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.blockAddIdType = (int) j;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw ParserException.createForMalformedContainer(null, "ContentCompAlgo " + j + " not supported");
                case 17029:
                    if (j < 1 || j > 2) {
                        throw ParserException.createForMalformedContainer(null, "DocTypeReadVersion " + j + " not supported");
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.createForMalformedContainer(null, "EBMLReadVersion " + j + " not supported");
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw ParserException.createForMalformedContainer(null, "ContentEncAlgo " + j + " not supported");
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.createForMalformedContainer(null, "AESSettingsCipherMode " + j + " not supported");
                case 21420:
                    matroskaExtractor.seekEntryPosition = j + matroskaExtractor.segmentContentPosition;
                    return;
                case 21432:
                    int i3 = (int) j;
                    matroskaExtractor.assertInTrackEntry(i);
                    if (i3 == 0) {
                        matroskaExtractor.currentTrack.stereoMode = 0;
                        return;
                    }
                    if (i3 == 1) {
                        matroskaExtractor.currentTrack.stereoMode = 2;
                        return;
                    } else if (i3 == 3) {
                        matroskaExtractor.currentTrack.stereoMode = 1;
                        return;
                    } else {
                        if (i3 != 15) {
                            return;
                        }
                        matroskaExtractor.currentTrack.stereoMode = 3;
                        return;
                    }
                case 21680:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.displayWidth = (int) j;
                    return;
                case 21682:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.displayUnit = (int) j;
                    return;
                case 21690:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.displayHeight = (int) j;
                    return;
                case 21930:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.flagForced = j == 1;
                    return;
                case 21938:
                    matroskaExtractor.assertInTrackEntry(i);
                    MatroskaExtractor.Track track = matroskaExtractor.currentTrack;
                    track.hasColorInfo = true;
                    track.bitsPerChannel = (int) j;
                    return;
                case 21998:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.maxBlockAdditionId = (int) j;
                    return;
                case 22186:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.codecDelayNs = j;
                    return;
                case 22203:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.seekPreRollNs = j;
                    return;
                case 25188:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.audioBitDepth = (int) j;
                    return;
                case 30114:
                    matroskaExtractor.blockGroupDiscardPaddingNs = j;
                    return;
                case 30321:
                    matroskaExtractor.assertInTrackEntry(i);
                    int i4 = (int) j;
                    if (i4 == 0) {
                        matroskaExtractor.currentTrack.projectionType = 0;
                        return;
                    }
                    if (i4 == 1) {
                        matroskaExtractor.currentTrack.projectionType = 1;
                        return;
                    } else if (i4 == 2) {
                        matroskaExtractor.currentTrack.projectionType = 2;
                        return;
                    } else {
                        if (i4 != 3) {
                            return;
                        }
                        matroskaExtractor.currentTrack.projectionType = 3;
                        return;
                    }
                case 2352003:
                    matroskaExtractor.assertInTrackEntry(i);
                    matroskaExtractor.currentTrack.defaultSampleDurationNs = (int) j;
                    return;
                case 2807729:
                    matroskaExtractor.timecodeScale = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            matroskaExtractor.assertInTrackEntry(i);
                            int i5 = (int) j;
                            if (i5 == 1) {
                                matroskaExtractor.currentTrack.colorRange = 2;
                                return;
                            } else {
                                if (i5 != 2) {
                                    return;
                                }
                                matroskaExtractor.currentTrack.colorRange = 1;
                                return;
                            }
                        case 21946:
                            matroskaExtractor.assertInTrackEntry(i);
                            int isoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j);
                            if (isoTransferCharacteristicsToColorTransfer != -1) {
                                matroskaExtractor.currentTrack.colorTransfer = isoTransferCharacteristicsToColorTransfer;
                                return;
                            }
                            return;
                        case 21947:
                            matroskaExtractor.assertInTrackEntry(i);
                            matroskaExtractor.currentTrack.hasColorInfo = true;
                            int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j);
                            if (isoColorPrimariesToColorSpace != -1) {
                                matroskaExtractor.currentTrack.colorSpace = isoColorPrimariesToColorSpace;
                                return;
                            }
                            return;
                        case 21948:
                            matroskaExtractor.assertInTrackEntry(i);
                            matroskaExtractor.currentTrack.maxContentLuminance = (int) j;
                            return;
                        case 21949:
                            matroskaExtractor.assertInTrackEntry(i);
                            matroskaExtractor.currentTrack.maxFrameAverageLuminance = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
        public void maybeThrowException() {
        }

        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult m8measure3p2s80s(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, DefaultIntrinsicMeasurable defaultIntrinsicMeasurable, long j) {
            return ((SharedBoundsNode) ((ApproachLayoutModifierNode) this.this$0)).m149approachMeasure3p2s80s(approachIntrinsicsMeasureScope, defaultIntrinsicMeasurable, j);
        }

        public void onCaptureSequenceComplete(Camera2CaptureSequence camera2CaptureSequence) {
            if (camera2CaptureSequence.repeating) {
                return;
            }
            TraceParser traceParser = (TraceParser) this.this$0;
            synchronized (((ArrayList) traceParser.currentThread)) {
                ((ArrayList) traceParser.currentThread).remove(camera2CaptureSequence);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            ((SingleCloseImageProxy) this.this$0).close();
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverEnter(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            CascadingMenuPopup cascadingMenuPopup = (CascadingMenuPopup) this.this$0;
            Handler handler = cascadingMenuPopup.mSubMenuHoverHandler;
            handler.removeCallbacksAndMessages(null);
            ArrayList arrayList = cascadingMenuPopup.mShowingMenus;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == ((CascadingMenuPopup.CascadingMenuInfo) arrayList.get(i)).menu) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            handler.postAtTime(new ProfileAdapter.AnonymousClass8(this, i2 < arrayList.size() ? (CascadingMenuPopup.CascadingMenuInfo) arrayList.get(i2) : null, menuItemImpl, menuBuilder, 1), menuBuilder, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverExit(MenuBuilder menuBuilder, MenuItem menuItem) {
            ((CascadingMenuPopup) this.this$0).mSubMenuHoverHandler.removeCallbacksAndMessages(menuBuilder);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(MenuBuilder menuBuilder) {
            ToolbarActionBar toolbarActionBar = (ToolbarActionBar) this.this$0;
            boolean isOverflowMenuShowing = toolbarActionBar.mDecorToolbar.mToolbar.isOverflowMenuShowing();
            Window.Callback callback = toolbarActionBar.mWindowCallback;
            if (isOverflowMenuShowing) {
                callback.onPanelClosed(108, menuBuilder);
            } else if (callback.onPreparePanel(0, null, menuBuilder)) {
                callback.onMenuOpened(108, menuBuilder);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
        public void queueInputBuffer(int i, int i2, int i3, long j) {
            ((MediaCodec) this.this$0).queueInputBuffer(i, 0, i2, j, i3);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
        public void queueSecureInputBuffer(int i, CryptoInfo cryptoInfo, long j, int i2) {
            ((MediaCodec) this.this$0).queueSecureInputBuffer(i, 0, cryptoInfo.frameworkCryptoInfo, j, i2);
        }

        public ArrayList readAllArrayElemetsForNameSpace(Element element) {
            ArrayList arrayList = new ArrayList();
            int[] allArrayElements = getAllArrayElements(element);
            for (int i = 0; i < allArrayElements.length; i++) {
                Element element2 = new Element(element);
                element2.actingElement().position = i;
                element2.alterPathForArrays(allArrayElements[i]);
                arrayList.add(element2);
            }
            return arrayList;
        }

        public void release() {
            AtomicRef atomicRef = (AtomicRef) this.this$0;
            SessionSequencer$State sessionSequencer$State = SessionSequencer$State.CREATED;
            atomicRef.getClass();
            if (AtomicRef.FU.getAndSet(atomicRef, sessionSequencer$State) == SessionSequencer$State.CREATING) {
                throw null;
            }
        }

        public void removeProfileData(Element element, Element element2, ContextWrapper contextWrapper) {
            ProfileStore_ profileStore_ = (ProfileStore_) this.this$0;
            Element firstChildElement = element.getFirstChildElement();
            firstChildElement.getClass();
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            Iterator it = firstChildElement.children.iterator();
            while (it.hasNext()) {
                arrayList.add(new Element((Element) it.next()));
            }
            boolean z = firstChildElement.actingElement().hiddenInCategory;
            deleteProfileData(element2, contextWrapper);
            int extractIndex = extractIndex(element2.actingElement().pathKey);
            int[] allArrayElements = getAllArrayElements(element2);
            StringBuilder sb = new StringBuilder();
            for (int i : allArrayElements) {
                if (i != extractIndex) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(i);
                }
            }
            profileStore_.setData(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), element2.actingElement().parentPathKey, ".All"), sb.toString());
            profileStore_.store();
        }

        public void requestPermission() {
            ((InputContentInfo) ((PreviewView.AnonymousClass1) this.this$0).this$0).requestPermission();
        }

        public ArrayList scheduleLinePrefetch(int i) {
            ArrayList arrayList = new ArrayList();
            LazyGridState lazyGridState = (LazyGridState) this.this$0;
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                LazyGridMeasureResult lazyGridMeasureResult = lazyGridState.hasLookaheadOccurred ? lazyGridState.approachLayoutInfo : (LazyGridMeasureResult) lazyGridState.layoutInfoState.getValue();
                if (lazyGridMeasureResult != null) {
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    ref$IntRef.element = 1;
                    List list = (List) lazyGridMeasureResult.prefetchInfoRetriever.invoke(Integer.valueOf(i));
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Pair pair = (Pair) list.get(i2);
                        LazyLayoutPrefetchState lazyLayoutPrefetchState = lazyGridState.prefetchState;
                        int intValue = ((Number) pair.first).intValue();
                        long j = ((Constraints) pair.second).value;
                        WorkLauncherImpl workLauncherImpl = LazyGridState.Saver;
                        ref$IntRef = ref$IntRef;
                        arrayList.add(lazyLayoutPrefetchState.m325schedulePrecompositionAndPremeasure_EkL_Y$foundation(intValue, j, false, new n3$$ExternalSyntheticLambda0((ArrayList) null, ref$IntRef, list, i, lazyGridMeasureResult)));
                    }
                }
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                return arrayList;
            } catch (Throwable th) {
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
        public void setParameters(Bundle bundle) {
            ((MediaCodec) this.this$0).setParameters(bundle);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
        public void shutdown() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
        public void start() {
        }

        public void startMasterElement(int i, long j, long j2) {
            MatroskaExtractor matroskaExtractor = (MatroskaExtractor) this.this$0;
            matroskaExtractor.extractorOutput.getClass();
            if (i == 160) {
                matroskaExtractor.blockHasReferenceBlock = false;
                matroskaExtractor.blockGroupDiscardPaddingNs = 0L;
                return;
            }
            if (i == 174) {
                MatroskaExtractor.Track track = new MatroskaExtractor.Track();
                track.width = -1;
                track.height = -1;
                track.bitsPerChannel = -1;
                track.displayWidth = -1;
                track.displayHeight = -1;
                track.displayUnit = 0;
                track.projectionType = -1;
                track.projectionPoseYaw = RecyclerView.DECELERATION_RATE;
                track.projectionPosePitch = RecyclerView.DECELERATION_RATE;
                track.projectionPoseRoll = RecyclerView.DECELERATION_RATE;
                track.projectionData = null;
                track.stereoMode = -1;
                track.hasColorInfo = false;
                track.colorSpace = -1;
                track.colorTransfer = -1;
                track.colorRange = -1;
                track.maxContentLuminance = IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
                track.maxFrameAverageLuminance = 200;
                track.primaryRChromaticityX = -1.0f;
                track.primaryRChromaticityY = -1.0f;
                track.primaryGChromaticityX = -1.0f;
                track.primaryGChromaticityY = -1.0f;
                track.primaryBChromaticityX = -1.0f;
                track.primaryBChromaticityY = -1.0f;
                track.whitePointChromaticityX = -1.0f;
                track.whitePointChromaticityY = -1.0f;
                track.maxMasteringLuminance = -1.0f;
                track.minMasteringLuminance = -1.0f;
                track.channelCount = 1;
                track.audioBitDepth = -1;
                track.sampleRate = 8000;
                track.codecDelayNs = 0L;
                track.seekPreRollNs = 0L;
                track.waitingForDtsAnalysis = false;
                track.flagDefault = true;
                track.language = "eng";
                matroskaExtractor.currentTrack = track;
                track.isWebm = matroskaExtractor.isWebm;
                return;
            }
            if (i == 183) {
                if (matroskaExtractor.sentSeekMap) {
                    return;
                }
                matroskaExtractor.assertInCues(i);
                matroskaExtractor.currentCueTrackNumber = -1;
                matroskaExtractor.currentCueClusterPosition = -1L;
                matroskaExtractor.currentCueRelativePosition = -1L;
                return;
            }
            if (i == 187) {
                if (matroskaExtractor.sentSeekMap) {
                    return;
                }
                matroskaExtractor.assertInCues(i);
                matroskaExtractor.currentCueTimeUs = -9223372036854775807L;
                return;
            }
            if (i == 19899) {
                matroskaExtractor.seekEntryId = -1;
                matroskaExtractor.seekEntryPosition = -1L;
                return;
            }
            if (i == 20533) {
                matroskaExtractor.assertInTrackEntry(i);
                matroskaExtractor.currentTrack.hasContentEncryption = true;
                return;
            }
            if (i == 21968) {
                matroskaExtractor.assertInTrackEntry(i);
                matroskaExtractor.currentTrack.hasColorInfo = true;
                return;
            }
            if (i == 408125543) {
                long j3 = matroskaExtractor.segmentContentPosition;
                if (j3 != -1 && j3 != j) {
                    throw ParserException.createForMalformedContainer(null, "Multiple Segment elements not supported");
                }
                matroskaExtractor.segmentContentPosition = j;
                matroskaExtractor.segmentContentSize = j2;
                return;
            }
            if (i == 475249515) {
                if (matroskaExtractor.sentSeekMap) {
                    return;
                }
                matroskaExtractor.inCuesElement = true;
            } else if (i == 524531317 && !matroskaExtractor.sentSeekMap) {
                if (matroskaExtractor.seekForCuesEnabled && matroskaExtractor.cuesContentPosition != -1) {
                    matroskaExtractor.seekForCues = true;
                } else {
                    matroskaExtractor.extractorOutput.seekMap(new SeekMap.Unseekable(matroskaExtractor.durationUs));
                    matroskaExtractor.sentSeekMap = true;
                }
            }
        }

        public void stringElement(int i, String str) {
            MatroskaExtractor matroskaExtractor = (MatroskaExtractor) this.this$0;
            if (i == 134) {
                matroskaExtractor.assertInTrackEntry(i);
                matroskaExtractor.currentTrack.codecId = str;
                return;
            }
            if (i == 17026) {
                if ("webm".equals(str) || "matroska".equals(str)) {
                    matroskaExtractor.isWebm = str.equals("webm");
                    return;
                }
                throw ParserException.createForMalformedContainer(null, "DocType " + str + " not supported");
            }
            if (i == 21358) {
                matroskaExtractor.assertInTrackEntry(i);
                matroskaExtractor.currentTrack.name = str;
            } else {
                if (i != 2274716) {
                    return;
                }
                matroskaExtractor.assertInTrackEntry(i);
                matroskaExtractor.currentTrack.language = str;
            }
        }

        public InputContentInfo unwrap() {
            return (InputContentInfo) ((PreviewView.AnonymousClass1) this.this$0).this$0;
        }

        /* renamed from: update-Wko1d7g, reason: not valid java name */
        public void m10updateWko1d7g(float f, long j, long j2) {
            Magnifier magnifier = (Magnifier) this.this$0;
            if (!Float.isNaN(f)) {
                magnifier.setZoom(f);
            }
            if ((9223372034707292159L & j2) != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
            }
        }

        public void updateContent() {
            ((Magnifier) this.this$0).update();
        }

        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult m9measure3p2s80s(IntrinsicsMeasureScope intrinsicsMeasureScope, DefaultIntrinsicMeasurable defaultIntrinsicMeasurable, long j) {
            return ((LayoutModifierNode) this.this$0).mo144measure3p2s80s(intrinsicsMeasureScope, defaultIntrinsicMeasurable, j);
        }

        public void release(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        }

        public /* synthetic */ AnonymousClass1(Object obj) {
            this.this$0 = obj;
        }

        public AnonymousClass1(Magnifier magnifier) {
            this.this$0 = magnifier;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public static class LayoutParams extends ActionBar.LayoutParams {
        public int mViewType;

        public LayoutParams() {
            this.mViewType = 0;
            this.gravity = 8388627;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mViewType = 0;
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(DimensionKt.getDrawable(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(DimensionKt.getDrawable(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(DimensionKt.getDrawable(getContext(), i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
