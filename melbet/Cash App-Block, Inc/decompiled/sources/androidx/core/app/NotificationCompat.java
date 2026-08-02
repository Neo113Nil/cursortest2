package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class NotificationCompat {

    public final class BigPictureStyle extends Style {
        public IconCompat mBigLargeIcon;
        public boolean mBigLargeIconSet;
        public IconCompat mPictureIcon;

        public abstract class Api31Impl {
            public static void setBigPicture(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void setContentDescription(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void showBigPictureWhenCollapsed(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Bitmap bitmap;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).mBuilder).setBigContentTitle(this.mBigContentTitle);
            IconCompat iconCompat = this.mPictureIcon;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Api31Impl.setBigPicture(bigContentTitle, iconCompat.toIcon(notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder ? ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).mContext : null));
                } else {
                    int i = iconCompat.mType;
                    if (i == -1) {
                        i = ((Icon) iconCompat.mObj1).getType();
                    }
                    if (i == 1) {
                        IconCompat iconCompat2 = this.mPictureIcon;
                        int i2 = iconCompat2.mType;
                        if (i2 == -1) {
                            Object obj = iconCompat2.mObj1;
                            bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                        } else if (i2 == 1) {
                            bitmap = (Bitmap) iconCompat2.mObj1;
                        } else {
                            if (i2 != 5) {
                                OptionalProvider$$ExternalSyntheticLambda0.m$1(iconCompat2, "called getBitmap() on ");
                                return;
                            }
                            Bitmap bitmap2 = (Bitmap) iconCompat2.mObj1;
                            int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                            Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Paint paint = new Paint(3);
                            float f = min;
                            float f2 = 0.5f * f;
                            float f3 = 0.9166667f * f2;
                            float f4 = 0.010416667f * f;
                            paint.setColor(0);
                            paint.setShadowLayer(f4, RecyclerView.DECELERATION_RATE, f * 0.020833334f, 1023410176);
                            canvas.drawCircle(f2, f2, f3, paint);
                            paint.setShadowLayer(f4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 503316480);
                            canvas.drawCircle(f2, f2, f3, paint);
                            paint.clearShadowLayer();
                            paint.setColor(-16777216);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = new Matrix();
                            matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                            bitmapShader.setLocalMatrix(matrix);
                            paint.setShader(bitmapShader);
                            canvas.drawCircle(f2, f2, f3, paint);
                            canvas.setBitmap(null);
                            bitmap = createBitmap;
                        }
                        bigContentTitle = bigContentTitle.bigPicture(bitmap);
                    }
                }
            }
            if (this.mBigLargeIconSet) {
                IconCompat iconCompat3 = this.mBigLargeIcon;
                if (iconCompat3 == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    bigContentTitle.bigLargeIcon(iconCompat3.toIcon(notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder ? ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).mContext : null));
                }
            }
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.showBigPictureWhenCollapsed(bigContentTitle, false);
                Api31Impl.setContentDescription(bigContentTitle, null);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String getClassName() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public final void setBigContentTitle(CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
        }

        public final void setSummaryText(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
        }
    }

    public final class BigTextStyle extends Style {
        public CharSequence mBigText;

        @Override // androidx.core.app.NotificationCompat.Style
        public final void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).mBuilder).setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
            if (this.mSummaryTextSet) {
                bigText.setSummaryText(this.mSummaryText);
            }
        }

        public final void bigText(CharSequence charSequence) {
            this.mBigText = Builder.limitCharSequenceLength(charSequence);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String getClassName() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public final void setBigContentTitle$1(CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
        }

        public final void setSummaryText$1(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
        }
    }

    public final class DecoratedCustomViewStyle extends Style {

        public abstract class Api24Impl {
            public static Notification.Style createDecoratedCustomViewStyle() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).mBuilder.setStyle(Api24Impl.createDecoratedCustomViewStyle());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String getClassName() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
    }

    public final class InboxStyle extends Style {
        public ArrayList mTexts;

        @Override // androidx.core.app.NotificationCompat.Style
        public final void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).mBuilder).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            Iterator it = this.mTexts.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String getClassName() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public final void setSummaryText$2(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
        }
    }

    public final class MessagingStyle extends Style {
        public Boolean mIsGroupConversation;
        public final Person mUser;
        public final ArrayList mMessages = new ArrayList();
        public final ArrayList mHistoricMessages = new ArrayList();

        public abstract class Api24Impl {
            public static Notification.MessagingStyle addMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            public static Notification.MessagingStyle setConversationTitle(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        public abstract class Api26Impl {
            public static Notification.MessagingStyle addHistoricMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        public abstract class Api28Impl {
            public static Notification.MessagingStyle createMessagingStyle(android.app.Person person) {
                return new Notification.MessagingStyle(person);
            }

            public static Notification.MessagingStyle setGroupConversation(Notification.MessagingStyle messagingStyle, boolean z) {
                return messagingStyle.setGroupConversation(z);
            }
        }

        public final class Message {
            public final Bundle mExtras = new Bundle();
            public final Person mPerson;
            public final CharSequence mText;
            public final long mTimestamp;

            public abstract class Api28Impl {
                public static Parcelable castToParcelable(android.app.Person person) {
                    return person;
                }

                public static Notification.MessagingStyle.Message createMessage(CharSequence charSequence, long j, android.app.Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }
            }

            public Message(String str, long j, Person person) {
                this.mText = str;
                this.mTimestamp = j;
                this.mPerson = person;
            }

            public static Bundle[] getBundleArrayForMessages(ArrayList arrayList) {
                Bundle[] bundleArr = new Bundle[arrayList.size()];
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Message message = (Message) arrayList.get(i);
                    Person person = message.mPerson;
                    Bundle bundle = new Bundle();
                    CharSequence charSequence = message.mText;
                    if (charSequence != null) {
                        bundle.putCharSequence("text", charSequence);
                    }
                    bundle.putLong("time", message.mTimestamp);
                    if (person != null) {
                        bundle.putCharSequence("sender", person.mName);
                        bundle.putParcelable("sender_person", Api28Impl.castToParcelable(person.toAndroidPerson()));
                    }
                    Bundle bundle2 = message.mExtras;
                    if (bundle2 != null) {
                        bundle.putBundle("extras", bundle2);
                    }
                    bundleArr[i] = bundle;
                }
                return bundleArr;
            }
        }

        public MessagingStyle(Person person) {
            if (TextUtils.isEmpty(person.mName)) {
                a$$ExternalSyntheticBUOutline0.m$3("User's name must not be empty.");
                throw null;
            }
            this.mUser = person;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            Person person = this.mUser;
            bundle.putCharSequence("android.selfDisplayName", person.mName);
            Bundle bundle2 = new Bundle();
            bundle2.putCharSequence("name", person.mName);
            bundle2.putBundle("icon", null);
            bundle2.putString("uri", person.mUri);
            bundle2.putString("key", person.mKey);
            bundle2.putBoolean("isBot", person.mIsBot);
            bundle2.putBoolean("isImportant", person.mIsImportant);
            bundle.putBundle("android.messagingStyleUser", bundle2);
            bundle.putCharSequence("android.hiddenConversationTitle", null);
            ArrayList arrayList = this.mMessages;
            if (!arrayList.isEmpty()) {
                bundle.putParcelableArray("android.messages", Message.getBundleArrayForMessages(arrayList));
            }
            ArrayList arrayList2 = this.mHistoricMessages;
            if (!arrayList2.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", Message.getBundleArrayForMessages(arrayList2));
            }
            Boolean bool = this.mIsGroupConversation;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Boolean bool;
            Builder builder = this.mBuilder;
            boolean z = false;
            if ((builder == null || builder.mContext.getApplicationInfo().targetSdkVersion >= 28 || this.mIsGroupConversation != null) && (bool = this.mIsGroupConversation) != null) {
                z = bool.booleanValue();
            }
            this.mIsGroupConversation = Boolean.valueOf(z);
            Notification.MessagingStyle createMessagingStyle = Api28Impl.createMessagingStyle(this.mUser.toAndroidPerson());
            Iterator it = this.mMessages.iterator();
            while (true) {
                android.app.Person person = null;
                if (!it.hasNext()) {
                    break;
                }
                Message message = (Message) it.next();
                Person person2 = message.mPerson;
                CharSequence charSequence = message.mText;
                long j = message.mTimestamp;
                if (person2 != null) {
                    person = person2.toAndroidPerson();
                }
                Api24Impl.addMessage(createMessagingStyle, Message.Api28Impl.createMessage(charSequence, j, person));
            }
            Iterator it2 = this.mHistoricMessages.iterator();
            while (it2.hasNext()) {
                Message message2 = (Message) it2.next();
                Person person3 = message2.mPerson;
                Api26Impl.addHistoricMessage(createMessagingStyle, Message.Api28Impl.createMessage(message2.mText, message2.mTimestamp, person3 == null ? null : person3.toAndroidPerson()));
            }
            this.mIsGroupConversation.getClass();
            Api24Impl.setConversationTitle(createMessagingStyle, null);
            Api28Impl.setGroupConversation(createMessagingStyle, this.mIsGroupConversation.booleanValue());
            createMessagingStyle.setBuilder(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).mBuilder);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String getClassName() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }
    }

    public abstract class Style {
        CharSequence mBigContentTitle;
        protected Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet = false;

        public void addCompatExtras(Bundle bundle) {
            if (this.mSummaryTextSet) {
                bundle.putCharSequence("android.summaryText", this.mSummaryText);
            }
            CharSequence charSequence = this.mBigContentTitle;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String className = getClassName();
            if (className != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
            }
        }

        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        public String getClassName() {
            return null;
        }

        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public void setBuilder(Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }
    }

    public final class WearableExtender {
        public ArrayList mActions = new ArrayList();
        public int mFlags = 1;
        public ArrayList mPages = new ArrayList();
        public int mContentIconGravity = 8388613;
        public int mContentActionIndex = -1;
        public int mGravity = 80;

        public abstract class Api24Impl {
            public static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        public abstract class Api31Impl {
            public static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }
        }

        public final void addAction(Action action) {
            this.mActions.add(action);
        }

        public final Object clone() {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.mActions = new ArrayList(this.mActions);
            wearableExtender.mFlags = this.mFlags;
            wearableExtender.mPages = new ArrayList(this.mPages);
            wearableExtender.mContentIconGravity = this.mContentIconGravity;
            wearableExtender.mContentActionIndex = this.mContentActionIndex;
            wearableExtender.mGravity = this.mGravity;
            return wearableExtender;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewCustomerProfileSms.deepLinkSpecs;
    }

    public static Bundle getExtras(Notification notification) {
        return notification.extras;
    }

    public final class Action {
        public final PendingIntent actionIntent;
        public final int icon;
        public final boolean mAllowGeneratedReplies;
        public final Bundle mExtras;
        public IconCompat mIcon;
        public final RemoteInput[] mRemoteInputs;
        public final boolean mShowsUserInterface;
        public final CharSequence title;

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr) {
            this.mShowsUserInterface = true;
            this.mIcon = iconCompat;
            if (iconCompat != null) {
                int i = iconCompat.mType;
                if ((i == -1 ? ((Icon) iconCompat.mObj1).getType() : i) == 2) {
                    this.icon = iconCompat.getResId();
                }
            }
            this.title = Builder.limitCharSequenceLength(charSequence);
            this.actionIntent = pendingIntent;
            this.mExtras = bundle;
            this.mRemoteInputs = remoteInputArr;
            this.mAllowGeneratedReplies = true;
            this.mShowsUserInterface = true;
        }

        public final IconCompat getIconCompat() {
            int i;
            if (this.mIcon == null && (i = this.icon) != 0) {
                this.mIcon = IconCompat.createWithResource(i);
            }
            return this.mIcon;
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i == 0 ? null : IconCompat.createWithResource(i), charSequence, pendingIntent, new Bundle(), null);
        }
    }

    public final class Builder {
        public final ArrayList mActions;
        public final boolean mAllowSystemGeneratedContextualActions;
        public RemoteViews mBigContentView;
        public String mCategory;
        public String mChannelId;
        public int mColor;
        public PendingIntent mContentIntent;
        public CharSequence mContentText;
        public CharSequence mContentTitle;
        public RemoteViews mContentView;
        public final Context mContext;
        public Bundle mExtras;
        public String mGroupKey;
        public boolean mGroupSummary;
        public final ArrayList mInvisibleActions;
        public IconCompat mLargeIcon;
        public boolean mLocalOnly;
        public final Notification mNotification;
        public int mNumber;
        public final ArrayList mPeople;
        public final ArrayList mPersonList;
        public int mPriority;
        public boolean mProgressIndeterminate;
        public int mProgressMax;
        public Notification mPublicVersion;
        public String mShortcutId;
        public boolean mShowWhen;
        public Style mStyle;
        public CharSequence mSubText;
        public int mVisibility;

        public Builder(Context context, String str) {
            this.mActions = new ArrayList();
            this.mPersonList = new ArrayList();
            this.mInvisibleActions = new ArrayList();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            Notification notification = new Notification();
            this.mNotification = notification;
            this.mContext = context;
            this.mChannelId = str;
            notification.when = System.currentTimeMillis();
            notification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList();
            this.mAllowSystemGeneratedContextualActions = true;
        }

        public static CharSequence limitCharSequenceLength(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public final void addAction(int i, PendingIntent pendingIntent, String str) {
            this.mActions.add(new Action(i, str, pendingIntent));
        }

        public final Notification build() {
            Bundle bundle;
            RemoteViews makeHeadsUpContentView;
            RemoteViews makeBigContentView;
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Builder builder = notificationCompatBuilder.mBuilderCompat;
            Style style = builder.mStyle;
            if (style != null) {
                style.apply(notificationCompatBuilder);
            }
            RemoteViews makeContentView = style != null ? style.makeContentView(notificationCompatBuilder) : null;
            Notification build = notificationCompatBuilder.mBuilder.build();
            if (makeContentView != null) {
                build.contentView = makeContentView;
            } else {
                RemoteViews remoteViews = builder.mContentView;
                if (remoteViews != null) {
                    build.contentView = remoteViews;
                }
            }
            if (style != null && (makeBigContentView = style.makeBigContentView(notificationCompatBuilder)) != null) {
                build.bigContentView = makeBigContentView;
            }
            if (style != null && (makeHeadsUpContentView = builder.mStyle.makeHeadsUpContentView(notificationCompatBuilder)) != null) {
                build.headsUpContentView = makeHeadsUpContentView;
            }
            if (style != null && (bundle = build.extras) != null) {
                style.addCompatExtras(bundle);
            }
            return build;
        }

        public final void extend(WearableExtender wearableExtender) {
            Bundle bundle = new Bundle();
            if (!wearableExtender.mActions.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(wearableExtender.mActions.size());
                Iterator it = wearableExtender.mActions.iterator();
                while (it.hasNext()) {
                    Action action = (Action) it.next();
                    IconCompat iconCompat = action.getIconCompat();
                    boolean z = action.mAllowGeneratedReplies;
                    Bundle bundle2 = action.mExtras;
                    Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat == null ? null : iconCompat.toIcon(null), action.title, action.actionIntent);
                    Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
                    bundle3.putBoolean("android.support.allowGeneratedReplies", z);
                    WearableExtender.Api24Impl.setAllowGeneratedReplies(builder, z);
                    if (Build.VERSION.SDK_INT >= 31) {
                        WearableExtender.Api31Impl.setAuthenticationRequired(builder, false);
                    }
                    builder.addExtras(bundle3);
                    RemoteInput[] remoteInputArr = action.mRemoteInputs;
                    if (remoteInputArr != null) {
                        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
                        if (remoteInputArr.length > 0) {
                            RemoteInput remoteInput = remoteInputArr[0];
                            throw null;
                        }
                        for (android.app.RemoteInput remoteInput2 : remoteInputArr2) {
                            builder.addRemoteInput(remoteInput2);
                        }
                    }
                    arrayList.add(builder.build());
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i = wearableExtender.mFlags;
            if (i != 1) {
                bundle.putInt("flags", i);
            }
            if (!wearableExtender.mPages.isEmpty()) {
                ArrayList arrayList2 = wearableExtender.mPages;
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            int i2 = wearableExtender.mContentIconGravity;
            if (i2 != 8388613) {
                bundle.putInt("contentIconGravity", i2);
            }
            int i3 = wearableExtender.mContentActionIndex;
            if (i3 != -1) {
                bundle.putInt("contentActionIndex", i3);
            }
            int i4 = wearableExtender.mGravity;
            if (i4 != 80) {
                bundle.putInt("gravity", i4);
            }
            if (this.mExtras == null) {
                this.mExtras = new Bundle();
            }
            this.mExtras.putBundle("android.wearable.EXTENSIONS", bundle);
        }

        public final void setAutoCancel(boolean z) {
            setFlag(16, z);
        }

        public final void setChannelId() {
            this.mChannelId = "com.google.android.gms.availability";
        }

        public final void setColor(int i) {
            this.mColor = i;
        }

        public final void setContentIntent(PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
        }

        public final void setContentText(CharSequence charSequence) {
            this.mContentText = limitCharSequenceLength(charSequence);
        }

        public final void setContentTitle(CharSequence charSequence) {
            this.mContentTitle = limitCharSequenceLength(charSequence);
        }

        public final void setFlag(int i, boolean z) {
            Notification notification = this.mNotification;
            if (z) {
                notification.flags = i | notification.flags;
            } else {
                notification.flags = (~i) & notification.flags;
            }
        }

        public final void setGroup(String str) {
            this.mGroupKey = str;
        }

        public final void setLocalOnly() {
            this.mLocalOnly = true;
        }

        public final void setPriority() {
            this.mPriority = 2;
        }

        public final void setSmallIcon(int i) {
            this.mNotification.icon = i;
        }

        public final void setStyle(Style style) {
            if (this.mStyle != style) {
                this.mStyle = style;
                if (style != null) {
                    style.setBuilder(this);
                }
            }
        }

        public final void setTicker(String str) {
            this.mNotification.tickerText = limitCharSequenceLength(str);
        }

        public final void setWhen(long j) {
            this.mNotification.when = j;
        }

        public Builder(Context context) {
            this(context, null);
        }
    }
}
