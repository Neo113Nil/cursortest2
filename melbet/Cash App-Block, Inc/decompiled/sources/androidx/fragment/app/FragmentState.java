package androidx.fragment.app;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.os.IResultReceiver;
import android.support.v4.os.IResultReceiver$Stub$Proxy;
import android.support.v4.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentState;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.versionedparcelable.ParcelImpl;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Question;
import app.cash.history.screens.HistoryScreens;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.common.Money;
import defpackage.DropMode;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new AnonymousClass1(0);
    public final String mClassName;
    public final int mContainerId;
    public final boolean mDetached;
    public final int mFragmentId;
    public final boolean mFromLayout;
    public final boolean mHidden;
    public final boolean mInDynamicContainer;
    public final int mMaxLifecycleState;
    public final boolean mRemoving;
    public final boolean mRetainInstance;
    public final String mTag;
    public final int mTargetRequestCode;
    public final String mTargetWho;
    public final boolean mUserVisibleHint;
    public final String mWho;

    /* renamed from: androidx.fragment.app.FragmentState$1, reason: invalid class name */
    public final class AnonymousClass1 implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:115:0x02f9  */
        @Override // android.os.Parcelable.Creator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object createFromParcel(final Parcel parcel) {
            Uri uri;
            Bundle bundle;
            IResultReceiver iResultReceiver = null;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    return new FragmentState(parcel);
                case 1:
                    parcel.getClass();
                    return new Finish(parcel.readParcelable(AnonymousClass1.class.getClassLoader()));
                case 2:
                    return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                        public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new FragmentState.AnonymousClass1(2);
                        public final MediaDescriptionCompat mDescription;
                        public final int mFlags;

                        {
                            this.mFlags = parcel.readInt();
                            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        public final String toString() {
                            return "MediaItem{mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(Parcel parcel2, int i2) {
                            parcel2.writeInt(this.mFlags);
                            this.mDescription.writeToParcel(parcel2, i2);
                        }
                    };
                case 3:
                    Object createFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                    if (createFromParcel == null) {
                        return null;
                    }
                    MediaDescription mediaDescription = (MediaDescription) createFromParcel;
                    String mediaId = mediaDescription.getMediaId();
                    CharSequence title = mediaDescription.getTitle();
                    CharSequence subtitle = mediaDescription.getSubtitle();
                    CharSequence description = mediaDescription.getDescription();
                    Bitmap iconBitmap = mediaDescription.getIconBitmap();
                    Uri iconUri = mediaDescription.getIconUri();
                    Bundle extras = mediaDescription.getExtras();
                    if (extras != null) {
                        extras.setClassLoader(DropMode.class.getClassLoader());
                        uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                    } else {
                        uri = null;
                    }
                    if (uri != null) {
                        if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                            bundle = null;
                            if (uri == null) {
                                uri = mediaDescription.getMediaUri();
                            }
                            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                            mediaDescriptionCompat.mDescriptionObj = createFromParcel;
                            return mediaDescriptionCompat;
                        }
                        extras.remove("android.support.v4.media.description.MEDIA_URI");
                        extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    }
                    bundle = extras;
                    if (uri == null) {
                    }
                    MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                    mediaDescriptionCompat2.mDescriptionObj = createFromParcel;
                    return mediaDescriptionCompat2;
                case 4:
                    return new MediaMetadataCompat(parcel);
                case 5:
                    return new RatingCompat(parcel.readFloat(), parcel.readInt());
                case 6:
                    return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                        public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new FragmentState.AnonymousClass1(6);
                        public final MediaDescriptionCompat mDescription;
                        public final long mId;

                        {
                            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                            this.mId = parcel.readLong();
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        public final String toString() {
                            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
                            sb.append(this.mDescription);
                            sb.append(", Id=");
                            return CameraState$Type$EnumUnboxingLocalUtility.m(this.mId, " }", sb);
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(Parcel parcel2, int i2) {
                            this.mDescription.writeToParcel(parcel2, i2);
                            parcel2.writeLong(this.mId);
                        }
                    };
                case 7:
                    MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                    mediaSessionCompat$ResultReceiverWrapper.mResultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                    return mediaSessionCompat$ResultReceiverWrapper;
                case 8:
                    final Parcelable readParcelable = parcel.readParcelable(null);
                    return new Parcelable(readParcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                        public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new FragmentState.AnonymousClass1(8);
                        public final Object mInner;

                        {
                            this.mInner = readParcelable;
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof MediaSessionCompat$Token)) {
                                return false;
                            }
                            Object obj2 = ((MediaSessionCompat$Token) obj).mInner;
                            Object obj3 = this.mInner;
                            if (obj3 == null) {
                                return obj2 == null;
                            }
                            if (obj2 == null) {
                                return false;
                            }
                            return obj3.equals(obj2);
                        }

                        public final int hashCode() {
                            Object obj = this.mInner;
                            if (obj == null) {
                                return 0;
                            }
                            return obj.hashCode();
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(Parcel parcel2, int i2) {
                            parcel2.writeParcelable((Parcelable) this.mInner, i2);
                        }
                    };
                case 9:
                    ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                    parcelableVolumeInfo.volumeType = parcel.readInt();
                    parcelableVolumeInfo.controlType = parcel.readInt();
                    parcelableVolumeInfo.maxVolume = parcel.readInt();
                    parcelableVolumeInfo.currentVolume = parcel.readInt();
                    parcelableVolumeInfo.audioStream = parcel.readInt();
                    return parcelableVolumeInfo;
                case 10:
                    return new PlaybackStateCompat(parcel);
                case 11:
                    android.support.v4.os.ResultReceiver resultReceiver = new android.support.v4.os.ResultReceiver();
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    int i2 = ResultReceiver.MyResultReceiver.$r8$clinit;
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(IResultReceiver.DESCRIPTOR);
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver)) {
                            IResultReceiver$Stub$Proxy iResultReceiver$Stub$Proxy = new IResultReceiver$Stub$Proxy();
                            iResultReceiver$Stub$Proxy.mRemote = readStrongBinder;
                            iResultReceiver = iResultReceiver$Stub$Proxy;
                        } else {
                            iResultReceiver = (IResultReceiver) queryLocalInterface;
                        }
                    }
                    resultReceiver.mReceiver = iResultReceiver;
                    return resultReceiver;
                case 12:
                    parcel.getClass();
                    return new ActivityResult(parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                case 13:
                    parcel.getClass();
                    Parcelable readParcelable2 = parcel.readParcelable(IntentSender.class.getClassLoader());
                    readParcelable2.getClass();
                    return new IntentSenderRequest((IntentSender) readParcelable2, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
                case 14:
                    AppCompatSpinner.SavedState savedState = new AppCompatSpinner.SavedState(parcel);
                    savedState.mShowDropdown = parcel.readByte() != 0;
                    return savedState;
                case 15:
                    NestedScrollView.SavedState savedState2 = new NestedScrollView.SavedState(parcel);
                    savedState2.scrollPosition = parcel.readInt();
                    return savedState2;
                case 16:
                    return new BackStackRecordState(parcel);
                case 17:
                    return new BackStackState(parcel);
                case 18:
                    FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = new FragmentManager.LaunchedFragmentInfo();
                    launchedFragmentInfo.mWho = parcel.readString();
                    launchedFragmentInfo.mRequestCode = parcel.readInt();
                    return launchedFragmentInfo;
                case 19:
                    FragmentManagerState fragmentManagerState = new FragmentManagerState();
                    fragmentManagerState.mPrimaryNavActiveWho = null;
                    fragmentManagerState.mBackStackStateKeys = new ArrayList();
                    fragmentManagerState.mBackStackStates = new ArrayList();
                    fragmentManagerState.mActive = parcel.createStringArrayList();
                    fragmentManagerState.mAdded = parcel.createStringArrayList();
                    fragmentManagerState.mBackStack = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                    fragmentManagerState.mBackStackIndex = parcel.readInt();
                    fragmentManagerState.mPrimaryNavActiveWho = parcel.readString();
                    fragmentManagerState.mBackStackStateKeys = parcel.createStringArrayList();
                    fragmentManagerState.mBackStackStates = parcel.createTypedArrayList(BackStackState.CREATOR);
                    fragmentManagerState.mLaunchedFragments = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
                    return fragmentManagerState;
                case 20:
                    LinearLayoutManager.SavedState savedState3 = new LinearLayoutManager.SavedState();
                    savedState3.mAnchorPosition = parcel.readInt();
                    savedState3.mAnchorOffset = parcel.readInt();
                    savedState3.mAnchorLayoutFromEnd = parcel.readInt() == 1;
                    return savedState3;
                case 21:
                    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItem = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
                    fullSpanItem.mPosition = parcel.readInt();
                    fullSpanItem.mGapDir = parcel.readInt();
                    fullSpanItem.mHasUnwantedGapAfter = parcel.readInt() == 1;
                    int readInt = parcel.readInt();
                    if (readInt > 0) {
                        int[] iArr = new int[readInt];
                        fullSpanItem.mGapPerSpan = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return fullSpanItem;
                case 22:
                    StaggeredGridLayoutManager.SavedState savedState4 = new StaggeredGridLayoutManager.SavedState();
                    savedState4.mAnchorPosition = parcel.readInt();
                    savedState4.mVisibleAnchorPosition = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    savedState4.mSpanOffsetsSize = readInt2;
                    if (readInt2 > 0) {
                        int[] iArr2 = new int[readInt2];
                        savedState4.mSpanOffsets = iArr2;
                        parcel.readIntArray(iArr2);
                    }
                    int readInt3 = parcel.readInt();
                    savedState4.mSpanLookupSize = readInt3;
                    if (readInt3 > 0) {
                        int[] iArr3 = new int[readInt3];
                        savedState4.mSpanLookup = iArr3;
                        parcel.readIntArray(iArr3);
                    }
                    savedState4.mReverseLayout = parcel.readInt() == 1;
                    savedState4.mAnchorLayoutFromEnd = parcel.readInt() == 1;
                    savedState4.mLastLayoutRTL = parcel.readInt() == 1;
                    savedState4.mFullSpanItems = parcel.readArrayList(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class.getClassLoader());
                    return savedState4;
                case 23:
                    return new SwipeRefreshLayout.SavedState(parcel);
                case 24:
                    return new ParcelImpl(parcel);
                case 25:
                    parcel.getClass();
                    return new AskedQuestion(parcel.readString(), (Question) parcel.readParcelable(AskedQuestion.class.getClassLoader()));
                case 26:
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    Money money = (Money) parcel.readParcelable(HistoryScreens.CancelPayment.class.getClassLoader());
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt4);
                    while (i != readInt4) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(HistoryScreens.CancelPayment.class, parcel, arrayList, i, 1);
                    }
                    return new HistoryScreens.CancelPayment(readString, readString2, money, arrayList);
                case 27:
                    parcel.getClass();
                    return new HistoryScreens.CancelPendingSupPaymentScreen(parcel.readString());
                case 28:
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    Money money2 = (Money) parcel.readParcelable(HistoryScreens.CheckPaymentStatus.class.getClassLoader());
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt5);
                    while (i != readInt5) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(HistoryScreens.CheckPaymentStatus.class, parcel, arrayList2, i, 1);
                    }
                    return new HistoryScreens.CheckPaymentStatus(readString3, readString4, money2, arrayList2);
                default:
                    parcel.getClass();
                    return new HistoryScreens.Error((Redacted) parcel.readParcelable(HistoryScreens.Error.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new FragmentState[i];
                case 1:
                    return new Finish[i];
                case 2:
                    return new MediaBrowserCompat$MediaItem[i];
                case 3:
                    return new MediaDescriptionCompat[i];
                case 4:
                    return new MediaMetadataCompat[i];
                case 5:
                    return new RatingCompat[i];
                case 6:
                    return new MediaSessionCompat$QueueItem[i];
                case 7:
                    return new MediaSessionCompat$ResultReceiverWrapper[i];
                case 8:
                    return new MediaSessionCompat$Token[i];
                case 9:
                    return new ParcelableVolumeInfo[i];
                case 10:
                    return new PlaybackStateCompat[i];
                case 11:
                    return new android.support.v4.os.ResultReceiver[i];
                case 12:
                    return new ActivityResult[i];
                case 13:
                    return new IntentSenderRequest[i];
                case 14:
                    return new AppCompatSpinner.SavedState[i];
                case 15:
                    return new NestedScrollView.SavedState[i];
                case 16:
                    return new BackStackRecordState[i];
                case 17:
                    return new BackStackState[i];
                case 18:
                    return new FragmentManager.LaunchedFragmentInfo[i];
                case 19:
                    return new FragmentManagerState[i];
                case 20:
                    return new LinearLayoutManager.SavedState[i];
                case 21:
                    return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
                case 22:
                    return new StaggeredGridLayoutManager.SavedState[i];
                case 23:
                    return new SwipeRefreshLayout.SavedState[i];
                case 24:
                    return new ParcelImpl[i];
                case 25:
                    return new AskedQuestion[i];
                case 26:
                    return new HistoryScreens.CancelPayment[i];
                case 27:
                    return new HistoryScreens.CancelPendingSupPaymentScreen[i];
                case 28:
                    return new HistoryScreens.CheckPaymentStatus[i];
                default:
                    return new HistoryScreens.Error[i];
            }
        }
    }

    public FragmentState(Parcel parcel) {
        this.mClassName = parcel.readString();
        this.mWho = parcel.readString();
        this.mFromLayout = parcel.readInt() != 0;
        this.mInDynamicContainer = parcel.readInt() != 0;
        this.mFragmentId = parcel.readInt();
        this.mContainerId = parcel.readInt();
        this.mTag = parcel.readString();
        this.mRetainInstance = parcel.readInt() != 0;
        this.mRemoving = parcel.readInt() != 0;
        this.mDetached = parcel.readInt() != 0;
        this.mHidden = parcel.readInt() != 0;
        this.mMaxLifecycleState = parcel.readInt();
        this.mTargetWho = parcel.readString();
        this.mTargetRequestCode = parcel.readInt();
        this.mUserVisibleHint = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Fragment instantiate(FragmentFactory fragmentFactory, ClassLoader classLoader) {
        Fragment instantiate = fragmentFactory.instantiate(classLoader, this.mClassName);
        instantiate.mWho = this.mWho;
        instantiate.mFromLayout = this.mFromLayout;
        instantiate.mInDynamicContainer = this.mInDynamicContainer;
        instantiate.mRestored = true;
        instantiate.mFragmentId = this.mFragmentId;
        instantiate.mContainerId = this.mContainerId;
        instantiate.mTag = this.mTag;
        instantiate.mRetainInstance = this.mRetainInstance;
        instantiate.mRemoving = this.mRemoving;
        instantiate.mDetached = this.mDetached;
        instantiate.mHidden = this.mHidden;
        instantiate.mMaxState = Lifecycle.State.values()[this.mMaxLifecycleState];
        instantiate.mTargetWho = this.mTargetWho;
        instantiate.mTargetRequestCode = this.mTargetRequestCode;
        instantiate.mUserVisibleHint = this.mUserVisibleHint;
        return instantiate;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.mClassName);
        sb.append(" (");
        sb.append(this.mWho);
        sb.append(")}:");
        if (this.mFromLayout) {
            sb.append(" fromLayout");
        }
        if (this.mInDynamicContainer) {
            sb.append(" dynamicContainer");
        }
        int i = this.mContainerId;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.mTag;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.mRetainInstance) {
            sb.append(" retainInstance");
        }
        if (this.mRemoving) {
            sb.append(" removing");
        }
        if (this.mDetached) {
            sb.append(" detached");
        }
        if (this.mHidden) {
            sb.append(" hidden");
        }
        String str2 = this.mTargetWho;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.mTargetRequestCode);
        }
        if (this.mUserVisibleHint) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mClassName);
        parcel.writeString(this.mWho);
        parcel.writeInt(this.mFromLayout ? 1 : 0);
        parcel.writeInt(this.mInDynamicContainer ? 1 : 0);
        parcel.writeInt(this.mFragmentId);
        parcel.writeInt(this.mContainerId);
        parcel.writeString(this.mTag);
        parcel.writeInt(this.mRetainInstance ? 1 : 0);
        parcel.writeInt(this.mRemoving ? 1 : 0);
        parcel.writeInt(this.mDetached ? 1 : 0);
        parcel.writeInt(this.mHidden ? 1 : 0);
        parcel.writeInt(this.mMaxLifecycleState);
        parcel.writeString(this.mTargetWho);
        parcel.writeInt(this.mTargetRequestCode);
        parcel.writeInt(this.mUserVisibleHint ? 1 : 0);
    }

    public FragmentState(Fragment fragment) {
        this.mClassName = fragment.getClass().getName();
        this.mWho = fragment.mWho;
        this.mFromLayout = fragment.mFromLayout;
        this.mInDynamicContainer = fragment.mInDynamicContainer;
        this.mFragmentId = fragment.mFragmentId;
        this.mContainerId = fragment.mContainerId;
        this.mTag = fragment.mTag;
        this.mRetainInstance = fragment.mRetainInstance;
        this.mRemoving = fragment.mRemoving;
        this.mDetached = fragment.mDetached;
        this.mHidden = fragment.mHidden;
        this.mMaxLifecycleState = fragment.mMaxState.ordinal();
        this.mTargetWho = fragment.mTargetWho;
        this.mTargetRequestCode = fragment.mTargetRequestCode;
        this.mUserVisibleHint = fragment.mUserVisibleHint;
    }
}
