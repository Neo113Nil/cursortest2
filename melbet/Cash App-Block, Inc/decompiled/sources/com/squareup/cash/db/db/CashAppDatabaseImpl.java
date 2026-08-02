package com.squareup.cash.db.db;

import app.cash.sqldelight.Transacter;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.db.SqlSchema;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.db.SessionQueries;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class CashAppDatabaseImpl extends TransacterImpl implements Transacter {
    public final SessionQueries analyticsMessageQueries;
    public final SessionQueries sessionQueries;
    public final SessionQueries storageLinkQueries;

    public final class Schema implements SqlSchema {
        public final /* synthetic */ int $r8$classId;
        public static final Schema INSTANCE$1 = new Schema(1);
        public static final Schema INSTANCE = new Schema(0);

        public /* synthetic */ Schema(int i) {
            this.$r8$classId = i;
        }

        /* renamed from: migrateInternal-ElmaSbI$1, reason: not valid java name */
        public static void m3518migrateInternalElmaSbI$1(AndroidSqliteDriver androidSqliteDriver, long j, long j2) {
            String str;
            String str2;
            String str3;
            Integer num;
            Integer num2;
            String str4;
            String str5;
            String str6;
            Integer num3;
            String str7;
            Integer num4;
            String str8;
            Integer num5;
            String str9;
            Integer num6;
            String str10;
            Integer num7;
            String str11;
            Integer num8;
            String str12;
            String str13;
            String str14;
            Integer num9;
            String str15;
            Integer num10;
            String str16;
            String str17;
            String str18;
            Integer num11;
            String str19;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String str28;
            Integer num12;
            String str29;
            Integer num13;
            String str30;
            String str31;
            Integer num14;
            String str32;
            String str33;
            String str34;
            String str35;
            String str36;
            Integer num15;
            String str37;
            String str38;
            String str39;
            String str40;
            String str41;
            String str42;
            String str43;
            String str44;
            String str45;
            String str46;
            String str47;
            String str48;
            String str49;
            String str50;
            String str51;
            String str52;
            String str53;
            String str54;
            String str55;
            String str56;
            String str57;
            String str58;
            String str59;
            String str60;
            String str61;
            String str62;
            String str63;
            String str64;
            String str65;
            String str66;
            if (j <= 86 && j2 > 86) {
                androidSqliteDriver.execute(null, "CREATE TABLE pending_payment (\n  external_id TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL,\n  retry_at INTEGER NOT NULL,\n  retry_count INTEGER NOT NULL DEFAULT 0,\n  request BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE pending_transfer (\n  external_id TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL,\n  retry_at INTEGER NOT NULL,\n  retry_count INTEGER NOT NULL DEFAULT 0,\n  request BLOB NOT NULL\n)", null);
            }
            if (j <= 87 && j2 > 87) {
                androidSqliteDriver.execute(null, "DROP TABLE pending_payment", null);
                androidSqliteDriver.execute(null, "CREATE TABLE pending_payment (\n  external_id TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL,\n  retry_at INTEGER NOT NULL,\n  retry_count INTEGER NOT NULL DEFAULT 0,\n  request BLOB NOT NULL,\n  amount BLOB NOT NULL,\n  orientation TEXT NOT NULL\n)", null);
            }
            if (j <= 88 && j2 > 88) {
                androidSqliteDriver.execute(null, "ALTER TABLE payment ADD COLUMN external_id TEXT", null);
            }
            if (j <= 89 && j2 > 89) {
                androidSqliteDriver.execute(null, "CREATE TABLE offline_config (\n  enabled INTEGER,\n  external_status_url TEXT,\n  attempted_payment_status_result BLOB,\n  attempted_bill_status_result BLOB,\n  attempted_cash_out_status_result BLOB,\n  attempted_add_cash_status_result BLOB\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO offline_config DEFAULT VALUES", null);
            }
            if (j <= 90 && j2 > 90) {
                androidSqliteDriver.execute(null, "ALTER TABLE offline_config ADD COLUMN retry_intervals BLOB", null);
            }
            if (j <= 91 && j2 > 91) {
                androidSqliteDriver.execute(null, "CREATE TABLE new_profile (\n  profile_id TEXT NOT NULL PRIMARY KEY,\n  full_name TEXT,\n  photo_url TEXT,\n  require_passcode_confirmation INTEGER NOT NULL,\n  has_passcode INTEGER NOT NULL,\n  nearby_visibility TEXT NOT NULL,\n  cashtag TEXT,\n  cashtag_url TEXT,\n  cashtag_url_display_text TEXT,\n  cashtag_url_enabled INTEGER NOT NULL DEFAULT 0,\n  rate_plan TEXT NOT NULL,\n  can_upgrade_to_business INTEGER NOT NULL DEFAULT 0,\n  is_verified_account INTEGER NOT NULL,\n  app_message_notifications_enabled INTEGER NOT NULL DEFAULT 0,\n  verification_instrument_token TEXT,\n  deposit_preference TEXT,\n  cash_balance_home_screen_button_enabled INTEGER NOT NULL,\n  cash_balance_home_screen_button_priority INTEGER NOT NULL DEFAULT 0,\n  adding_cash_enabled INTEGER NOT NULL,\n  address BLOB,\n  deposit_preference_data BLOB,\n  request_minimum_note_length INTEGER NOT NULL DEFAULT 0,\n  cash_drawer_data BLOB\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_profile\nSELECT profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n       nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n       rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n       verification_instrument_token, deposit_preference, cash_balance_home_screen_button_enabled,\n       cash_balance_home_screen_button_priority, adding_cash_enabled,\n       address, deposit_preference_data, request_minimum_note_length, cash_drawer_data\nFROM profile", null);
                androidSqliteDriver.execute(null, "DROP TABLE profile", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_profile RENAME TO profile", null);
            }
            if (j <= 92 && j2 > 92) {
                androidSqliteDriver.execute(null, "DROP TABLE offline_config", null);
                androidSqliteDriver.execute(null, "CREATE TABLE offline_config (\n  enabled INTEGER,\n  external_status_url TEXT,\n  attempted_payment_status_result BLOB,\n  offline_payment_status_result BLOB,\n  attempted_bill_status_result BLOB,\n  offline_bill_status_result BLOB,\n  attempted_cash_out_status_result BLOB,\n  offline_cash_out_status_result BLOB,\n  attempted_add_cash_status_result BLOB,\n  offline_add_cash_status_result BLOB,\n  retry_intervals BLOB\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO offline_config DEFAULT VALUES", null);
            }
            if (j <= 93 && j2 > 93) {
                androidSqliteDriver.execute(null, "ALTER TABLE pending_payment ADD COLUMN succeeded INTEGER NOT NULL DEFAULT 0", null);
                androidSqliteDriver.execute(null, "ALTER TABLE pending_transfer ADD COLUMN succeeded INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 94 && j2 > 94) {
                androidSqliteDriver.execute(null, "CREATE TABLE stamps_config (\n  stamps_url TEXT,\n  stamps_version INTEGER\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO stamps_config DEFAULT VALUES", null);
            }
            if (j <= 95 && j2 > 95) {
                androidSqliteDriver.execute(null, "DROP TABLE stamps_config", null);
                androidSqliteDriver.execute(null, "CREATE TABLE stamps_config (\n  stamps BLOB\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO stamps_config DEFAULT VALUES", null);
            }
            if (j <= 96 && j2 > 96) {
                androidSqliteDriver.execute(null, "ALTER TABLE profile ADD COLUMN region TEXT NOT NULL DEFAULT 'USA'", null);
                androidSqliteDriver.execute(null, "ALTER TABLE profile ADD COLUMN default_currency TEXT NOT NULL DEFAULT 'USD'", null);
            }
            if (j <= 97 && j2 > 97) {
                androidSqliteDriver.execute(null, "CREATE TABLE new_profile (\n  profile_id TEXT NOT NULL PRIMARY KEY,\n  full_name TEXT,\n  photo_url TEXT,\n  require_passcode_confirmation INTEGER NOT NULL,\n  has_passcode INTEGER NOT NULL,\n  nearby_visibility TEXT NOT NULL,\n  cashtag TEXT,\n  cashtag_url TEXT,\n  cashtag_url_display_text TEXT,\n  cashtag_url_enabled INTEGER NOT NULL DEFAULT 0,\n  rate_plan TEXT NOT NULL,\n  can_upgrade_to_business INTEGER NOT NULL DEFAULT 0,\n  is_verified_account INTEGER NOT NULL,\n  app_message_notifications_enabled INTEGER NOT NULL DEFAULT 0,\n  verification_instrument_token TEXT,\n  deposit_preference TEXT,\n  cash_balance_home_screen_button_enabled INTEGER NOT NULL,\n  cash_balance_home_screen_button_priority INTEGER NOT NULL DEFAULT 0,\n  adding_cash_enabled INTEGER NOT NULL,\n  address BLOB,\n  deposit_preference_data BLOB,\n  request_minimum_note_length INTEGER NOT NULL DEFAULT 0,\n  cash_drawer_data BLOB,\n  country_code TEXT,\n  default_currency TEXT\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_profile\nSELECT profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n  nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n  rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n  verification_instrument_token, deposit_preference, cash_balance_home_screen_button_enabled,\n  cash_balance_home_screen_button_priority, adding_cash_enabled,\n  address, deposit_preference_data, request_minimum_note_length, cash_drawer_data,\n  substr(region, 1, 2), default_currency\nFROM profile", null);
                androidSqliteDriver.execute(null, "DROP TABLE profile", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_profile RENAME TO profile", null);
            }
            if (j <= 98 && j2 > 98) {
                androidSqliteDriver.execute(null, "ALTER TABLE app_message ADD COLUMN colors BLOB", null);
                androidSqliteDriver.execute(null, "CREATE TABLE new_entity_config (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  old_token TEXT DEFAULT NULL,\n  new_token TEXT DEFAULT NULL,\n  sync_token TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_entity_config\nSELECT entity_config._id, entity_config.old_token, entity_config.new_token, entity_config.sync_token\nFROM entity_config", null);
                androidSqliteDriver.execute(null, "DROP TABLE entity_config", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_entity_config RENAME TO entity_config", null);
            }
            if (j <= 99 && j2 > 99) {
                androidSqliteDriver.execute(null, "CREATE TABLE new_app_message (\n  message_token TEXT NOT NULL PRIMARY KEY,\n  state TEXT NOT NULL,\n  priority INTEGER,\n  presentation_mode TEXT,\n  home_button_text TEXT,\n  whats_new BLOB,\n  banner BLOB,\n  feature_list BLOB,\n  button_stack BLOB,\n  html BLOB,\n  direct_action BLOB,\n  drawer BLOB,\n  toggle BLOB,\n  promo BLOB,\n  foreground_video BLOB,\n  theme TEXT,\n  colors BLOB\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_app_message\nSELECT message_token, state, priority,\n       CASE force_open WHEN 1 THEN 'HOME_SCREEN' ELSE 'HOME_BUTTON' END,\n       home_button_text, whats_new, banner, feature_list, button_stack, html, direct_action,\n       drawer, toggle, promo, NULL, theme, colors\nFROM app_message", null);
                androidSqliteDriver.execute(null, "DROP TABLE app_message", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_app_message RENAME TO app_message", null);
            }
            if (j <= 100 && j2 > 100) {
                androidSqliteDriver.execute(null, "ALTER TABLE customer ADD COLUMN accent_color TEXT", null);
            }
            if (j <= 101 && j2 > 101) {
                androidSqliteDriver.execute(null, "ALTER TABLE customer ADD COLUMN country_code TEXT", null);
            }
            if (j <= 102 && j2 > 102) {
                androidSqliteDriver.execute(null, "CREATE TABLE feature_flags (\n  profile_id TEXT NOT NULL PRIMARY KEY REFERENCES profile,\n  flags BLOB\n)", null);
            }
            if (j <= 104 && j2 > 104) {
                androidSqliteDriver.execute(null, "CREATE TABLE new_reward_status (\n  id INTEGER NOT NULL PRIMARY KEY,\n  code_entry_enabled INTEGER NOT NULL,\n  minimum_code_length INTEGER NOT NULL,\n  reward_screen_enabled INTEGER NOT NULL,\n  reward_button_text TEXT,\n  reward_button_priority INTEGER NOT NULL,\n  reward_header_text TEXT,\n  reward_main_text TEXT,\n  completed_reward_payments INTEGER NOT NULL,\n  available_reward_payments INTEGER NOT NULL,\n  reward_payment_amount BLOB NOT NULL,\n  expiration TEXT\n)", null);
                androidSqliteDriver.execute(null, "DROP TABLE reward_status", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_reward_status RENAME TO reward_status", null);
            }
            if (j <= 105 && j2 > 105) {
                androidSqliteDriver.execute(null, "ALTER TABLE instrument_linking_config\nADD COLUMN nfc_card_linking_enabled INTEGER DEFAULT 0", null);
            }
            if (j <= 106 && j2 > 106) {
                androidSqliteDriver.execute(null, "CREATE TABLE direct_deposit_account (\n  routing_number TEXT NOT NULL,\n  account_number_prefix TEXT NOT NULL,\n  profile_id TEXT NOT NULL REFERENCES profile ON DELETE CASCADE,\n  is_placeholder INTEGER NOT NULL,\n  PRIMARY KEY(profile_id) -- Only one DDA per profile allowed.\n)", null);
            }
            if (j <= 108 && j2 > 108) {
                androidSqliteDriver.execute(null, "ALTER TABLE instrument\nADD COLUMN wallet_address TEXT DEFAULT NULL", null);
            }
            if (j <= 109 && j2 > 109) {
                androidSqliteDriver.execute(null, "CREATE TABLE new_device_user (\n  user_id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  current_profile_id TEXT\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_device_user\nSELECT user_id, current_profile_id\nFROM device_user", null);
                androidSqliteDriver.execute(null, "DROP TABLE device_user", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_device_user RENAME TO device_user", null);
            }
            if (j <= 110 && j2 > 110) {
                androidSqliteDriver.execute(null, "ALTER TABLE blockers_config ADD COLUMN add_cash_header_text TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(null, "ALTER TABLE blockers_config ADD COLUMN target_balance_amount BLOB DEFAULT NULL", null);
            }
            if (j <= 111 && j2 > 111) {
                androidSqliteDriver.execute(null, "ALTER TABLE profile ADD COLUMN bitcoin_deposit_enabled INTEGER NOT NULL DEFAULT 0", null);
                androidSqliteDriver.execute(null, "ALTER TABLE profile\nADD COLUMN bitcoin_withdrawal_enabled INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 112 && j2 > 112) {
                androidSqliteDriver.execute(null, "CREATE TABLE balance_data (\n  profile_id TEXT NOT NULL PRIMARY KEY REFERENCES profile,\n  cash_balance_home_screen_button_enabled INTEGER NOT NULL,\n  cash_balance_home_screen_button_priority INTEGER NOT NULL,\n  adding_cash_enabled INTEGER NOT NULL,\n  bitcoin_deposit_enabled INTEGER NOT NULL,\n  bitcoin_withdrawl_enabled INTEGER NOT NULL,\n  enable_cryptocurrency_transfer_out_status TEXT NOT NULL,\n  enable_cryptocurrency_transfer_out_button_text TEXT\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE new_profile (\n  profile_id TEXT NOT NULL PRIMARY KEY,\n  full_name TEXT,\n  photo_url TEXT,\n  require_passcode_confirmation INTEGER NOT NULL,\n  has_passcode INTEGER NOT NULL,\n  nearby_visibility TEXT NOT NULL,\n  cashtag TEXT,\n  cashtag_url TEXT,\n  cashtag_url_display_text TEXT,\n  cashtag_url_enabled INTEGER NOT NULL DEFAULT 0,\n  rate_plan TEXT NOT NULL,\n  can_upgrade_to_business INTEGER NOT NULL DEFAULT 0,\n  is_verified_account INTEGER NOT NULL,\n  app_message_notifications_enabled INTEGER NOT NULL DEFAULT 0,\n  verification_instrument_token TEXT,\n  deposit_preference TEXT,\n  address BLOB,\n  deposit_preference_data BLOB,\n  request_minimum_note_length INTEGER NOT NULL DEFAULT 0,\n  cash_drawer_data BLOB,\n  country_code TEXT,\n  default_currency TEXT\n  -- TODO tax stuff?\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_profile\nSELECT profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n  nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled, rate_plan,\n  can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n  verification_instrument_token, deposit_preference, address, deposit_preference_data,\n  request_minimum_note_length, cash_drawer_data, country_code, default_currency\nFROM profile", null);
                androidSqliteDriver.execute(null, "DROP TABLE profile", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_profile RENAME TO profile", null);
            }
            if (j <= 113 && j2 > 113) {
                androidSqliteDriver.execute(null, "CREATE TABLE new_balance_data (\n  profile_id TEXT NOT NULL PRIMARY KEY REFERENCES profile,\n  cash_balance_home_screen_button_enabled INTEGER NOT NULL,\n  cash_balance_home_screen_button_priority INTEGER NOT NULL,\n  adding_cash_enabled INTEGER NOT NULL,\n  bitcoin_deposit_enabled INTEGER NOT NULL,\n  enable_cryptocurrency_transfer_out_status TEXT NOT NULL,\n  enable_cryptocurrency_transfer_out_button_text TEXT\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_balance_data\nSELECT profile_id, cash_balance_home_screen_button_enabled, cash_balance_home_screen_button_priority,\n  adding_cash_enabled, bitcoin_deposit_enabled, enable_cryptocurrency_transfer_out_status,\n  enable_cryptocurrency_transfer_out_button_text\nFROM balance_data", null);
                androidSqliteDriver.execute(null, "DROP TABLE balance_data", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_balance_data RENAME TO balance_data", null);
            }
            if (j <= 114 && j2 > 114) {
                androidSqliteDriver.execute(null, "CREATE TABLE bitcoin_transaction_customer_ids (\n  customer_id TEXT PRIMARY KEY\n)", null);
            }
            if (j <= 115 && j2 > 115) {
                androidSqliteDriver.execute(null, "CREATE TABLE new_tutorials (\n  profile_id TEXT NOT NULL PRIMARY KEY REFERENCES profile ON DELETE CASCADE,\n  tutorial_data BLOB,\n  home_pill_version INTEGER NOT NULL DEFAULT 0,\n  home_pill_version_seen INTEGER NOT NULL DEFAULT 0,\n  balance_amount_version INTEGER NOT NULL DEFAULT 0,\n  balance_amount_version_seen INTEGER NOT NULL DEFAULT 0,\n  balance_card_version INTEGER NOT NULL DEFAULT 0,\n  balance_card_version_seen INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_tutorials\nSELECT tutorials.profile_id, tutorials.tutorial_data, tutorials.home_pill_version, tutorials.home_pill_version_seen, tutorials.balance_amount_version, tutorials.balance_amount_version_seen, tutorials.balance_card_version, tutorials.balance_card_version_seen\nFROM tutorials\nGROUP BY profile_id", null);
                androidSqliteDriver.execute(null, "DROP TABLE tutorials", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_tutorials RENAME TO tutorials", null);
            }
            if (j <= 116 && j2 > 116) {
                androidSqliteDriver.execute(null, "DROP TABLE balance_data", null);
                androidSqliteDriver.execute(null, "CREATE TABLE balance_data (\n  profile_id TEXT NOT NULL PRIMARY KEY REFERENCES profile,\n  cash_balance_home_screen_button_enabled INTEGER NOT NULL,\n  cash_balance_home_screen_button_priority INTEGER NOT NULL,\n  adding_cash_enabled INTEGER NOT NULL,\n  bitcoin_deposit_enabled INTEGER NOT NULL,\n  enable_cryptocurrency_transfer_out_status TEXT NOT NULL,\n  enable_cryptocurrency_transfer_out_button_text TEXT,\n  balance_limit_groups BLOB NOT NULL\n)", null);
            }
            if (j <= 117 && j2 > 117) {
                androidSqliteDriver.execute(null, "CREATE TABLE cryptocurrency_config (\n  btc_welcome_message TEXT DEFAULT NULL,\n  learn_about_btc_button_text TEXT DEFAULT NULL,\n  learn_about_btc_url TEXT DEFAULT NULL,\n  dismiss_button_text TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO cryptocurrency_config DEFAULT VALUES", null);
            }
            if (j <= 118 && j2 > 118) {
                androidSqliteDriver.execute(null, "ALTER TABLE support_config ADD COLUMN trouble_scanning_url TEXT DEFAULT NULL", null);
            }
            if (j <= 119 && j2 > 119) {
                androidSqliteDriver.execute(null, "DROP TABLE tutorials", null);
            }
            if (j <= 120 && j2 > 120) {
                androidSqliteDriver.execute(null, "CREATE TABLE new_profile (\n  profile_id TEXT NOT NULL PRIMARY KEY,\n  full_name TEXT,\n  photo_url TEXT,\n  require_passcode_confirmation INTEGER NOT NULL,\n  has_passcode INTEGER NOT NULL,\n  nearby_visibility TEXT NOT NULL,\n  cashtag TEXT,\n  cashtag_url TEXT,\n  cashtag_url_display_text TEXT,\n  cashtag_url_enabled INTEGER NOT NULL DEFAULT 0,\n  rate_plan TEXT NOT NULL,\n  can_upgrade_to_business INTEGER NOT NULL DEFAULT 0,\n  is_verified_account INTEGER NOT NULL,\n  app_message_notifications_enabled INTEGER NOT NULL DEFAULT 0,\n  verification_instrument_token TEXT,\n  deposit_preference TEXT,\n  address BLOB,\n  deposit_preference_data BLOB,\n  request_minimum_note_length INTEGER NOT NULL DEFAULT 0,\n  cash_drawer_data BLOB,\n  country_code TEXT,\n  default_currency TEXT\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_profile\nSELECT profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n  nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled, rate_plan,\n  can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n  verification_instrument_token, deposit_preference, address, deposit_preference_data,\n  request_minimum_note_length, cash_drawer_data, country_code, default_currency\nFROM profile", null);
                androidSqliteDriver.execute(null, "DROP TABLE profile", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_profile RENAME TO profile", null);
            }
            if (j <= 121 && j2 > 121) {
                androidSqliteDriver.execute(null, "CREATE TABLE effective_limits (\n  limited_action TEXT NOT NULL PRIMARY KEY,\n  limit_amount BLOB NOT NULL,\n  limit_exceeded_message TEXT\n)", null);
            }
            if (j <= 122 && j2 > 122) {
                androidSqliteDriver.execute(null, "ALTER TABLE direct_deposit_account ADD COLUMN explanation_text TEXT DEFAULT NULL", null);
            }
            if (j <= 123 && j2 > 123) {
                androidSqliteDriver.execute(null, "CREATE TABLE new_app_message (\n  message_token TEXT NOT NULL PRIMARY KEY,\n  state TEXT NOT NULL,\n  presentation_mode TEXT,\n  whats_new BLOB,\n  banner BLOB,\n  feature_list BLOB,\n  button_stack BLOB,\n  html BLOB,\n  direct_action BLOB,\n  drawer BLOB,\n  toggle BLOB,\n  promo BLOB,\n  foreground_video BLOB,\n  theme TEXT,\n  colors BLOB\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_app_message\nSELECT message_token, state, presentation_mode, whats_new, banner, feature_list, button_stack,\n  html, direct_action, drawer, toggle, promo, foreground_video, theme, colors\nFROM app_message", null);
                androidSqliteDriver.execute(null, "DROP TABLE app_message", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_app_message RENAME TO app_message", null);
                androidSqliteDriver.execute(null, "ALTER TABLE device_user ADD COLUMN active_balance_drawer TEXT", null);
            }
            if (j <= 124 && j2 > 124) {
                androidSqliteDriver.execute(null, "CREATE TABLE reward (\n  token TEXT NOT NULL PRIMARY KEY,\n  category TEXT,\n  avatars BLOB,\n  title TEXT,\n  main_text TEXT,\n  details_url TEXT\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE selected_reward (\n  token TEXT NOT NULL PRIMARY KEY,\n  reward_token TEXT NOT NULL REFERENCES reward(token)\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE reward_slot (\n  token TEXT NOT NULL PRIMARY KEY,\n  state TEXT NOT NULL,\n  selected_reward_token TEXT REFERENCES selected_reward(token)\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE selectable_reward (\n  reward_token TEXT NOT NULL REFERENCES reward(token)\n)", null);
            }
            if (j <= 125 && j2 > 125) {
                androidSqliteDriver.execute(null, "CREATE TABLE instrument_linking_option (\n  _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  profile_id TEXT NOT NULL REFERENCES profile,\n  instrument_types TEXT NOT NULL,\n  title TEXT,\n  description TEXT\n)", null);
            }
            if (j <= 126 && j2 > 126) {
                androidSqliteDriver.execute(null, "CREATE TABLE rewards_data (\n  show_rewards INTEGER DEFAULT 0\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO rewards_data DEFAULT VALUES", null);
            }
            if (j <= 127 && j2 > 127) {
                androidSqliteDriver.execute(null, "DROP TABLE IF EXISTS rewards_data", null);
                androidSqliteDriver.execute(null, "CREATE TABLE rewards_data (\n  show_rewards INTEGER DEFAULT 0\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO rewards_data DEFAULT VALUES", null);
            }
            if (j <= 128 && j2 > 128) {
                androidSqliteDriver.execute(null, "ALTER TABLE customer ADD COLUMN category TEXT", null);
            }
            if (j <= 129 && j2 > 129) {
                androidSqliteDriver.execute(null, "CREATE TABLE loyalty_program (\n  id TEXT NOT NULL PRIMARY KEY,\n  merchant_avatar_url TEXT NOT NULL,\n  merchant_name TEXT NOT NULL,\n  merchant_token TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE points_program (\n  loyalty_program_id TEXT NOT NULL REFERENCES loyalty_program ON DELETE CASCADE,\n  points_earned INTEGER NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE points_reward (\n  loyalty_program_id TEXT NOT NULL REFERENCES loyalty_program ON DELETE CASCADE,\n  points_required INTEGER NOT NULL,\n  display_name TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE stars_program (\n  loyalty_program_id TEXT NOT NULL REFERENCES loyalty_program ON DELETE CASCADE,\n  stars_earned INTEGER NOT NULL,\n  stars_per_reward INTEGER NOT NULL,\n  display_name TEXT NOT NULL\n)", null);
            }
            if (j <= 130 && j2 > 130) {
                androidSqliteDriver.execute(null, "CREATE TABLE loyalty_customer (\n  phone_number TEXT NOT NULL PRIMARY KEY\n)", null);
            }
            if (j <= 131 && j2 > 131) {
                androidSqliteDriver.execute(null, "ALTER TABLE profile ADD COLUMN customer_since INTEGER", null);
            }
            if (j <= 132 && j2 > 132) {
                androidSqliteDriver.execute(null, "ALTER TABLE support_config ADD COLUMN terms_of_service_url TEXT DEFAULT NULL", null);
            }
            if (j <= 133 && j2 > 133) {
                androidSqliteDriver.execute(null, "ALTER TABLE profile ADD COLUMN loyalty_data BLOB", null);
            }
            if (j <= 134 && j2 > 134) {
                androidSqliteDriver.execute(null, "ALTER TABLE blockers_config RENAME TO blockersConfig", null);
            }
            if (j <= 135 && j2 > 135) {
                androidSqliteDriver.execute(null, "ALTER TABLE loyalty_program RENAME TO loyaltyProgram", null);
                androidSqliteDriver.execute(null, "ALTER TABLE loyalty_customer RENAME TO loyaltyCustomer", null);
                androidSqliteDriver.execute(null, "ALTER TABLE stars_program RENAME TO starsProgram", null);
                androidSqliteDriver.execute(null, "ALTER TABLE points_program RENAME TO pointsProgram", null);
                androidSqliteDriver.execute(null, "ALTER TABLE points_reward RENAME TO pointsReward", null);
            }
            if (j <= 136 && j2 > 136) {
                androidSqliteDriver.execute(null, "DROP TABLE loyaltyCustomer", null);
                androidSqliteDriver.execute(null, "DROP TABLE loyaltyProgram", null);
                androidSqliteDriver.execute(null, "DROP TABLE pointsProgram", null);
                androidSqliteDriver.execute(null, "DROP TABLE pointsReward", null);
                androidSqliteDriver.execute(null, "DROP TABLE starsProgram", null);
                androidSqliteDriver.execute(null, "CREATE TABLE loyaltyCustomer (\n  phone_number TEXT NOT NULL PRIMARY KEY\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE loyaltyProgram (\n  id TEXT NOT NULL PRIMARY KEY,\n  merchant_avatar_url TEXT NOT NULL,\n  merchant_name TEXT NOT NULL,\n  merchant_token TEXT\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE pointsProgram (\n  loyalty_program_id TEXT NOT NULL REFERENCES loyaltyProgram,\n\n  points_earned INTEGER NOT NULL,\n  PRIMARY KEY(loyalty_program_id)\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE pointsReward (\n  loyalty_program_id TEXT NOT NULL REFERENCES loyaltyProgram,\n  points_required INTEGER NOT NULL,\n  display_name TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE starsProgram (\n  loyalty_program_id TEXT NOT NULL REFERENCES loyaltyProgram,\n  stars_earned INTEGER NOT NULL,\n  stars_per_reward INTEGER NOT NULL,\n  display_name TEXT NOT NULL,\n  PRIMARY KEY(loyalty_program_id)\n)", null);
            }
            if (j <= 137 && j2 > 137) {
                androidSqliteDriver.execute(null, "ALTER TABLE starsProgram ADD COLUMN rewards_earned INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 138 && j2 > 138) {
                androidSqliteDriver.execute(null, "ALTER TABLE profile ADD COLUMN profile_token TEXT DEFAULT NULL", null);
            }
            if (j <= 139 && j2 > 139) {
                androidSqliteDriver.execute(null, "DROP TABLE IF EXISTS instrument_linking_config", null);
                androidSqliteDriver.execute(null, "DROP TABLE IF EXISTS instrumentLinkingConfig", null);
                androidSqliteDriver.execute(null, "CREATE TABLE instrumentLinkingConfig (\n  header_no_instrument_linked TEXT DEFAULT NULL,\n  description_no_instrument_linked TEXT DEFAULT NULL,\n  header_bank_account_linked TEXT DEFAULT NULL,\n  description_bank_account_linked TEXT DEFAULT NULL,\n  header_no_instrument_linked_personal TEXT DEFAULT NULL,\n  description_no_instrument_linked_personal TEXT DEFAULT NULL,\n  credit_card_fee_bps INTEGER DEFAULT NULL,\n  credit_card_linking_enabled INTEGER DEFAULT NULL,\n  max_credit_prompts INTEGER DEFAULT NULL,\n  cash_balance_enabled INTEGER DEFAULT NULL,\n  customer_passcode_instrument_token TEXT DEFAULT NULL,\n  issued_cards_enabled INTEGER DEFAULT NULL,\n  bankbook_enabled INTEGER DEFAULT NULL,\n  issued_card_disabled_style TEXT DEFAULT NULL,\n  physical_issued_cards_enabled INTEGER DEFAULT NULL,\n  supported_card_themes BLOB,\n  nfc_card_linking_enabled INTEGER DEFAULT 0\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO instrumentLinkingConfig DEFAULT VALUES", null);
            }
            if (j <= 140 && j2 > 140) {
                androidSqliteDriver.execute(null, "DROP TABLE instrument", null);
                androidSqliteDriver.execute(null, "CREATE TABLE instrument (\n  token TEXT NOT NULL PRIMARY KEY,\n  cash_instrument_type TEXT NOT NULL,\n  card_brand TEXT,\n  suffix TEXT,\n  bank_name TEXT,\n  icon_url TEXT,\n  balance_currency TEXT,\n  balance_amount INTEGER,\n  version INTEGER NOT NULL,\n  profile_id TEXT NOT NULL REFERENCES profile ON DELETE CASCADE,\n  detail_icon_url TEXT,\n  display_name TEXT,\n  wallet_address TEXT\n)", null);
            }
            if (j <= 141 && j2 > 141) {
                androidSqliteDriver.execute(null, "DELETE FROM instrumentLinkingConfig", null);
                androidSqliteDriver.execute(null, "INSERT INTO instrumentLinkingConfig DEFAULT VALUES", null);
            }
            if (j <= 142 && j2 > 142) {
                androidSqliteDriver.execute(null, "CREATE TABLE instrumentLinkingOption (\n  profile_id TEXT NOT NULL REFERENCES profile,\n  instrument_types TEXT NOT NULL,\n  title TEXT,\n  description TEXT\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO instrumentLinkingOption\nSELECT profile_id, instrument_types, title, description\nFROM instrument_linking_option", null);
                androidSqliteDriver.execute(null, "DROP TABLE instrument_linking_option", null);
            }
            if (j <= 143 && j2 > 143) {
                androidSqliteDriver.execute(null, "PRAGMA legacy_alter_table=1", null);
                androidSqliteDriver.execute(null, "CREATE TABLE transferInstrumentMap (\n  source_type TEXT NOT NULL,\n  target_type TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO transferInstrumentMap\nSELECT source_type, target_type\nFROM transfer_instrument_map\nWHERE profile_id = (SELECT current_profile_id FROM device_user)", null);
                androidSqliteDriver.execute(null, "DROP TABLE transfer_instrument_map", null);
                androidSqliteDriver.execute(null, "CREATE TABLE notificationPreference (\n  canonical_text TEXT PRIMARY KEY NOT NULL,\n  enabled INTEGER NOT NULL,\n  type TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO notificationPreference\nSELECT canonical_text, enabled, type\nFROM notification_preference\nWHERE profile_id = (SELECT current_profile_id FROM device_user)", null);
                androidSqliteDriver.execute(null, "DROP TABLE notification_preference", null);
                androidSqliteDriver.execute(null, "CREATE TABLE scenarioPlan (\n  client_scenario TEXT NOT NULL,\n  scenario_plan BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO scenarioPlan\nSELECT client_scenario, scenario_plan\nFROM scenario_plan\nWHERE profile_id = (SELECT current_profile_id FROM device_user)", null);
                androidSqliteDriver.execute(null, "DROP TABLE scenario_plan", null);
                androidSqliteDriver.execute(null, "CREATE TABLE profileAlias (\n  canonical_text TEXT PRIMARY KEY NOT NULL,\n  verified INTEGER NOT NULL,\n  type TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO profileAlias\nSELECT canonical_text, verified, type\nFROM profile_alias\nWHERE profile_id = (SELECT current_profile_id FROM device_user)", null);
                androidSqliteDriver.execute(null, "DROP TABLE profile_alias", null);
                androidSqliteDriver.execute(null, "CREATE TABLE balanceData (\n  cash_balance_home_screen_button_enabled INTEGER NOT NULL,\n  cash_balance_home_screen_button_priority INTEGER NOT NULL,\n  adding_cash_enabled INTEGER NOT NULL,\n  bitcoin_deposit_enabled INTEGER NOT NULL,\n  enable_cryptocurrency_transfer_out_status TEXT NOT NULL,\n  enable_cryptocurrency_transfer_out_button_text TEXT,\n  balance_limit_groups BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO balanceData\nSELECT cash_balance_home_screen_button_enabled, cash_balance_home_screen_button_priority,\n       adding_cash_enabled, bitcoin_deposit_enabled, enable_cryptocurrency_transfer_out_status,\n       enable_cryptocurrency_transfer_out_button_text, balance_limit_groups\nFROM balance_data\nWHERE profile_id = (SELECT current_profile_id FROM device_user)", null);
                androidSqliteDriver.execute(null, "DROP TABLE balance_data", null);
                androidSqliteDriver.execute(null, "CREATE TABLE new_instrumentLinkingOption (\n  instrument_types TEXT NOT NULL,\n  title TEXT,\n  description TEXT\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_instrumentLinkingOption\nSELECT instrument_types, title, description\nFROM instrumentLinkingOption\nWHERE profile_id = (SELECT current_profile_id FROM device_user)", null);
                androidSqliteDriver.execute(null, "DROP TABLE instrumentLinkingOption", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_instrumentLinkingOption RENAME TO instrumentLinkingOption", null);
                androidSqliteDriver.execute(null, "CREATE TABLE new_instrument (\n  token TEXT NOT NULL PRIMARY KEY,\n  cash_instrument_type TEXT NOT NULL,\n  card_brand TEXT,\n  suffix TEXT,\n  bank_name TEXT,\n  icon_url TEXT,\n  balance_currency TEXT,\n  balance_amount INTEGER,\n  version INTEGER NOT NULL,\n  detail_icon_url TEXT,\n  display_name TEXT,\n  wallet_address TEXT\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_instrument\nSELECT token, cash_instrument_type, card_brand, suffix, bank_name, icon_url, balance_currency,\n       balance_amount, version, detail_icon_url, display_name, wallet_address\nFROM instrument\nWHERE profile_id = (SELECT current_profile_id FROM device_user)", null);
                androidSqliteDriver.execute(null, "DROP TABLE instrument", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_instrument RENAME TO instrument", null);
                androidSqliteDriver.execute(null, "CREATE TABLE issuedCard (\n  token TEXT NOT NULL,\n  instrument_type TEXT NOT NULL,\n  last_four TEXT NOT NULL,\n  enabled INTEGER NOT NULL,\n  is_virtual INTEGER NOT NULL,\n  locked_by_passcode INTEGER NOT NULL,\n  cardholder_name TEXT NOT NULL,\n  activated INTEGER NOT NULL,\n  physical_card BLOB\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO issuedCard\nSELECT token, instrument_type, last_four, enabled, is_virtual, locked_by_passcode, cardholder_name,\n       activated, physical_card\nFROM issued_card\nWHERE profile_id = (SELECT current_profile_id FROM device_user)", null);
                androidSqliteDriver.execute(null, "DROP TABLE issued_card", null);
                androidSqliteDriver.execute(null, "CREATE TABLE directDepositAccount (\n  routing_number TEXT NOT NULL,\n  account_number_prefix TEXT NOT NULL,\n  is_placeholder INTEGER NOT NULL,\n  explanation_text TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO directDepositAccount\nSELECT routing_number, account_number_prefix, is_placeholder, explanation_text\nFROM direct_deposit_account\nWHERE profile_id = (SELECT current_profile_id FROM device_user)", null);
                androidSqliteDriver.execute(null, "DROP TABLE direct_deposit_account", null);
                androidSqliteDriver.execute(null, "CREATE TABLE featureFlags (\n  flags BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO featureFlags\nSELECT flags\nFROM feature_flags\nWHERE profile_id = (SELECT current_profile_id FROM device_user)", null);
                androidSqliteDriver.execute(null, "DROP TABLE feature_flags", null);
                androidSqliteDriver.execute(null, "DELETE FROM profile WHERE profile_id != (SELECT current_profile_id FROM device_user)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE deviceUser (\n  user_id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  active_balance_drawer TEXT\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO deviceUser\nSELECT user_id, active_balance_drawer\nFROM device_user", null);
                androidSqliteDriver.execute(null, "DROP TABLE device_user", null);
            }
            if (j <= 144 && j2 > 144) {
                androidSqliteDriver.execute(null, "CREATE TABLE offlineConfig (\n  enabled INTEGER,\n  external_status_url TEXT,\n  attempted_payment_status_result BLOB,\n  offline_payment_status_result BLOB,\n  attempted_bill_status_result BLOB,\n  offline_bill_status_result BLOB,\n  attempted_cash_out_status_result BLOB,\n  offline_cash_out_status_result BLOB,\n  attempted_add_cash_status_result BLOB,\n  offline_add_cash_status_result BLOB,\n  retry_intervals BLOB\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO offlineConfig SELECT offline_config.enabled, offline_config.external_status_url, offline_config.attempted_payment_status_result, offline_config.offline_payment_status_result, offline_config.attempted_bill_status_result, offline_config.offline_bill_status_result, offline_config.attempted_cash_out_status_result, offline_config.offline_cash_out_status_result, offline_config.attempted_add_cash_status_result, offline_config.offline_add_cash_status_result, offline_config.retry_intervals FROM offline_config", null);
                androidSqliteDriver.execute(null, "DROP TABLE offline_config", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeOfflineConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM offlineConfig;\nINSERT INTO offlineConfig(rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 145 && j2 > 145) {
                androidSqliteDriver.execute(null, "DROP TABLE rewards_data", null);
                androidSqliteDriver.execute(null, "DROP TABLE reward_slot", null);
                androidSqliteDriver.execute(null, "DROP TABLE selectable_reward", null);
                androidSqliteDriver.execute(null, "DROP TABLE selected_reward", null);
                androidSqliteDriver.execute(null, "CREATE TABLE rewardsData (\n  show_rewards INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO rewardsData DEFAULT VALUES", null);
                androidSqliteDriver.execute(null, "CREATE TABLE selectedReward (\n  token TEXT NOT NULL PRIMARY KEY,\n  reward_token TEXT NOT NULL REFERENCES reward(token)\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE selectableReward (\n  reward_token TEXT NOT NULL REFERENCES reward(token)\n)", null);
                androidSqliteDriver.execute(null, "CREATE TABLE rewardSlot (\n  token TEXT NOT NULL PRIMARY KEY,\n  state TEXT NOT NULL,\n  selected_reward_token TEXT REFERENCES selectedReward(token)\n)", null);
            }
            if (j <= 146 && j2 > 146) {
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeInstrumentLinkingConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM instrumentLinkingConfig;\nINSERT INTO instrumentLinkingConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeBlockersConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM blockersConfig;\nINSERT INTO blockersConfig(rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 147 && j2 > 147) {
                androidSqliteDriver.execute(null, "ALTER TABLE web_login_config RENAME TO webLoginConfig", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeWebLoginConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM webLoginConfig;\nINSERT INTO webLoginConfig(rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 148 && j2 > 148) {
                androidSqliteDriver.execute(null, "ALTER TABLE support_config RENAME TO supportConfig", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeSupportConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM supportConfig;\nINSERT INTO supportConfig(rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 149 && j2 > 149) {
                androidSqliteDriver.execute(null, "ALTER TABLE balanceData ADD COLUMN scheduled_reload_data BLOB DEFAULT NULL", null);
            }
            if (j <= 150 && j2 > 150) {
                androidSqliteDriver.execute(null, "ALTER TABLE stamps_config RENAME TO stampsConfig", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeStampsConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM stampsConfig;\nINSERT INTO stampsConfig (rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 151 && j2 > 151) {
                androidSqliteDriver.execute(null, "PRAGMA legacy_alter_table=1", null);
                androidSqliteDriver.execute(null, "ALTER TABLE payment_history_config RENAME TO paymentHistoryConfig", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removePaymentHistoryConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM paymentHistoryConfig;\nINSERT INTO paymentHistoryConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "ALTER TABLE bitcoin_transaction_customer_ids RENAME TO bitcoinTransactionCustomerIds", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeBitcoinTransactionCustomerIdsWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM bitcoinTransactionCustomerIds;\nEND", null);
            }
            if (j <= 152 && j2 > 152) {
                androidSqliteDriver.execute(null, "ALTER TABLE cryptocurrency_config RENAME TO cryptocurrencyConfig", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeCryptocurrencyConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM cryptocurrencyConfig;\nINSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 153 && j2 > 153) {
                androidSqliteDriver.execute(null, "ALTER TABLE sharing_config RENAME TO sharingConfig", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeSharingConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM sharingConfig;\nINSERT INTO sharingConfig (rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 154 && j2 > 154) {
                androidSqliteDriver.execute(null, "ALTER TABLE rewardsData ADD COLUMN show_boost_video INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j > 155 || j2 <= 155) {
                str = "CREATE TRIGGER removeWebLoginConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM webLoginConfig;\nINSERT INTO webLoginConfig(rowid) VALUES (NULL);\nEND";
            } else {
                str = "CREATE TRIGGER removeWebLoginConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM webLoginConfig;\nINSERT INTO webLoginConfig(rowid) VALUES (NULL);\nEND";
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeNotificationPreferenceWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM notificationPreference;\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeInstrumentLinkingOptionWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM instrumentLinkingOption;\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeBalanceDataWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM balanceData;\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeProfileAliasWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM profileAlias;\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeScenarioPlanWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM scenarioPlan;\nEND", null);
            }
            if (j > 156 || j2 <= 156) {
                str2 = "CREATE TRIGGER removeNotificationPreferenceWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM notificationPreference;\nEND";
                str3 = "CREATE TRIGGER removeProfileAliasWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM profileAlias;\nEND";
                num = null;
            } else {
                str3 = "CREATE TRIGGER removeProfileAliasWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM profileAlias;\nEND";
                str2 = "CREATE TRIGGER removeNotificationPreferenceWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM notificationPreference;\nEND";
                num = null;
                androidSqliteDriver.execute(null, "CREATE TABLE new_profile (\n  profile_id TEXT NOT NULL PRIMARY KEY,\n  full_name TEXT,\n  photo_url TEXT,\n  require_passcode_confirmation INTEGER NOT NULL,\n  has_passcode INTEGER NOT NULL,\n  nearby_visibility TEXT NOT NULL,\n  cashtag TEXT,\n  cashtag_url TEXT,\n  cashtag_url_display_text TEXT,\n  cashtag_url_enabled INTEGER NOT NULL DEFAULT 0,\n  rate_plan TEXT NOT NULL,\n  can_upgrade_to_business INTEGER NOT NULL DEFAULT 0,\n  is_verified_account INTEGER NOT NULL,\n  app_message_notifications_enabled INTEGER NOT NULL DEFAULT 0,\n  verification_instrument_token TEXT,\n  deposit_preference TEXT,\n  address BLOB,\n  deposit_preference_data BLOB,\n  request_minimum_note_length INTEGER NOT NULL DEFAULT 0,\n  cash_drawer_data BLOB,\n  country_code TEXT,\n  default_currency TEXT NOT NULL,\n  customer_since INTEGER,\n  loyalty_data BLOB,\n  profile_token TEXT DEFAULT NULL\n  -- TODO tax stuff?\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_profile\nSELECT profile.profile_id, profile.full_name, profile.photo_url, profile.require_passcode_confirmation, profile.has_passcode, profile.nearby_visibility, profile.cashtag, profile.cashtag_url, profile.cashtag_url_display_text, profile.cashtag_url_enabled, profile.rate_plan, profile.can_upgrade_to_business, profile.is_verified_account, profile.app_message_notifications_enabled, profile.verification_instrument_token, profile.deposit_preference, profile.address, profile.deposit_preference_data, profile.request_minimum_note_length, profile.cash_drawer_data, profile.country_code, profile.default_currency, profile.customer_since, profile.loyalty_data, profile.profile_token FROM profile", null);
                androidSqliteDriver.execute(null, "DROP TABLE profile", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_profile RENAME TO profile", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeSupportConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM supportConfig;\nINSERT INTO supportConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeWebLoginConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM webLoginConfig;\nINSERT INTO webLoginConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeInstrumentLinkingConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM instrumentLinkingConfig;\nINSERT INTO instrumentLinkingConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeBlockersConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM blockersConfig;\nINSERT INTO blockersConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeOfflineConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM offlineConfig;\nINSERT INTO offlineConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeStampsConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM stampsConfig;\nINSERT INTO stampsConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removePaymentHistoryConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM paymentHistoryConfig;\nINSERT INTO paymentHistoryConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeBitcoinTransactionCustomerIdsWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM bitcoinTransactionCustomerIds;\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeCryptocurrencyConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM cryptocurrencyConfig;\nINSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeSharingConfigWithProfile", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeSharingConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM sharingConfig;\nINSERT INTO sharingConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeBalanceDataWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM balanceData;\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeProfileAliasWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM profileAlias;\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeScenarioPlanWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM scenarioPlan;\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeInstrumentLinkingOptionWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM instrumentLinkingOption;\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER IF NOT EXISTS removeNotificationPreferenceWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM notificationPreference;\nEND", null);
                androidSqliteDriver.execute(null, "DROP VIEW payments_model", null);
                androidSqliteDriver.execute(null, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data, sender.render_data,\n       recipient.render_data, recipient_id, sender_id, captured_at, created_at,\n       their_id, display_date, _id, sender_amount, recipient_amount, paid_out_at, refunded_at,\n       updated_at, is_badged, local_status,\n       datetime(outstanding_until/1000, 'unixepoch') > datetime('now') AS is_outstanding,\n       external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
            }
            if (j <= 157 && j2 > 157) {
                androidSqliteDriver.execute(num, "DROP TABLE IF EXISTS instrument_linking_option", null);
                androidSqliteDriver.execute(num, "DROP TABLE IF EXISTS instrumentLinkingOption", null);
                androidSqliteDriver.execute(num, "CREATE TABLE instrumentLinkingOption (\n  instrument_types TEXT NOT NULL,\n  title TEXT,\n  description TEXT\n)", null);
            }
            if (j <= 158 && j2 > 158) {
                androidSqliteDriver.execute(num, "DELETE FROM profile\nWHERE (SELECT count(*) FROM profile) > 1", null);
            }
            if (j > 159 || j2 <= 159) {
                num2 = null;
            } else {
                num2 = null;
                androidSqliteDriver.execute(null, "CREATE INDEX IF NOT EXISTS activity_index\nON payment(display_date)", null);
                androidSqliteDriver.execute(null, "DROP VIEW recipients", null);
                androidSqliteDriver.execute(null, "CREATE VIEW recipients AS\nSELECT contact.display_name AS contact_display_name, contact.lookup_key, already_invited,\n       has_multiple_customers, customer.customer_id, customer.threaded_customer_id, cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer, coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email, customer_sms AS sms, photo_url, customer_display_name,\n       group_concat(email) AS email_addresses, group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments, coalesce(is_square, 0) AS is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked, merchant_data, customer.accent_color, customer.country_code, customer.category\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, NULL, 0, 0, customer.customer_id, customer.threaded_customer_id, cashtag,\n       is_cash_customer, is_verified, is_business, email, sms, photo_url, customer_display_name,\n       email, sms, can_accept_payments, is_square, coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee, blocked, merchant_data, customer.accent_color, customer.country_code,\n       customer.category\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nWHERE lookup_key IS NULL", null);
            }
            if (j <= 160 && j2 > 160) {
                androidSqliteDriver.execute(num2, "DROP VIEW IF EXISTS cash_activity", null);
                androidSqliteDriver.execute(num2, "CREATE VIEW cash_activity AS\nSELECT *\nFROM payments_model AS payment\nJOIN (\n  SELECT *\n  FROM (\n    SELECT *\n    FROM recipients AS recipient\n    ORDER BY coalesce(contact_display_name, customer_display_name) ASC -- Prefer the contact we pick has a alphabetical display name.\n  )\n  GROUP BY customer_id\n) AS recipient\nON recipient_id = recipient.customer_id\nJOIN (\n  SELECT *\n  FROM (\n    SELECT *\n    FROM recipients AS sender\n    ORDER BY coalesce(contact_display_name, customer_display_name) ASC -- Prefer the contact we pick has a alphabetical display name.\n  )\n  GROUP BY customer_id\n) AS sender\nON sender_id = sender.customer_id\nORDER BY display_date DESC", null);
            }
            if (j <= 161 && j2 > 161) {
                androidSqliteDriver.execute(num2, "ALTER TABLE app_message RENAME TO appMessage", null);
            }
            if (j <= 162 && j2 > 162) {
                androidSqliteDriver.execute(null, "ALTER TABLE invitation_config RENAME TO invitationConfig", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeInvitationConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM invitationConfig;\nINSERT INTO invitationConfig (rowid) VALUES (NULL);\nEND", null);
            }
            if (j > 163 || j2 <= 163) {
                str4 = "DROP VIEW recipients";
            } else {
                str4 = "DROP VIEW recipients";
                androidSqliteDriver.execute(null, "ALTER TABLE institutions_config RENAME TO institutionsConfig", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeInstitutionsConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM institutionsConfig;\nINSERT INTO institutionsConfig (rowid) VALUES (NULL);\nEND", null);
            }
            if (j > 164 || j2 <= 164) {
                str5 = "CREATE TRIGGER removeInstrumentLinkingOptionWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM instrumentLinkingOption;\nEND";
            } else {
                str5 = "CREATE TRIGGER removeInstrumentLinkingOptionWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM instrumentLinkingOption;\nEND";
                androidSqliteDriver.execute(null, "ALTER TABLE recipient_config RENAME TO recipientConfig", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeRecipientConfigWithprofile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM recipientConfig;\nINSERT INTO recipientConfig (rowid) VALUES (NULL);\nEND", null);
            }
            if (j > 165 || j2 <= 165) {
                str6 = "CREATE TRIGGER removeBalanceDataWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM balanceData;\nEND";
                num3 = null;
            } else {
                str6 = "CREATE TRIGGER removeBalanceDataWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM balanceData;\nEND";
                num3 = null;
                androidSqliteDriver.execute(null, "ALTER TABLE rate_plan_config RENAME TO ratePlanConfig", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeRatePlanConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM ratePlanConfig;\nINSERT INTO ratePlanConfig (rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 166 && j2 > 166) {
                androidSqliteDriver.execute(num3, "ALTER TABLE reward_status RENAME TO rewardStatus", null);
            }
            if (j <= 167 && j2 > 167) {
                androidSqliteDriver.execute(num3, "ALTER TABLE pending_payment RENAME TO pendingPayment", null);
                androidSqliteDriver.execute(num3, "ALTER TABLE pending_transfer RENAME TO pendingTransfer", null);
                androidSqliteDriver.execute(num3, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM pendingPayment;\nDELETE FROM pendingTransfer;\nEND", null);
                androidSqliteDriver.execute(num3, "CREATE VIEW completedPendingPayments AS\nSELECT pendingPayment.external_id\nFROM pendingPayment\nINNER JOIN payment\nON pendingPayment.external_id = payment.external_id\nWHERE succeeded = 1", null);
                androidSqliteDriver.execute(num3, "CREATE TRIGGER deleteSuccessfulPayments\nAFTER UPDATE OF succeeded ON pendingPayment\nBEGIN\nDELETE FROM pendingPayment\nWHERE external_id IN completedPendingPayments;\nEND", null);
                androidSqliteDriver.execute(num3, "CREATE VIEW completedPendingTransfers AS\nSELECT pendingTransfer.external_id\nFROM pendingTransfer\nINNER JOIN payment\nON pendingTransfer.external_id = payment.external_id", null);
                androidSqliteDriver.execute(num3, "CREATE TRIGGER deleteSuccessfulTransfers\nAFTER UPDATE OF succeeded ON pendingTransfer\nBEGIN\nDELETE FROM pendingTransfer\nWHERE external_id IN completedPendingTransfers;\nEND", null);
                androidSqliteDriver.execute(num3, "CREATE TRIGGER deleteDuplicatePayments\nAFTER INSERT ON payment\nBEGIN\nDELETE FROM pendingPayment\nWHERE external_id IN completedPendingPayments;\nDELETE FROM pendingTransfer\nWHERE external_id IN completedPendingTransfers;\nEND", null);
            }
            if (j <= 168 && j2 > 168) {
                androidSqliteDriver.execute(num3, "CREATE TABLE supportFlowEvent (\n  _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  node_token TEXT,\n  position INTEGER DEFAULT -1,\n  registered_at INTEGER NOT NULL,\n  type TEXT,\n  action_url TEXT,\n  client_scenario TEXT\n)", null);
                androidSqliteDriver.execute(num3, "CREATE TRIGGER removeSupportFlowEventsWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM supportFlowEvent;\nEND", null);
            }
            if (j <= 169 && j2 > 169) {
                androidSqliteDriver.execute(num3, "CREATE VIEW merchantIds AS\nSELECT customer_id\nFROM customer\nWHERE merchant_data IS NOT NULL", null);
                androidSqliteDriver.execute(num3, "DROP VIEW payments_model", null);
                androidSqliteDriver.execute(num3, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at,\n       their_id, display_date, _id, sender_amount, recipient_amount, paid_out_at, refunded_at,\n       updated_at, is_badged, local_status,\n       datetime(outstanding_until/1000, 'unixepoch') > datetime('now') AS is_outstanding,\n       external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num3, "CREATE VIEW cashActivity AS\nSELECT their_id, is_outstanding, _id, token, payment_render_data, sender_render_data,\n       recipient_render_data, local_status, state, role, amount, is_badged, is_bitcoin,\n       avatar.photo_url, avatar.accent_color, avatar.customer_id, coalesce(avatar.lookup_key, \"\") AS lookup_key,\n       coalesce(contact_display_name, customer_display_name, cashtag, email, sms) AS display_name,\n       avatar.merchant_data, avatar.email, avatar.sms, avatar.threaded_customer_id\nFROM payments_model AS payment\nJOIN recipients AS avatar\nON CASE WHEN (their_id IN bitcoinTransactionCustomerIds OR their_id IN merchantIds)\n        THEN avatar.customer_id = their_id\n        ELSE avatar.customer_id = sender_id\n        END\nORDER BY display_date DESC", null);
            }
            if (j > 170 || j2 <= 170) {
                str7 = "CREATE TRIGGER removeScenarioPlanWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM scenarioPlan;\nEND";
                num4 = null;
            } else {
                str7 = "CREATE TRIGGER removeScenarioPlanWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM scenarioPlan;\nEND";
                num4 = null;
                androidSqliteDriver.execute(null, "CREATE VIEW pending AS\nSELECT pendingPayment.request AS payment_request,\n       NULL AS transfer_request,\n       pendingPayment.created_at,\n       credit_card_fee_bps\nFROM pendingPayment\nLEFT JOIN payment ON pendingPayment.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL\nUNION\nSELECT NULL AS payment_request,\n       pendingTransfer.request AS transfer_request,\n       pendingTransfer.created_at,\n       credit_card_fee_bps\nFROM pendingTransfer\nLEFT JOIN payment ON pendingTransfer.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL", null);
                androidSqliteDriver.execute(null, "DROP VIEW payments_model", null);
                androidSqliteDriver.execute(null, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at,\n       their_id, display_date, _id, sender_amount, recipient_amount, paid_out_at, refunded_at,\n       updated_at, is_badged, local_status,\n       (outstanding_until > strftime('%s', 'now') * 1000) AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(null, "DROP VIEW cashActivity", null);
                androidSqliteDriver.execute(null, "CREATE VIEW cashActivity AS\nSELECT their_id, is_outstanding, _id, token, payment_render_data, sender_render_data,\n       recipient_render_data, local_status, state, role, amount, is_badged, is_bitcoin,\n       avatar.photo_url, avatar.accent_color, avatar.customer_id, avatar.lookup_key,\n       coalesce(contact_display_name, customer_display_name, cashtag, email, sms) AS display_name,\n       avatar.merchant_data, avatar.email, avatar.sms, avatar.threaded_customer_id\nFROM payments_model AS payment\nJOIN recipients AS avatar\nON avatar.customer_id = their_id\nORDER BY display_date DESC", null);
            }
            if (j <= 171 && j2 > 171) {
                androidSqliteDriver.execute(num4, "CREATE VIEW activityCustomer AS\nSELECT photo_url, accent_color, payments_model.their_id AS customer_id, is_business = 1 AS is_business,\n       coalesce(contact_display_name, customer_display_name, cashtag, email, sms, '') AS display_name,\n       merchant_data, lookup_key, email, sms, threaded_customer_id, blocked\nFROM payments_model\nJOIN recipients ON their_id = customer_id\nWHERE threaded_customer_id IS NULL\nAND merchant_data IS NULL\nGROUP BY coalesce(threaded_customer_id, customer_id)\nHAVING display_date = max(display_date)\nORDER BY display_date DESC", null);
            }
            if (j <= 172 && j2 > 172) {
                androidSqliteDriver.execute(num4, "DROP VIEW cashActivity", null);
                androidSqliteDriver.execute(num4, "CREATE VIEW cashActivity AS\nSELECT their_id, is_outstanding, _id, token, payment_render_data, sender_render_data,\n       recipient_render_data, local_status, state, role, amount, is_badged, is_bitcoin,\n       avatar.photo_url, avatar.accent_color, avatar.lookup_key,\n       coalesce(contact_display_name, customer_display_name, cashtag, email, sms) AS display_name,\n       avatar.merchant_data, avatar.email, avatar.sms, avatar.threaded_customer_id, display_date\nFROM payments_model AS payment\nJOIN recipients AS avatar\nON avatar.customer_id = their_id\nORDER BY display_date DESC", null);
            }
            if (j <= 173 && j2 > 173) {
                androidSqliteDriver.execute(num4, "DROP VIEW pending", null);
                androidSqliteDriver.execute(num4, "CREATE VIEW pending AS\nSELECT pendingPayment.external_id,\n       pendingPayment.request AS payment_request,\n       NULL AS transfer_request,\n       pendingPayment.created_at,\n       credit_card_fee_bps\nFROM pendingPayment\nLEFT JOIN payment ON pendingPayment.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL\nUNION\nSELECT pendingTransfer.external_id,\n       NULL AS payment_request,\n       pendingTransfer.request AS transfer_request,\n       pendingTransfer.created_at,\n       credit_card_fee_bps\nFROM pendingTransfer\nLEFT JOIN payment ON pendingTransfer.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL", null);
            }
            if (j <= 174 && j2 > 174) {
                androidSqliteDriver.execute(num4, "CREATE VIEW paymentsModel AS\nSELECT token, amount, their_id, role, orientation,\n       payment.render_data AS payment_render_data, sender.render_data AS sender_render_data,\n       recipient.render_data AS recipient_render_data\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nWHERE payment.render_data IS NOT NULL\nAND sender.render_data IS NOT NULL\nAND recipient.render_data IS NOT NULL", null);
            }
            if (j <= 175 && j2 > 175) {
                androidSqliteDriver.execute(num4, "DROP VIEW IF EXISTS cash_activity", null);
            }
            if (j <= 176 && j2 > 176) {
                androidSqliteDriver.execute(num4, "ALTER TABLE invitationConfig ADD COLUMN preview_message_by_country BLOB DEFAULT NULL", null);
            }
            if (j <= 177 && j2 > 177) {
                androidSqliteDriver.execute(num4, "CREATE VIEW contactActivity AS\nSELECT their_id, is_outstanding, _id, token, payment_render_data, sender_render_data,\n       recipient_render_data, local_status, state, role, amount, is_badged, is_bitcoin,\n       avatar.photo_url, avatar.accent_color, avatar.lookup_key,\n       coalesce(contact_display_name, customer_display_name, cashtag, email, sms) AS display_name,\n       avatar.merchant_data, avatar.email, avatar.sms, avatar.threaded_customer_id, display_date\nFROM payments_model AS payment\nJOIN recipients AS avatar\nON CASE WHEN (their_id IN bitcoinTransactionCustomerIds OR their_id IN merchantIds)\n        THEN avatar.customer_id = their_id\n        ELSE avatar.customer_id = sender_id\n        END\nGROUP BY token, avatar.customer_id\nORDER BY is_outstanding DESC, display_date DESC", null);
            }
            if (j <= 178 && j2 > 178) {
                androidSqliteDriver.execute(num4, "ALTER TABLE balanceData ADD COLUMN scheduled_reload_enabled INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 179 && j2 > 179) {
                androidSqliteDriver.execute(num4, "DROP TABLE starsProgram", null);
            }
            if (j <= 180 && j2 > 180) {
                androidSqliteDriver.execute(num4, "CREATE TABLE loyaltyAccount (\n  account_id TEXT PRIMARY KEY,\n  merchant_id TEXT NOT NULL,\n  customer_phone_number TEXT NOT NULL,\n  points_earned INTEGER NOT NULL DEFAULT 0,\n  last_time_visited INTEGER NOT NULL DEFAULT 0\n)", null);
            }
            if (j <= 181 && j2 > 181) {
                androidSqliteDriver.execute(num4, "DROP VIEW paymentsModel", null);
            }
            if (j <= 182 && j2 > 182) {
                androidSqliteDriver.execute(num4, "DROP VIEW contactActivity", null);
            }
            if (j > 183 || j2 <= 183) {
                str8 = "CREATE TRIGGER removeInvitationConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM invitationConfig;\nINSERT INTO invitationConfig (rowid) VALUES (NULL);\nEND";
                num5 = null;
            } else {
                str8 = "CREATE TRIGGER removeInvitationConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM invitationConfig;\nINSERT INTO invitationConfig (rowid) VALUES (NULL);\nEND";
                num5 = null;
                androidSqliteDriver.execute(null, "ALTER TABLE entity_config ADD COLUMN attempted_sync INTEGER NOT NULL DEFAULT 0", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER signOut", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM pendingPayment;\nDELETE FROM pendingTransfer;\nDELETE FROM entity_config;\nINSERT INTO entity_config (rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 184 && j2 > 184) {
                androidSqliteDriver.execute(num5, "DROP TABLE loyaltyCustomer", null);
                androidSqliteDriver.execute(num5, "DROP TABLE loyaltyProgram", null);
                androidSqliteDriver.execute(num5, "DROP TABLE pointsProgram", null);
                androidSqliteDriver.execute(num5, "DROP TABLE pointsReward", null);
            }
            if (j > 185 || j2 <= 185) {
                str9 = "CREATE TRIGGER removeOfflineConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM offlineConfig;\nINSERT INTO offlineConfig(rowid) VALUES (NULL);\nEND";
                num6 = null;
            } else {
                num6 = null;
                androidSqliteDriver.execute(null, "DROP VIEW cashActivity", null);
                str9 = "CREATE TRIGGER removeOfflineConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM offlineConfig;\nINSERT INTO offlineConfig(rowid) VALUES (NULL);\nEND";
                androidSqliteDriver.execute(null, "CREATE VIEW cashActivity AS\nSELECT their_id, is_outstanding, _id, token, payment_render_data, sender_render_data,\n       recipient_render_data, local_status, state, role, amount, is_badged, is_bitcoin,\n       avatar.photo_url, avatar.accent_color, avatar.lookup_key,\n       coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n       avatar.merchant_data, avatar.email, avatar.sms, avatar.threaded_customer_id, display_date\nFROM payments_model AS payment\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY token, avatar.customer_id\nORDER BY display_date DESC", null);
                androidSqliteDriver.execute(null, "DROP VIEW activityCustomer", null);
                androidSqliteDriver.execute(null, "CREATE VIEW activityCustomer AS\nSELECT photo_url, accent_color, payments_model.their_id AS customer_id, is_business = 1 AS is_business,\n       coalesce(display_name, customer_display_name, cashtag, email, sms, '') AS display_name,\n       merchant_data, contact.lookup_key, email, sms, threaded_customer_id, blocked\nFROM payments_model\nJOIN customer ON their_id = customer_id\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nWHERE threaded_customer_id IS NULL\nAND merchant_data IS NULL\nGROUP BY coalesce(threaded_customer_id, customer.customer_id)\nHAVING display_date = max(display_date)\nORDER BY display_date DESC", null);
            }
            if (j <= 186 && j2 > 186) {
                androidSqliteDriver.execute(num6, "ALTER TABLE rewardsData ADD COLUMN defer_reward_selection INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 187 && j2 > 187) {
                androidSqliteDriver.execute(num6, "PRAGMA legacy_alter_table=1", null);
                androidSqliteDriver.execute(num6, "CREATE TABLE new_balanceData (\n  cash_balance_home_screen_button_enabled INTEGER NOT NULL,\n  cash_balance_home_screen_button_priority INTEGER NOT NULL,\n  adding_cash_enabled INTEGER NOT NULL,\n  enable_cryptocurrency_transfer_out_status TEXT NOT NULL,\n  enable_cryptocurrency_transfer_out_button_text TEXT,\n  balance_limit_groups BLOB NOT NULL,\n  scheduled_reload_data BLOB DEFAULT NULL,\n  scheduled_reload_enabled INTEGER NOT NULL DEFAULT 0,\n  enable_cryptocurrency_transfer_in_status TEXT NOT NULL,\n  enable_cryptocurrency_transfer_in_button_text TEXT\n)", null);
                androidSqliteDriver.execute(num6, "INSERT INTO new_balanceData\nSELECT cash_balance_home_screen_button_enabled, cash_balance_home_screen_button_priority,\n       adding_cash_enabled, enable_cryptocurrency_transfer_out_status,\n       enable_cryptocurrency_transfer_out_button_text, balance_limit_groups, scheduled_reload_data,\n       scheduled_reload_enabled, 'DEPOSITS_DISALLOWED', NULL\nFROM balanceData", null);
                androidSqliteDriver.execute(num6, "DROP TABLE balanceData", null);
                androidSqliteDriver.execute(num6, "ALTER TABLE new_balanceData RENAME TO balanceData", null);
            }
            if (j <= 188 && j2 > 188) {
                androidSqliteDriver.execute(num6, "DROP VIEW activityCustomer", null);
                androidSqliteDriver.execute(num6, "CREATE VIEW activityCustomer AS\n\nSELECT photo_url, accent_color, payments_model.their_id AS customer_id, is_business = 1 AS is_business,\n       coalesce(display_name, customer_display_name, cashtag, email, sms, '') AS display_name,\n       merchant_data, contact.lookup_key, email, sms, threaded_customer_id, blocked, display_date, 0 = 1 AS is_loyalty\nFROM payments_model\nJOIN customer ON their_id = customer_id\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nWHERE threaded_customer_id IS NULL\nAND merchant_data IS NULL\nGROUP BY coalesce(threaded_customer_id, customer.customer_id)\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, NULL, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name,\n       merchant_data, NULL, NULL, NULL, threaded_customer_id, blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty\nFROM loyaltyAccount\nJOIN customer ON merchant_id = customer_id\n\nORDER BY display_date DESC", null);
            }
            if (j > 189 || j2 <= 189) {
                str10 = "CREATE TRIGGER removePaymentHistoryConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM paymentHistoryConfig;\nINSERT INTO paymentHistoryConfig(rowid) VALUES (NULL);\nEND";
                num7 = null;
            } else {
                str10 = "CREATE TRIGGER removePaymentHistoryConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM paymentHistoryConfig;\nINSERT INTO paymentHistoryConfig(rowid) VALUES (NULL);\nEND";
                num7 = null;
                androidSqliteDriver.execute(null, "CREATE TABLE cashDrawerConfig (\n  get_card_video_url TEXT DEFAULT NULL,\n  get_card_image_url TEXT DEFAULT NULL,\n  get_card_width INTEGER DEFAULT NULL,\n  get_card_height INTEGER DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO cashDrawerConfig DEFAULT VALUES", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeCashDrawerConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM cashDrawerConfig;\nINSERT INTO cashDrawerConfig (rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 190 && j2 > 190) {
                androidSqliteDriver.execute(num7, "ALTER TABLE loyaltyAccount ADD COLUMN account_status_url TEXT", null);
            }
            if (j <= 191 && j2 > 191) {
                androidSqliteDriver.execute(num7, "ALTER TABLE pendingPayment ADD COLUMN recipients INTEGER NOT NULL DEFAULT 1", null);
                androidSqliteDriver.execute(num7, "DROP VIEW pending", null);
                androidSqliteDriver.execute(num7, "CREATE VIEW pending AS\nSELECT pendingPayment.external_id,\n       pendingPayment.request AS payment_request,\n       NULL AS transfer_request,\n       pendingPayment.created_at,\n       credit_card_fee_bps,\n       recipients\nFROM pendingPayment\nLEFT JOIN payment ON pendingPayment.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL\nUNION\nSELECT pendingTransfer.external_id,\n       NULL AS payment_request,\n       pendingTransfer.request AS transfer_request,\n       pendingTransfer.created_at,\n       credit_card_fee_bps,\n       1 AS recipients\nFROM pendingTransfer\nLEFT JOIN payment ON pendingTransfer.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL", null);
            }
            if (j <= 192 && j2 > 192) {
                androidSqliteDriver.execute(num7, "CREATE VIEW activityRecipient AS\nSELECT contact.display_name AS contact_display_name, contact.lookup_key, already_invited,\n       has_multiple_customers, customer.customer_id, customer.threaded_customer_id, cashtag,\n       is_cash_customer, is_verified, is_business, email, sms, photo_url, customer_display_name,\n       group_concat(email) AS email_addresses, group_concat(sms) AS sms_numbers,\n       can_accept_payments, is_square, coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee, blocked, merchant_data, customer.accent_color, customer.country_code,\n       customer.category\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nGROUP BY customer.customer_id", null);
            }
            if (j <= 193 && j2 > 193) {
                androidSqliteDriver.execute(num7, "CREATE TABLE new_payment (\n  _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  token TEXT NOT NULL UNIQUE,\n  orientation TEXT NOT NULL,\n  role TEXT,\n  sender_id TEXT NOT NULL,\n  recipient_id TEXT NOT NULL,\n  state TEXT,\n  amount BLOB,\n  sender_amount BLOB,\n  recipient_amount BLOB,\n  created_at INTEGER NOT NULL DEFAULT 0,\n  updated_at INTEGER NOT NULL DEFAULT 0,\n  captured_at INTEGER NOT NULL DEFAULT 0,\n  refunded_at INTEGER NOT NULL DEFAULT 0,\n  paid_out_at INTEGER NOT NULL DEFAULT 0,\n  display_date INTEGER NOT NULL DEFAULT 0,\n  is_badged INTEGER NOT NULL DEFAULT 0,\n  render_data TEXT,\n  their_id TEXT NOT NULL,\n  outstanding_until INTEGER,\n  external_id TEXT\n)", null);
                androidSqliteDriver.execute(num7, "INSERT INTO new_payment\nSELECT _id, token, orientation, role, sender_id, recipient_id, state, amount, sender_amount,\n       recipient_amount, created_at, updated_at, captured_at, refunded_at, paid_out_at, display_date,\n       is_badged, render_data, their_id, outstanding_until, external_id\nFROM payment", null);
                androidSqliteDriver.execute(num7, "DROP TABLE payment", null);
                androidSqliteDriver.execute(num7, "ALTER TABLE new_payment RENAME TO payment", null);
                androidSqliteDriver.execute(num7, "CREATE TRIGGER IF NOT EXISTS deleteDuplicatePayments\nAFTER INSERT ON payment\nBEGIN\nDELETE FROM pendingPayment\nWHERE external_id IN completedPendingPayments;\nDELETE FROM pendingTransfer\nWHERE external_id IN completedPendingTransfers;\nEND", null);
                androidSqliteDriver.execute(num7, "CREATE INDEX IF NOT EXISTS activity_index\nON payment(display_date)", null);
                androidSqliteDriver.execute(num7, "DROP VIEW payments_model", null);
                androidSqliteDriver.execute(num7, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at,\n       their_id, display_date, _id, sender_amount, recipient_amount, paid_out_at, refunded_at,\n       updated_at, is_badged,\n       (outstanding_until > strftime('%s', 'now') * 1000) AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num7, "DROP VIEW cashActivity", null);
                androidSqliteDriver.execute(num7, "CREATE VIEW cashActivity AS\nSELECT their_id, is_outstanding, _id, token, payment_render_data, sender_render_data,\n       recipient_render_data, state, role, amount, is_badged, is_bitcoin,\n       avatar.photo_url, avatar.accent_color, avatar.lookup_key,\n       coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n       avatar.merchant_data, avatar.email, avatar.sms, avatar.threaded_customer_id, display_date\nFROM payments_model AS payment\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j <= 194 && j2 > 194) {
                androidSqliteDriver.execute(num7, "CREATE TABLE boostConfig (\n  selection_screen_title TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num7, "INSERT INTO boostConfig DEFAULT VALUES", null);
                androidSqliteDriver.execute(num7, "CREATE TRIGGER removeBoostConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM boostConfig;\nINSERT INTO boostConfig(rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 195 && j2 > 195) {
                androidSqliteDriver.execute(num7, "ALTER TABLE reward ADD COLUMN program_detail_rows BLOB", null);
            }
            if (j <= 196 && j2 > 196) {
                androidSqliteDriver.execute(num7, "ALTER TABLE rewardsData ADD COLUMN new_to_boost INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 197 && j2 > 197) {
                androidSqliteDriver.execute(num7, "ALTER TABLE reward ADD COLUMN footer_text TEXT", null);
            }
            if (j <= 198 && j2 > 198) {
                androidSqliteDriver.execute(num7, "DROP TABLE featureFlags", null);
                androidSqliteDriver.execute(num7, "CREATE TABLE featureFlags (\n  name TEXT NOT NULL PRIMARY KEY,\n  flag BLOB NOT NULL,\n  local INTEGER NOT NULL\n)", null);
            }
            if (j <= 199 && j2 > 199) {
                androidSqliteDriver.execute(num7, "ALTER TABLE instrumentLinkingConfig ADD COLUMN bank_account_oauth_config BLOB", null);
            }
            if (j <= 200 && j2 > 200) {
                androidSqliteDriver.execute(num7, "ALTER TABLE instrumentLinkingOption ADD COLUMN fee_bps INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 201 && j2 > 201) {
                androidSqliteDriver.execute(num7, "ALTER TABLE payment ADD COLUMN boost_amount BLOB", null);
                androidSqliteDriver.execute(num7, "DROP VIEW payments_model", null);
                androidSqliteDriver.execute(num7, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at, their_id, display_date, _id, sender_amount,\n       recipient_amount, boost_amount, paid_out_at, refunded_at, updated_at, is_badged,\n       (outstanding_until > strftime('%s', 'now') * 1000) AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
            }
            if (j <= 202 && j2 > 202) {
                androidSqliteDriver.execute(num7, "ALTER TABLE instrumentLinkingOption ADD COLUMN show_in_instrument_selector INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 203 && j2 > 203) {
                androidSqliteDriver.execute(num7, "CREATE TABLE new_reward (\n  token TEXT NOT NULL PRIMARY KEY,\n  category TEXT,\n  avatars BLOB,\n  title TEXT,\n  main_text TEXT,\n  program_detail_rows BLOB,\n  footer_text TEXT\n)", null);
                androidSqliteDriver.execute(num7, "INSERT INTO new_reward\nSELECT token, category, avatars, title, main_text, program_detail_rows, footer_text\nFROM reward", null);
                androidSqliteDriver.execute(num7, "DROP TABLE reward", null);
                androidSqliteDriver.execute(num7, "ALTER TABLE new_reward RENAME TO reward", null);
            }
            if (j <= 204 && j2 > 204) {
                androidSqliteDriver.execute(num7, "ALTER TABLE reward ADD COLUMN reward_state TEXT NOT NULL DEFAULT 'UNLOCKED'", null);
                androidSqliteDriver.execute(num7, "ALTER TABLE reward ADD COLUMN fallback_progress_text TEXT", null);
            }
            if (j <= 205 && j2 > 205) {
                androidSqliteDriver.execute(num7, "DROP VIEW payments_model", null);
                androidSqliteDriver.execute(num7, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at, their_id, display_date, _id, sender_amount,\n       recipient_amount, boost_amount, paid_out_at, refunded_at, updated_at, is_badged,\n       coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num7, "DROP VIEW cashActivity", null);
                androidSqliteDriver.execute(num7, "CREATE VIEW cashActivity AS\nSELECT their_id, is_outstanding, _id, token, payment_render_data, sender_render_data,\n       recipient_render_data, state, role, amount, is_badged, is_bitcoin,\n       avatar.photo_url, avatar.accent_color, avatar.lookup_key,\n       coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n       avatar.merchant_data, avatar.email, avatar.sms, avatar.threaded_customer_id, display_date\nFROM payments_model AS payment\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j <= 206 && j2 > 206) {
                androidSqliteDriver.execute(num7, "DROP TABLE IF EXISTS rewardSelection", null);
                androidSqliteDriver.execute(num7, "DROP VIEW IF EXISTS rewardWithSelection", null);
                androidSqliteDriver.execute(num7, "CREATE TABLE rewardSelection (\n  token TEXT NOT NULL PRIMARY KEY,\n  reward_token TEXT NOT NULL REFERENCES reward(token),\n  version INTEGER NOT NULL,\n  reward_selection BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(num7, "CREATE VIEW rewardWithSelection AS\nSELECT reward.*, rewardSelection.reward_selection\nFROM reward\nLEFT JOIN rewardSelection ON reward.token = rewardSelection.reward_token", null);
                androidSqliteDriver.execute(num7, "DROP VIEW payments_model", null);
                androidSqliteDriver.execute(num7, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at, their_id, display_date, _id, sender_amount,\n       recipient_amount, boost_amount, paid_out_at, refunded_at, updated_at, is_badged,\n       coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num7, "DROP VIEW cashActivity", null);
                androidSqliteDriver.execute(num7, "CREATE VIEW cashActivity AS\nSELECT their_id, is_outstanding, _id, token, payment_render_data, sender_render_data,\n       recipient_render_data, state, role, amount, is_badged, is_bitcoin,\n       avatar.photo_url, avatar.accent_color, avatar.lookup_key,\n       coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n       avatar.merchant_data, avatar.email, avatar.sms, avatar.threaded_customer_id, display_date\nFROM payments_model AS payment\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j > 207 || j2 <= 207) {
                str11 = "DROP VIEW cashActivity";
                num8 = null;
            } else {
                str11 = "DROP VIEW cashActivity";
                num8 = null;
                androidSqliteDriver.execute(null, "CREATE TABLE reactionConfig (\n  maxEmojisPerReaction INTEGER NOT NULL DEFAULT 0,\n  extendedReactions BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO reactionConfig DEFAULT VALUES", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeReactionConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM reactionConfig;\nINSERT INTO reactionConfig(rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 208 && j2 > 208) {
                androidSqliteDriver.execute(num8, "ALTER TABLE instrumentLinkingConfig ADD COLUMN yodlee_enabled INTEGER DEFAULT NULL", null);
            }
            if (j <= 209 && j2 > 209) {
                androidSqliteDriver.execute(num8, "DROP VIEW activityCustomer", null);
                androidSqliteDriver.execute(num8, "CREATE VIEW activityCustomer AS\n\nSELECT photo_url, accent_color, payments_model.their_id AS customer_id, is_business = 1 AS is_business,\n       coalesce(display_name, customer_display_name, cashtag, email, sms, '') AS display_name,\n       merchant_data, contact.lookup_key, email, sms, threaded_customer_id, blocked, display_date, 0 = 1 AS is_loyalty,\n       can_accept_payments\nFROM payments_model\nJOIN customer ON their_id = customer_id\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nWHERE threaded_customer_id IS NULL\nAND merchant_data IS NULL\nGROUP BY coalesce(threaded_customer_id, customer.customer_id)\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name,\n       merchant_data, NULL, NULL, NULL, threaded_customer_id, blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty,\n       can_accept_payments\nFROM loyaltyAccount\nJOIN customer ON merchant_id = customer_id\n\nORDER BY display_date DESC", null);
            }
            if (j <= 210 && j2 > 210) {
                androidSqliteDriver.execute(num8, "CREATE TABLE EquityAccount (\n  account_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  profile_id TEXT NOT NULL REFERENCES profile\n)", null);
                androidSqliteDriver.execute(num8, "CREATE TABLE Trade (\n  trade_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  symbol TEXT NOT NULL,\n  equity_account INTEGER NOT NULL REFERENCES EquityAccount,\n  amount_usd BLOB NOT NULL,\n  amount_long INTEGER NOT NULL,\n  shares REAL NOT NULL,\n  trade_time INTEGER NOT NULL\n)", null);
                androidSqliteDriver.execute(num8, "CREATE TABLE Stock (\n  symbol TEXT NOT NULL PRIMARY KEY,\n  name TEXT NOT NULL,\n  market_cap INTEGER NOT NULL,\n  last_close INTEGER NOT NULL\n)", null);
            }
            if (j <= 211 && j2 > 211) {
                androidSqliteDriver.execute(num8, "CREATE INDEX byName ON Stock(name)", null);
                androidSqliteDriver.execute(num8, "CREATE INDEX bySymbol ON Stock(symbol)", null);
            }
            if (j > 212 || j2 <= 212) {
                str12 = "DROP VIEW payments_model";
            } else {
                str12 = "DROP VIEW payments_model";
                androidSqliteDriver.execute(null, "CREATE TABLE locationConfig (\n  interval INTEGER DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO locationConfig DEFAULT VALUES", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeLocationConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM locationConfig;\nINSERT INTO locationConfig (rowid) VALUES (NULL);\nEND", null);
            }
            if (j > 213 || j2 <= 213) {
                str13 = "CREATE TRIGGER removeRatePlanConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM ratePlanConfig;\nINSERT INTO ratePlanConfig (rowid) VALUES (NULL);\nEND";
                str14 = "CREATE TRIGGER removeReactionConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM reactionConfig;\nINSERT INTO reactionConfig(rowid) VALUES (NULL);\nEND";
                num9 = null;
            } else {
                str13 = "CREATE TRIGGER removeRatePlanConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM ratePlanConfig;\nINSERT INTO ratePlanConfig (rowid) VALUES (NULL);\nEND";
                num9 = null;
                androidSqliteDriver.execute(null, "PRAGMA foreign_keys=off", null);
                androidSqliteDriver.execute(null, "BEGIN TRANSACTION", null);
                str14 = "CREATE TRIGGER removeReactionConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM reactionConfig;\nINSERT INTO reactionConfig(rowid) VALUES (NULL);\nEND";
                androidSqliteDriver.execute(null, "DROP TRIGGER removeSupportConfigWithProfile", null);
                androidSqliteDriver.execute(null, "ALTER TABLE supportConfig RENAME TO supportConfig_old", null);
                androidSqliteDriver.execute(null, "CREATE TABLE supportConfig (\n  help_center_url TEXT DEFAULT NULL,\n  contact_support_url TEXT DEFAULT NULL,\n  privacy_policy_url TEXT DEFAULT NULL,\n  trouble_scanning_url TEXT DEFAULT NULL,\n  terms_of_service_url TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO supportConfig(help_center_url, contact_support_url, privacy_policy_url,\n    trouble_scanning_url, terms_of_service_url)\nSELECT help_center_url, contact_support_url, privacy_policy_url, trouble_scanning_url,\n    terms_of_service_url\nFROM supportConfig_old", null);
                androidSqliteDriver.execute(null, "DROP TABLE supportConfig_old", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeSupportConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM supportConfig;\nINSERT INTO supportConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "COMMIT", null);
                androidSqliteDriver.execute(null, "PRAGMA foreign_keys=true", null);
            }
            if (j <= 214 && j2 > 214) {
                androidSqliteDriver.execute(num9, "ALTER TABLE profile ADD COLUMN incoming_request_policy TEXT DEFAULT NULL", null);
            }
            if (j <= 215 && j2 > 215) {
                androidSqliteDriver.execute(num9, "CREATE TABLE loyaltyProgram(\n  program_id TEXT PRIMARY KEY,\n  cash_merchant_token TEXT NOT NULL,\n  reward_tiers BLOB NOT NULL,\n  loyalty_unit BLOB NOT NULL\n)", null);
            }
            if (j <= 216 && j2 > 216) {
                androidSqliteDriver.execute(num9, "DROP TABLE IF EXISTS loyaltyAccount", null);
                androidSqliteDriver.execute(num9, "CREATE TABLE loyaltyAccount (\n  account_id TEXT PRIMARY KEY,\n  merchant_id TEXT NOT NULL,\n  customer_phone_number TEXT NOT NULL,\n  points_earned INTEGER NOT NULL DEFAULT 0,\n  last_time_visited INTEGER NOT NULL DEFAULT 0,\n  account_status_url TEXT,\n  loyalty_program_id TEXT NOT NULL\n)", null);
            }
            if (j > 217 || j2 <= 217) {
                str15 = "PRAGMA foreign_keys=true";
                num10 = null;
            } else {
                str15 = "PRAGMA foreign_keys=true";
                num10 = null;
                androidSqliteDriver.execute(null, "DROP TABLE IF EXISTS loyaltyAccount", null);
                androidSqliteDriver.execute(null, "CREATE TABLE loyaltyAccount (\n  account_id TEXT PRIMARY KEY,\n  customer_phone_number TEXT NOT NULL,\n  points_earned INTEGER NOT NULL DEFAULT 0,\n  last_time_visited INTEGER NOT NULL DEFAULT 0,\n  account_status_url TEXT,\n  loyalty_program_id TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "CREATE VIEW loyaltyMerchant AS\nSELECT *\nFROM loyaltyAccount\nJOIN loyaltyProgram ON loyalty_program_id = program_id", null);
                androidSqliteDriver.execute(null, "DROP VIEW IF EXISTS activityCustomer", null);
                androidSqliteDriver.execute(null, "CREATE VIEW activityCustomer AS\n\nSELECT photo_url, accent_color, payments_model.their_id AS customer_id, is_business = 1 AS is_business,\n       coalesce(display_name, customer_display_name, cashtag, email, sms, '') AS display_name,\n       merchant_data, contact.lookup_key, email, sms, threaded_customer_id, blocked, display_date, 0 = 1 AS is_loyalty,\n       can_accept_payments\nFROM payments_model\nJOIN customer ON their_id = customer_id\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nWHERE threaded_customer_id IS NULL\nAND merchant_data IS NULL\nGROUP BY coalesce(threaded_customer_id, customer.customer_id)\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name,\n       merchant_data, NULL, NULL, NULL, threaded_customer_id, blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty,\n       can_accept_payments\nFROM loyaltyMerchant\nJOIN customer ON cash_merchant_token = customer_id\n\nORDER BY display_date DESC", null);
            }
            if (j <= 218 && j2 > 218) {
                androidSqliteDriver.execute(num10, "DROP VIEW IF EXISTS activityCustomer", null);
                androidSqliteDriver.execute(num10, "CREATE VIEW customerRelation AS\nSELECT CASE\n WHEN threaded_customer_id IS NULL THEN customer_id\n ELSE threaded_customer_id\nEND AS parent_id, customer_id AS child_id\nFROM customer", null);
                androidSqliteDriver.execute(num10, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked, display_date,\n       0 = 1 AS is_loyalty, parent.can_accept_payments\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name,\n       merchant_data, NULL, NULL, NULL, blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty,\n       can_accept_payments\nFROM loyaltyMerchant\nJOIN customer ON cash_merchant_token = customer_id\n\nORDER BY display_date DESC", null);
            }
            if (j <= 219 && j2 > 219) {
                androidSqliteDriver.execute(num10, "DROP VIEW IF EXISTS activityCustomer", null);
                androidSqliteDriver.execute(num10, "DROP VIEW IF EXISTS loyaltyMerchant", null);
                androidSqliteDriver.execute(num10, "CREATE VIEW loyaltyMerchant AS\nSELECT customer_id, threaded_customer_id, photo_url, account_status_url, accent_color,\n       coalesce(customer_display_name, '') AS display_name, customer_phone_number, merchant_data,\n       is_business, blocked, max(last_time_visited, coalesce(display_date, 0)) AS display_date,\n       can_accept_payments, points_earned, reward_tiers, loyalty_unit\nFROM loyaltyAccount\nJOIN loyaltyProgram ON loyalty_program_id = program_id\nJOIN customer ON cash_merchant_token = customer_id\nLEFT JOIN payments_model ON cash_merchant_token = recipient_id\nAND display_date = (\n  SELECT max(display_date)\n  FROM payments_model\n  WHERE recipient_id = cash_merchant_token\n)", null);
                androidSqliteDriver.execute(num10, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked, display_date,\n       0 = 1 AS is_loyalty, parent.can_accept_payments\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nWHERE parent.customer_id NOT IN (SELECT customer_id FROM loyaltyMerchant)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       display_name, merchant_data, NULL, NULL, NULL, blocked, display_date, 1 = 1 AS is_loyalty,\n       can_accept_payments\nFROM loyaltyMerchant\n\nORDER BY display_date DESC", null);
            }
            if (j <= 220 && j2 > 220) {
                androidSqliteDriver.execute(num10, "DROP VIEW IF EXISTS activityCustomer", null);
                androidSqliteDriver.execute(num10, "DROP VIEW IF EXISTS loyaltyMerchant", null);
                androidSqliteDriver.execute(num10, "DROP TABLE IF EXISTS loyaltyProgram", null);
                androidSqliteDriver.execute(num10, "CREATE TABLE loyaltyProgram(\n  program_id TEXT PRIMARY KEY,\n  cash_merchant_token TEXT NOT NULL,\n  program_rewards BLOB NOT NULL,\n  loyalty_unit BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(num10, "CREATE VIEW loyaltyMerchant AS\nSELECT customer_id, threaded_customer_id, photo_url, account_status_url, accent_color,\n       coalesce(customer_display_name, '') AS display_name, customer_phone_number, merchant_data,\n       is_business, blocked, max(last_time_visited, coalesce(display_date, 0)) AS display_date,\n       can_accept_payments, points_earned, program_rewards, loyalty_unit\nFROM loyaltyAccount\nJOIN loyaltyProgram ON loyalty_program_id = program_id\nJOIN customer ON cash_merchant_token = customer_id\nLEFT JOIN payments_model ON cash_merchant_token = recipient_id\nAND display_date = (\n  SELECT max(display_date)\n  FROM payments_model\n  WHERE recipient_id = cash_merchant_token\n)", null);
                androidSqliteDriver.execute(num10, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked, display_date,\n       0 = 1 AS is_loyalty, parent.can_accept_payments\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nWHERE parent.customer_id NOT IN (SELECT customer_id FROM loyaltyMerchant)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       display_name, merchant_data, NULL, NULL, NULL, blocked, display_date, 1 = 1 AS is_loyalty,\n       can_accept_payments\nFROM loyaltyMerchant\n\nORDER BY display_date DESC", null);
            }
            if (j <= 221 && j2 > 221) {
                androidSqliteDriver.execute(num10, "DROP TABLE deviceUser", null);
            }
            if (j <= 222 && j2 > 222) {
                androidSqliteDriver.execute(num10, "DROP VIEW IF EXISTS activityCustomer", null);
                androidSqliteDriver.execute(num10, "DROP VIEW IF EXISTS loyaltyMerchant", null);
                androidSqliteDriver.execute(num10, "CREATE VIEW loyaltyMerchant AS\nSELECT cash_merchant_token, account_status_url, customer_phone_number, last_time_visited,\n       points_earned, program_rewards, loyalty_unit\nFROM loyaltyAccount\nJOIN loyaltyProgram ON loyalty_program_id = program_id", null);
                androidSqliteDriver.execute(num10, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyMerchant ON (parent.customer_id = cash_merchant_token)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments\nFROM loyaltyMerchant\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (SELECT their_id FROM payments_model)\n\nORDER BY display_date DESC", null);
            }
            if (j <= 223 && j2 > 223) {
                androidSqliteDriver.execute(num10, "ALTER TABLE profile ADD COLUMN has_passed_idv INTEGER DEFAULT NULL", null);
            }
            if (j <= 224 && j2 > 224) {
                androidSqliteDriver.execute(num10, "CREATE VIRTUAL TABLE IF NOT EXISTS entity_fts USING fts4 (\n  tokenize=simple X \"$ *&#%\\'\"\"\\/(){}\\[]|=+-_,:;<>-?!\\t\\r\\n\",\n  text_content TEXT\n)", null);
                androidSqliteDriver.execute(num10, "CREATE TABLE IF NOT EXISTS entity_lookup (\n  fts_docid INTEGER PRIMARY KEY,\n  entity_id TEXT NOT NULL,\n  customer_id TEXT,\n  entity_type INTEGER NOT NULL\n)", null);
                androidSqliteDriver.execute(num10, "CREATE INDEX IF NOT EXISTS customer_id_index ON entity_lookup (customer_id)", null);
            }
            if (j <= 225 && j2 > 225) {
                androidSqliteDriver.execute(num10, "DROP TABLE IF EXISTS instrumentLinkingConfig", null);
                androidSqliteDriver.execute(num10, "CREATE TABLE instrumentLinkingConfig (\n  header_no_instrument_linked TEXT DEFAULT NULL,\n  description_no_instrument_linked TEXT DEFAULT NULL,\n  header_bank_account_linked TEXT DEFAULT NULL,\n  description_bank_account_linked TEXT DEFAULT NULL,\n  header_no_instrument_linked_personal TEXT DEFAULT NULL,\n  description_no_instrument_linked_personal TEXT DEFAULT NULL,\n  credit_card_fee_bps INTEGER DEFAULT NULL,\n  credit_card_linking_enabled INTEGER DEFAULT NULL,\n  max_credit_prompts INTEGER DEFAULT NULL,\n  cash_balance_enabled INTEGER DEFAULT NULL,\n  customer_passcode_instrument_token TEXT DEFAULT NULL,\n  issued_cards_enabled INTEGER DEFAULT NULL,\n  bankbook_enabled INTEGER DEFAULT NULL,\n  issued_card_disabled_style TEXT DEFAULT NULL,\n  physical_issued_cards_enabled INTEGER DEFAULT NULL,\n  supported_card_themes BLOB,\n  nfc_card_linking_enabled INTEGER DEFAULT 0,\n  bank_account_linking_config BLOB\n)", null);
                androidSqliteDriver.execute(num10, "INSERT INTO instrumentLinkingConfig DEFAULT VALUES", null);
            }
            if (j > 226 || j2 <= 226) {
                str16 = "BEGIN TRANSACTION";
                str17 = "DROP VIEW IF EXISTS activityCustomer";
                str18 = str3;
                num11 = null;
                str19 = "CREATE TRIGGER removeRecipientConfigWithprofile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM recipientConfig;\nINSERT INTO recipientConfig (rowid) VALUES (NULL);\nEND";
                str20 = str15;
            } else {
                str17 = "DROP VIEW IF EXISTS activityCustomer";
                num11 = null;
                androidSqliteDriver.execute(null, "PRAGMA foreign_keys=off", null);
                androidSqliteDriver.execute(null, "BEGIN TRANSACTION", null);
                str16 = "BEGIN TRANSACTION";
                androidSqliteDriver.execute(null, "DROP TRIGGER removeInstrumentLinkingConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeInstitutionsConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeCryptocurrencyConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeCashDrawerConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeBlockersConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeSupportConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeStampsConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeSharingConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeRecipientConfigWithprofile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeReactionConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeRatePlanConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removePaymentHistoryConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeOfflineConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeInvitationConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeWebLoginConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeBoostConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeBitcoinTransactionCustomerIdsWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeLocationConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeBalanceDataWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeInstrumentLinkingOptionWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeNotificationPreferenceWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeProfileAliasWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeScenarioPlanWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER removeSupportFlowEventsWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER signOut", null);
                androidSqliteDriver.execute(null, "ALTER TABLE profile RENAME TO profile_old", null);
                androidSqliteDriver.execute(null, "CREATE TABLE profile (\n  profile_id TEXT NOT NULL PRIMARY KEY,\n  full_name TEXT,\n  photo_url TEXT,\n  require_passcode_confirmation INTEGER NOT NULL,\n  has_passcode INTEGER NOT NULL,\n  nearby_visibility TEXT NOT NULL,\n  cashtag TEXT,\n  cashtag_url TEXT,\n  cashtag_url_display_text TEXT,\n  cashtag_url_enabled INTEGER NOT NULL DEFAULT 0,\n  rate_plan TEXT NOT NULL,\n  can_upgrade_to_business INTEGER NOT NULL DEFAULT 0,\n  is_verified_account INTEGER NOT NULL,\n  app_message_notifications_enabled INTEGER NOT NULL DEFAULT 0,\n  verification_instrument_token TEXT,\n  deposit_preference TEXT,\n  address BLOB,\n  deposit_preference_data BLOB,\n  request_minimum_note_length INTEGER NOT NULL DEFAULT 0,\n  cash_drawer_data BLOB,\n  country_code TEXT,\n  default_currency TEXT NOT NULL,\n  customer_since INTEGER,\n  profile_token TEXT DEFAULT NULL,\n  incoming_request_policy TEXT DEFAULT NULL,\n  has_passed_idv INTEGER DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO profile(profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n    nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n    rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n    verification_instrument_token, deposit_preference, address, deposit_preference_data,\n    request_minimum_note_length, cash_drawer_data, country_code, default_currency, customer_since,\n    profile_token, incoming_request_policy, has_passed_idv)\nSELECT profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n    nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n    rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n    verification_instrument_token, deposit_preference, address, deposit_preference_data,\n    request_minimum_note_length, cash_drawer_data, country_code, default_currency, customer_since,\n    profile_token, incoming_request_policy, has_passed_idv\nFROM profile_old", null);
                androidSqliteDriver.execute(null, "DROP TABLE profile_old", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeInstrumentLinkingConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM instrumentLinkingConfig;\nINSERT INTO instrumentLinkingConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeInstitutionsConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM institutionsConfig;\nINSERT INTO institutionsConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeCryptocurrencyConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM cryptocurrencyConfig;\nINSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeCashDrawerConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM cashDrawerConfig;\nINSERT INTO cashDrawerConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeBlockersConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM blockersConfig;\nINSERT INTO blockersConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeSupportConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM supportConfig;\nINSERT INTO supportConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeStampsConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM stampsConfig;\nINSERT INTO stampsConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeSharingConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM sharingConfig;\nINSERT INTO sharingConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeRecipientConfigWithprofile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM recipientConfig;\nINSERT INTO recipientConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, str14, null);
                androidSqliteDriver.execute(null, str13, null);
                androidSqliteDriver.execute(null, str10, null);
                androidSqliteDriver.execute(null, str9, null);
                androidSqliteDriver.execute(null, str8, null);
                androidSqliteDriver.execute(null, str, null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeBoostConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM boostConfig;\nINSERT INTO boostConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeBitcoinTransactionCustomerIdsWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM bitcoinTransactionCustomerIds;\nEND", null);
                androidSqliteDriver.execute(null, str7, null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeLocationConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM locationConfig;\nINSERT INTO locationConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, str6, null);
                androidSqliteDriver.execute(null, str5, null);
                androidSqliteDriver.execute(null, str2, null);
                str18 = str3;
                androidSqliteDriver.execute(null, str18, null);
                str19 = "CREATE TRIGGER removeRecipientConfigWithprofile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM recipientConfig;\nINSERT INTO recipientConfig (rowid) VALUES (NULL);\nEND";
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeSupportFlowEventsWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM supportFlowEvent;\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM pendingPayment;\nDELETE FROM pendingTransfer;\nDELETE FROM entity_config;\nINSERT INTO entity_config (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "COMMIT", null);
                str20 = str15;
                androidSqliteDriver.execute(null, str20, null);
            }
            if (j > 227 || j2 <= 227) {
                str21 = "CREATE TRIGGER removeSharingConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM sharingConfig;\nINSERT INTO sharingConfig (rowid) VALUES (NULL);\nEND";
                str22 = str16;
                str23 = "CREATE TRIGGER removeStampsConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM stampsConfig;\nINSERT INTO stampsConfig (rowid) VALUES (NULL);\nEND";
                str24 = str17;
                str25 = "CREATE TRIGGER removeSupportConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM supportConfig;\nINSERT INTO supportConfig(rowid) VALUES (NULL);\nEND";
            } else {
                androidSqliteDriver.execute(num11, "PRAGMA foreign_keys=off", null);
                str21 = "CREATE TRIGGER removeSharingConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM sharingConfig;\nINSERT INTO sharingConfig (rowid) VALUES (NULL);\nEND";
                str22 = str16;
                androidSqliteDriver.execute(num11, str22, null);
                str23 = "CREATE TRIGGER removeStampsConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM stampsConfig;\nINSERT INTO stampsConfig (rowid) VALUES (NULL);\nEND";
                str24 = str17;
                androidSqliteDriver.execute(num11, str24, null);
                str25 = "CREATE TRIGGER removeSupportConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM supportConfig;\nINSERT INTO supportConfig(rowid) VALUES (NULL);\nEND";
                androidSqliteDriver.execute(num11, "DROP VIEW IF EXISTS loyaltyMerchant", null);
                androidSqliteDriver.execute(num11, "CREATE VIEW loyaltyData AS\nSELECT cash_merchant_token, account_status_url, customer_phone_number, last_time_visited,\n       points_earned, program_rewards, loyalty_unit\nFROM loyaltyAccount\nJOIN loyaltyProgram ON loyalty_program_id = program_id", null);
                androidSqliteDriver.execute(num11, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyData ON (parent.customer_id = cash_merchant_token)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (SELECT their_id FROM payments_model)\n\nORDER BY display_date DESC", null);
                androidSqliteDriver.execute(num11, "COMMIT", null);
                androidSqliteDriver.execute(num11, str20, null);
            }
            if (j <= 228 && j2 > 228) {
                androidSqliteDriver.execute(num11, "CREATE TABLE investing_data(\n  get_investments_cursor TEXT\n)", null);
                androidSqliteDriver.execute(num11, "INSERT INTO investing_data (get_investments_cursor)\nVALUES (NULL)", null);
                androidSqliteDriver.execute(num11, "CREATE TABLE investment_entity(\n  token TEXT NOT NULL PRIMARY KEY,\n  symbol TEXT NOT NULL,\n  type TEXT NOT NULL,\n  display_name TEXT NOT NULL,\n  icon_url TEXT,\n  outstanding_shares INTEGER,\n  color TEXT,\n  status TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num11, "CREATE TABLE investing_discovery (\n  category TEXT NOT NULL,\n  investment_entity_token TEXT NOT NULL REFERENCES investment_entity,\n  rank INTEGER,\n  PRIMARY KEY (category, investment_entity_token)\n)", null);
            }
            if (j <= 229 && j2 > 229) {
                androidSqliteDriver.execute(num11, "DROP TABLE investing_data", null);
                androidSqliteDriver.execute(num11, "CREATE TABLE investing_data (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  old_token TEXT DEFAULT NULL,\n  new_token TEXT DEFAULT NULL,\n  sync_token TEXT DEFAULT NULL,\n  attempted_sync INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num11, "INSERT INTO investing_data DEFAULT VALUES", null);
            }
            if (j <= 230 && j2 > 230) {
                androidSqliteDriver.execute(num11, "DROP VIEW rewardWithSelection", null);
                androidSqliteDriver.execute(num11, "DROP TABLE rewardSelection", null);
                androidSqliteDriver.execute(num11, "CREATE TABLE rewardSelection (\n  token TEXT NOT NULL PRIMARY KEY,\n  reward_token TEXT NOT NULL,\n  version INTEGER NOT NULL,\n  reward_selection BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(num11, "CREATE VIEW rewardWithSelection AS\nSELECT reward.*, rewardSelection.reward_selection\nFROM reward\nLEFT JOIN rewardSelection ON reward.token = rewardSelection.reward_token", null);
            }
            if (j <= 231 && j2 > 231) {
                androidSqliteDriver.execute(num11, "ALTER TABLE profile ADD COLUMN cashtag_qr_image_url TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(num11, "ALTER TABLE profile ADD COLUMN cashtag_with_currency_symbol TEXT DEFAULT NULL", null);
            }
            if (j <= 232 && j2 > 232) {
                androidSqliteDriver.execute(num11, "ALTER TABLE profile ADD COLUMN available_p2p_target_regions BLOB DEFAULT NULL", null);
            }
            if (j <= 233 && j2 > 233) {
                androidSqliteDriver.execute(num11, "CREATE TABLE investment_holding(\n  token TEXT NOT NULL PRIMARY KEY,\n  units TEXT NOT NULL,\n  invested_amount BLOB,\n  state TEXT NOT NULL\n)", null);
            }
            if (j <= 234 && j2 > 234) {
                androidSqliteDriver.execute(num11, "CREATE VIRTUAL TABLE investing_search USING fts4(\n  content TEXT\n)", null);
                androidSqliteDriver.execute(num11, "CREATE TRIGGER investment_entity_search_insertion\nAFTER INSERT ON investment_entity\nBEGIN\n  INSERT OR REPLACE INTO investing_search (docid, content)\n  VALUES (new.rowid, new.symbol || ' ' || new.display_name);\nEND", null);
                androidSqliteDriver.execute(num11, "CREATE TRIGGER investment_entity_search_deletion\nAFTER DELETE ON investment_entity\nBEGIN\n  DELETE FROM investing_search\n  WHERE docid = old.rowid;\nEND", null);
            }
            if (j <= 235 && j2 > 235) {
                androidSqliteDriver.execute(num11, "DROP TABLE investment_entity", null);
                androidSqliteDriver.execute(num11, "CREATE TABLE investment_entity(\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  token TEXT NOT NULL UNIQUE,\n  symbol TEXT NOT NULL,\n  type TEXT NOT NULL,\n  display_name TEXT NOT NULL,\n  icon_url TEXT,\n  outstanding_shares INTEGER,\n  color TEXT,\n  status TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num11, "CREATE INDEX investment_entity_token_index ON investment_entity(token)", null);
                androidSqliteDriver.execute(num11, "DROP TABLE investing_discovery", null);
                androidSqliteDriver.execute(num11, "CREATE TABLE investing_discovery (\n  category TEXT NOT NULL,\n  category_index INTEGER NOT NULL,\n  investment_entity_token TEXT NOT NULL REFERENCES investment_entity,\n  rank INTEGER,\n  PRIMARY KEY (category, investment_entity_token)\n)", null);
                androidSqliteDriver.execute(num11, "CREATE TRIGGER IF NOT EXISTS investment_entity_search_insertion\nAFTER INSERT ON investment_entity\nBEGIN\n  INSERT OR REPLACE INTO investing_search (docid, content)\n  VALUES (new.rowid, new.symbol || ' ' || new.display_name);\nEND", null);
                androidSqliteDriver.execute(num11, "CREATE TRIGGER IF NOT EXISTS investment_entity_search_deletion\nAFTER DELETE ON investment_entity\nBEGIN\n  DELETE FROM investing_search\n  WHERE docid = old.rowid;\nEND", null);
            }
            if (j <= 236 && j2 > 236) {
                androidSqliteDriver.execute(num11, "DROP VIEW activityCustomer", null);
                androidSqliteDriver.execute(num11, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyData ON (parent.customer_id = cash_merchant_token)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (\n  SELECT parent_id\n  FROM customerRelation\n  WHERE child_id IN (SELECT their_id FROM payments_model)\n)\n\nORDER BY display_date DESC", null);
            }
            if (j <= 237 && j2 > 237) {
                androidSqliteDriver.execute(num11, "DROP INDEX byName", null);
                androidSqliteDriver.execute(num11, "DROP INDEX bySymbol", null);
                androidSqliteDriver.execute(num11, "DROP TABLE EquityAccount", null);
                androidSqliteDriver.execute(num11, "DROP TABLE Stock", null);
                androidSqliteDriver.execute(num11, "DROP TABLE Trade", null);
            }
            if (j <= 238 && j2 > 238) {
                androidSqliteDriver.execute(num11, str22, null);
                androidSqliteDriver.execute(num11, "CREATE TABLE supportConfig_backup (\n  contact_support_url TEXT DEFAULT NULL,\n  privacy_policy_url TEXT DEFAULT NULL,\n  terms_of_service_url TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num11, "INSERT INTO supportConfig_backup\nSELECT contact_support_url, privacy_policy_url, terms_of_service_url\nFROM supportConfig", null);
                androidSqliteDriver.execute(num11, "DROP TABLE supportConfig", null);
                androidSqliteDriver.execute(num11, "ALTER TABLE supportConfig_backup RENAME TO supportConfig", null);
                androidSqliteDriver.execute(num11, "COMMIT", null);
            }
            if (j <= 239 && j2 > 239) {
                androidSqliteDriver.execute(num11, "ALTER TABLE profile ADD COLUMN printable_cashtag_qr_image_url TEXT DEFAULT NULL", null);
            }
            if (j <= 240 && j2 > 240) {
                androidSqliteDriver.execute(num11, "ALTER TABLE instrument ADD COLUMN pending_verification INTEGER DEFAULT NULL", null);
            }
            if (j <= 241 && j2 > 241) {
                androidSqliteDriver.execute(num11, "CREATE TABLE itemizedReceipt (\n  token TEXT NOT NULL PRIMARY KEY,\n  transaction_token TEXT NOT NULL,\n  render_json TEXT NOT NULL\n)", null);
            }
            if (j <= 242 && j2 > 242) {
                androidSqliteDriver.execute(num11, "CREATE TABLE scheduled_payment(\n  _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  token TEXT NOT NULL UNIQUE,\n  state TEXT NOT NULL,\n  initiator_customer_token TEXT,\n  getter_customer_tokens BLOB DEFAULT NULL,\n  orientation TEXT NOT NULL,\n  amount BLOB NOT NULL,\n  note TEXT,\n  schedule BLOB,\n  next_payment_at INTEGER,\n  schedule_display_label TEXT\n)", null);
            }
            if (j <= 243 && j2 > 243) {
                androidSqliteDriver.execute(num11, "DROP TABLE investment_holding", null);
                androidSqliteDriver.execute(num11, "CREATE TABLE investment_holding(\n  token TEXT NOT NULL PRIMARY KEY,\n  units TEXT NOT NULL,\n  invested_amount INTEGER NOT NULL,\n  currency TEXT,\n  state TEXT NOT NULL\n)", null);
            }
            if (j <= 244 && j2 > 244) {
                androidSqliteDriver.execute(num11, "DROP TRIGGER signOut", null);
                androidSqliteDriver.execute(num11, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n\n  -- Clear investing tables\n  DELETE FROM investing_data;\n  INSERT INTO investing_data (rowid) VALUES (NULL);\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\nEND", null);
            }
            if (j > 245 || j2 <= 245) {
                str26 = str11;
                str27 = str20;
            } else {
                androidSqliteDriver.execute(num11, "ALTER TABLE payment ADD COLUMN scheduled_for INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num11, "ALTER TABLE payment ADD COLUMN scheduled_payment_token TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(num11, str12, null);
                androidSqliteDriver.execute(num11, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at, their_id, display_date, _id, sender_amount,\n       recipient_amount, boost_amount, paid_out_at, refunded_at, updated_at, is_badged,\n       coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n       coalesce(length(scheduled_payment_token), 0) > 0 AS is_scheduled, scheduled_for, scheduled_payment_token\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                str26 = str11;
                androidSqliteDriver.execute(num11, str26, null);
                str27 = str20;
                androidSqliteDriver.execute(num11, "CREATE VIEW cashActivity AS\nSELECT their_id, is_outstanding, _id, token, payment_render_data, sender_render_data,\n       recipient_render_data, state, role, amount, is_badged, is_bitcoin, is_scheduled,\n       scheduled_for, scheduled_payment_token, avatar.photo_url, avatar.accent_color,\n       avatar.lookup_key, coalesce(display_name, customer_display_name, cashtag, email, sms)\n       AS display_name, avatar.merchant_data, avatar.email, avatar.sms,avatar.threaded_customer_id,\n       display_date\nFROM payments_model AS payment\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j <= 246 && j2 > 246) {
                androidSqliteDriver.execute(num11, "ALTER TABLE customer ADD COLUMN investment_entity_token TEXT DEFAULT NULL", null);
            }
            if (j <= 247 && j2 > 247) {
                androidSqliteDriver.execute(num11, str26, null);
                androidSqliteDriver.execute(num11, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  state,\n  role,\n  amount,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo_url,\n  avatar.accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j <= 248 && j2 > 248) {
                androidSqliteDriver.execute(num11, "DROP TABLE investing_discovery", null);
                androidSqliteDriver.execute(num11, "CREATE TABLE investing_discovery (\n  category TEXT NOT NULL,\n  category_index INTEGER NOT NULL,\n  investment_entity_token TEXT NOT NULL REFERENCES investment_entity,\n  PRIMARY KEY (category, investment_entity_token)\n)", null);
            }
            if (j <= 249 && j2 > 249) {
                androidSqliteDriver.execute(num11, str22, null);
                androidSqliteDriver.execute(num11, "CREATE TABLE rewardsData_backup (\n  show_rewards INTEGER NOT NULL DEFAULT 0,\n  show_boost_video INTEGER NOT NULL DEFAULT 0,\n  new_to_boost INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num11, "INSERT INTO rewardsData_backup\nSELECT show_rewards, show_boost_video, new_to_boost\nFROM rewardsData", null);
                androidSqliteDriver.execute(num11, "DROP TABLE rewardsData", null);
                androidSqliteDriver.execute(num11, "ALTER TABLE rewardsData_backup RENAME TO rewardsData", null);
                androidSqliteDriver.execute(num11, "COMMIT", null);
            }
            if (j <= 250 && j2 > 250) {
                androidSqliteDriver.execute(num11, "ALTER TABLE customer ADD COLUMN region TEXT", null);
            }
            if (j > 251 || j2 <= 251) {
                str28 = str26;
                num12 = null;
            } else {
                num12 = null;
                androidSqliteDriver.execute(null, "DROP VIEW IF EXISTS activityRecipient", null);
                str28 = str26;
                androidSqliteDriver.execute(null, "CREATE VIEW activityRecipient AS\n\nSELECT contact.display_name AS contact_display_name, contact.lookup_key, already_invited,\n       has_multiple_customers, customer.customer_id, customer.threaded_customer_id, cashtag,\n       is_cash_customer, is_verified, is_business, email, sms, photo_url, customer_display_name,\n       group_concat(email) AS email_addresses, group_concat(sms) AS sms_numbers,\n       can_accept_payments, is_square, coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee, blocked, merchant_data, customer.accent_color, customer.region,\n       customer.category\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\n\nGROUP BY customer.customer_id", null);
            }
            if (j <= 252 && j2 > 252) {
                androidSqliteDriver.execute(num12, "DROP VIEW IF EXISTS recipients", null);
                androidSqliteDriver.execute(num12, "CREATE VIEW recipients AS\n\nSELECT contact.display_name AS contact_display_name, contact.lookup_key, already_invited,\n       has_multiple_customers, customer.customer_id, customer.threaded_customer_id, cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer, coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email, customer_sms AS sms, photo_url, customer_display_name,\n       group_concat(email) AS email_addresses, group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments, coalesce(is_square, 0) AS is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked, merchant_data, customer.accent_color, customer.region, customer.category\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, NULL, 0, 0, customer.customer_id, customer.threaded_customer_id, cashtag,\n       is_cash_customer, is_verified, is_business, email, sms, photo_url, customer_display_name,\n       email, sms, can_accept_payments, is_square, coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee, blocked, merchant_data, customer.accent_color, customer.region,\n       customer.category\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nWHERE lookup_key IS NULL", null);
            }
            if (j <= 253 && j2 > 253) {
                androidSqliteDriver.execute(num12, str22, null);
                androidSqliteDriver.execute(num12, "CREATE TABLE customer_backup (\n  customer_id TEXT PRIMARY KEY,\n  photo_url TEXT,\n  cashtag TEXT,\n  customer_display_name TEXT,\n  can_accept_payments INTEGER NOT NULL DEFAULT 0,\n  is_square INTEGER NOT NULL DEFAULT 0,\n  is_cash_customer INTEGER NOT NULL DEFAULT 0,\n  is_business INTEGER NOT NULL DEFAULT 0,\n  is_verified INTEGER NOT NULL DEFAULT 0,\n  credit_card_fee INTEGER,\n  render_data TEXT,\n  blocked TEXT NOT NULL,\n  threaded_customer_id TEXT,\n  merchant_data BLOB,\n  accent_color TEXT,\n  category TEXT,\n  investment_entity_token TEXT DEFAULT NULL,\n  region TEXT\n)", null);
                androidSqliteDriver.execute(num12, "INSERT INTO customer_backup\nSELECT customer_id, photo_url, cashtag, customer_display_name, can_accept_payments, is_square,\n  is_cash_customer, is_business, is_verified, credit_card_fee, render_data, blocked,\n  threaded_customer_id, merchant_data, accent_color, category, investment_entity_token, region\nFROM customer", null);
                androidSqliteDriver.execute(num12, "DROP TABLE customer", null);
                androidSqliteDriver.execute(num12, "ALTER TABLE customer_backup RENAME TO customer", null);
                androidSqliteDriver.execute(num12, "COMMIT", null);
            }
            if (j <= 254 && j2 > 254) {
                androidSqliteDriver.execute(num12, "ALTER TABLE profile ADD COLUMN region TEXT", null);
            }
            if (j <= 255 && j2 > 255) {
                androidSqliteDriver.execute(num12, "DROP TABLE itemizedReceipt", null);
                androidSqliteDriver.execute(num12, "CREATE TABLE itemizedReceipt (\n  token TEXT NOT NULL PRIMARY KEY,\n  transaction_token TEXT UNIQUE NOT NULL,\n  render_json TEXT NOT NULL\n)", null);
            }
            if (j <= 256 && j2 > 256) {
                androidSqliteDriver.execute(num12, "ALTER TABLE instrument ADD COLUMN selection_icon_url TEXT", null);
            }
            if (j <= 257 && j2 > 257) {
                androidSqliteDriver.execute(num12, "DROP TRIGGER removeInstrumentLinkingConfigWithProfile", null);
            }
            if (j <= 258 && j2 > 258) {
                androidSqliteDriver.execute(num12, "CREATE TABLE cardDesign (\n  white_signature BLOB,\n  black_signature BLOB,\n  touch_data BLOB,\n  card_theme TEXT NOT NULL,\n  cashtag_enabled INTEGER NOT NULL\n)", null);
            }
            if (j <= 259 && j2 > 259) {
                androidSqliteDriver.execute(num12, "DROP TRIGGER signOut", null);
                androidSqliteDriver.execute(num12, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n\n  -- Clear investing tables\n  DELETE FROM investing_data;\n  INSERT INTO investing_data (rowid) VALUES (NULL);\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\nEND", null);
            }
            if (j <= 260 && j2 > 260) {
                androidSqliteDriver.execute(num12, "ALTER TABLE instrument ADD COLUMN sync_entity_id TEXT", null);
            }
            if (j <= 261 && j2 > 261) {
                androidSqliteDriver.execute(num12, "CREATE TABLE entity_range (\n\trange BLOB\n)", null);
            }
            if (j > 262 || j2 <= 262) {
                str29 = "COMMIT";
                num13 = null;
            } else {
                num13 = null;
                androidSqliteDriver.execute(null, "DROP TABLE cardDesign", null);
                str29 = "COMMIT";
                androidSqliteDriver.execute(null, "CREATE TABLE cardDesign (\n  white_signature BLOB,\n  black_signature BLOB,\n  encoded_signature TEXT,\n  stamps BLOB NOT NULL,\n  card_theme TEXT NOT NULL,\n  cashtag_enabled INTEGER NOT NULL\n)", null);
            }
            if (j <= 263 && j2 > 263) {
                androidSqliteDriver.execute(num13, "CREATE TABLE sync_entity (\n  entity_id TEXT NOT NULL,\n  type TEXT NOT NULL,\n  entity BLOB NOT NULL,\n  PRIMARY KEY (entity_id, type)\n)", null);
            }
            if (j <= 264 && j2 > 264) {
                androidSqliteDriver.execute(num13, "CREATE TABLE creditLine(\n  token TEXT NOT NULL PRIMARY KEY,\n  credit_limit BLOB NOT NULL,\n  available_amount BLOB,\n  outstanding_amount BLOB\n)", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE loan(\n  token TEXT NOT NULL PRIMARY KEY,\n  credit_line_token TEXT NOT NULL,\n  borrowed_amount BLOB,\n  setup_fee_amount BLOB,\n  outstanding_amount BLOB,\n  borrowed_at INTEGER NOT NULL\n)", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE loanTransaction(\n  token TEXT NOT NULL PRIMARY KEY,\n  type TEXT NOT NULL,\n  loan_token TEXT NOT NULL,\n  loan_payment BLOB\n)", null);
            }
            if (j <= 265 && j2 > 265) {
                androidSqliteDriver.execute(num13, "ALTER TABLE investing_discovery ADD COLUMN category_description TEXT", null);
            }
            if (j <= 266 && j2 > 266) {
                androidSqliteDriver.execute(num13, "DROP VIEW rewardWithSelection", null);
                androidSqliteDriver.execute(num13, "CREATE VIEW rewardWithSelection AS\nSELECT reward.*, rewardSelection.reward_selection\nFROM reward\nLEFT JOIN rewardSelection ON reward.token = rewardSelection.reward_token\nGROUP BY reward.token", null);
            }
            if (j <= 267 && j2 > 267) {
                androidSqliteDriver.execute(num13, "DROP TABLE cardDesign", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE cardDesign (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  white_signature BLOB,\n  black_signature BLOB,\n  encoded_signature TEXT,\n  stamps BLOB DEFAULT NULL,\n  card_theme TEXT NOT NULL DEFAULT 'BLACK',\n  cashtag_enabled INTEGER NOT NULL DEFAULT 0\n)", null);
            }
            if (j <= 268 && j2 > 268) {
                androidSqliteDriver.execute(num13, "DROP TABLE IF EXISTS creditLine", null);
                androidSqliteDriver.execute(num13, "DROP TABLE IF EXISTS loan", null);
                androidSqliteDriver.execute(num13, "DROP TABLE IF EXISTS loanTransaction", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE creditLine(\n  token TEXT NOT NULL PRIMARY KEY,\n  credit_limit BLOB NOT NULL,\n  available_amount BLOB,\n  outstanding_amount BLOB,\n  setup_fee_bps INTEGER NOT NULL\n)", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE loan(\n  token TEXT NOT NULL PRIMARY KEY,\n  credit_line_token TEXT NOT NULL,\n  borrowed_at INTEGER NOT NULL,\n  principal_amount BLOB NOT NULL,\n  setup_fee_amount BLOB,\n  outstanding_amount BLOB,\n  late_fee_amount BLOB,\n  interest_amount BLOB,\n  setup_fee_bps INTEGER NOT NULL\n)", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE loanTransaction(\n  token TEXT NOT NULL PRIMARY KEY,\n  type TEXT NOT NULL,\n  credit_line_token TEXT NOT NULL,\n  loan_token TEXT NOT NULL,\n  date INTEGER,\n  loan_payment BLOB,\n  loan_drawdown BLOB,\n  loan_charge BLOB\n)", null);
            }
            if (j <= 269 && j2 > 269) {
                androidSqliteDriver.execute(num13, "ALTER TABLE profile ADD COLUMN direct_deposit_account_enabled INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 270 && j2 > 270) {
                androidSqliteDriver.execute(num13, "CREATE TABLE investing_settings (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 0,\n  purchase_limit BLOB,\n  sell_limit BLOB,\n  equities_discovery_url TEXT,\n  bitcoin_discovery_url TEXT,\n  disclosures_web_url TEXT,\n  my_watchlist_description TEXT\n)", null);
            }
            if (j <= 271 && j2 > 271) {
                androidSqliteDriver.execute(num13, "DROP TABLE IF EXISTS investing_settings", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE investing_settings (\n  purchase_limit BLOB,\n  sell_limit BLOB,\n  equities_discovery_url TEXT,\n  bitcoin_discovery_url TEXT,\n  disclosures_web_url TEXT,\n  my_watchlist_description TEXT\n)", null);
            }
            if (j <= 272 && j2 > 272) {
                androidSqliteDriver.execute(num13, "CREATE VIEW ownedHoldings AS\nSELECT *\nFROM investment_holding\nJOIN investment_entity USING (token)\nWHERE invested_amount <> 0\nORDER BY invested_amount DESC", null);
            }
            if (j <= 273 && j2 > 273) {
                androidSqliteDriver.execute(num13, "DROP TRIGGER removeSupportFlowEventsWithProfile", null);
                androidSqliteDriver.execute(num13, "DROP TRIGGER signOut", null);
                androidSqliteDriver.execute(num13, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n  DELETE FROM supportFlowEvent;\n\n  -- Clear investing tables\n  DELETE FROM investing_data;\n  INSERT INTO investing_data (rowid) VALUES (NULL);\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\nEND", null);
            }
            if (j <= 274 && j2 > 274) {
                androidSqliteDriver.execute(num13, "DROP TABLE IF EXISTS transferInstrumentMap", null);
            }
            if (j <= 275 && j2 > 275) {
                androidSqliteDriver.execute(num13, "ALTER TABLE entity_range RENAME TO entity_range_old", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE entity_range (\n\trange BLOB UNIQUE\n)", null);
                androidSqliteDriver.execute(num13, "INSERT OR IGNORE INTO entity_range SELECT entity_range_old.range FROM entity_range_old", null);
                androidSqliteDriver.execute(num13, "DROP TABLE entity_range_old", null);
            }
            if (j <= 276 && j2 > 276) {
                androidSqliteDriver.execute(num13, "DROP TABLE cardDesign", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE cardDesign (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  white_signature BLOB,\n  black_signature BLOB,\n  encoded_signature TEXT,\n  stamps BLOB DEFAULT NULL,\n  card_theme TEXT NOT NULL DEFAULT 'BLACK',\n  cashtag_enabled INTEGER NOT NULL DEFAULT 0,\n  cashtag_on_top INTEGER NOT NULL DEFAULT 0\n)", null);
            }
            if (j <= 277 && j2 > 277) {
                androidSqliteDriver.execute(num13, "ALTER TABLE investing_settings ADD COLUMN crypto_disclosure_url TEXT", null);
            }
            if (j <= 278 && j2 > 278) {
                androidSqliteDriver.execute(num13, "CREATE TABLE investing_entity_price_cache(\n  token TEXT PRIMARY KEY,\n  price BLOB NOT NULL\n)", null);
            }
            if (j <= 279 && j2 > 279) {
                androidSqliteDriver.execute(num13, "ALTER TABLE investing_settings ADD COLUMN my_first_stock_configuration BLOB", null);
            }
            if (j <= 280 && j2 > 280) {
                androidSqliteDriver.execute(num13, "ALTER TABLE reward ADD COLUMN boost_detail_rows BLOB", null);
            }
            if (j <= 281 && j2 > 281) {
                androidSqliteDriver.execute(num13, "ALTER TABLE investing_settings ADD COLUMN equities_discovery_stock_tiles BLOB", null);
            }
            if (j <= 282 && j2 > 282) {
                androidSqliteDriver.execute(num13, "ALTER TABLE investment_entity ADD COLUMN about_text TEXT", null);
                androidSqliteDriver.execute(num13, "ALTER TABLE investment_entity ADD COLUMN about_detail_rows BLOB DEFAULT NULL", null);
            }
            if (j <= 283 && j2 > 283) {
                androidSqliteDriver.execute(num13, "ALTER TABLE reward ADD COLUMN boost_attributes BLOB", null);
            }
            if (j <= 284 && j2 > 284) {
                androidSqliteDriver.execute(num13, "ALTER TABLE creditLine ADD COLUMN quick_amounts BLOB", null);
                androidSqliteDriver.execute(num13, "ALTER TABLE creditLine ADD COLUMN minimum_loan_amount BLOB", null);
                androidSqliteDriver.execute(num13, "ALTER TABLE loan ADD COLUMN detail_rows BLOB", null);
            }
            if (j <= 285 && j2 > 285) {
                androidSqliteDriver.execute(num13, "ALTER TABLE issuedCard ADD COLUMN card_theme BLOB", null);
            }
            if (j <= 286 && j2 > 286) {
                androidSqliteDriver.execute(num13, "ALTER TABLE reward ADD COLUMN full_title_text TEXT", null);
            }
            if (j <= 287 && j2 > 287) {
                androidSqliteDriver.execute(num13, "ALTER TABLE reward ADD COLUMN expiration_date_time_ms INTEGER", null);
            }
            if (j <= 288 && j2 > 288) {
                androidSqliteDriver.execute(num13, "DROP TRIGGER signOut", null);
                androidSqliteDriver.execute(num13, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n  DELETE FROM supportFlowEvent;\n\n  -- Clear investing tables\n  DELETE FROM investing_data;\n  INSERT INTO investing_data (rowid) VALUES (NULL);\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\nEND", null);
            }
            if (j <= 289 && j2 > 289) {
                androidSqliteDriver.execute(num13, "DROP TRIGGER removeBoostConfigWithProfile", null);
                androidSqliteDriver.execute(num13, "DROP TABLE boostConfig", null);
            }
            if (j <= 290 && j2 > 290) {
                androidSqliteDriver.execute(num13, "CREATE TABLE boostConfig (\n  expirationHintThresholdBps INTEGER DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num13, "INSERT INTO boostConfig DEFAULT VALUES", null);
            }
            if (j <= 291 && j2 > 291) {
                androidSqliteDriver.execute(num13, "ALTER TABLE reward ADD COLUMN activation_date_time_ms INTEGER", null);
            }
            if (j <= 292 && j2 > 292) {
                androidSqliteDriver.execute(num13, "CREATE TABLE investment_statement(\n  key TEXT NOT NULL PRIMARY KEY,\n  name TEXT NOT NULL,\n  issue_date INTEGER NOT NULL,\n  type TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num13, "DROP TRIGGER signOut", null);
                androidSqliteDriver.execute(num13, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n  DELETE FROM supportFlowEvent;\n\n  -- Clear investing tables\n  DELETE FROM investing_data;\n  INSERT INTO investing_data (rowid) VALUES (NULL);\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\nEND", null);
            }
            if (j <= 293 && j2 > 293) {
                androidSqliteDriver.execute(num13, "ALTER TABLE paymentHistoryConfig ADD COLUMN lending_transaction_customer_ids BLOB DEFAULT NULL", null);
            }
            if (j <= 294 && j2 > 294) {
                androidSqliteDriver.execute(num13, "DROP TABLE offlineConfig", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE offlineConfig (\n  enabled INTEGER NOT NULL DEFAULT 0,\n  external_status_url TEXT,\n  attempted_payment_status_result BLOB,\n  offline_payment_status_result BLOB,\n  attempted_bill_status_result BLOB,\n  offline_bill_status_result BLOB,\n  attempted_cash_out_status_result BLOB,\n  offline_cash_out_status_result BLOB,\n  attempted_add_cash_status_result BLOB,\n  offline_add_cash_status_result BLOB,\n  retry_intervals BLOB\n)", null);
                androidSqliteDriver.execute(num13, "INSERT INTO offlineConfig DEFAULT VALUES", null);
            }
            if (j <= 295 && j2 > 295) {
                androidSqliteDriver.execute(num13, "DROP TABLE investment_statement", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE investment_statement(\n  key TEXT NOT NULL PRIMARY KEY,\n  name TEXT NOT NULL,\n  document_date INTEGER NOT NULL,\n  type TEXT NOT NULL,\n  url TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num13, "DROP TRIGGER signOut", null);
                androidSqliteDriver.execute(num13, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n  DELETE FROM supportFlowEvent;\n\n  -- Clear investing tables\n  DELETE FROM investing_data;\n  INSERT INTO investing_data (rowid) VALUES (NULL);\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\nEND", null);
            }
            if (j <= 296 && j2 > 296) {
                androidSqliteDriver.execute(num13, "ALTER TABLE loanTransaction RENAME TO loanTransaction_old", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE loanTransaction(\n  token TEXT NOT NULL PRIMARY KEY,\n  type TEXT NOT NULL,\n  credit_line_token TEXT NOT NULL,\n  loan_token TEXT NOT NULL,\n  date INTEGER,\n  is_outstanding INTEGER NOT NULL,\n  loan_payment BLOB,\n  loan_drawdown BLOB,\n  loan_charge BLOB\n)", null);
                androidSqliteDriver.execute(num13, "INSERT INTO loanTransaction(\n  token, type, credit_line_token, loan_token, date, is_outstanding, loan_payment, loan_drawdown,\n  loan_charge\n)\nSELECT token, type, credit_line_token, loan_token, date, 0, loan_payment, loan_drawdown, loan_charge\nFROM loanTransaction_old", null);
                androidSqliteDriver.execute(num13, "DROP TABLE loanTransaction_old", null);
            }
            if (j <= 297 && j2 > 297) {
                androidSqliteDriver.execute(num13, "ALTER TABLE loan RENAME TO loan_old", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE loan(\n  token TEXT NOT NULL PRIMARY KEY,\n  credit_line_token TEXT NOT NULL,\n  borrowed_at INTEGER NOT NULL,\n  principal_amount BLOB NOT NULL,\n  setup_fee_amount BLOB,\n  outstanding_amount BLOB,\n  late_fee_amount BLOB,\n  interest_amount BLOB,\n  setup_fee_bps INTEGER NOT NULL,\n  detail_rows BLOB,\n  state TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num13, "INSERT INTO loan(\n  token, credit_line_token, borrowed_at, principal_amount, setup_fee_amount, outstanding_amount,\n  late_fee_amount, interest_amount, setup_fee_bps, detail_rows, state\n)\nSELECT token, credit_line_token, borrowed_at, principal_amount, setup_fee_amount,\n       outstanding_amount, late_fee_amount, interest_amount, setup_fee_bps, detail_rows, \"OPEN\"\nFROM loan_old", null);
                androidSqliteDriver.execute(num13, "DROP TABLE loan_old", null);
            }
            if (j <= 298 && j2 > 298) {
                androidSqliteDriver.execute(num13, "CREATE TABLE investing_stocks_portfolio_graph_cache(\n  range TEXT PRIMARY KEY NOT NULL,\n  data BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(num13, "CREATE TABLE investing_bitcoin_portfolio_graph_cache(\n  profileCurrency TEXT NOT NULL,\n  range TEXT NOT NULL,\n  data BLOB NOT NULL,\n  PRIMARY KEY (profileCurrency, range)\n)", null);
            }
            if (j > 299 || j2 <= 299) {
                str30 = "CREATE TRIGGER removeBlockersConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM blockersConfig;\nINSERT INTO blockersConfig(rowid) VALUES (NULL);\nEND";
                str31 = "DROP TRIGGER signOut";
                num14 = null;
            } else {
                str31 = "DROP TRIGGER signOut";
                num14 = null;
                androidSqliteDriver.execute(null, str24, null);
                androidSqliteDriver.execute(null, "DROP VIEW IF EXISTS cashActivity", null);
                androidSqliteDriver.execute(null, "DROP VIEW IF EXISTS payments_model", null);
                str30 = "CREATE TRIGGER removeBlockersConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM blockersConfig;\nINSERT INTO blockersConfig(rowid) VALUES (NULL);\nEND";
                androidSqliteDriver.execute(null, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at, their_id, display_date, _id, sender_amount,\n       recipient_amount, boost_amount, paid_out_at, refunded_at, updated_at, is_badged,\n       coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n       coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled, scheduled_for, scheduled_payment_token\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(null, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  state,\n  role,\n  amount,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo_url,\n  avatar.accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
                androidSqliteDriver.execute(null, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyData ON (parent.customer_id = cash_merchant_token)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (\n  SELECT parent_id\n  FROM customerRelation\n  WHERE child_id IN (SELECT their_id FROM payments_model)\n)\n\nORDER BY display_date DESC", null);
            }
            if (j <= 300 && j2 > 300) {
                androidSqliteDriver.execute(num14, "ALTER TABLE investment_statement ADD COLUMN email_forwardable INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 301 && j2 > 301) {
                androidSqliteDriver.execute(num14, "DROP TABLE cardDesign", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE cardDesign (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  white_signature BLOB,\n  black_signature BLOB,\n  encoded_signature TEXT,\n  stamps BLOB DEFAULT NULL,\n  card_theme BLOB NOT NULL,\n  cashtag_enabled INTEGER NOT NULL DEFAULT 0,\n  cashtag_on_top INTEGER NOT NULL DEFAULT 0\n)", null);
            }
            if (j <= 302 && j2 > 302) {
                androidSqliteDriver.execute(num14, "DROP TABLE cardDesign", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE cardDesign (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  white_signature BLOB,\n  black_signature BLOB,\n  encoded_signature TEXT,\n  stamps BLOB DEFAULT NULL,\n  legacy_card_theme TEXT DEFAULT NULL,\n  card_theme BLOB DEFAULT NULL,\n  cashtag_enabled INTEGER NOT NULL DEFAULT 0,\n  cashtag_on_top INTEGER NOT NULL DEFAULT 0\n)", null);
            }
            if (j <= 303 && j2 > 303) {
                androidSqliteDriver.execute(num14, "ALTER TABLE sync_entity ADD COLUMN entity_processor_version INTEGER DEFAULT 0", null);
                androidSqliteDriver.execute(num14, "CREATE INDEX entity_processor_version_index ON sync_entity (entity_processor_version)", null);
            }
            if (j <= 304 && j2 > 304) {
                androidSqliteDriver.execute(num14, "DROP TABLE cardDesign", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE cardDesign (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  white_signature BLOB,\n  black_signature BLOB,\n  encoded_signature TEXT,\n  stamps BLOB DEFAULT NULL,\n  touch_data BLOB DEFAULT NULL,\n  legacy_card_theme TEXT DEFAULT NULL,\n  card_theme BLOB DEFAULT NULL,\n  cashtag_enabled INTEGER NOT NULL DEFAULT 0,\n  cashtag_on_top INTEGER NOT NULL DEFAULT 0\n)", null);
            }
            if (j <= 305 && j2 > 305) {
                androidSqliteDriver.execute(num14, "DROP TABLE cardDesign", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE cardDesign (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  white_signature BLOB,\n  black_signature BLOB,\n  encoded_signature TEXT,\n  stamps BLOB DEFAULT NULL,\n  touch_data BLOB DEFAULT NULL,\n  legacy_card_theme TEXT DEFAULT NULL,\n  card_theme BLOB DEFAULT NULL,\n  controls_theme BLOB DEFAULT NULL,\n  cashtag_enabled INTEGER NOT NULL DEFAULT 0,\n  cashtag_on_top INTEGER NOT NULL DEFAULT 0\n)", null);
            }
            if (j <= 306 && j2 > 306) {
                androidSqliteDriver.execute(num14, "CREATE TABLE unhandled_sync_entity (\n  entity_id TEXT NOT NULL,\n  entity BLOB NOT NULL,\n  entity_processor_version INTEGER DEFAULT 0,\n  created_at INTEGER DEFAULT CURRENT_TIMESTAMP NOT NULL,\n  PRIMARY KEY (entity_id, created_at)\n)", null);
                androidSqliteDriver.execute(num14, "CREATE INDEX unhandled_entity_processor_version_index ON unhandled_sync_entity(entity_processor_version)", null);
            }
            if (j <= 307 && j2 > 307) {
                androidSqliteDriver.execute(num14, "ALTER TABLE profile ADD COLUMN bitcoin_display_units TEXT", null);
            }
            if (j <= 308 && j2 > 308) {
                androidSqliteDriver.execute(num14, "CREATE TABLE bulletinAppMessage (\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT\n)", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE homeScreenMessage(\n  messageToken TEXT UNIQUE REFERENCES bulletinAppMessage,\n  headline TEXT,\n  assetUrl TEXT,\n  primaryNavigationAction BLOB,\n  secondaryNavigationAction BLOB\n)", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE activityInlineMessage(\n  messageToken TEXT UNIQUE REFERENCES bulletinAppMessage,\n  headline TEXT,\n  assetUrl TEXT,\n  incrementActivityBadge INTEGER NOT NULL,\n  primaryNavigationAction BLOB,\n  secondaryNavigationAction BLOB\n)", null);
            }
            if (j <= 309 && j2 > 309) {
                androidSqliteDriver.execute(num14, "ALTER TABLE creditLine ADD COLUMN first_time_borrow_data BLOB", null);
            }
            if (j <= 310 && j2 > 310) {
                androidSqliteDriver.execute(num14, "ALTER TABLE loanTransaction ADD COLUMN activity_token TEXT", null);
            }
            if (j <= 311 && j2 > 311) {
                androidSqliteDriver.execute(num14, "ALTER TABLE payment ADD COLUMN hidden_until INTEGER", null);
                androidSqliteDriver.execute(num14, "DROP VIEW IF EXISTS payments_model", null);
                androidSqliteDriver.execute(num14, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at, their_id, display_date, _id, sender_amount,\n       recipient_amount, boost_amount, paid_out_at, refunded_at, updated_at, is_badged,\n       coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n       coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled, scheduled_for, scheduled_payment_token,\n       coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num14, "DROP VIEW IF EXISTS cashActivity", null);
                androidSqliteDriver.execute(num14, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  state,\n  role,\n  amount,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo_url,\n  avatar.accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
                androidSqliteDriver.execute(num14, str24, null);
                androidSqliteDriver.execute(num14, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyData ON (parent.customer_id = cash_merchant_token)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (\n  SELECT parent_id\n  FROM customerRelation\n  WHERE child_id IN (SELECT their_id FROM payments_model)\n)\n\nORDER BY display_date DESC", null);
            }
            if (j <= 312 && j2 > 312) {
                androidSqliteDriver.execute(num14, "CREATE VIEW loanTransactionWithActivityCheck AS\nSELECT loanTransaction.*, (\n\tSELECT count(*) > 0\n\tFROM cashActivity\n\tWHERE cashActivity.token = loanTransaction.activity_token\n) AS activity_exists\nFROM loanTransaction", null);
            }
            if (j <= 313 && j2 > 313) {
                androidSqliteDriver.execute(num14, "ALTER TABLE investing_settings ADD COLUMN my_first_bitcoin_configuration BLOB", null);
            }
            if (j <= 314 && j2 > 314) {
                androidSqliteDriver.execute(num14, "ALTER TABLE reward ADD COLUMN progress_text TEXT", null);
            }
            if (j <= 315 && j2 > 315) {
                androidSqliteDriver.execute(num14, "CREATE TABLE investment_performance(\n  entity_token TEXT NOT NULL PRIMARY KEY,\n  title TEXT,\n  sections BLOB NOT NULL\n)", null);
            }
            if (j <= 316 && j2 > 316) {
                androidSqliteDriver.execute(num14, "DROP TABLE homeScreenMessage", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE homeScreenMessage(\n  messageToken TEXT UNIQUE REFERENCES bulletinAppMessage,\n  text TEXT,\n  assetUrl TEXT,\n  primaryNavigationAction BLOB,\n  secondaryNavigationAction BLOB\n)", null);
                androidSqliteDriver.execute(num14, "DROP TABLE activityInlineMessage", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE activityInlineMessage(\n  messageToken TEXT UNIQUE REFERENCES bulletinAppMessage,\n  text TEXT,\n  assetUrl TEXT,\n  hasViewed INTEGER NOT NULL,\n  primaryNavigationAction BLOB,\n  secondaryNavigationAction BLOB\n)", null);
            }
            if (j <= 317 && j2 > 317) {
                androidSqliteDriver.execute(num14, "ALTER TABLE investing_settings ADD COLUMN scheduled_btc_buys_enabled INTEGER", null);
                androidSqliteDriver.execute(num14, "ALTER TABLE investing_settings ADD COLUMN min_scheduled_btc_buy_amt BLOB", null);
            }
            if (j <= 318 && j2 > 318) {
                androidSqliteDriver.execute(num14, "DROP VIEW IF EXISTS loanTransactionWithActivityCheck", null);
                androidSqliteDriver.execute(num14, "CREATE VIEW loanTransactionWithActivityCheck AS\nSELECT loanTransaction.*, (\n\tSELECT count(*) > 0\n\tFROM payments_model\n\tWHERE payments_model.token = loanTransaction.activity_token\n) AS activity_exists\nFROM loanTransaction", null);
            }
            if (j <= 319 && j2 > 319) {
                androidSqliteDriver.execute(num14, "CREATE TABLE recurring_preference(\n  _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  entity_id TEXT NOT NULL UNIQUE,\n  amount BLOB NOT NULL,\n  schedule BLOB NOT NULL,\n  next_reload_at INTEGER NOT NULL,\n  type TEXT NOT NULL\n)", null);
            }
            if (j <= 320 && j2 > 320) {
                androidSqliteDriver.execute(num14, "CREATE TABLE invitationEntity(\n  entity_id TEXT PRIMARY KEY,\n  hashed_alias TEXT\n)", null);
            }
            if (j > 321 || j2 <= 321) {
                str32 = str4;
                str33 = "DROP VIEW IF EXISTS cashActivity";
            } else {
                str32 = str4;
                androidSqliteDriver.execute(num14, str32, null);
                str33 = "DROP VIEW IF EXISTS cashActivity";
                androidSqliteDriver.execute(num14, "CREATE VIEW recipients AS\nSELECT contact.display_name AS contact_display_name,\n       contact.lookup_key,\n       CASE already_invited WHEN 1 THEN 1\n         ELSE invite_entity_id IS NOT NULL END AS already_invited,\n       has_multiple_customers,\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer,\n       coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email,\n       customer_sms AS sms,\n       photo_url,\n       customer_display_name,\n       group_concat(email) AS email_addresses,\n       group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments,\n       coalesce(is_square, 0) AS is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.accent_color,\n       customer.region,\n       customer.category\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON alias.hashed_alias = invite_hashed_alias\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       invite_entity_id IS NOT NULL,\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       is_cash_customer,\n       is_verified,\n       is_business,\n       email,\n       sms,\n       photo_url,\n       customer_display_name,\n       email,\n       sms,\n       can_accept_payments,\n       is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.accent_color,\n       customer.region,\n       customer.category\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON contact_alias.hashed_alias = invite_hashed_alias\nWHERE lookup_key IS NULL", null);
            }
            if (j <= 322 && j2 > 322) {
                androidSqliteDriver.execute(num14, str22, null);
                androidSqliteDriver.execute(num14, "CREATE TABLE recurring_preference_copy(\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  enabled INTEGER NOT NULL,\n  amount BLOB NOT NULL,\n  schedule BLOB NOT NULL,\n  next_reload_at INTEGER,\n  type TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num14, "INSERT INTO recurring_preference_copy (entity_id, enabled, amount, schedule, next_reload_at, type)\nSELECT entity_id, 1, amount, schedule, next_reload_at, type\nFROM recurring_preference", null);
                androidSqliteDriver.execute(num14, "DROP TABLE recurring_preference", null);
                androidSqliteDriver.execute(num14, "ALTER TABLE recurring_preference_copy\nRENAME TO recurring_preference", null);
                androidSqliteDriver.execute(num14, "END TRANSACTION", null);
            }
            if (j <= 323 && j2 > 323) {
                androidSqliteDriver.execute(num14, "ALTER TABLE reward ADD COLUMN discount_text TEXT", null);
            }
            if (j <= 324 && j2 > 324) {
                androidSqliteDriver.execute(num14, str22, null);
                androidSqliteDriver.execute(num14, "ALTER TABLE investing_settings ADD COLUMN scheduled_stock_buys_enabled INTEGER", null);
                androidSqliteDriver.execute(num14, "ALTER TABLE investing_settings ADD COLUMN min_scheduled_stock_buy_amt BLOB", null);
                androidSqliteDriver.execute(num14, "END TRANSACTION", null);
            }
            if (j <= 325 && j2 > 325) {
                androidSqliteDriver.execute(num14, "ALTER TABLE recurring_preference ADD COLUMN investment_entity_token TEXT", null);
            }
            if (j <= 326 && j2 > 326) {
                androidSqliteDriver.execute(num14, "CREATE TABLE cardTabNullStateConfig(\n  config BLOB\n)", null);
            }
            if (j <= 327 && j2 > 327) {
                androidSqliteDriver.execute(num14, "DROP TABLE IF EXISTS cardTabNullStateConfig", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE cardTabNullStateConfig(\n  config BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num14, "INSERT INTO cardTabNullStateConfig DEFAULT VALUES", null);
            }
            if (j <= 328 && j2 > 328) {
                androidSqliteDriver.execute(num14, "CREATE TABLE category (\n  token TEXT NOT NULL PRIMARY KEY,\n  name TEXT NOT NULL,\n  description TEXT,\n  prefix_icon TEXT,\n  image_url TEXT,\n  accent_color TEXT,\n  parent_category_token TEXT REFERENCES category,\n  type TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE filter_group (\n  token TEXT NOT NULL PRIMARY KEY,\n  name TEXT NOT NULL,\n  can_select_multiple_categories INTEGER,\n  subfilters BLOB,\n  category_map BLOB\n)", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE category_in_filter_group(\n  filter_group_token TEXT NOT NULL REFERENCES filter_group,\n  category_token TEXT NOT NULL REFERENCES category,\n  PRIMARY KEY (filter_group_token, category_token)\n)", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE entity_in_category(\n  category_token TEXT NOT NULL REFERENCES category,\n  entity_token TEXT NOT NULL REFERENCES investment_entity,\n  PRIMARY KEY (category_token, entity_token)\n)", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE filter_for_category(\n  category_token TEXT NOT NULL REFERENCES category,\n  filter_token TEXT NOT NULL REFERENCES filter_group,\n  PRIMARY KEY (category_token, filter_token)\n)", null);
            }
            if (j <= 329 && j2 > 329) {
                androidSqliteDriver.execute(num14, "ALTER TABLE filter_group ADD COLUMN name_plural TEXT", null);
                androidSqliteDriver.execute(num14, "ALTER TABLE filter_group ADD COLUMN join_type TEXT", null);
            }
            if (j <= 330 && j2 > 330) {
                androidSqliteDriver.execute(num14, "ALTER TABLE profile ADD COLUMN instagram_share_qr_data BLOB", null);
            }
            if (j <= 331 && j2 > 331) {
                androidSqliteDriver.execute(num14, "ALTER TABLE balanceData ADD COLUMN check_deposits_enabled INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 332 && j2 > 332) {
                androidSqliteDriver.execute(num14, "ALTER TABLE balanceData ADD COLUMN direct_deposit BLOB DEFAULT NULL", null);
            }
            if (j <= 333 && j2 > 333) {
                androidSqliteDriver.execute(num14, "ALTER TABLE appMessage ADD COLUMN shouldBadgeActivity INTEGER DEFAULT NULL", null);
            }
            if (j <= 334 && j2 > 334) {
                androidSqliteDriver.execute(num14, str22, null);
                androidSqliteDriver.execute(num14, "DROP VIEW IF EXISTS activityRecipient", null);
                androidSqliteDriver.execute(num14, "CREATE VIEW activityRecipient AS\nSELECT contact.display_name AS contact_display_name, contact.lookup_key, already_invited,\n       has_multiple_customers, customer.customer_id, customer.threaded_customer_id, cashtag,\n       is_cash_customer, is_verified, is_business, email, sms, photo_url, customer_display_name,\n       group_concat(email) AS email_addresses, group_concat(sms) AS sms_numbers,\n       can_accept_payments, is_square, coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee, blocked, merchant_data, customer.accent_color, customer.region,\n       customer.category, customer.investment_entity_token\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nGROUP BY customer.customer_id", null);
                androidSqliteDriver.execute(num14, "END TRANSACTION", null);
            }
            if (j <= 335 && j2 > 335) {
                androidSqliteDriver.execute(num14, "CREATE TABLE IF NOT EXISTS category (\n  token TEXT NOT NULL PRIMARY KEY,\n  name TEXT NOT NULL,\n  description TEXT,\n  prefix_icon TEXT,\n  image_url TEXT,\n  accent_color TEXT,\n  parent_category_token TEXT REFERENCES category,\n  type TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE IF NOT EXISTS category_in_filter_group(\n  filter_group_token TEXT NOT NULL REFERENCES filter_group,\n  category_token TEXT NOT NULL REFERENCES category,\n  PRIMARY KEY (filter_group_token, category_token)\n)", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE IF NOT EXISTS entity_in_category(\n  category_token TEXT NOT NULL REFERENCES category,\n  entity_token TEXT NOT NULL REFERENCES investment_entity,\n  PRIMARY KEY (category_token, entity_token)\n)", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE IF NOT EXISTS filter_group (\n  token TEXT NOT NULL PRIMARY KEY,\n  name TEXT NOT NULL,\n  can_select_multiple_categories INTEGER,\n  subfilters BLOB,\n  category_map BLOB,\n  name_plural TEXT,\n  join_type TEXT\n)", null);
                androidSqliteDriver.execute(num14, "CREATE TABLE IF NOT EXISTS filter_for_category(\n  category_token TEXT NOT NULL REFERENCES category,\n  filter_token TEXT NOT NULL REFERENCES filter_group,\n  PRIMARY KEY (category_token, filter_token)\n)", null);
            }
            if (j > 336 || j2 <= 336) {
                str34 = "DROP TABLE cardDesign";
                str35 = "DROP VIEW IF EXISTS payments_model";
                str36 = str29;
                num15 = null;
                str37 = "CREATE TRIGGER removeCashDrawerConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM cashDrawerConfig;\nINSERT INTO cashDrawerConfig (rowid) VALUES (NULL);\nEND";
                str38 = str27;
            } else {
                str35 = "DROP VIEW IF EXISTS payments_model";
                num15 = null;
                androidSqliteDriver.execute(null, "PRAGMA foreign_keys=off", null);
                androidSqliteDriver.execute(null, str22, null);
                str34 = "DROP TABLE cardDesign";
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeProfileAliasWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeInstitutionsConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeCryptocurrencyConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeCashDrawerConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeBlockersConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeSupportConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeStampsConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeSharingConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeRecipientConfigWithprofile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeReactionConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeRatePlanConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removePaymentHistoryConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeOfflineConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeInvitationConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeWebLoginConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeBitcoinTransactionCustomerIdsWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeScenarioPlanWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeBalanceDataWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeInstrumentLinkingOptionWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeNotificationPreferenceWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS removeLocationConfigWithProfile", null);
                androidSqliteDriver.execute(null, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(null, "ALTER TABLE profile RENAME TO profile_old", null);
                androidSqliteDriver.execute(null, "CREATE TABLE profile (\n  profile_id TEXT NOT NULL PRIMARY KEY,\n  full_name TEXT,\n  photo_url TEXT,\n  require_passcode_confirmation INTEGER NOT NULL,\n  has_passcode INTEGER NOT NULL,\n  nearby_visibility TEXT NOT NULL,\n  cashtag TEXT,\n  cashtag_url TEXT,\n  cashtag_url_display_text TEXT,\n  cashtag_url_enabled INTEGER NOT NULL DEFAULT 0,\n  rate_plan TEXT NOT NULL,\n  can_upgrade_to_business INTEGER NOT NULL DEFAULT 0,\n  is_verified_account INTEGER NOT NULL,\n  app_message_notifications_enabled INTEGER NOT NULL DEFAULT 0,\n  verification_instrument_token TEXT,\n  deposit_preference TEXT,\n  address BLOB,\n  deposit_preference_data BLOB,\n  request_minimum_note_length INTEGER NOT NULL DEFAULT 0,\n  cash_drawer_data BLOB,\n  country_code TEXT,\n  default_currency TEXT NOT NULL,\n  customer_since INTEGER,\n  profile_token TEXT DEFAULT NULL,\n  incoming_request_policy TEXT DEFAULT NULL,\n  has_passed_idv INTEGER DEFAULT NULL,\n  cashtag_qr_image_url TEXT DEFAULT NULL,\n  cashtag_with_currency_symbol TEXT DEFAULT NULL,\n  available_p2p_target_regions BLOB DEFAULT NULL,\n  printable_cashtag_qr_image_url TEXT DEFAULT NULL,\n  region TEXT,\n  direct_deposit_account_enabled INTEGER NOT NULL DEFAULT 0,\n  bitcoin_display_units TEXT,\n  instagram_share_qr_data BLOB\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO profile(profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n    nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n    rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n    verification_instrument_token, deposit_preference, address, deposit_preference_data,\n    request_minimum_note_length, cash_drawer_data, country_code, default_currency, customer_since,\n    profile_token, incoming_request_policy, has_passed_idv, cashtag_qr_image_url,\n    cashtag_with_currency_symbol, available_p2p_target_regions, printable_cashtag_qr_image_url,\n    region, direct_deposit_account_enabled, bitcoin_display_units)\nSELECT profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n    nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n    rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n    verification_instrument_token, deposit_preference, address, deposit_preference_data,\n    request_minimum_note_length, cash_drawer_data, country_code, default_currency, customer_since,\n    profile_token, incoming_request_policy, has_passed_idv, cashtag_qr_image_url,\n    cashtag_with_currency_symbol, available_p2p_target_regions, printable_cashtag_qr_image_url,\n    region, direct_deposit_account_enabled, bitcoin_display_units\nFROM profile_old", null);
                androidSqliteDriver.execute(null, "DROP TABLE profile_old", null);
                androidSqliteDriver.execute(null, str18, null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeInstitutionsConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM institutionsConfig;\nINSERT INTO institutionsConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeCryptocurrencyConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM cryptocurrencyConfig;\nINSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeCashDrawerConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM cashDrawerConfig;\nINSERT INTO cashDrawerConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, str30, null);
                androidSqliteDriver.execute(null, str25, null);
                androidSqliteDriver.execute(null, str23, null);
                androidSqliteDriver.execute(null, str21, null);
                androidSqliteDriver.execute(null, str19, null);
                androidSqliteDriver.execute(null, str14, null);
                androidSqliteDriver.execute(null, str13, null);
                androidSqliteDriver.execute(null, str10, null);
                androidSqliteDriver.execute(null, str9, null);
                androidSqliteDriver.execute(null, str8, null);
                androidSqliteDriver.execute(null, str, null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeBitcoinTransactionCustomerIdsWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM bitcoinTransactionCustomerIds;\nEND", null);
                androidSqliteDriver.execute(null, str7, null);
                androidSqliteDriver.execute(null, str6, null);
                androidSqliteDriver.execute(null, str5, null);
                androidSqliteDriver.execute(null, str2, null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER removeLocationConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM locationConfig;\nINSERT INTO locationConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(null, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n  DELETE FROM supportFlowEvent;\n\n  -- Clear investing tables\n  DELETE FROM investing_data;\n  INSERT INTO investing_data (rowid) VALUES (NULL);\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\nEND", null);
                str36 = str29;
                androidSqliteDriver.execute(null, str36, null);
                str37 = "CREATE TRIGGER removeCashDrawerConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM cashDrawerConfig;\nINSERT INTO cashDrawerConfig (rowid) VALUES (NULL);\nEND";
                str38 = str27;
                androidSqliteDriver.execute(null, str38, null);
            }
            if (j > 337 || j2 <= 337) {
                str39 = "CREATE TRIGGER removeCryptocurrencyConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM cryptocurrencyConfig;\nINSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\nEND";
            } else {
                str39 = "CREATE TRIGGER removeCryptocurrencyConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM cryptocurrencyConfig;\nINSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\nEND";
                androidSqliteDriver.execute(num15, "ALTER TABLE balanceData ADD COLUMN deposit_check BLOB DEFAULT NULL", null);
            }
            if (j <= 338 && j2 > 338) {
                androidSqliteDriver.execute(num15, "PRAGMA foreign_keys=off", null);
                androidSqliteDriver.execute(num15, str22, null);
                androidSqliteDriver.execute(num15, "ALTER TABLE category RENAME TO category_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS category (\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  token TEXT NOT NULL UNIQUE,\n  name TEXT NOT NULL,\n  description TEXT,\n  prefix_icon TEXT,\n  image_url TEXT,\n  accent_color TEXT,\n  parent_category_token TEXT REFERENCES category,\n  type TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO category(token, name, description, prefix_icon, image_url, accent_color,\nparent_category_token, type)\nSELECT token, name, description, prefix_icon, image_url, accent_color, parent_category_token, type\nFROM category_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE category_old", null);
                androidSqliteDriver.execute(num15, str36, null);
                androidSqliteDriver.execute(num15, str38, null);
            }
            if (j <= 339 && j2 > 339) {
                androidSqliteDriver.execute(num15, "ALTER TABLE cryptocurrencyConfig ADD COLUMN minimum_withdrawal_limit_sats INTEGER DEFAULT NULL", null);
            }
            if (j <= 340 && j2 > 340) {
                androidSqliteDriver.execute(num15, "DROP TABLE entity_in_category", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE entity_in_category(\n  category_token TEXT NOT NULL REFERENCES category,\n  entity_token TEXT NOT NULL REFERENCES investment_entity(token),\n  PRIMARY KEY (category_token, entity_token)\n)", null);
            }
            if (j <= 341 && j2 > 341) {
                androidSqliteDriver.execute(num15, "DROP TABLE category", null);
                androidSqliteDriver.execute(num15, "DROP TABLE category_in_filter_group", null);
                androidSqliteDriver.execute(num15, "DROP TABLE entity_in_category", null);
                androidSqliteDriver.execute(num15, "DROP TABLE filter_group", null);
                androidSqliteDriver.execute(num15, "DROP TABLE filter_for_category", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE category (\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  token TEXT NOT NULL UNIQUE,\n  entity_id TEXT NOT NULL UNIQUE,\n  name TEXT NOT NULL,\n  description TEXT,\n  prefix_icon TEXT,\n  image_url TEXT,\n  accent_color TEXT,\n  parent_category_token TEXT,\n  type TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE filter_group (\n  token TEXT NOT NULL PRIMARY KEY,\n  entity_id TEXT NOT NULL UNIQUE,\n  name TEXT NOT NULL,\n  can_select_multiple_categories INTEGER,\n  subfilters BLOB,\n  category_map BLOB,\n  name_plural TEXT,\n  join_type TEXT\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE filter_for_category(\n  category_token TEXT NOT NULL,\n  filter_token TEXT NOT NULL,\n  PRIMARY KEY (category_token, filter_token)\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE category_in_filter_group(\n  filter_group_token TEXT NOT NULL,\n  category_token TEXT NOT NULL,\n  PRIMARY KEY (filter_group_token, category_token)\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE entity_in_category(\n  category_token TEXT NOT NULL,\n  entity_token TEXT NOT NULL,\n  PRIMARY KEY (category_token, entity_token)\n)", null);
            }
            if (j <= 342 && j2 > 342) {
                androidSqliteDriver.execute(num15, "ALTER TABLE customer ADD COLUMN joined_on integer DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, str32, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW recipients AS\nSELECT contact.display_name AS contact_display_name,\n       contact.lookup_key,\n       CASE already_invited WHEN 1 THEN 1\n         ELSE invite_entity_id IS NOT NULL END AS already_invited,\n       has_multiple_customers,\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer,\n       coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email,\n       customer_sms AS sms,\n       photo_url,\n       customer_display_name,\n       group_concat(email) AS email_addresses,\n       group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments,\n       coalesce(is_square, 0) AS is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON alias.hashed_alias = invite_hashed_alias\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       invite_entity_id IS NOT NULL,\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       is_cash_customer,\n       is_verified,\n       is_business,\n       email,\n       sms,\n       photo_url,\n       customer_display_name,\n       email,\n       sms,\n       can_accept_payments,\n       is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON contact_alias.hashed_alias = invite_hashed_alias\nWHERE lookup_key IS NULL", null);
            }
            if (j <= 343 && j2 > 343) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investment_entity ADD COLUMN search_ordering INTEGER DEFAULT NULL", null);
            }
            if (j <= 344 && j2 > 344) {
                androidSqliteDriver.execute(num15, "DELETE FROM appMessage WHERE presentation_mode = 'HOME_BUTTON'", null);
                androidSqliteDriver.execute(num15, "DELETE FROM appMessage WHERE presentation_mode = 'PROFILE_CASH_CARD'", null);
            }
            if (j <= 345 && j2 > 345) {
                androidSqliteDriver.execute(num15, "CREATE TABLE inlineMessage(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  placement TEXT,\n  image BLOB,\n  title TEXT,\n  subtitle TEXT,\n  primaryNavigationAction BLOB,\n  secondaryNavigationAction BLOB\n)", null);
            }
            if (j <= 346 && j2 > 346) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS activityInlineMessage", null);
            }
            if (j <= 347 && j2 > 347) {
                androidSqliteDriver.execute(num15, "ALTER TABLE category ADD COLUMN filter_description TEXT", null);
            }
            if (j <= 348 && j2 > 348) {
                androidSqliteDriver.execute(num15, "CREATE TABLE popupMessage(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  placement TEXT,\n  image BLOB,\n  title TEXT,\n  subtitle TEXT,\n  primaryNavigationAction BLOB,\n  secondaryNavigationAction BLOB\n)", null);
            }
            if (j <= 349 && j2 > 349) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS homeScreenMessage", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS bulletinAppMessage", null);
            }
            if (j <= 350 && j2 > 350) {
                androidSqliteDriver.execute(num15, "CREATE TABLE inAppNotificationMessage (\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  duration INTEGER,\n  assetUrl TEXT,\n  action BLOB\n)", null);
            }
            if (j <= 351 && j2 > 351) {
                androidSqliteDriver.execute(num15, "CREATE TABLE lendingConfig(\n  enabled INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO lendingConfig DEFAULT VALUES", null);
            }
            if (j <= 352 && j2 > 352) {
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_news_article (\n  entity_token TEXT,\n  provider TEXT NOT NULL,\n  provider_avatar BLOB NOT NULL,\n  headline TEXT NOT NULL,\n  published_at_millis INTEGER NOT NULL,\n  url TEXT,\n  display_in_carousel INTEGER NOT NULL\n)", null);
            }
            if (j <= 353 && j2 > 353) {
                androidSqliteDriver.execute(num15, "ALTER TABLE lendingConfig ADD COLUMN last_updated INTEGER NOT NULL DEFAULT 0", null);
                androidSqliteDriver.execute(num15, "UPDATE lendingConfig SET last_updated = 0", null);
            }
            if (j <= 354 && j2 > 354) {
                androidSqliteDriver.execute(num15, "ALTER TABLE inlineMessage ADD COLUMN cannotBeDismissed INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 355 && j2 > 355) {
                androidSqliteDriver.execute(num15, "ALTER TABLE paymentHistoryConfig\nADD COLUMN referral_customer_ids BLOB DEFAULT NULL", null);
            }
            if (j <= 356 && j2 > 356) {
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS loanTransactionWithActivityCheck", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE loanTransaction RENAME TO loanTransaction_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE loanTransaction(\n  token TEXT NOT NULL PRIMARY KEY,\n  type TEXT,\n  credit_line_token TEXT NOT NULL,\n  loan_token TEXT NOT NULL,\n  date INTEGER,\n  is_outstanding INTEGER NOT NULL,\n  loan_payment BLOB,\n  loan_drawdown BLOB,\n  loan_charge BLOB,\n  activity_token TEXT\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO loanTransaction(\n  token, type, credit_line_token, loan_token, date, is_outstanding, loan_payment,\n  loan_drawdown, loan_charge, activity_token\n)\nSELECT token, type, credit_line_token, loan_token, date, is_outstanding, loan_payment,\n       loan_drawdown, loan_charge, activity_token\nFROM loanTransaction_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE loanTransaction_old", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW loanTransactionWithActivityCheck AS\nSELECT loanTransaction.*, (\n\tSELECT count(*) > 0\n\tFROM payments_model\n\tWHERE payments_model.token = loanTransaction.activity_token\n) AS activity_exists\nFROM loanTransaction", null);
            }
            if (j <= 357 && j2 > 357) {
                androidSqliteDriver.execute(num15, "CREATE TABLE cardStudio (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  touch_data BLOB DEFAULT NULL,\n  card_theme BLOB DEFAULT NULL,\n  cashtag_enabled INTEGER NOT NULL DEFAULT 0\n)", null);
            }
            if (j <= 358 && j2 > 358) {
                androidSqliteDriver.execute(num15, "CREATE INDEX entity_in_category_entity_token_index ON entity_in_category(entity_token)", null);
            }
            if (j <= 359 && j2 > 359) {
                androidSqliteDriver.execute(num15, "CREATE TABLE newInstrumentLinkingConfig (\n  header_no_instrument_linked TEXT DEFAULT NULL,\n  description_no_instrument_linked TEXT DEFAULT NULL,\n  header_bank_account_linked TEXT DEFAULT NULL,\n  description_bank_account_linked TEXT DEFAULT NULL,\n  header_no_instrument_linked_personal TEXT DEFAULT NULL,\n  description_no_instrument_linked_personal TEXT DEFAULT NULL,\n  credit_card_fee_bps INTEGER DEFAULT NULL,\n  credit_card_linking_enabled INTEGER DEFAULT NULL,\n  max_credit_prompts INTEGER DEFAULT NULL,\n  cash_balance_enabled INTEGER DEFAULT NULL,\n  customer_passcode_instrument_token TEXT DEFAULT NULL,\n  issued_cards_enabled INTEGER DEFAULT NULL,\n  bankbook_enabled INTEGER DEFAULT NULL,\n  issued_card_disabled_style TEXT DEFAULT NULL,\n  physical_issued_cards_enabled INTEGER DEFAULT NULL,\n  nfc_card_linking_enabled INTEGER DEFAULT 0,\n  bank_account_linking_config BLOB\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO newInstrumentLinkingConfig (\n  header_no_instrument_linked, description_no_instrument_linked, header_bank_account_linked,\n  description_bank_account_linked, header_no_instrument_linked_personal,\n  description_no_instrument_linked_personal, credit_card_fee_bps, credit_card_linking_enabled,\n  max_credit_prompts, cash_balance_enabled, customer_passcode_instrument_token,\n  issued_cards_enabled, bankbook_enabled, issued_card_disabled_style, physical_issued_cards_enabled,\n  nfc_card_linking_enabled, bank_account_linking_config\n)\nSELECT header_no_instrument_linked, description_no_instrument_linked, header_bank_account_linked,\n  description_bank_account_linked, header_no_instrument_linked_personal,\n  description_no_instrument_linked_personal, credit_card_fee_bps, credit_card_linking_enabled,\n  max_credit_prompts, cash_balance_enabled, customer_passcode_instrument_token,\n  issued_cards_enabled, bankbook_enabled, issued_card_disabled_style, physical_issued_cards_enabled,\n  nfc_card_linking_enabled, bank_account_linking_config\nFROM instrumentLinkingConfig", null);
                androidSqliteDriver.execute(num15, "DROP TABLE instrumentLinkingConfig", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE newInstrumentLinkingConfig RENAME TO instrumentLinkingConfig", null);
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS pending", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW pending AS\nSELECT pendingPayment.external_id,\n       pendingPayment.request AS payment_request,\n       NULL AS transfer_request,\n       pendingPayment.created_at,\n       credit_card_fee_bps,\n       recipients\nFROM pendingPayment\nLEFT JOIN payment ON pendingPayment.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL\nUNION\nSELECT pendingTransfer.external_id,\n       NULL AS payment_request,\n       pendingTransfer.request AS transfer_request,\n       pendingTransfer.created_at,\n       credit_card_fee_bps,\n       1 AS recipients\nFROM pendingTransfer\nLEFT JOIN payment ON pendingTransfer.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL", null);
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS recipients", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW recipients AS\nSELECT contact.display_name AS contact_display_name,\n       contact.lookup_key,\n       CASE already_invited WHEN 1 THEN 1\n         ELSE invite_entity_id IS NOT NULL END AS already_invited,\n       has_multiple_customers,\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer,\n       coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email,\n       customer_sms AS sms,\n       photo_url,\n       customer_display_name,\n       group_concat(email) AS email_addresses,\n       group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments,\n       coalesce(is_square, 0) AS is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON alias.hashed_alias = invite_hashed_alias\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       invite_entity_id IS NOT NULL,\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       is_cash_customer,\n       is_verified,\n       is_business,\n       email,\n       sms,\n       photo_url,\n       customer_display_name,\n       email,\n       sms,\n       can_accept_payments,\n       is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON contact_alias.hashed_alias = invite_hashed_alias\nWHERE lookup_key IS NULL", null);
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS activityRecipient", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW activityRecipient AS\nSELECT contact.display_name AS contact_display_name, contact.lookup_key, already_invited,\n       has_multiple_customers, customer.customer_id, customer.threaded_customer_id, cashtag,\n       is_cash_customer, is_verified, is_business, email, sms, photo_url, customer_display_name,\n       group_concat(email) AS email_addresses, group_concat(sms) AS sms_numbers,\n       can_accept_payments, is_square, coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee, blocked, merchant_data, customer.accent_color, customer.region,\n       customer.category, customer.investment_entity_token\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nGROUP BY customer.customer_id", null);
            }
            if (j <= 360 && j2 > 360) {
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS loanTransactionWithActivityCheck", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE loanTransaction RENAME TO loanTransaction_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE loanTransaction(\n  token TEXT NOT NULL PRIMARY KEY,\n  type TEXT,\n  credit_line_token TEXT NOT NULL,\n  loan_token TEXT NOT NULL,\n  date INTEGER,\n  is_outstanding INTEGER NOT NULL,\n  loan_payment BLOB,\n  loan_drawdown BLOB,\n  loan_charge BLOB,\n  loan_refund BLOB,\n  activity_token TEXT\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO loanTransaction(\n  token, type, credit_line_token, loan_token, date, is_outstanding, loan_payment,\n  loan_drawdown, loan_charge, loan_refund, activity_token\n)\nSELECT token, type, credit_line_token, loan_token, date, is_outstanding, loan_payment,\n       loan_drawdown, loan_charge, NULL, activity_token\nFROM loanTransaction_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE loanTransaction_old", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW loanTransactionWithActivityCheck AS\nSELECT loanTransaction.*, (\n\tSELECT count(*) > 0\n\tFROM payments_model\n\tWHERE payments_model.token = loanTransaction.activity_token\n) AS activity_exists\nFROM loanTransaction", null);
            }
            if (j > 361 || j2 <= 361) {
                str40 = str31;
                str41 = "DROP VIEW IF EXISTS activityRecipient";
            } else {
                androidSqliteDriver.execute(num15, "DROP TABLE investing_data", null);
                str40 = str31;
                androidSqliteDriver.execute(num15, str40, null);
                str41 = "DROP VIEW IF EXISTS activityRecipient";
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n  DELETE FROM supportFlowEvent;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\nEND", null);
            }
            if (j <= 362 && j2 > 362) {
                androidSqliteDriver.execute(num15, "DROP TABLE investing_news_article", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_news_article (\n  kind TEXT NOT NULL,\n  provider TEXT NOT NULL,\n  provider_avatar BLOB NOT NULL,\n  headline TEXT NOT NULL,\n  published_at_millis INTEGER NOT NULL,\n  url TEXT,\n  display_in_carousel INTEGER NOT NULL\n)", null);
            }
            if (j <= 363 && j2 > 363) {
                androidSqliteDriver.execute(num15, str40, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n  DELETE FROM supportFlowEvent;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\nEND", null);
            }
            if (j <= 364 && j2 > 364) {
                androidSqliteDriver.execute(num15, "DROP TABLE investing_news_article", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_news_article (\n  kind TEXT NOT NULL,\n  provider TEXT NOT NULL,\n  provider_avatar BLOB NOT NULL,\n  headline TEXT NOT NULL,\n  published_at_millis INTEGER,\n  url TEXT,\n  display_in_carousel INTEGER NOT NULL\n)", null);
            }
            if (j <= 365 && j2 > 365) {
                androidSqliteDriver.execute(num15, "DROP TABLE investing_news_article", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_news_article (\n  kind TEXT NOT NULL,\n  provider TEXT NOT NULL,\n  provider_avatar BLOB NOT NULL,\n  headline TEXT NOT NULL,\n  published_at_millis INTEGER,\n  url TEXT,\n  display_in_carousel INTEGER NOT NULL,\n  saved_at_millis INTEGER NOT NULL\n)", null);
            }
            if (j <= 366 && j2 > 366) {
                androidSqliteDriver.execute(num15, "CREATE TABLE custom_order (\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  token TEXT NOT NULL UNIQUE,\n  entity_id TEXT NOT NULL UNIQUE,\n  type TEXT NOT NULL,\n  side TEXT NOT NULL,\n  original_price BLOB NOT NULL,\n  target_price BLOB NOT NULL,\n  target_bps INTEGER NOT NULL,\n  order_amount BLOB NOT NULL,\n  ordered_at_millis INTEGER NOT NULL,\n  expiration_date_millis INTEGER NOT NULL,\n  entity_token TEXT\n)", null);
            }
            if (j <= 367 && j2 > 367) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN custom_order_configuration BLOB", null);
            }
            if (j <= 368 && j2 > 368) {
                androidSqliteDriver.execute(num15, "ALTER TABLE payment\nADD COLUMN rollup_type TEXT DEFAULT NULL", null);
            }
            if (j > 369 || j2 <= 369) {
                str42 = str12;
                str43 = str32;
                str44 = str28;
                str45 = "DROP VIEW IF EXISTS loanTransactionWithActivityCheck";
            } else {
                str42 = str12;
                androidSqliteDriver.execute(num15, str42, null);
                str43 = str32;
                androidSqliteDriver.execute(num15, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at, their_id, display_date, _id, sender_amount,\n       recipient_amount, boost_amount, paid_out_at, refunded_at, updated_at, is_badged, rollup_type,\n       coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n       coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled, scheduled_for, scheduled_payment_token,\n       coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                str44 = str28;
                androidSqliteDriver.execute(num15, str44, null);
                str45 = "DROP VIEW IF EXISTS loanTransactionWithActivityCheck";
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  state,\n  role,\n  amount,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo_url,\n  avatar.accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j <= 370 && j2 > 370) {
                androidSqliteDriver.execute(num15, "ALTER TABLE balanceData ADD COLUMN dda_form BLOB DEFAULT NULL", null);
            }
            if (j <= 371 && j2 > 371) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS custom_order", null);
            }
            if (j <= 372 && j2 > 372) {
                androidSqliteDriver.execute(num15, "DROP VIEW activityCustomer", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments,\n       cash_merchant_token IS NOT NULL AS has_loyalty_data\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyData ON (parent.customer_id = cash_merchant_token)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments, 0 == 0\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (\n  SELECT parent_id\n  FROM customerRelation\n  WHERE child_id IN (SELECT their_id FROM payments_model)\n)\n\nORDER BY display_date DESC", null);
            }
            if (j <= 373 && j2 > 373) {
                androidSqliteDriver.execute(num15, "ALTER TABLE creditLine ADD COLUMN fee_status_data BLOB", null);
            }
            if (j <= 374 && j2 > 374) {
                androidSqliteDriver.execute(num15, "CREATE TABLE loyaltyNotificationPreference (\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  title TEXT NOT NULL,\n  enabled INTEGER DEFAULT 0\n)", null);
            }
            if (j <= 375 && j2 > 375) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investment_entity ADD COLUMN delisted INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 376 && j2 > 376) {
                androidSqliteDriver.execute(num15, "ALTER TABLE creditLine ADD COLUMN unlock_borrow_data BLOB", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE creditLine ADD COLUMN instrument_display_name TEXT", null);
            }
            if (j <= 377 && j2 > 377) {
                androidSqliteDriver.execute(num15, "CREATE TABLE investment_incentive (\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  token TEXT NOT NULL UNIQUE,\n  entity_id TEXT NOT NULL UNIQUE,\n  offer_amount BLOB NOT NULL,\n  state TEXT NOT NULL,\n  icon BLOB NOT NULL,\n  text TEXT NOT NULL,\n  expiration_timestamp_millis INTEGER NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, str40, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n  DELETE FROM supportFlowEvent;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\nEND", null);
            }
            if (j <= 378 && j2 > 378) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investment_entity ADD COLUMN entity_color BLOB", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE category ADD COLUMN category_color BLOB", null);
            }
            if (j <= 379 && j2 > 379) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN first_time_congrats_equity_title TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN first_time_congrats_equity_text TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN first_time_congrats_equity_detail_title TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN first_time_congrats_equity_detail_text TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN first_time_congrats_bitcoin_title TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN first_time_congrats_bitcoin_text TEXT", null);
            }
            if (j <= 380 && j2 > 380) {
                androidSqliteDriver.execute(num15, "ALTER TABLE balanceData ADD COLUMN bitcoin_p2p_enabled INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 381 && j2 > 381) {
                androidSqliteDriver.execute(num15, "ALTER TABLE loyaltyProgram ADD COLUMN render_data TEXT", null);
                androidSqliteDriver.execute(num15, str42, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at, their_id, display_date, _id, sender_amount,\n       recipient_amount, boost_amount, paid_out_at, refunded_at, updated_at, is_badged, rollup_type,\n       coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n       coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled, scheduled_for, scheduled_payment_token,\n       coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden, loyalty.render_data AS loyalty_render_data\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nLEFT JOIN loyaltyProgram AS loyalty ON (payment.recipient_id = loyalty.cash_merchant_token)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num15, str44, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo_url,\n  avatar.accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j <= 382 && j2 > 382) {
                androidSqliteDriver.execute(num15, "ALTER TABLE payment\nADD COLUMN investment_order_type TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, str42, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at, their_id, display_date, _id, sender_amount,\n       recipient_amount, boost_amount, paid_out_at, refunded_at, updated_at, is_badged, rollup_type,\n       investment_order_type,\n       coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n       coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled, scheduled_for, scheduled_payment_token,\n       coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden, loyalty.render_data AS loyalty_render_data\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nLEFT JOIN loyaltyProgram AS loyalty ON (payment.recipient_id = loyalty.cash_merchant_token)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num15, str44, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo_url,\n  avatar.accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j > 383 || j2 <= 383) {
                String str67 = str39;
                str46 = str40;
                str47 = str10;
                str48 = str67;
            } else {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeProfileAliasWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeInstitutionsConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeCryptocurrencyConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeCashDrawerConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeBlockersConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeSupportConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeStampsConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeSharingConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeRecipientConfigWithprofile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeReactionConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeRatePlanConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removePaymentHistoryConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeOfflineConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeInvitationConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeWebLoginConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeBitcoinTransactionCustomerIdsWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeScenarioPlanWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeBalanceDataWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeInstrumentLinkingOptionWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeNotificationPreferenceWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeLocationConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE profile RENAME TO profile_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE profile (\n  profile_id TEXT NOT NULL PRIMARY KEY,\n  full_name TEXT,\n  photo_url TEXT,\n  require_passcode_confirmation INTEGER NOT NULL,\n  has_passcode INTEGER NOT NULL,\n  nearby_visibility TEXT NOT NULL,\n  cashtag TEXT,\n  cashtag_url TEXT,\n  cashtag_url_display_text TEXT,\n  cashtag_url_enabled INTEGER NOT NULL DEFAULT 0,\n  rate_plan TEXT NOT NULL,\n  can_upgrade_to_business INTEGER NOT NULL DEFAULT 0,\n  is_verified_account INTEGER NOT NULL,\n  app_message_notifications_enabled INTEGER NOT NULL DEFAULT 0,\n  verification_instrument_token TEXT,\n  deposit_preference TEXT,\n  address BLOB,\n  deposit_preference_data BLOB,\n  request_minimum_note_length INTEGER NOT NULL DEFAULT 0,\n  cash_drawer_data BLOB,\n  country_code TEXT,\n  default_currency TEXT NOT NULL,\n  customer_since INTEGER,\n  profile_token TEXT DEFAULT NULL,\n  incoming_request_policy TEXT DEFAULT NULL,\n  has_passed_idv INTEGER DEFAULT NULL,\n  cashtag_qr_image_url TEXT DEFAULT NULL,\n  cashtag_with_currency_symbol TEXT DEFAULT NULL,\n  available_p2p_target_regions BLOB DEFAULT NULL,\n  printable_cashtag_qr_image_url TEXT DEFAULT NULL,\n  region TEXT,\n  direct_deposit_account_enabled INTEGER NOT NULL DEFAULT 0,\n  bitcoin_display_units TEXT,\n  instagram_share_qr_data BLOB\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO profile(profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n    nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n    rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n    verification_instrument_token, deposit_preference, address, deposit_preference_data,\n    request_minimum_note_length, cash_drawer_data, country_code, default_currency, customer_since,\n    profile_token, incoming_request_policy, has_passed_idv, cashtag_qr_image_url,\n    cashtag_with_currency_symbol, available_p2p_target_regions, printable_cashtag_qr_image_url,\n    region, direct_deposit_account_enabled, bitcoin_display_units, instagram_share_qr_data)\nSELECT profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n    nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n    rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n    verification_instrument_token, deposit_preference, address, deposit_preference_data,\n    request_minimum_note_length, cash_drawer_data, country_code, default_currency, customer_since,\n    profile_token, incoming_request_policy, has_passed_idv, cashtag_qr_image_url,\n    cashtag_with_currency_symbol, available_p2p_target_regions, printable_cashtag_qr_image_url,\n    region, direct_deposit_account_enabled, bitcoin_display_units, instagram_share_qr_data\nFROM profile_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE profile_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE checkDepositConfig (\n  light_image_url TEXT DEFAULT NULL,\n  dark_image_url TEXT DEFAULT NULL,\n  description TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO checkDepositConfig DEFAULT VALUES", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeCheckDepositConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM checkDepositConfig;\nINSERT INTO checkDepositConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(num15, str18, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeInstitutionsConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM institutionsConfig;\nINSERT INTO institutionsConfig (rowid) VALUES (NULL);\nEND", null);
                String str68 = str39;
                androidSqliteDriver.execute(num15, str68, null);
                str46 = str40;
                androidSqliteDriver.execute(num15, str37, null);
                androidSqliteDriver.execute(num15, str30, null);
                androidSqliteDriver.execute(num15, str25, null);
                androidSqliteDriver.execute(num15, str23, null);
                androidSqliteDriver.execute(num15, str21, null);
                androidSqliteDriver.execute(num15, str19, null);
                androidSqliteDriver.execute(num15, str14, null);
                androidSqliteDriver.execute(num15, str13, null);
                str47 = str10;
                androidSqliteDriver.execute(num15, str47, null);
                str48 = str68;
                androidSqliteDriver.execute(num15, str9, null);
                androidSqliteDriver.execute(num15, str8, null);
                androidSqliteDriver.execute(num15, str, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeBitcoinTransactionCustomerIdsWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM bitcoinTransactionCustomerIds;\nEND", null);
                androidSqliteDriver.execute(num15, str7, null);
                androidSqliteDriver.execute(num15, str6, null);
                androidSqliteDriver.execute(num15, str5, null);
                androidSqliteDriver.execute(num15, str2, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeLocationConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM locationConfig;\nINSERT INTO locationConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n  DELETE FROM supportFlowEvent;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\nEND", null);
            }
            if (j <= 384 && j2 > 384) {
                androidSqliteDriver.execute(num15, "PRAGMA foreign_keys=off", null);
                androidSqliteDriver.execute(num15, str22, null);
                androidSqliteDriver.execute(num15, "ALTER TABLE reward RENAME TO reward_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS reward (\n  token TEXT NOT NULL PRIMARY KEY,\n  category TEXT,\n  avatars BLOB,\n  title TEXT,\n  main_text TEXT,\n  program_detail_rows BLOB,\n  footer_text TEXT,\n  boost_detail_rows BLOB,\n  boost_attributes BLOB,\n  full_title_text TEXT,\n  expiration_date_time_ms INTEGER,\n  activation_date_time_ms INTEGER,\n  discount_text TEXT,\n  reward_selection_state BLOB\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO reward(token, category, avatars, title, main_text, program_detail_rows,\nfooter_text, boost_detail_rows, boost_attributes, full_title_text, expiration_date_time_ms,\nactivation_date_time_ms, discount_text)\nSELECT token, category, avatars, title, main_text, program_detail_rows,\nfooter_text, boost_detail_rows, boost_attributes, full_title_text, expiration_date_time_ms,\nactivation_date_time_ms, discount_text\nFROM reward_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE reward_old", null);
                androidSqliteDriver.execute(num15, "DROP VIEW rewardWithSelection", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW rewardWithSelection AS\nSELECT reward.*, rewardSelection.reward_selection\nFROM reward\nLEFT JOIN rewardSelection ON reward.token = rewardSelection.reward_token\nGROUP BY reward.token", null);
                androidSqliteDriver.execute(num15, str36, null);
                androidSqliteDriver.execute(num15, str38, null);
            }
            if (j <= 385 && j2 > 385) {
                androidSqliteDriver.execute(num15, "ALTER TABLE loyaltyProgram ADD COLUMN program_details TEXT", null);
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS loyaltyData", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW loyaltyData AS\nSELECT cash_merchant_token, account_status_url, customer_phone_number, last_time_visited,\n       points_earned, program_rewards, loyalty_unit, program_details\nFROM loyaltyAccount\nJOIN loyaltyProgram ON loyalty_program_id = program_id", null);
            }
            if (j <= 386 && j2 > 386) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investment_holding ADD COLUMN daily_gain_params BLOB", null);
            }
            if (j <= 387 && j2 > 387) {
                androidSqliteDriver.execute(num15, "ALTER TABLE reward ADD COLUMN draggable INTEGER NOT NULL DEFAULT 1", null);
            }
            if (j <= 388 && j2 > 388) {
                androidSqliteDriver.execute(num15, "ALTER TABLE payment ADD COLUMN payment_type TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, str42, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at, their_id, display_date, _id, sender_amount,\n       recipient_amount, boost_amount, paid_out_at, refunded_at, updated_at, is_badged, rollup_type,\n       investment_order_type, payment_type,\n       coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n       coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled, scheduled_for, scheduled_payment_token,\n       coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden, loyalty.render_data AS loyalty_render_data\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nLEFT JOIN loyaltyProgram AS loyalty ON (payment.recipient_id = loyalty.cash_merchant_token)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num15, str44, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo_url,\n  avatar.accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removePaymentHistoryConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE paymentHistoryConfig ADD COLUMN top_level_feed_payment_type_deny_list BLOB DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, str47, null);
            }
            if (j <= 389 && j2 > 389) {
                androidSqliteDriver.execute(num15, "ALTER TABLE category ADD COLUMN ui_order INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 390 && j2 > 390) {
                androidSqliteDriver.execute(num15, "CREATE TABLE fullScreenAdConfig(\n  token TEXT NOT NULL PRIMARY KEY,\n  config BLOB DEFAULT NULL\n)", null);
            }
            if (j <= 391 && j2 > 391) {
                androidSqliteDriver.execute(num15, "ALTER TABLE boostConfig ADD COLUMN bitcoinBoostUpsell BLOB DEFAULT NULL", null);
            }
            if (j <= 392 && j2 > 392) {
                androidSqliteDriver.execute(num15, "CREATE TABLE investment_notification_option (\n  id TEXT PRIMARY KEY NOT NULL,\n  enabled INTEGER NOT NULL\n)", null);
            }
            if (j <= 393 && j2 > 393) {
                androidSqliteDriver.execute(num15, str34, null);
                androidSqliteDriver.execute(num15, "CREATE TABLE cardDesign (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  white_signature BLOB,\n  black_signature BLOB,\n  encoded_signature TEXT,\n  stamps BLOB DEFAULT NULL,\n  touch_data BLOB DEFAULT NULL,\n  card_theme BLOB DEFAULT NULL,\n  controls_theme BLOB DEFAULT NULL,\n  cashtag_enabled INTEGER NOT NULL DEFAULT 0,\n  cashtag_on_top INTEGER NOT NULL DEFAULT 0\n)", null);
            }
            if (j > 394 || j2 <= 394) {
                str49 = "PRAGMA foreign_keys=off";
                str50 = str38;
                str51 = str36;
                str52 = str2;
                str53 = str5;
                str54 = str6;
                str55 = str7;
                str56 = "CREATE TRIGGER removeLocationConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM locationConfig;\nINSERT INTO locationConfig (rowid) VALUES (NULL);\nEND";
            } else {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeCheckDepositConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeProfileAliasWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeInstitutionsConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeCryptocurrencyConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeCashDrawerConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeBlockersConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeSupportConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeStampsConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeSharingConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeRecipientConfigWithprofile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeReactionConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeRatePlanConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removePaymentHistoryConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeOfflineConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeInvitationConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeWebLoginConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeBitcoinTransactionCustomerIdsWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeScenarioPlanWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeBalanceDataWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeInstrumentLinkingOptionWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeNotificationPreferenceWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeLocationConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE profile RENAME TO profile_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE profile (\n  profile_id TEXT NOT NULL PRIMARY KEY,\n  full_name TEXT,\n  photo_url TEXT,\n  require_passcode_confirmation INTEGER NOT NULL,\n  has_passcode INTEGER NOT NULL,\n  nearby_visibility TEXT NOT NULL,\n  cashtag TEXT,\n  cashtag_url TEXT,\n  cashtag_url_display_text TEXT,\n  cashtag_url_enabled INTEGER NOT NULL DEFAULT 0,\n  rate_plan TEXT NOT NULL,\n  can_upgrade_to_business INTEGER NOT NULL DEFAULT 0,\n  is_verified_account INTEGER NOT NULL,\n  app_message_notifications_enabled INTEGER NOT NULL DEFAULT 0,\n  verification_instrument_token TEXT,\n  deposit_preference TEXT,\n  address BLOB,\n  deposit_preference_data BLOB,\n  request_minimum_note_length INTEGER NOT NULL DEFAULT 0,\n  cash_drawer_data BLOB,\n  country_code TEXT,\n  default_currency TEXT NOT NULL,\n  customer_since INTEGER,\n  profile_token TEXT DEFAULT NULL,\n  incoming_request_policy TEXT DEFAULT NULL,\n  has_passed_idv INTEGER DEFAULT NULL,\n  cashtag_qr_image_url TEXT DEFAULT NULL,\n  cashtag_with_currency_symbol TEXT DEFAULT NULL,\n  available_p2p_target_regions BLOB DEFAULT NULL,\n  printable_cashtag_qr_image_url TEXT DEFAULT NULL,\n  region TEXT,\n  direct_deposit_account_enabled INTEGER NOT NULL DEFAULT 0,\n  bitcoin_display_units TEXT,\n  instagram_share_qr_data BLOB\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO profile(profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n    nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n    rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n    verification_instrument_token, deposit_preference, address, deposit_preference_data,\n    request_minimum_note_length, cash_drawer_data, country_code, default_currency, customer_since,\n    profile_token, incoming_request_policy, has_passed_idv, cashtag_qr_image_url,\n    cashtag_with_currency_symbol, available_p2p_target_regions, printable_cashtag_qr_image_url,\n    region, direct_deposit_account_enabled, bitcoin_display_units, instagram_share_qr_data)\nSELECT profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n    nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n    rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n    verification_instrument_token, deposit_preference, address, deposit_preference_data,\n    request_minimum_note_length, cash_drawer_data, country_code, default_currency, customer_since,\n    profile_token, incoming_request_policy, has_passed_idv, cashtag_qr_image_url,\n    cashtag_with_currency_symbol, available_p2p_target_regions, printable_cashtag_qr_image_url,\n    region, direct_deposit_account_enabled, bitcoin_display_units, instagram_share_qr_data\nFROM profile_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE profile_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE bankingConfig (\n  main_screen_title TEXT DEFAULT NULL,\n  main_screen_balance_subtitle TEXT DEFAULT NULL,\n  balance_screen_title TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO bankingConfig DEFAULT VALUES", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeBankingConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM bankingConfig;\nINSERT INTO bankingConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeCheckDepositConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM checkDepositConfig;\nINSERT INTO checkDepositConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(num15, str18, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeInstitutionsConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM institutionsConfig;\nINSERT INTO institutionsConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(num15, str48, null);
                androidSqliteDriver.execute(num15, str37, null);
                androidSqliteDriver.execute(num15, str30, null);
                androidSqliteDriver.execute(num15, str25, null);
                androidSqliteDriver.execute(num15, str23, null);
                androidSqliteDriver.execute(num15, str21, null);
                androidSqliteDriver.execute(num15, str19, null);
                androidSqliteDriver.execute(num15, str14, null);
                androidSqliteDriver.execute(num15, str13, null);
                androidSqliteDriver.execute(num15, str47, null);
                androidSqliteDriver.execute(num15, str9, null);
                androidSqliteDriver.execute(num15, str8, null);
                androidSqliteDriver.execute(num15, str, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeBitcoinTransactionCustomerIdsWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM bitcoinTransactionCustomerIds;\nEND", null);
                str55 = str7;
                androidSqliteDriver.execute(num15, str55, null);
                str54 = str6;
                androidSqliteDriver.execute(num15, str54, null);
                str53 = str5;
                androidSqliteDriver.execute(num15, str53, null);
                str50 = str38;
                str52 = str2;
                androidSqliteDriver.execute(num15, str52, null);
                str49 = "PRAGMA foreign_keys=off";
                str56 = "CREATE TRIGGER removeLocationConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM locationConfig;\nINSERT INTO locationConfig (rowid) VALUES (NULL);\nEND";
                androidSqliteDriver.execute(num15, str56, null);
                str51 = str36;
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n  DELETE FROM supportFlowEvent;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\nEND", null);
            }
            if (j <= 395 && j2 > 395) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investment_notification_option\nADD COLUMN config BLOB DEFAULT NULL", null);
            }
            if (j <= 396 && j2 > 396) {
                androidSqliteDriver.execute(num15, "DROP VIEW loyaltyData", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW loyaltyData AS\nSELECT cash_merchant_token, account_status_url, customer_phone_number, last_time_visited,\n       points_earned, program_rewards, loyalty_unit, program_details, loyalty_program_id, account_id\nFROM loyaltyAccount\nJOIN loyaltyProgram ON loyalty_program_id = program_id", null);
            }
            if (j > 397 || j2 <= 397) {
                str57 = str22;
                str58 = "DROP VIEW activityCustomer";
            } else {
                androidSqliteDriver.execute(num15, "CREATE TABLE loyaltyHiddenPaymentTypes (\n  payment_type TEXT NOT NULL UNIQUE\n)", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE paymentHistoryConfig\nADD loyalty_merchant_hidden_payment_types BLOB DEFAULT NULL", null);
                str58 = "DROP VIEW activityCustomer";
                androidSqliteDriver.execute(num15, str58, null);
                str57 = str22;
                androidSqliteDriver.execute(num15, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments,\n       cash_merchant_token IS NOT NULL AS has_loyalty_data\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyData ON (parent.customer_id = cash_merchant_token)\nWHERE payment_type NOT IN (SELECT payment_type FROM loyaltyHiddenPaymentTypes)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments, 0 == 0\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (\n  SELECT parent_id\n  FROM customerRelation\n  WHERE child_id IN (SELECT their_id FROM payments_model)\n)\n\nORDER BY display_date DESC", null);
            }
            if (j <= 398 && j2 > 398) {
                androidSqliteDriver.execute(num15, str58, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments,\n       cash_merchant_token IS NOT NULL AS has_loyalty_data\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyData ON (parent.customer_id = cash_merchant_token)\nWHERE payment_type IS NULL\nOR payment_type NOT IN (SELECT payment_type FROM loyaltyHiddenPaymentTypes)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments, 0 == 0\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (\n  SELECT parent_id\n  FROM customerRelation\n  WHERE child_id IN (SELECT their_id FROM payments_model)\n)\n\nORDER BY display_date DESC", null);
            }
            if (j <= 399 && j2 > 399) {
                androidSqliteDriver.execute(num15, "ALTER TABLE creditLine ADD COLUMN status_icon TEXT", null);
            }
            if (j <= 400 && j2 > 400) {
                androidSqliteDriver.execute(num15, "CREATE TABLE cardTabNullStateSwipeConfig(\n  config BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO cardTabNullStateSwipeConfig DEFAULT VALUES", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE cardTabNullStateScrollConfig(\n  config BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO cardTabNullStateScrollConfig DEFAULT VALUES", null);
            }
            if (j <= 401 && j2 > 401) {
                androidSqliteDriver.execute(num15, "DROP TABLE cardTabNullStateConfig", null);
            }
            if (j <= 402 && j2 > 402) {
                androidSqliteDriver.execute(num15, "CREATE TABLE new_loan(\n  token TEXT NOT NULL PRIMARY KEY,\n  credit_line_token TEXT NOT NULL,\n  borrowed_at INTEGER NOT NULL,\n  due_at INTEGER,\n  principal_amount BLOB NOT NULL,\n  setup_fee_amount BLOB,\n  outstanding_amount BLOB,\n  late_fee_amount BLOB,\n  interest_amount BLOB,\n  setup_fee_bps INTEGER NOT NULL,\n  detail_rows BLOB,\n  state TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO new_loan\nSELECT token,\n       credit_line_token,\n       borrowed_at,\n       NULL,\n       principal_amount,\n       setup_fee_amount,\n       outstanding_amount,\n       late_fee_amount,\n       interest_amount,\n       setup_fee_bps,\n       detail_rows,\n       state\nFROM loan", null);
                androidSqliteDriver.execute(num15, "DROP TABLE loan", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE new_loan RENAME TO loan", null);
            }
            if (j <= 403 && j2 > 403) {
                androidSqliteDriver.execute(num15, "DROP VIEW loanTransactionWithActivityCheck", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW loanTransactionWithActivityCheck AS\nSELECT loanTransaction.*,\n       loan.state AS loan_state,\n       loan.due_at AS loan_due_at,\n       (\n        SELECT count(*) > 0\n        FROM payments_model\n        WHERE payments_model.token = loanTransaction.activity_token\n      ) AS activity_exists\nFROM loanTransaction\nJOIN loan ON loan.token = loanTransaction.token", null);
            }
            if (j <= 404 && j2 > 404) {
                androidSqliteDriver.execute(num15, str58, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments,\n       cash_merchant_token IS NOT NULL AS has_loyalty_data\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyData ON (parent.customer_id = cash_merchant_token)\nWHERE payment_type IS NULL\nOR payment_type NOT IN (SELECT payment_type FROM loyaltyHiddenPaymentTypes)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments, 0 == 0\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (\n  SELECT parent_id\n  FROM customerRelation\n  WHERE child_id IN (\n    SELECT their_id\n    FROM payments_model\n    WHERE payment_type IS NULL\n    OR payment_type NOT IN (SELECT payment_type FROM loyaltyHiddenPaymentTypes)\n  )\n)\n\nORDER BY display_date DESC", null);
            }
            if (j <= 405 && j2 > 405) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investment_entity ADD COLUMN icon BLOB", null);
            }
            if (j <= 406 && j2 > 406) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profile ADD COLUMN bitcoin_amount_entry_currency_preference TEXT DEFAULT NULL", null);
            }
            if (j <= 407 && j2 > 407) {
                androidSqliteDriver.execute(num15, "CREATE TABLE analyticsMessage(\n  message_id TEXT PRIMARY KEY,\n  timestamp INTEGER NOT NULL,\n  message BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX idx_analyticsMessage_timestamp ON analyticsMessage (timestamp)", null);
            }
            if (j <= 408 && j2 > 408) {
                androidSqliteDriver.execute(num15, "DROP INDEX IF EXISTS idx_analyticsMessage_timestamp", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS analyticsMessage", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE analytics_message(\n  message_uuid TEXT NOT NULL PRIMARY KEY,\n  recorded_at INTEGER NOT NULL,\n  payload BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX idx_analyticsMessage_timestamp ON analytics_message (recorded_at)", null);
            }
            if (j <= 409 && j2 > 409) {
                androidSqliteDriver.execute(num15, str46, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n  DELETE FROM supportFlowEvent;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\n  DELETE FROM investment_notification_option;\nEND", null);
            }
            if (j <= 410 && j2 > 410) {
                androidSqliteDriver.execute(num15, str45, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW loanTransactionWithActivityCheck AS\nSELECT loanTransaction.*,\n       loan.state AS loan_state,\n       loan.due_at AS loan_due_at,\n       (\n        SELECT count(*) > 0\n        FROM payments_model\n        WHERE payments_model.token = loanTransaction.activity_token\n      ) AS activity_exists\nFROM loanTransaction\nLEFT JOIN loan ON loan.token = loanTransaction.token", null);
            }
            if (j <= 411 && j2 > 411) {
                androidSqliteDriver.execute(num15, "ALTER TABLE creditLine ADD COLUMN skip_loan_amount_selection INTEGER", null);
            }
            if (j <= 412 && j2 > 412) {
                androidSqliteDriver.execute(num15, "CREATE TABLE new_appMessage (\n  message_token TEXT NOT NULL PRIMARY KEY,\n  state TEXT NOT NULL,\n  presentation_mode TEXT,\n  toggle BLOB,\n  theme TEXT,\n  colors BLOB,\n  shouldBadgeActivity INTEGER DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO new_appMessage\nSELECT message_token, state, presentation_mode, toggle, theme, colors, shouldBadgeActivity\nFROM appMessage", null);
                androidSqliteDriver.execute(num15, "DROP TABLE appMessage", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE new_appMessage RENAME TO appMessage", null);
            }
            if (j <= 413 && j2 > 413) {
                androidSqliteDriver.execute(num15, "CREATE TABLE new_appMessage (\n  message_token TEXT NOT NULL PRIMARY KEY,\n  state TEXT NOT NULL,\n  toggle BLOB\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO new_appMessage\nSELECT message_token, state, toggle\nFROM appMessage", null);
                androidSqliteDriver.execute(num15, "DROP TABLE appMessage", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE new_appMessage RENAME TO appMessage", null);
            }
            if (j <= 414 && j2 > 414) {
                androidSqliteDriver.execute(num15, "DROP TABLE appMessage", null);
            }
            if (j <= 415 && j2 > 415) {
                androidSqliteDriver.execute(num15, "DROP INDEX IF EXISTS idx_analyticsMessage_timestamp", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS analytics_message", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE analytics_message(\n  message_uuid TEXT NOT NULL PRIMARY KEY,\n  recorded_at INTEGER NOT NULL,\n  payload BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX idx_analyticsMessage_timestamp ON analytics_message (recorded_at)", null);
            }
            if (j <= 416 && j2 > 416) {
                androidSqliteDriver.execute(num15, "ALTER TABLE payment\nADD COLUMN gifted_investment_entity_token TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, str42, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW payments_model AS\nSELECT amount, token, orientation, role, state, payment.render_data AS payment_render_data,\n       sender.render_data AS sender_render_data, recipient.render_data AS recipient_render_data,\n       recipient_id, sender_id, captured_at, created_at, their_id, display_date, _id, sender_amount,\n       recipient_amount, boost_amount, paid_out_at, refunded_at, updated_at, is_badged, rollup_type,\n       investment_order_type, payment_type, gifted_investment_entity_token,\n       coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding, external_id,\n       (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n       coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled, scheduled_for, scheduled_payment_token,\n       coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden, loyalty.render_data AS loyalty_render_data\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nLEFT JOIN loyaltyProgram AS loyalty ON (payment.recipient_id = loyalty.cash_merchant_token)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num15, str44, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo_url,\n  avatar.accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j <= 417 && j2 > 417) {
                androidSqliteDriver.execute(num15, str44, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo_url,\n  avatar.accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j <= 418 && j2 > 418) {
                androidSqliteDriver.execute(num15, "CREATE TABLE balance_snapshot(\n  instrument_token TEXT PRIMARY KEY,\n  balance_amount INTEGER,\n  balance_currency TEXT\n)", null);
            }
            if (j <= 419 && j2 > 419) {
                androidSqliteDriver.execute(num15, "CREATE VIEW balance_snapshot_instrument AS\nSELECT balance_snapshot.*, instrument.cash_instrument_type\nFROM balance_snapshot\nJOIN instrument\nON balance_snapshot.instrument_token = instrument.token", null);
            }
            if (j <= 420 && j2 > 420) {
                androidSqliteDriver.execute(num15, "ALTER TABLE customer ADD COLUMN photo BLOB DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE customer ADD COLUMN themed_accent_color BLOB DEFAULT NULL", null);
            }
            if (j <= 421 && j2 > 421) {
                androidSqliteDriver.execute(num15, "ALTER TABLE lendingConfig ADD COLUMN instrument_client_scenario TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE lendingConfig ADD COLUMN deep_link_client_scenario TEXT DEFAULT NULL", null);
            }
            if (j <= 423 && j2 > 423) {
                androidSqliteDriver.execute(num15, "CREATE TABLE transfer_customer_ids(\n  id TEXT NOT NULL PRIMARY KEY\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE banking_transaction_customer_ids(\n  id TEXT NOT NULL PRIMARY KEY\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE lending_transaction_customer_ids(\n  id TEXT NOT NULL PRIMARY KEY\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE referral_customer_ids(\n  id TEXT NOT NULL PRIMARY KEY\n)", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removePaymentHistoryConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removePaymentHistoryConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM paymentHistoryConfig;\nDELETE FROM transfer_customer_ids;\nDELETE FROM banking_transaction_customer_ids;\nDELETE FROM lending_transaction_customer_ids;\nDELETE FROM referral_customer_ids;\nINSERT INTO paymentHistoryConfig(rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(num15, "DROP TABLE paymentHistoryConfig", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE paymentHistoryConfig (\n  script_url TEXT DEFAULT NULL,\n  search_url TEXT DEFAULT NULL,\n  top_level_feed_payment_type_deny_list BLOB DEFAULT NULL,\n  loyalty_merchant_hidden_payment_types BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO paymentHistoryConfig DEFAULT VALUES", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW externalIds AS\nSELECT * FROM transfer_customer_ids\nUNION\nSELECT * FROM banking_transaction_customer_ids\nUNION\nSELECT * FROM lending_transaction_customer_ids\nUNION\nSELECT * FROM referral_customer_ids\nUNION\nSELECT * FROM bitcoinTransactionCustomerIds", null);
                androidSqliteDriver.execute(num15, str58, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments,\n       cash_merchant_token IS NOT NULL AS has_loyalty_data,\n       (their_id NOT IN (SELECT * FROM externalIds) AND\n         child.merchant_data IS NULL AND\n         child.investment_entity_token IS NULL\n       ) = 1 AS isRegular\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyData ON (parent.customer_id = cash_merchant_token)\nWHERE payment_type IS NULL\nOR payment_type NOT IN (SELECT payment_type FROM loyaltyHiddenPaymentTypes)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments, 0 == 0,\n       0 = 1\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (\n  SELECT parent_id\n  FROM customerRelation\n  WHERE child_id IN (\n    SELECT their_id\n    FROM payments_model\n    WHERE payment_type IS NULL\n    OR payment_type NOT IN (SELECT payment_type FROM loyaltyHiddenPaymentTypes)\n  )\n)\n\nORDER BY display_date DESC", null);
                androidSqliteDriver.execute(num15, str44, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo_url,\n  avatar.accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT display_name, accent_color, photo_url, customer_display_name, cashtag, email, sms,\n         threaded_customer_id, merchant_data, customer.customer_id, contact.lookup_key, investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j <= 424 && j2 > 424) {
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS balance_snapshot_instrument", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW IF NOT EXISTS balanceSnapshotInstrument AS\nSELECT\n  balance_snapshot.instrument_token,\n  instrument.cash_instrument_type,\n  instrument.card_brand,\n  instrument.suffix,\n  instrument.bank_name,\n  instrument.icon_url,\n  balance_snapshot.balance_currency,\n  balance_snapshot.balance_amount,\n  instrument.version,\n  instrument.detail_icon_url,\n  instrument.display_name,\n  instrument.wallet_address,\n  instrument.pending_verification,\n  instrument.selection_icon_url,\n  instrument.sync_entity_id\nFROM balance_snapshot\nJOIN instrument\nON balance_snapshot.instrument_token = instrument.token\nWHERE cash_instrument_type = 'CASH_BALANCE'\nUNION\nSELECT\n  instrument.token,\n  instrument.cash_instrument_type,\n  instrument.card_brand,\n  instrument.suffix,\n  instrument.bank_name,\n  instrument.icon_url,\n  instrument.balance_currency,\n  instrument.balance_amount,\n  instrument.version,\n  instrument.detail_icon_url,\n  instrument.display_name,\n  instrument.wallet_address,\n  instrument.pending_verification,\n  instrument.selection_icon_url,\n  instrument.sync_entity_id\nFROM instrument\nWHERE cash_instrument_type != 'CASH_BALANCE'", null);
            }
            if (j <= 425 && j2 > 425) {
                androidSqliteDriver.execute(num15, "CREATE TABLE p2pSettings(\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  require_minimum_initiator_notes_length_for_requests INTEGER,\n  incoming_request_policy TEXT,\n  nearby_visibility TEXT,\n  rate_plan TEXT,\n  can_upgrade_to_business INTEGER,\n  deposit_preference TEXT,\n  cash_balance_home_screen_button_enabled INTEGER\n)", null);
            }
            if (j <= 426 && j2 > 426) {
                androidSqliteDriver.execute(num15, "ALTER TABLE p2pSettings RENAME TO temp", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE p2pSettings(\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  require_minimum_initiator_notes_length_for_requests INTEGER NOT NULL DEFAULT 0,\n  incoming_request_policy TEXT,\n  nearby_visibility TEXT,\n  rate_plan TEXT,\n  can_upgrade_to_business INTEGER,\n  deposit_preference TEXT,\n  cash_balance_home_screen_button_enabled INTEGER\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO p2pSettings (\n  entity_id,\n  require_minimum_initiator_notes_length_for_requests,\n  incoming_request_policy,\n  nearby_visibility,\n  rate_plan,\n  can_upgrade_to_business,\n  deposit_preference,\n  cash_balance_home_screen_button_enabled\n)\nSELECT\n  entity_id,\n  require_minimum_initiator_notes_length_for_requests,\n  incoming_request_policy,\n  nearby_visibility,\n  rate_plan,\n  can_upgrade_to_business,\n  deposit_preference,\n  cash_balance_home_screen_button_enabled\nFROM temp", null);
                androidSqliteDriver.execute(num15, "DROP TABLE temp", null);
            }
            if (j <= 427 && j2 > 427) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeBankingConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeBlockersConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeCashDrawerConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeCheckDepositConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeCryptocurrencyConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeInvitationConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeOfflineConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removePaymentHistoryConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeRatePlanConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeReactionConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeRecipientConfigWithprofile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeSharingConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeStampsConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeSupportConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeWebLoginConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeBitcoinTransactionCustomerIdsWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER removeInstitutionsConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeAppConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM bankingConfig;\nINSERT INTO bankingConfig (rowid) VALUES (NULL);\n\nDELETE FROM blockersConfig;\nINSERT INTO blockersConfig(rowid) VALUES (NULL);\n\nDELETE FROM cashDrawerConfig;\nINSERT INTO cashDrawerConfig (rowid) VALUES (NULL);\n\nDELETE FROM checkDepositConfig;\nINSERT INTO checkDepositConfig (rowid) VALUES (NULL);\n\nDELETE FROM cryptocurrencyConfig;\nINSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\n\nDELETE FROM instrumentLinkingConfig;\nINSERT INTO instrumentLinkingConfig (rowid) VALUES (NULL);\n\nDELETE FROM invitationConfig;\nINSERT INTO invitationConfig (rowid) VALUES (NULL);\n\nDELETE FROM offlineConfig;\nINSERT INTO offlineConfig(rowid) VALUES (NULL);\n\nDELETE FROM paymentHistoryConfig;\nDELETE FROM transfer_customer_ids;\nDELETE FROM banking_transaction_customer_ids;\nDELETE FROM lending_transaction_customer_ids;\nDELETE FROM referral_customer_ids;\nINSERT INTO paymentHistoryConfig(rowid) VALUES (NULL);\n\nDELETE FROM ratePlanConfig;\nINSERT INTO ratePlanConfig (rowid) VALUES (NULL);\n\nDELETE FROM reactionConfig;\nINSERT INTO reactionConfig(rowid) VALUES (NULL);\n\nDELETE FROM recipientConfig;\nINSERT INTO recipientConfig (rowid) VALUES (NULL);\n\nDELETE FROM sharingConfig;\nINSERT INTO sharingConfig (rowid) VALUES (NULL);\n\nDELETE FROM stampsConfig;\nINSERT INTO stampsConfig (rowid) VALUES (NULL);\n\nDELETE FROM supportConfig;\nINSERT INTO supportConfig(rowid) VALUES (NULL);\n\nDELETE FROM webLoginConfig;\nINSERT INTO webLoginConfig(rowid) VALUES (NULL);\n\nDELETE FROM bitcoinTransactionCustomerIds;\n\nDELETE FROM institutionsConfig;\nINSERT INTO institutionsConfig (rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 428 && j2 > 428) {
                androidSqliteDriver.execute(num15, "CREATE TABLE profileDetails(\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  bio TEXT\n)", null);
            }
            if (j <= 429 && j2 > 429) {
                androidSqliteDriver.execute(num15, "ALTER TABLE p2pSettings RENAME TO temp", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE p2pSettings(\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  require_minimum_initiator_notes_length_for_requests INTEGER NOT NULL DEFAULT 0,\n  incoming_request_policy TEXT,\n  nearby_visibility TEXT,\n  rate_plan TEXT,\n  can_upgrade_to_business INTEGER,\n  deposit_preference TEXT,\n  deposit_preference_data BLOB,\n  cash_balance_home_screen_button_enabled INTEGER\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO p2pSettings (\n  entity_id,\n  require_minimum_initiator_notes_length_for_requests,\n  incoming_request_policy,\n  nearby_visibility,\n  rate_plan,\n  can_upgrade_to_business,\n  deposit_preference,\n  deposit_preference_data,\n  cash_balance_home_screen_button_enabled\n)\nSELECT\n  entity_id,\n  require_minimum_initiator_notes_length_for_requests,\n  incoming_request_policy,\n  nearby_visibility,\n  rate_plan,\n  can_upgrade_to_business,\n  deposit_preference,\n  NULL,\n  cash_balance_home_screen_button_enabled\nFROM temp", null);
                androidSqliteDriver.execute(num15, "DROP TABLE temp", null);
            }
            if (j <= 430 && j2 > 430) {
                androidSqliteDriver.execute(num15, "ALTER TABLE pendingPayment ADD COLUMN invest_payment_data BLOB DEFAULT NULL", null);
            }
            if (j <= 431 && j2 > 431) {
                androidSqliteDriver.execute(num15, "DROP TABLE scheduled_payment", null);
            }
            if (j <= 432 && j2 > 432) {
                androidSqliteDriver.execute(num15, "CREATE TABLE new_payment (\n  _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  token TEXT NOT NULL UNIQUE,\n  orientation TEXT NOT NULL,\n  role TEXT,\n  sender_id TEXT NOT NULL,\n  recipient_id TEXT NOT NULL,\n  state TEXT,\n  amount INTEGER,\n  amount_currency TEXT,\n  sender_amount BLOB,\n  recipient_amount BLOB,\n  created_at INTEGER NOT NULL DEFAULT 0,\n  updated_at INTEGER NOT NULL DEFAULT 0,\n  captured_at INTEGER NOT NULL DEFAULT 0,\n  refunded_at INTEGER NOT NULL DEFAULT 0,\n  paid_out_at INTEGER NOT NULL DEFAULT 0,\n  display_date INTEGER NOT NULL DEFAULT 0,\n  is_badged INTEGER NOT NULL DEFAULT 0,\n  render_data TEXT,\n  their_id TEXT NOT NULL,\n  outstanding_until INTEGER,\n  external_id TEXT,\n  boost_amount BLOB,\n  scheduled_for INTEGER DEFAULT NULL,\n  scheduled_payment_token TEXT DEFAULT NULL,\n  hidden_until INTEGER,\n  rollup_type TEXT DEFAULT NULL,\n  investment_order_type TEXT DEFAULT NULL,\n  payment_type TEXT DEFAULT NULL,\n  gifted_investment_entity_token TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO new_payment\nSELECT\n  _id,\n   token,\n   orientation,\n   role,\n   sender_id,\n   recipient_id,\n   state TEXT,\n   -- amount and amount_currency fields are backfilled via CashAccountDatabaseCallback.\n   NULL,\n   NULL,\n   sender_amount,\n   recipient_amount,\n   created_at,\n   updated_at,\n   captured_at,\n   refunded_at,\n   paid_out_at,\n   display_date,\n   is_badged,\n   render_data,\n   their_id,\n   outstanding_until,\n   external_id,\n   boost_amount,\n   scheduled_for,\n   scheduled_payment_token,\n   hidden_until,\n   rollup_type,\n   investment_order_type,\n   payment_type,\n   gifted_investment_entity_token\nFROM payment", null);
            }
            if (j <= 433 && j2 > 433) {
                androidSqliteDriver.execute(num15, "DROP TABLE payment", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE new_payment RENAME TO payment", null);
                androidSqliteDriver.execute(num15, "DROP INDEX IF EXISTS activity_index", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX activity_index\nON payment(display_date)", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS deleteDuplicatePayments", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER deleteDuplicatePayments\nAFTER INSERT ON payment\nBEGIN\nDELETE FROM pendingPayment\nWHERE external_id IN completedPendingPayments;\nDELETE FROM pendingTransfer\nWHERE external_id IN completedPendingTransfers;\nEND", null);
                androidSqliteDriver.execute(num15, str42, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW payments_model AS\nSELECT\n  amount,\n  amount_currency,\n  token,\n  orientation,\n  role,\n  state,\n  payment.render_data AS payment_render_data,\n  sender.render_data AS sender_render_data,\n  recipient.render_data AS recipient_render_data,\n  recipient_id,\n  sender_id,\n  captured_at,\n  created_at,\n  their_id,\n  display_date,\n  _id,\n  sender_amount,\n  recipient_amount,\n  boost_amount,\n  paid_out_at,\n  refunded_at,\n  updated_at,\n  is_badged,\n  rollup_type,\n  investment_order_type,\n  payment_type,\n  gifted_investment_entity_token,\n  coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding,\n  external_id,\n  (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n  coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden,\n  loyalty.render_data AS loyalty_render_data\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nLEFT JOIN loyaltyProgram AS loyalty ON (payment.recipient_id = loyalty.cash_merchant_token)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num15, str44, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo_url,\n  avatar.accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    accent_color,\n    photo_url,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j > 434 || j2 <= 434) {
                str59 = str43;
                str60 = str42;
            } else {
                androidSqliteDriver.execute(num15, str58, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW activityCustomer AS\nSELECT parent.photo_url, parent.photo, parent.accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments,\n       cash_merchant_token IS NOT NULL AS has_loyalty_data,\n       (their_id NOT IN (SELECT * FROM externalIds) AND\n         child.merchant_data IS NULL AND\n         child.investment_entity_token IS NULL\n       ) = 1 AS isRegular\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyData ON (parent.customer_id = cash_merchant_token)\nWHERE payment_type IS NULL\nOR payment_type NOT IN (SELECT payment_type FROM loyaltyHiddenPaymentTypes)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo_url, photo, accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments, 0 == 0,\n       0 = 1\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (\n  SELECT parent_id\n  FROM customerRelation\n  WHERE child_id IN (\n    SELECT their_id\n    FROM payments_model\n    WHERE payment_type IS NULL\n    OR payment_type NOT IN (SELECT payment_type FROM loyaltyHiddenPaymentTypes)\n  )\n)\n\nORDER BY display_date DESC", null);
                androidSqliteDriver.execute(num15, str44, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo_url,\n  avatar.photo,\n  avatar.accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    accent_color,\n    photo_url,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
                androidSqliteDriver.execute(num15, "DROP VIEW activityRecipient", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW activityRecipient AS\nSELECT\n  contact.display_name AS contact_display_name,\n  contact.lookup_key,\n  already_invited,\n  has_multiple_customers,\n  customer.customer_id,\n  customer.threaded_customer_id,\n  cashtag,\n  is_cash_customer,\n  is_verified,\n  is_business,\n  email,\n  sms,\n  photo_url,\n  photo,\n  customer_display_name,\n  group_concat(email) AS email_addresses,\n  group_concat(sms) AS sms_numbers,\n  can_accept_payments,\n  is_square,\n  coalesce(credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0) AS credit_card_fee,\n  blocked,\n  merchant_data,\n  customer.accent_color,\n  customer.region,\n  customer.category,\n  customer.investment_entity_token\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nGROUP BY customer.customer_id", null);
                str59 = str43;
                androidSqliteDriver.execute(num15, str59, null);
                str60 = str42;
                androidSqliteDriver.execute(num15, "CREATE VIEW recipients AS\nSELECT contact.display_name AS contact_display_name,\n       contact.lookup_key,\n       CASE already_invited WHEN 1 THEN 1\n         ELSE invite_entity_id IS NOT NULL END AS already_invited,\n       has_multiple_customers,\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer,\n       coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email,\n       customer_sms AS sms,\n       photo_url,\n       photo,\n       customer_display_name,\n       group_concat(email) AS email_addresses,\n       group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments,\n       coalesce(is_square, 0) AS is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON alias.hashed_alias = invite_hashed_alias\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       invite_entity_id IS NOT NULL,\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       is_cash_customer,\n       is_verified,\n       is_business,\n       email,\n       sms,\n       photo_url,\n       photo,\n       customer_display_name,\n       email,\n       sms,\n       can_accept_payments,\n       is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON contact_alias.hashed_alias = invite_hashed_alias\nWHERE lookup_key IS NULL", null);
            }
            if (j <= 435 && j2 > 435) {
                androidSqliteDriver.execute(num15, "CREATE TABLE cash_house_screen (\n  token TEXT PRIMARY KEY NOT NULL,\n  screen_json TEXT NOT NULL\n)", null);
            }
            if (j <= 436 && j2 > 436) {
                androidSqliteDriver.execute(num15, "CREATE TABLE new_customer (\n  customer_id TEXT PRIMARY KEY,\n  cashtag TEXT,\n  customer_display_name TEXT,\n  can_accept_payments INTEGER NOT NULL DEFAULT 0,\n  is_square INTEGER NOT NULL DEFAULT 0,\n  is_cash_customer INTEGER NOT NULL DEFAULT 0,\n  is_business INTEGER NOT NULL DEFAULT 0,\n  is_verified INTEGER NOT NULL DEFAULT 0,\n  credit_card_fee INTEGER,\n  render_data TEXT,\n  blocked TEXT NOT NULL,\n  threaded_customer_id TEXT,\n  merchant_data BLOB,\n  category TEXT,\n  investment_entity_token TEXT DEFAULT NULL,\n  region TEXT,\n  joined_on INTEGER DEFAULT NULL,\n  photo BLOB DEFAULT NULL,\n  themed_accent_color BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO new_customer\nSELECT\n  customer_id,\n  cashtag,\n  customer_display_name,\n  can_accept_payments,\n  is_square,\n  is_cash_customer,\n  is_business,\n  is_verified,\n  credit_card_fee,\n  render_data,\n  blocked,\n  threaded_customer_id,\n  merchant_data,\n  category,\n  investment_entity_token,\n  region,\n  joined_on,\n  photo,\n  themed_accent_color\nFROM customer", null);
            }
            if (j <= 437 && j2 > 437) {
                androidSqliteDriver.execute(num15, "DROP TABLE customer", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE new_customer RENAME TO customer", null);
                androidSqliteDriver.execute(num15, "DROP VIEW merchantIds", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW merchantIds AS\nSELECT customer_id\nFROM customer\nWHERE merchant_data IS NOT NULL", null);
                androidSqliteDriver.execute(num15, str44, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
                androidSqliteDriver.execute(num15, "DROP VIEW activityRecipient", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW activityRecipient AS\nSELECT\n  contact.display_name AS contact_display_name,\n  contact.lookup_key,\n  already_invited,\n  has_multiple_customers,\n  customer.customer_id,\n  customer.threaded_customer_id,\n  cashtag,\n  is_cash_customer,\n  is_verified,\n  is_business,\n  email,\n  sms,\n  photo,\n  customer_display_name,\n  group_concat(email) AS email_addresses,\n  group_concat(sms) AS sms_numbers,\n  can_accept_payments,\n  is_square,\n  coalesce(credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0) AS credit_card_fee,\n  blocked,\n  merchant_data,\n  customer.themed_accent_color,\n  customer.region,\n  customer.category,\n  customer.investment_entity_token\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nGROUP BY customer.customer_id", null);
                androidSqliteDriver.execute(num15, "DROP VIEW customerRelation", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW customerRelation AS\nSELECT CASE\n WHEN threaded_customer_id IS NULL THEN customer_id\n ELSE threaded_customer_id\nEND AS parent_id, customer_id AS child_id\nFROM customer", null);
                androidSqliteDriver.execute(num15, str58, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW activityCustomer AS\nSELECT parent.photo, parent.themed_accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments,\n       cash_merchant_token IS NOT NULL AS has_loyalty_data,\n       (their_id NOT IN (SELECT * FROM externalIds) AND\n         child.merchant_data IS NULL AND\n         child.investment_entity_token IS NULL\n       ) = 1 AS isRegular\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyData ON (parent.customer_id = cash_merchant_token)\nWHERE payment_type IS NULL\nOR payment_type NOT IN (SELECT payment_type FROM loyaltyHiddenPaymentTypes)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo, themed_accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments, 0 == 0,\n       0 = 1\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (\n  SELECT parent_id\n  FROM customerRelation\n  WHERE child_id IN (\n    SELECT their_id\n    FROM payments_model\n    WHERE payment_type IS NULL\n    OR payment_type NOT IN (SELECT payment_type FROM loyaltyHiddenPaymentTypes)\n  )\n)\n\nORDER BY display_date DESC", null);
                androidSqliteDriver.execute(num15, str59, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW recipients AS\nSELECT contact.display_name AS contact_display_name,\n       contact.lookup_key,\n       CASE already_invited WHEN 1 THEN 1\n         ELSE invite_entity_id IS NOT NULL END AS already_invited,\n       has_multiple_customers,\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer,\n       coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email,\n       customer_sms AS sms,\n       photo,\n       customer_display_name,\n       group_concat(email) AS email_addresses,\n       group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments,\n       coalesce(is_square, 0) AS is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON alias.hashed_alias = invite_hashed_alias\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       invite_entity_id IS NOT NULL,\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       is_cash_customer,\n       is_verified,\n       is_business,\n       email,\n       sms,\n       photo,\n       customer_display_name,\n       email,\n       sms,\n       can_accept_payments,\n       is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON contact_alias.hashed_alias = invite_hashed_alias\nWHERE lookup_key IS NULL", null);
            }
            if (j <= 438 && j2 > 438) {
                androidSqliteDriver.execute(num15, "ALTER TABLE loyaltyProgram ADD COLUMN deep_link_token TEXT", null);
            }
            if (j <= 439 && j2 > 439) {
                androidSqliteDriver.execute(num15, "CREATE TABLE didvManualCaptureConfig(\n  config BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO didvManualCaptureConfig DEFAULT VALUES", null);
            }
            if (j <= 440 && j2 > 440) {
                androidSqliteDriver.execute(num15, "CREATE TABLE bankingTab(\n  sections BLOB\n)", null);
            }
            if (j <= 441 && j2 > 441) {
                androidSqliteDriver.execute(num15, "ALTER TABLE directDepositAccount ADD COLUMN display_complete_account_number INTEGER DEFAULT NULL", null);
            }
            if (j <= 442 && j2 > 442) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeAppConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeBalanceDataWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeInstrumentLinkingOptionWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeLocationConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeNotificationPreferenceWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeProfileAliasWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeScenarioPlanWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE profile RENAME TO profile_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE profile(\n  profile_id TEXT NOT NULL PRIMARY KEY,\n  full_name TEXT,\n  photo_url TEXT,\n  require_passcode_confirmation INTEGER NOT NULL,\n  has_passcode INTEGER NOT NULL,\n  nearby_visibility TEXT NOT NULL,\n  cashtag TEXT,\n  cashtag_url TEXT,\n  cashtag_url_display_text TEXT,\n  cashtag_url_enabled INTEGER NOT NULL DEFAULT 0,\n  rate_plan TEXT NOT NULL,\n  can_upgrade_to_business INTEGER NOT NULL DEFAULT 0,\n  is_verified_account INTEGER NOT NULL,\n  app_message_notifications_enabled INTEGER NOT NULL DEFAULT 0,\n  verification_instrument_token TEXT,\n  deposit_preference TEXT,\n  address BLOB,\n  deposit_preference_data BLOB,\n  request_minimum_note_length INTEGER NOT NULL DEFAULT 0,\n  cash_drawer_data BLOB,\n  country_code TEXT,\n  default_currency TEXT NOT NULL,\n  customer_since INTEGER,\n  profile_token TEXT DEFAULT NULL,\n  incoming_request_policy TEXT DEFAULT NULL,\n  has_passed_idv INTEGER DEFAULT NULL,\n  cashtag_qr_image_url TEXT DEFAULT NULL,\n  cashtag_with_currency_symbol TEXT DEFAULT NULL,\n  available_p2p_target_regions BLOB DEFAULT NULL,\n  printable_cashtag_qr_image_url TEXT DEFAULT NULL,\n  region TEXT,\n  direct_deposit_account_enabled INTEGER NOT NULL DEFAULT 0,\n  bitcoin_display_units TEXT,\n  bitcoin_amount_entry_currency_preference TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO profile(profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n    nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n    rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n    verification_instrument_token, deposit_preference, address, deposit_preference_data,\n    request_minimum_note_length, cash_drawer_data, country_code, default_currency, customer_since,\n    profile_token, incoming_request_policy, has_passed_idv, cashtag_qr_image_url,\n    cashtag_with_currency_symbol, available_p2p_target_regions, printable_cashtag_qr_image_url,\n    region, direct_deposit_account_enabled, bitcoin_display_units, bitcoin_amount_entry_currency_preference)\nSELECT profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n    nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n    rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n    verification_instrument_token, deposit_preference, address, deposit_preference_data,\n    request_minimum_note_length, cash_drawer_data, country_code, default_currency, customer_since,\n    profile_token, incoming_request_policy, has_passed_idv, cashtag_qr_image_url,\n    cashtag_with_currency_symbol, available_p2p_target_regions, printable_cashtag_qr_image_url,\n    region, direct_deposit_account_enabled, bitcoin_display_units, bitcoin_amount_entry_currency_preference\nFROM profile_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE profile_old", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeAppConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM bankingConfig;\nINSERT INTO bankingConfig (rowid) VALUES (NULL);\n\nDELETE FROM blockersConfig;\nINSERT INTO blockersConfig(rowid) VALUES (NULL);\n\nDELETE FROM cashDrawerConfig;\nINSERT INTO cashDrawerConfig (rowid) VALUES (NULL);\n\nDELETE FROM checkDepositConfig;\nINSERT INTO checkDepositConfig (rowid) VALUES (NULL);\n\nDELETE FROM cryptocurrencyConfig;\nINSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\n\nDELETE FROM instrumentLinkingConfig;\nINSERT INTO instrumentLinkingConfig (rowid) VALUES (NULL);\n\nDELETE FROM invitationConfig;\nINSERT INTO invitationConfig (rowid) VALUES (NULL);\n\nDELETE FROM offlineConfig;\nINSERT INTO offlineConfig(rowid) VALUES (NULL);\n\nDELETE FROM paymentHistoryConfig;\nDELETE FROM transfer_customer_ids;\nDELETE FROM banking_transaction_customer_ids;\nDELETE FROM lending_transaction_customer_ids;\nDELETE FROM referral_customer_ids;\nINSERT INTO paymentHistoryConfig(rowid) VALUES (NULL);\n\nDELETE FROM ratePlanConfig;\nINSERT INTO ratePlanConfig (rowid) VALUES (NULL);\n\nDELETE FROM reactionConfig;\nINSERT INTO reactionConfig(rowid) VALUES (NULL);\n\nDELETE FROM recipientConfig;\nINSERT INTO recipientConfig (rowid) VALUES (NULL);\n\nDELETE FROM sharingConfig;\nINSERT INTO sharingConfig (rowid) VALUES (NULL);\n\nDELETE FROM stampsConfig;\nINSERT INTO stampsConfig (rowid) VALUES (NULL);\n\nDELETE FROM supportConfig;\nINSERT INTO supportConfig(rowid) VALUES (NULL);\n\nDELETE FROM webLoginConfig;\nINSERT INTO webLoginConfig(rowid) VALUES (NULL);\n\nDELETE FROM bitcoinTransactionCustomerIds;\n\nDELETE FROM institutionsConfig;\nINSERT INTO institutionsConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(num15, str54, null);
                androidSqliteDriver.execute(num15, str53, null);
                androidSqliteDriver.execute(num15, str56, null);
                androidSqliteDriver.execute(num15, str52, null);
                androidSqliteDriver.execute(num15, str18, null);
                androidSqliteDriver.execute(num15, str55, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n  DELETE FROM supportFlowEvent;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\n  DELETE FROM investment_notification_option;\nEND", null);
            }
            if (j <= 443 && j2 > 443) {
                androidSqliteDriver.execute(num15, "DROP TABLE balance_snapshot", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE balance_snapshot(\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  instrument_token TEXT UNIQUE NOT NULL,\n  balance_amount INTEGER,\n  balance_currency TEXT\n)", null);
            }
            if (j <= 444 && j2 > 444) {
                androidSqliteDriver.execute(num15, "ALTER TABLE popupMessage ADD COLUMN animation BLOB", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE inlineMessage ADD COLUMN animation BLOB", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE inAppNotificationMessage ADD COLUMN animation BLOB", null);
            }
            if (j <= 445 && j2 > 445) {
                androidSqliteDriver.execute(num15, "CREATE TABLE sync_value_issued_card (\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  encrypted_sync_entity BLOB NOT NULL\n)", null);
            }
            if (j <= 446 && j2 > 446) {
                androidSqliteDriver.execute(num15, "ALTER TABLE pendingPayment ADD COLUMN client_scenario TEXT DEFAULT NULL", null);
            }
            if (j <= 447 && j2 > 447) {
                androidSqliteDriver.execute(num15, "CREATE TABLE physicalDepositUsAddressSearch (\n  identifier TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL DEFAULT 0,\n  formatted_address TEXT NOT NULL,\n  street_address_line_1 Text NOT NULL,\n  street_address_line_2 Text,\n  zip TEXT NOT NULL,\n  latitude REAL,\n  longitude REAL\n)", null);
            }
            if (j <= 448 && j2 > 448) {
                androidSqliteDriver.execute(num15, "ALTER TABLE creditLine ADD COLUMN lending_product TEXT", null);
            }
            if (j <= 449 && j2 > 449) {
                androidSqliteDriver.execute(num15, "CREATE TABLE paper_money_deposit_barcode (\n  barcode_number TEXT DEFAULT NULL,\n  expiry_duration_second INTEGER DEFAULT NULL,\n  updated_at TEXT DEFAULT CURRENT_TIMESTAMP\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO paper_money_deposit_barcode DEFAULT VALUES", null);
            }
            if (j <= 450 && j2 > 450) {
                androidSqliteDriver.execute(num15, "ALTER TABLE loan ADD COLUMN lending_product TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE loanTransaction ADD COLUMN lending_product TEXT", null);
            }
            if (j > 451 || j2 <= 451) {
                str61 = str33;
                str62 = str35;
            } else {
                androidSqliteDriver.execute(num15, "ALTER TABLE payment ADD COLUMN lending_loan_token TEXT DEFAULT NULL", null);
                str62 = str35;
                androidSqliteDriver.execute(num15, str62, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW payments_model AS\nSELECT\n  amount,\n  amount_currency,\n  token,\n  orientation,\n  role,\n  state,\n  payment.render_data AS payment_render_data,\n  sender.render_data AS sender_render_data,\n  recipient.render_data AS recipient_render_data,\n  recipient_id,\n  sender_id,\n  captured_at,\n  created_at,\n  their_id,\n  display_date,\n  _id,\n  sender_amount,\n  recipient_amount,\n  boost_amount,\n  paid_out_at,\n  refunded_at,\n  updated_at,\n  is_badged,\n  rollup_type,\n  investment_order_type,\n  payment_type,\n  gifted_investment_entity_token,\n  coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding,\n  external_id,\n  (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n  coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden,\n  loyalty.render_data AS loyalty_render_data,\n  lending_loan_token\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nLEFT JOIN loyaltyProgram AS loyalty ON (payment.recipient_id = loyalty.cash_merchant_token)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                str61 = str33;
                androidSqliteDriver.execute(num15, str61, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j <= 452 && j2 > 452) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS paper_money_deposit_barcode", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE paperDepositBarcodeInfo (\n  updated_at INTEGER DEFAULT NULL,\n  expires_at INTEGER DEFAULT NULL,\n  success BLOB DEFAULT NULL,\n  failure BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES", null);
            }
            if (j <= 455 && j2 > 455) {
                androidSqliteDriver.execute(num15, "ALTER TABLE loan ADD COLUMN bnpl_data BLOB", null);
            }
            if (j <= 456 && j2 > 456) {
                androidSqliteDriver.execute(num15, "CREATE TABLE new_unhandled_sync_entity (\n  entity_id TEXT NOT NULL,\n  entity_type INTEGER NOT NULL,\n  entity BLOB NOT NULL,\n  entity_processor_version INTEGER DEFAULT 0,\n  PRIMARY KEY (entity_id, entity_type)\n)", null);
            }
            if (j <= 457 && j2 > 457) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS unhandled_sync_entity", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE new_unhandled_sync_entity RENAME TO unhandled_sync_entity", null);
                androidSqliteDriver.execute(num15, "DROP INDEX IF EXISTS unhandled_entity_processor_version_index", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX unhandled_entity_processor_version_index ON unhandled_sync_entity(entity_processor_version)", null);
            }
            if (j <= 458 && j2 > 458) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS physicalDepositUsAddressSearch (\n  identifier TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL DEFAULT 0,\n  formatted_address TEXT NOT NULL,\n  street_address_line_1 Text NOT NULL,\n  street_address_line_2 Text,\n  zip TEXT NOT NULL,\n  latitude REAL,\n  longitude REAL\n)", null);
            }
            if (j <= 460 && j2 > 460) {
                androidSqliteDriver.execute(num15, str62, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW payments_model AS\nSELECT\n  amount,\n  amount_currency,\n  token,\n  orientation,\n  role,\n  state,\n  payment.render_data AS payment_render_data,\n  sender.render_data AS sender_render_data,\n  recipient.render_data AS recipient_render_data,\n  recipient_id,\n  sender_id,\n  captured_at,\n  created_at,\n  their_id,\n  display_date,\n  _id,\n  sender_amount,\n  recipient_amount,\n  boost_amount,\n  paid_out_at,\n  refunded_at,\n  updated_at,\n  is_badged,\n  rollup_type,\n  investment_order_type,\n  payment_type,\n  gifted_investment_entity_token,\n  coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding,\n  external_id,\n  (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n  coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden,\n  loyalty.render_data AS loyalty_render_data,\n  lending_loan_token\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nLEFT JOIN loyaltyProgram AS loyalty ON (payment.recipient_id = loyalty.cash_merchant_token)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num15, str61, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC", null);
            }
            if (j <= 461 && j2 > 461) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS paper_money_deposit_barcode", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS paperDepositBarcodeInfo (\n  updated_at INTEGER DEFAULT NULL,\n  expires_at INTEGER DEFAULT NULL,\n  success BLOB DEFAULT NULL,\n  failure BLOB DEFAULT NULL\n)", null);
            }
            if (j <= 463 && j2 > 463) {
                androidSqliteDriver.execute(num15, "DROP TABLE cash_house_screen", null);
            }
            if (j <= 464 && j2 > 464) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS physicalDepositUsAddressSearch", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE physicalDepositUsAddressSearch (\n  identifier TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL DEFAULT 0,\n  formatted_address TEXT NOT NULL,\n  primary_text TEXT NOT NULL,\n  secondary_text TEXT,\n  latitude REAL,\n  longitude REAL\n)", null);
            }
            if (j <= 465 && j2 > 465) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_discovery ADD COLUMN in_search_suggestion INTEGER", null);
            }
            if (j <= 466 && j2 > 466) {
                androidSqliteDriver.execute(num15, "CREATE TABLE dataPrivacySettings(\n  settings BLOB\n)", null);
            }
            if (j <= 467 && j2 > 467) {
                androidSqliteDriver.execute(num15, "ALTER TABLE pendingTransfer ADD COLUMN type TEXT DEFAULT NULL", null);
            }
            if (j <= 468 && j2 > 468) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN bitcoin_investment_entity_token TEXT", null);
            }
            if (j <= 469 && j2 > 469) {
                androidSqliteDriver.execute(num15, "ALTER TABLE creditLine ADD COLUMN subtitle TEXT", null);
            }
            if (j <= 470 && j2 > 470) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS bankingTab", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE bankingTab (\n  entity_id TEXT PRIMARY KEY,\n  sections BLOB\n)", null);
            }
            if (j <= 471 && j2 > 471) {
                androidSqliteDriver.execute(num15, "ALTER TABLE loanTransaction ADD COLUMN description TEXT", null);
            }
            if (j <= 472 && j2 > 472) {
                androidSqliteDriver.execute(num15, "CREATE TABLE documentCategory (\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  category_id TEXT NOT NULL,\n  parent_category_id TEXT,\n  display_name TEXT NOT NULL,\n  display_order INTEGER,\n  display_date INTEGER,\n  render_style TEXT\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE document (\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  token TEXT NOT NULL,\n  category TEXT,\n  title TEXT NOT NULL,\n  display_date INTEGER,\n  client_route TEXT,\n  url TEXT,\n  version_data BLOB\n)", null);
            }
            if (j <= 473 && j2 > 473) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS documentCategory", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE documentCategory (\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  category_id TEXT NOT NULL,\n  parent_category_id TEXT NOT NULL,\n  display_name TEXT NOT NULL,\n  display_order INTEGER,\n  display_date INTEGER,\n  render_style TEXT\n)", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS document", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE document (\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  token TEXT NOT NULL,\n  category TEXT NOT NULL,\n  title TEXT NOT NULL,\n  display_date INTEGER,\n  client_route TEXT,\n  url TEXT,\n  version_data BLOB\n)", null);
            }
            if (j <= 474 && j2 > 474) {
                androidSqliteDriver.execute(num15, "ALTER TABLE issuedCard RENAME TO temp", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE issuedCard (\n  token TEXT NOT NULL,\n  instrument_type TEXT NOT NULL,\n  last_four TEXT NOT NULL,\n  enabled INTEGER NOT NULL,\n  is_virtual INTEGER NOT NULL,\n  locked_by_passcode INTEGER NOT NULL,\n  cardholder_name TEXT,\n  activated INTEGER NOT NULL,\n  physical_card BLOB,\n  card_theme BLOB\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO issuedCard\nSELECT temp.token, temp.instrument_type, temp.last_four, temp.enabled, temp.is_virtual, temp.locked_by_passcode, temp.cardholder_name, temp.activated, temp.physical_card, temp.card_theme FROM temp", null);
                androidSqliteDriver.execute(num15, "DROP TABLE temp", null);
            }
            if (j <= 475 && j2 > 475) {
                androidSqliteDriver.execute(num15, "CREATE TABLE contact_detailed_sync_state(\n  id TEXT PRIMARY KEY,\n  hash TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE sync_details\nADD COLUMN detailed_sync_token TEXT DEFAULT NULL", null);
            }
            if (j <= 476 && j2 > 476) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS profileDirectorySection (\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  title TEXT NOT NULL,\n  type TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS profileDirectoryItem (\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  title BLOB,\n  subtitle BLOB,\n  profileImage BLOB,\n  actionUrl TEXT,\n  header BLOB,\n  button BLOB,\n  section_id INTEGER NOT NULL REFERENCES profileDirectorySection ON DELETE CASCADE\n)", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX IF NOT EXISTS idx_profileDirectoryItem_section_id ON profileDirectoryItem (section_id)", null);
            }
            if (j <= 477 && j2 > 477) {
                androidSqliteDriver.execute(num15, "ALTER TABLE documentCategory ADD COLUMN version_data BLOB", null);
            }
            if (j <= 478 && j2 > 478) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN placeholderSection BLOB", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectoryItem ADD COLUMN metadata BLOB", null);
            }
            if (j <= 479 && j2 > 479) {
                androidSqliteDriver.execute(num15, "ALTER TABLE inAppNotificationMessage ADD COLUMN image BLOB", null);
            }
            if (j <= 480 && j2 > 480) {
                androidSqliteDriver.execute(num15, "CREATE TABLE core_customer (\n  entity_id TEXT PRIMARY KEY,\n  core_customer BLOB\n)", null);
            }
            if (j <= 481 && j2 > 481) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS dataPrivacySettings", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE dataPrivacySettings(\n  entity_id TEXT PRIMARY KEY,\n  settings BLOB\n)", null);
            }
            if (j <= 482 && j2 > 482) {
                androidSqliteDriver.execute(num15, "CREATE TABLE status_and_limits (\n  entity_id TEXT PRIMARY KEY,\n  has_passed_idv INTEGER,\n  adding_cash_enabled INTEGER,\n  balance_limit_groups BLOB\n)", null);
            }
            if (j <= 483 && j2 > 483) {
                androidSqliteDriver.execute(num15, "CREATE TABLE profileDirectoryConfig (\n  id INTEGER NOT NULL PRIMARY KEY,\n  cacheTTLInMillis INTEGER\n)", null);
            }
            if (j <= 484 && j2 > 484) {
                androidSqliteDriver.execute(num15, "CREATE TABLE new_creditLine(\n  token TEXT NOT NULL PRIMARY KEY,\n  credit_limit BLOB NOT NULL,\n  available_amount BLOB,\n  outstanding_amount BLOB,\n  setup_fee_bps INTEGER NOT NULL,\n  quick_amounts BLOB,\n  minimum_loan_amount BLOB,\n  first_time_borrow_data BLOB,\n  unlock_borrow_data BLOB,\n  instrument_display_name TEXT,\n  status_icon TEXT,\n  skip_loan_amount_selection INTEGER,\n  lending_product TEXT,\n  subtitle TEXT\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO new_creditLine\nSELECT token,\n       credit_limit,\n       available_amount,\n       outstanding_amount,\n       setup_fee_bps,\n       quick_amounts,\n       minimum_loan_amount,\n       first_time_borrow_data,\n       unlock_borrow_data,\n       instrument_display_name,\n       status_icon,\n       skip_loan_amount_selection,\n       lending_product,\n       subtitle\nFROM creditLine", null);
                androidSqliteDriver.execute(num15, "DROP TABLE creditLine", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE new_creditLine RENAME TO creditLine", null);
            }
            if (j <= 485 && j2 > 485) {
                androidSqliteDriver.execute(num15, "ALTER TABLE creditLine ADD COLUMN status_data BLOB", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE creditLine ADD COLUMN limit_data BLOB", null);
            }
            if (j <= 486 && j2 > 486) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN maxDisplayItems INTEGER", null);
            }
            if (j <= 487 && j2 > 487) {
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS recipients", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW IF NOT EXISTS recipients AS\nSELECT contact.display_name AS contact_display_name,\n       contact.lookup_key,\n       CASE already_invited WHEN 1 THEN 1\n         ELSE invite_entity_id IS NOT NULL END AS already_invited,\n       has_multiple_customers,\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer,\n       coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email,\n       customer_sms AS sms,\n       photo,\n       customer_display_name,\n       group_concat(email) AS email_addresses,\n       group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments,\n       coalesce(is_square, 0) AS is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       CASE WHEN recent_customer_id IS NOT NULL THEN 1\n                          ELSE 0 END AS is_recent\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON alias.hashed_alias = invite_hashed_alias\nLEFT JOIN (SELECT activityRecipient.customer_id AS recent_customer_id\n FROM activityRecipient\n JOIN payment ON (customer_id = their_id)\n WHERE can_accept_payments\n AND is_cash_customer\n GROUP BY customer_id HAVING display_date = max(display_date)\n ORDER BY display_date DESC) ON customer_id = recent_customer_id\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       invite_entity_id IS NOT NULL,\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       is_cash_customer,\n       is_verified,\n       is_business,\n       email,\n       sms,\n       photo,\n       customer_display_name,\n       email,\n       sms,\n       can_accept_payments,\n       is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       CASE WHEN recent_customer_id IS NOT NULL THEN 1\n          ELSE 0 END AS is_recent\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON contact_alias.hashed_alias = invite_hashed_alias\nLEFT JOIN (SELECT activityRecipient.customer_id AS recent_customer_id\n FROM activityRecipient\n JOIN payment ON (customer_id = their_id)\n WHERE can_accept_payments\n AND is_cash_customer\n GROUP BY customer_id HAVING display_date = max(display_date)\n ORDER BY display_date DESC) ON customer_id = recent_customer_id\nWHERE lookup_key IS NULL", null);
            }
            if (j <= 488 && j2 > 488) {
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_settings_new (\n  purchase_limit BLOB,\n  sell_limit BLOB,\n  equities_discovery_url TEXT,\n  bitcoin_discovery_url TEXT,\n  disclosures_web_url TEXT,\n  my_watchlist_description TEXT,\n  crypto_disclosure_url TEXT,\n  my_first_stock_configuration BLOB,\n  equities_discovery_stock_tiles BLOB,\n  my_first_bitcoin_configuration BLOB,\n  min_scheduled_btc_buy_amt BLOB,\n  min_scheduled_stock_buy_amt BLOB,\n  custom_order_configuration BLOB,\n  first_time_congrats_equity_title TEXT,\n  first_time_congrats_equity_text TEXT,\n  first_time_congrats_equity_detail_title TEXT,\n  first_time_congrats_equity_detail_text TEXT,\n  first_time_congrats_bitcoin_title TEXT,\n  first_time_congrats_bitcoin_text TEXT,\n  bitcoin_investment_entity_token TEXT\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO investing_settings_new\nSELECT purchase_limit,\n  sell_limit,\n  equities_discovery_url,\n  bitcoin_discovery_url,\n  disclosures_web_url,\n  my_watchlist_description,\n  crypto_disclosure_url,\n  my_first_stock_configuration,\n  equities_discovery_stock_tiles,\n  my_first_bitcoin_configuration,\n  min_scheduled_btc_buy_amt,\n  min_scheduled_stock_buy_amt,\n  custom_order_configuration,\n  first_time_congrats_equity_title,\n  first_time_congrats_equity_text,\n  first_time_congrats_equity_detail_title,\n  first_time_congrats_equity_detail_text,\n  first_time_congrats_bitcoin_title,\n  first_time_congrats_bitcoin_text,\n  bitcoin_investment_entity_token\nFROM investing_settings", null);
                androidSqliteDriver.execute(num15, "DROP TABLE investing_settings", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings_new RENAME TO investing_settings", null);
            }
            if (j > 489 || j2 <= 489) {
                str63 = str46;
            } else {
                androidSqliteDriver.execute(num15, "DROP TABLE supportFlowEvent", null);
                str63 = str46;
                androidSqliteDriver.execute(num15, str63, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM cardDesign;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\n  DELETE FROM investment_notification_option;\nEND", null);
            }
            if (j <= 490 && j2 > 490) {
                androidSqliteDriver.execute(num15, "CREATE TABLE passwordInfo (\n    entity_id TEXT NOT NULL PRIMARY KEY,\n    version INTEGER NOT NULL,\n    has_password INTEGER NOT NULL\n)", null);
            }
            if (j <= 491 && j2 > 491) {
                androidSqliteDriver.execute(num15, "ALTER TABLE creditLine ADD COLUMN alert BLOB", null);
            }
            if (j <= 492 && j2 > 492) {
                androidSqliteDriver.execute(num15, "CREATE TABLE businessGrants(\n  id TEXT PRIMARY KEY,\n  merchant_id TEXT,\n  updated_at INTEGER,\n  created_at INTEGER\n)", null);
            }
            if (j <= 493 && j2 > 493) {
                androidSqliteDriver.execute(num15, "CREATE TABLE authenticatorInfo (\n    entity_id TEXT NOT NULL PRIMARY KEY,\n    otp_enabled INTEGER NOT NULL\n)", null);
            }
            if (j <= 494 && j2 > 494) {
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_discovery_new (\n  category TEXT NOT NULL,\n  category_index INTEGER NOT NULL,\n  investment_entity_token TEXT NOT NULL,\n  category_description TEXT,\n  in_search_suggestion INTEGER,\n  PRIMARY KEY (category, investment_entity_token)\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO investing_discovery_new\nSELECT investing_discovery.category, investing_discovery.category_index, investing_discovery.investment_entity_token, investing_discovery.category_description, investing_discovery.in_search_suggestion FROM investing_discovery", null);
                androidSqliteDriver.execute(num15, "DROP TABLE investing_discovery", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_discovery_new RENAME TO investing_discovery", null);
            }
            if (j <= 495 && j2 > 495) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS authenticatorInfo (\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  otp_enabled INTEGER NOT NULL\n)", null);
            }
            if (j <= 496 && j2 > 496) {
                androidSqliteDriver.execute(num15, "CREATE TABLE crypto_wallet (\n  entity_id TEXT PRIMARY KEY,\n  wallet BLOB\n)", null);
            }
            if (j <= 497 && j2 > 497) {
                androidSqliteDriver.execute(num15, "ALTER TABLE lendingConfig ADD COLUMN app_version INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 498 && j2 > 498) {
                androidSqliteDriver.execute(num15, "ALTER TABLE directDepositAccount ADD COLUMN support_node_token TEXT DEFAULT NULL", null);
            }
            if (j <= 499 && j2 > 499) {
                androidSqliteDriver.execute(num15, "CREATE TABLE market_capabilities (\n  updated_at_millis INTEGER NOT NULL,\n  capabilities BLOB NOT NULL\n)", null);
            }
            if (j <= 500 && j2 > 500) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN text_title BLOB", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN subtitle BLOB", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectoryItem ADD COLUMN picture BLOB", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectoryItem ADD COLUMN isCardItem INTEGER", null);
            }
            if (j <= 501 && j2 > 501) {
                androidSqliteDriver.execute(num15, "CREATE TABLE cashDrawerData(\n  cashDrawerData BLOB\n)", null);
            }
            if (j <= 502 && j2 > 502) {
                androidSqliteDriver.execute(num15, "CREATE TABLE cardScheme(\n  cardScheme BLOB\n)", null);
            }
            if (j <= 503 && j2 > 503) {
                androidSqliteDriver.execute(num15, "CREATE TABLE  sync_value_instrument (\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  token TEXT NOT NULL UNIQUE,\n  cash_instrument_type TEXT NOT NULL,\n  card_brand TEXT,\n  suffix TEXT,\n  bank_name TEXT,\n  icon_url TEXT,\n  detail_icon_url TEXT,\n  display_name TEXT,\n  pending_verification INTEGER DEFAULT NULL,\n  selection_icon_url TEXT\n)", null);
            }
            if (j <= 504 && j2 > 504) {
                androidSqliteDriver.execute(num15, "CREATE TABLE giftCard(\n  entity_id TEXT PRIMARY KEY,\n  card BLOB\n)", null);
            }
            if (j <= 505 && j2 > 505) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN informationButton BLOB", null);
            }
            if (j <= 506 && j2 > 506) {
                androidSqliteDriver.execute(num15, "CREATE TABLE new_profileDirectorySection (\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  title BLOB,\n  subtitle BLOB,\n  type TEXT NOT NULL,\n  placeholderSection BLOB,\n  maxDisplayItems INTEGER,\n  informationButton BLOB\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO new_profileDirectorySection\nSELECT\n  id,\n  text_title,\n  subtitle,\n  type,\n  placeholderSection,\n  maxDisplayItems,\n  informationButton\nFROM profileDirectorySection", null);
                androidSqliteDriver.execute(num15, "DROP TABLE profileDirectorySection", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE new_profileDirectorySection RENAME TO profileDirectorySection", null);
            }
            if (j <= 507 && j2 > 507) {
                androidSqliteDriver.execute(num15, "ALTER TABLE issuedCard ADD COLUMN card_status_text TEXT", null);
            }
            if (j <= 508 && j2 > 508) {
                androidSqliteDriver.execute(num15, "ALTER TABLE issuedCard ADD COLUMN dimmed INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 509 && j2 > 509) {
                androidSqliteDriver.execute(num15, "CREATE TABLE orderedRewardToken (\n  token TEXT PRIMARY KEY\n)", null);
            }
            if (j <= 510 && j2 > 510) {
                androidSqliteDriver.execute(num15, "CREATE TABLE crypto_payroll_preference(\n  entity_id TEXT PRIMARY KEY,\n  allocation_bps INTEGER,\n  target_currency TEXT NOT NULL,\n  source_currency TEXT NOT NULL\n)", null);
            }
            if (j <= 511 && j2 > 511) {
                androidSqliteDriver.execute(num15, "ALTER TABLE lendingConfig ADD COLUMN instrument_data BLOB DEFAULT NULL", null);
            }
            if (j <= 512 && j2 > 512) {
                androidSqliteDriver.execute(num15, "CREATE TABLE familyAccount(\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  customer_token TEXT NOT NULL,\n  family_account BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX customer_token_index ON familyAccount(customer_token)", null);
            }
            if (j <= 513 && j2 > 513) {
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_roundups_onboarding_flow(\n  blockerData BLOB NOT NULL\n)", null);
            }
            if (j <= 514 && j2 > 514) {
                androidSqliteDriver.execute(num15, "CREATE TABLE lendingInfo(\n  entity_id TEXT PRIMARY KEY,\n  potential_future_borrower INTEGER NOT NULL\n)", null);
            }
            if (j <= 515 && j2 > 515) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS investing_roundups_onboarding_flow", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_roundups_onboarding_flow(\n  blocker_data BLOB NOT NULL,\n  flow_token TEXT NOT NULL\n)", null);
            }
            if (j <= 516 && j2 > 516) {
                androidSqliteDriver.execute(num15, "ALTER TABLE reward ADD COLUMN affiliate_link_url TEXT", null);
            }
            if (j <= 517 && j2 > 517) {
                androidSqliteDriver.execute(num15, "CREATE TABLE trusted_contact (\n  customer_token TEXT NOT NULL PRIMARY KEY,\n  firstname TEXT NOT NULL,\n  lastname TEXT NOT NULL,\n  email_address TEXT NOT NULL,\n  phone_number TEXT DEFAULT NULL,\n  address BLOB DEFAULT NULL\n)", null);
            }
            if (j <= 518 && j2 > 518) {
                androidSqliteDriver.execute(num15, "ALTER TABLE bankingConfig ADD COLUMN recurring_deposits_dda_upsell BLOB DEFAULT NULL", null);
            }
            if (j <= 519 && j2 > 519) {
                androidSqliteDriver.execute(num15, str61, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC, payment.token ASC", null);
            }
            if (j <= 520 && j2 > 520) {
                androidSqliteDriver.execute(num15, "ALTER TABLE lendingInfo ADD COLUMN access_data BLOB", null);
            }
            if (j <= 521 && j2 > 521) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS lendingConfig", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE lendingConfig(\n  enabled INTEGER NOT NULL DEFAULT 0,\n  last_updated INTEGER NOT NULL DEFAULT 0,\n  instrument_routing BLOB DEFAULT NULL,\n  deep_link_routing BLOB DEFAULT NULL,\n  app_version INTEGER NOT NULL DEFAULT 0,\n  instrument_data BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO lendingConfig DEFAULT VALUES", null);
            }
            if (j <= 522 && j2 > 522) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS investing_roundups_onboarding_flow", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_roundups_onboarding_flow(\n  blocker_data BLOB NOT NULL,\n  server_flow_token TEXT NOT NULL,\n  client_flow_token TEXT NOT NULL\n)", null);
            }
            if (j <= 523 && j2 > 523) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS trusted_contact", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE trusted_contact(\n  firstname TEXT NOT NULL,\n  lastname TEXT NOT NULL,\n  email_address TEXT NOT NULL,\n  phone_number TEXT DEFAULT NULL,\n  address BLOB DEFAULT NULL\n)", null);
            }
            if (j <= 524 && j2 > 524) {
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_roundups_automation (\n  investing_roundups_automation BLOB\n)", null);
            }
            if (j <= 525 && j2 > 525) {
                androidSqliteDriver.execute(num15, str61, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC, payment.token DESC", null);
            }
            if (j <= 526 && j2 > 526) {
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_suggestions(\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  entity_token TEXT NOT NULL UNIQUE,\n  suggestions BLOB NOT NULL,\n  updated_at INTEGER NOT NULL\n)", null);
            }
            if (j <= 527 && j2 > 527) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN trusted_contact_enabled INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 528 && j2 > 528) {
                androidSqliteDriver.execute(num15, "CREATE TABLE extendedProfileDetails(\n  customer_token TEXT NOT NULL PRIMARY KEY,\n  get_profile_details_response BLOB NOT NULL\n)", null);
            }
            if (j <= 529 && j2 > 529) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS investing_roundups_onboarding_flow", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_roundups_onboarding_flow(\n  intro_blocker_data BLOB,\n  destination_selection_blocker_data BLOB,\n  server_flow_token TEXT NOT NULL,\n  client_flow_token TEXT NOT NULL\n)", null);
            }
            if (j <= 530 && j2 > 530) {
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_full_profile(\n  customer_token TEXT UNIQUE DEFAULT NULL,\n  cashtag TEXT UNIQUE DEFAULT NULL,\n  title TEXT NOT NULL,\n  elements BLOB NOT NULL,\n  avatar BLOB NOT NULL,\n  updated_at INTEGER NOT NULL\n)", null);
            }
            if (j <= 531 && j2 > 531) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS investing_full_profile", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_full_profile(\n  customer_token TEXT UNIQUE DEFAULT NULL,\n  cashtag TEXT UNIQUE DEFAULT NULL,\n  title TEXT NOT NULL,\n  elements BLOB NOT NULL,\n  avatar BLOB DEFAULT NULL,\n  updated_at INTEGER NOT NULL\n)", null);
            }
            if (j <= 532 && j2 > 532) {
                androidSqliteDriver.execute(num15, "CREATE TABLE accessSettings(\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  has_passcode INTEGER NOT NULL DEFAULT 0,\n  require_passcode_confirmation INTEGER NOT NULL DEFAULT 0\n)", null);
            }
            if (j <= 533 && j2 > 533) {
                androidSqliteDriver.execute(num15, "CREATE TABLE availableAccountStatement (\n  statement_token TEXT NOT NULL PRIMARY KEY,\n  display_name TEXT,\n  statement_url TEXT,\n  statementCoverage BLOB\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE statementAccount (\n  account_token TEXT NOT NULL PRIMARY KEY,\n  customer_token TEXT NOT NULL,\n  is_sponsored_account INTEGER,\n  display_name TEXT,\n  account_type TEXT\n)", null);
            }
            if (j <= 534 && j2 > 534) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS investing_roundups_onboarding_flow", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_roundups_onboarding_flow(\n  intro_blocker_data BLOB,\n  destination_selection_blocker_data BLOB,\n  blocker_descriptor_id TEXT NOT NULL,\n  server_flow_token TEXT NOT NULL,\n  client_flow_token TEXT NOT NULL\n)", null);
            }
            if (j <= 535 && j2 > 535) {
                androidSqliteDriver.execute(num15, "ALTER TABLE lendingInfo ADD COLUMN first_time_borrow_data BLOB", null);
            }
            if (j <= 536 && j2 > 536) {
                androidSqliteDriver.execute(num15, str63, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\n  DELETE FROM investment_notification_option;\nEND", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS cardDesign", null);
            }
            if (j <= 537 && j2 > 537) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS statementAccount", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE customerStatementType (\n  customer_token TEXT NOT NULL,\n  is_sponsored_account INTEGER,\n  display_name TEXT,\n  statement_type TEXT NOT NULL,\n  PRIMARY KEY (customer_token, statement_type)\n)", null);
            }
            if (j <= 538 && j2 > 538) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS favorites (\n  id TEXT NOT NULL PRIMARY KEY\n)", null);
            }
            if (j <= 539 && j2 > 539) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS treehouseConfig", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE treehouseConfig (\n  activity_manifest_url TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO treehouseConfig DEFAULT VALUES", null);
            }
            if (j <= 540 && j2 > 540) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS cardTabNullStateScrollConfig", null);
            }
            if (j <= 541 && j2 > 541) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS shoppingRecentSearches (\n  search_text TEXT PRIMARY KEY COLLATE NOCASE,\n  updated_at INTEGER NOT NULL\n)", null);
            }
            if (j <= 542 && j2 > 542) {
                androidSqliteDriver.execute(num15, "ALTER TABLE paymentHistoryConfig\nADD COLUMN automated_investment_payment_types BLOB DEFAULT NULL", null);
            }
            if (j <= 543 && j2 > 543) {
                androidSqliteDriver.execute(num15, "ALTER TABLE payment ADD COLUMN entity_id TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, str60, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW payments_model AS\nSELECT\n  amount,\n  amount_currency,\n  entity_id,\n  token,\n  orientation,\n  role,\n  state,\n  payment.render_data AS payment_render_data,\n  sender.render_data AS sender_render_data,\n  recipient.render_data AS recipient_render_data,\n  recipient_id,\n  sender_id,\n  captured_at,\n  created_at,\n  their_id,\n  display_date,\n  _id,\n  sender_amount,\n  recipient_amount,\n  boost_amount,\n  paid_out_at,\n  refunded_at,\n  updated_at,\n  is_badged,\n  rollup_type,\n  investment_order_type,\n  payment_type,\n  gifted_investment_entity_token,\n  coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding,\n  external_id,\n  (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n  coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden,\n  loyalty.render_data AS loyalty_render_data,\n  lending_loan_token\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nLEFT JOIN loyaltyProgram AS loyalty ON (payment.recipient_id = loyalty.cash_merchant_token)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
            }
            if (j <= 544 && j2 > 544) {
                androidSqliteDriver.execute(num15, "DROP VIEW loanTransactionWithActivityCheck", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW loanTransactionWithActivityCheck AS\nSELECT loanTransaction.*,\n       loan.state AS loan_state,\n       loan.due_at AS loan_due_at,\n       payments_model.token AS payment_token\nFROM loanTransaction\nLEFT JOIN loan ON loan.token = loanTransaction.token\nLEFT JOIN payments_model ON payments_model.entity_id = loanTransaction.activity_token", null);
            }
            if (j <= 545 && j2 > 545) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS shoppingRecentlyViewed (\n  token TEXT PRIMARY KEY,\n  title TEXT,\n  light_image_url TEXT,\n  dark_image_url TEXT,\n  action_url TEXT,\n  updated_at INTEGER NOT NULL\n)", null);
            }
            if (j <= 546 && j2 > 546) {
                androidSqliteDriver.execute(num15, "ALTER TABLE payment ADD COLUMN associated_payment_token TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, str62, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW payments_model AS\nSELECT\n  amount,\n  amount_currency,\n  entity_id,\n  token,\n  orientation,\n  role,\n  state,\n  payment.render_data AS payment_render_data,\n  sender.render_data AS sender_render_data,\n  recipient.render_data AS recipient_render_data,\n  recipient_id,\n  sender_id,\n  captured_at,\n  created_at,\n  their_id,\n  display_date,\n  _id,\n  sender_amount,\n  recipient_amount,\n  boost_amount,\n  paid_out_at,\n  refunded_at,\n  updated_at,\n  is_badged,\n  rollup_type,\n  investment_order_type,\n  payment_type,\n  gifted_investment_entity_token,\n  coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding,\n  external_id,\n  (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n  coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden,\n  loyalty.render_data AS loyalty_render_data,\n  lending_loan_token,\n  associated_payment_token\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nLEFT JOIN loyaltyProgram AS loyalty ON (payment.recipient_id = loyalty.cash_merchant_token)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num15, str61, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  associated_payment_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC, payment.token DESC", null);
            }
            if (j <= 547 && j2 > 547) {
                androidSqliteDriver.execute(num15, "DROP VIEW loanTransactionWithActivityCheck", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW loanTransactionWithActivityCheck AS\nSELECT loanTransaction.*,\n       loan.state AS loan_state,\n       loan.due_at AS loan_due_at,\n       payments_model.token AS payment_token\nFROM loanTransaction\nLEFT JOIN loan ON loan.token = loanTransaction.loan_token\nLEFT JOIN payments_model ON payments_model.entity_id = loanTransaction.activity_token", null);
            }
            if (j <= 548 && j2 > 548) {
                androidSqliteDriver.execute(num15, "ALTER TABLE shoppingRecentlyViewed ADD COLUMN accent_color BLOB DEFAULT NULL", null);
            }
            if (j <= 549 && j2 > 549) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS shopHubBrowseDetails(\n  id INTEGER NOT NULL PRIMARY KEY,\n  ttl_in_millis INTEGER,\n  shop_browse_response BLOB NOT NULL\n)", null);
            }
            if (j <= 550 && j2 > 550) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS shopBrowseCategoryDetails(\n  category_token TEXT NOT NULL PRIMARY KEY,\n  ttl_in_millis INTEGER,\n  shop_category_browse_response BLOB NOT NULL\n)", null);
            }
            if (j <= 551 && j2 > 551) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS shopInfoDetails(\n  id INTEGER NOT NULL PRIMARY KEY,\n  ttl_in_millis INTEGER NOT NULL,\n  shop_info_response BLOB NOT NULL\n)", null);
            }
            if (j <= 552 && j2 > 552) {
                androidSqliteDriver.execute(num15, "CREATE TABLE temp_investing_roundups_automation(\n  ui_automation BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO temp_investing_roundups_automation\nSELECT investing_roundups_automation.investing_roundups_automation\nFROM investing_roundups_automation", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS investing_roundups_automation", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE temp_investing_roundups_automation RENAME TO investing_roundups_automation", null);
            }
            if (j <= 553 && j2 > 553) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN embeddedImageSection BLOB", null);
            }
            if (j <= 554 && j2 > 554) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN headerText BLOB", null);
            }
            if (j <= 555 && j2 > 555) {
                androidSqliteDriver.execute(num15, str63, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\nEND", null);
            }
            if (j <= 556 && j2 > 556) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investment_entity ADD COLUMN release_stage TEXT DEFAULT NULL", null);
            }
            if (j <= 557 && j2 > 557) {
                androidSqliteDriver.execute(num15, "DROP TABLE cashDrawerData", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeAppConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeBalanceDataWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeInstrumentLinkingOptionWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeLocationConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeNotificationPreferenceWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeProfileAliasWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeScenarioPlanWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE profile RENAME TO profile_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE profile(\n  profile_id TEXT NOT NULL PRIMARY KEY,\n  full_name TEXT,\n  photo_url TEXT,\n  require_passcode_confirmation INTEGER NOT NULL,\n  has_passcode INTEGER NOT NULL,\n  nearby_visibility TEXT NOT NULL,\n  cashtag TEXT,\n  cashtag_url TEXT,\n  cashtag_url_display_text TEXT,\n  cashtag_url_enabled INTEGER NOT NULL DEFAULT 0,\n  rate_plan TEXT NOT NULL,\n  can_upgrade_to_business INTEGER NOT NULL DEFAULT 0,\n  is_verified_account INTEGER NOT NULL,\n  app_message_notifications_enabled INTEGER NOT NULL DEFAULT 0,\n  verification_instrument_token TEXT,\n  deposit_preference TEXT,\n  address BLOB,\n  deposit_preference_data BLOB,\n  request_minimum_note_length INTEGER NOT NULL DEFAULT 0,\n  country_code TEXT,\n  default_currency TEXT NOT NULL,\n  customer_since INTEGER,\n  profile_token TEXT DEFAULT NULL,\n  incoming_request_policy TEXT DEFAULT NULL,\n  has_passed_idv INTEGER DEFAULT NULL,\n  cashtag_qr_image_url TEXT DEFAULT NULL,\n  cashtag_with_currency_symbol TEXT DEFAULT NULL,\n  available_p2p_target_regions BLOB DEFAULT NULL,\n  printable_cashtag_qr_image_url TEXT DEFAULT NULL,\n  region TEXT,\n  direct_deposit_account_enabled INTEGER NOT NULL DEFAULT 0,\n  bitcoin_display_units TEXT,\n  bitcoin_amount_entry_currency_preference TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO profile(profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n    nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n    rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n    verification_instrument_token, deposit_preference, address, deposit_preference_data,\n    request_minimum_note_length, country_code, default_currency, customer_since,\n    profile_token, incoming_request_policy, has_passed_idv, cashtag_qr_image_url,\n    cashtag_with_currency_symbol, available_p2p_target_regions, printable_cashtag_qr_image_url,\n    region, direct_deposit_account_enabled, bitcoin_display_units, bitcoin_amount_entry_currency_preference)\nSELECT profile_id, full_name, photo_url, require_passcode_confirmation, has_passcode,\n    nearby_visibility, cashtag, cashtag_url, cashtag_url_display_text, cashtag_url_enabled,\n    rate_plan, can_upgrade_to_business, is_verified_account, app_message_notifications_enabled,\n    verification_instrument_token, deposit_preference, address, deposit_preference_data,\n    request_minimum_note_length, country_code, default_currency, customer_since,\n    profile_token, incoming_request_policy, has_passed_idv, cashtag_qr_image_url,\n    cashtag_with_currency_symbol, available_p2p_target_regions, printable_cashtag_qr_image_url,\n    region, direct_deposit_account_enabled, bitcoin_display_units, bitcoin_amount_entry_currency_preference\nFROM profile_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE profile_old", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeAppConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM bankingConfig;\nINSERT INTO bankingConfig (rowid) VALUES (NULL);\n\nDELETE FROM blockersConfig;\nINSERT INTO blockersConfig(rowid) VALUES (NULL);\n\nDELETE FROM cashDrawerConfig;\nINSERT INTO cashDrawerConfig (rowid) VALUES (NULL);\n\nDELETE FROM checkDepositConfig;\nINSERT INTO checkDepositConfig (rowid) VALUES (NULL);\n\nDELETE FROM cryptocurrencyConfig;\nINSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\n\nDELETE FROM instrumentLinkingConfig;\nINSERT INTO instrumentLinkingConfig (rowid) VALUES (NULL);\n\nDELETE FROM invitationConfig;\nINSERT INTO invitationConfig (rowid) VALUES (NULL);\n\nDELETE FROM offlineConfig;\nINSERT INTO offlineConfig(rowid) VALUES (NULL);\n\nDELETE FROM paymentHistoryConfig;\nDELETE FROM transfer_customer_ids;\nDELETE FROM banking_transaction_customer_ids;\nDELETE FROM lending_transaction_customer_ids;\nDELETE FROM referral_customer_ids;\nINSERT INTO paymentHistoryConfig(rowid) VALUES (NULL);\n\nDELETE FROM ratePlanConfig;\nINSERT INTO ratePlanConfig (rowid) VALUES (NULL);\n\nDELETE FROM reactionConfig;\nINSERT INTO reactionConfig(rowid) VALUES (NULL);\n\nDELETE FROM recipientConfig;\nINSERT INTO recipientConfig (rowid) VALUES (NULL);\n\nDELETE FROM sharingConfig;\nINSERT INTO sharingConfig (rowid) VALUES (NULL);\n\nDELETE FROM stampsConfig;\nINSERT INTO stampsConfig (rowid) VALUES (NULL);\n\nDELETE FROM supportConfig;\nINSERT INTO supportConfig(rowid) VALUES (NULL);\n\nDELETE FROM webLoginConfig;\nINSERT INTO webLoginConfig(rowid) VALUES (NULL);\n\nDELETE FROM bitcoinTransactionCustomerIds;\n\nDELETE FROM institutionsConfig;\nINSERT INTO institutionsConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(num15, str54, null);
                androidSqliteDriver.execute(num15, str53, null);
                androidSqliteDriver.execute(num15, str56, null);
                androidSqliteDriver.execute(num15, str52, null);
                androidSqliteDriver.execute(num15, str18, null);
                androidSqliteDriver.execute(num15, str55, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\nEND", null);
            }
            if (j <= 558 && j2 > 558) {
                androidSqliteDriver.execute(num15, "DROP TABLE cashDrawerConfig", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeAppConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeAppConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM bankingConfig;\nINSERT INTO bankingConfig (rowid) VALUES (NULL);\n\nDELETE FROM blockersConfig;\nINSERT INTO blockersConfig(rowid) VALUES (NULL);\n\nDELETE FROM checkDepositConfig;\nINSERT INTO checkDepositConfig (rowid) VALUES (NULL);\n\nDELETE FROM cryptocurrencyConfig;\nINSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\n\nDELETE FROM instrumentLinkingConfig;\nINSERT INTO instrumentLinkingConfig (rowid) VALUES (NULL);\n\nDELETE FROM invitationConfig;\nINSERT INTO invitationConfig (rowid) VALUES (NULL);\n\nDELETE FROM offlineConfig;\nINSERT INTO offlineConfig(rowid) VALUES (NULL);\n\nDELETE FROM paymentHistoryConfig;\nDELETE FROM transfer_customer_ids;\nDELETE FROM banking_transaction_customer_ids;\nDELETE FROM lending_transaction_customer_ids;\nDELETE FROM referral_customer_ids;\nINSERT INTO paymentHistoryConfig(rowid) VALUES (NULL);\n\nDELETE FROM ratePlanConfig;\nINSERT INTO ratePlanConfig (rowid) VALUES (NULL);\n\nDELETE FROM reactionConfig;\nINSERT INTO reactionConfig(rowid) VALUES (NULL);\n\nDELETE FROM recipientConfig;\nINSERT INTO recipientConfig (rowid) VALUES (NULL);\n\nDELETE FROM sharingConfig;\nINSERT INTO sharingConfig (rowid) VALUES (NULL);\n\nDELETE FROM stampsConfig;\nINSERT INTO stampsConfig (rowid) VALUES (NULL);\n\nDELETE FROM supportConfig;\nINSERT INTO supportConfig(rowid) VALUES (NULL);\n\nDELETE FROM webLoginConfig;\nINSERT INTO webLoginConfig(rowid) VALUES (NULL);\n\nDELETE FROM bitcoinTransactionCustomerIds;\n\nDELETE FROM institutionsConfig;\nINSERT INTO institutionsConfig (rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 559 && j2 > 559) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN serverId TEXT DEFAULT NULL", null);
            }
            if (j <= 560 && j2 > 560) {
                androidSqliteDriver.execute(num15, "ALTER TABLE bankingTab ADD COLUMN disclosure TEXT", null);
            }
            if (j <= 561 && j2 > 561) {
                androidSqliteDriver.execute(num15, str61, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  avatar.is_cash_customer,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  associated_payment_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.is_cash_customer,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nWHERE payment.is_hidden = 0\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC, payment.token DESC", null);
            }
            if (j <= 562 && j2 > 562) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN layout TEXT DEFAULT NULL", null);
            }
            if (j <= 563 && j2 > 563) {
                androidSqliteDriver.execute(num15, "CREATE TABLE savingsHome(\n  entity_id TEXT PRIMARY KEY,\n  savings_home BLOB NOT NULL\n)", null);
            }
            if (j <= 564 && j2 > 564) {
                androidSqliteDriver.execute(num15, "CREATE TABLE savingsConfig(\n  entity_id TEXT PRIMARY KEY,\n  config BLOB NOT NULL\n)", null);
            }
            if (j <= 565 && j2 > 565) {
                androidSqliteDriver.execute(num15, "CREATE TABLE rewardMerchant(\n  reward_token TEXT NOT NULL REFERENCES reward(token),\n  merchant_token TEXT NOT NULL,\n  PRIMARY KEY (reward_token, merchant_token)\n)", null);
            }
            if (j <= 566 && j2 > 566) {
                androidSqliteDriver.execute(num15, "CREATE TABLE contact_detailed_sync_state_new(\n  primary_key TEXT PRIMARY KEY,\n  latest_lookup_key TEXT NOT NULL,\n  row_id INTEGER,\n  hash TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO contact_detailed_sync_state_new(\n  primary_key,\n  latest_lookup_key,\n  hash\n)\nSELECT id, id, hash FROM contact_detailed_sync_state", null);
                androidSqliteDriver.execute(num15, "DROP TABLE contact_detailed_sync_state", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE contact_detailed_sync_state_new\nRENAME TO contact_detailed_sync_state", null);
            }
            if (j > 567 || j2 <= 567) {
                str64 = str57;
                str65 = str51;
            } else {
                str64 = str57;
                androidSqliteDriver.execute(num15, str64, null);
                androidSqliteDriver.execute(num15, "CREATE TABLE investment_state(\n  has_active_brokerage_account INTEGER NOT NULL DEFAULT 0,\n  has_portfolio INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO investment_state DEFAULT VALUES", null);
                str65 = str51;
                androidSqliteDriver.execute(num15, str65, null);
            }
            if (j <= 568 && j2 > 568) {
                androidSqliteDriver.execute(num15, "CREATE VIEW recentRecipient AS\nSELECT contact.display_name AS contact_display_name,\n       contact.lookup_key,\n       CASE already_invited WHEN 1 THEN 1\n         ELSE invite_entity_id IS NOT NULL END AS already_invited,\n       has_multiple_customers,\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer,\n       coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email,\n       customer_sms AS sms,\n       photo,\n       customer_display_name,\n       group_concat(email) AS email_addresses,\n       group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments,\n       coalesce(is_square, 0) AS is_square,\n       coalesce(credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       NULL AS reward_token\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON alias.hashed_alias = invite_hashed_alias\nWHERE merchant_data IS NULL\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       invite_entity_id IS NOT NULL,\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       is_cash_customer,\n       is_verified,\n       is_business,\n       email,\n       sms,\n       photo,\n       customer_display_name,\n       email,\n       sms,\n       can_accept_payments,\n       is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       NULL   -- reward_token\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON contact_alias.hashed_alias = invite_hashed_alias\nWHERE lookup_key IS NULL\nAND merchant_data IS NULL\nAND (can_accept_payments OR email IS NOT NULL OR sms IS NOT NULL)\n\nUNION ALL\n\n-- Customers that are merchants\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       0,    -- already_invited\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       customer.cashtag,\n       customer.is_cash_customer,\n       customer.is_verified,\n       customer.is_business,\n       NULL, -- email\n       NULL, -- sms\n       customer.photo,\n       customer.customer_display_name,\n       NULL, -- emails\n       NULL, -- sms(s)\n       customer.can_accept_payments,\n       customer.is_square,\n       coalesce(\n         customer.credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       customer.blocked,\n       customer.merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       reward_token\nFROM customer\nLEFT JOIN (\n  SELECT *\n  FROM rewardMerchant\n  GROUP BY merchant_token\n) ON customer.customer_id = merchant_token\nWHERE customer.merchant_data IS NOT NULL AND trim(customer.merchant_data) != \"\"", null);
            }
            if (j <= 569 && j2 > 569) {
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS recentRecipient", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW recentRecipient AS\nSELECT contact.display_name AS contact_display_name,\n       contact.lookup_key,\n       CASE already_invited WHEN 1 THEN 1\n         ELSE invite_entity_id IS NOT NULL END AS already_invited,\n       has_multiple_customers,\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer,\n       coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email,\n       customer_sms AS sms,\n       photo,\n       customer_display_name,\n       group_concat(email) AS email_addresses,\n       group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments,\n       coalesce(is_square, 0) AS is_square,\n       coalesce(credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       NULL AS reward_token\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON alias.hashed_alias = invite_hashed_alias\nWHERE merchant_data IS NULL\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       invite_entity_id IS NOT NULL,\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       is_cash_customer,\n       is_verified,\n       is_business,\n       email,\n       sms,\n       photo,\n       customer_display_name,\n       email,\n       sms,\n       can_accept_payments,\n       is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       NULL   -- reward_token\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON contact_alias.hashed_alias = invite_hashed_alias\nWHERE lookup_key IS NULL\nAND merchant_data IS NULL\nAND (can_accept_payments OR email IS NOT NULL OR sms IS NOT NULL)\n\nUNION ALL\n\n-- Customers that are merchants\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       0,    -- already_invited\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       customer.cashtag,\n       customer.is_cash_customer,\n       customer.is_verified,\n       customer.is_business,\n       NULL, -- email\n       NULL, -- sms\n       customer.photo,\n       customer.customer_display_name,\n       NULL, -- emails\n       NULL, -- sms(s)\n       customer.can_accept_payments,\n       customer.is_square,\n       coalesce(\n         customer.credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       customer.blocked,\n       customer.merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       reward_token\nFROM customer\nLEFT JOIN (\n  SELECT *\n  FROM rewardMerchant\n  GROUP BY merchant_token\n) ON customer.customer_id = merchant_token\nWHERE customer.merchant_data IS NOT NULL\nAND trim(customer.merchant_data) != \"\"\n-- De-duplicate merchants and only fetch parent merchants\nAND customer.threaded_customer_id IS NULL", null);
            }
            if (j <= 570 && j2 > 570) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investment_holding ADD COLUMN average_cost BLOB", null);
            }
            if (j <= 571 && j2 > 571) {
                androidSqliteDriver.execute(num15, "CREATE TABLE family_account(\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  dependent BLOB,\n  sponsor BLOB\n)", null);
            }
            if (j <= 572 && j2 > 572) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS familyAccount", null);
            }
            if (j <= 573 && j2 > 573) {
                androidSqliteDriver.execute(num15, "ALTER TABLE sync_entity ADD COLUMN sync_value_type INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX sync_value_types ON sync_entity (sync_value_type)", null);
            }
            if (j <= 574 && j2 > 574) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS savingsHome", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS savingsConfig", null);
            }
            if (j <= 575 && j2 > 575) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectoryItem ADD COLUMN layout TEXT DEFAULT NULL", null);
            }
            if (j <= 576 && j2 > 576) {
                androidSqliteDriver.execute(num15, str64, null);
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_state(\n  has_active_brokerage_account INTEGER NOT NULL DEFAULT 0,\n  has_portfolio INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO investing_state\nSELECT has_active_brokerage_account, has_portfolio\nFROM investment_state", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS investment_state", null);
                androidSqliteDriver.execute(num15, str65, null);
            }
            if (j <= 577 && j2 > 577) {
                androidSqliteDriver.execute(num15, "ALTER TABLE inAppNotificationMessage ADD COLUMN avatar BLOB", null);
            }
            if (j <= 578 && j2 > 578) {
                androidSqliteDriver.execute(num15, str64, null);
                androidSqliteDriver.execute(num15, "CREATE TABLE tmp_investing_state(\n  has_active_brokerage_account INTEGER NOT NULL DEFAULT 0,\n  has_portfolio INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO tmp_investing_state DEFAULT VALUES", null);
                androidSqliteDriver.execute(num15, "UPDATE tmp_investing_state\nSET\n  has_active_brokerage_account = IFNULL((SELECT investing_state.has_active_brokerage_account FROM investing_state), 0),\n  has_portfolio = IFNULL((SELECT investing_state.has_portfolio FROM investing_state), 0)", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS investing_state", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE tmp_investing_state RENAME TO investing_state", null);
                androidSqliteDriver.execute(num15, str65, null);
            }
            if (j <= 579 && j2 > 579) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_state ADD COLUMN has_holdings INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 581 && j2 > 581) {
                androidSqliteDriver.execute(num15, "UPDATE profileDirectoryItem\nSET\n  layout = \"HORIZONTAL_RECTANGLE\"\n  WHERE layout = \"SQUARE\"", null);
            }
            if (j <= 582 && j2 > 582) {
                androidSqliteDriver.execute(num15, "ALTER TABLE treehouseConfig ADD COLUMN money_tab_manifest_url TEXT DEFAULT NULL", null);
            }
            if (j <= 583 && j2 > 583) {
                androidSqliteDriver.execute(num15, "ALTER TABLE shoppingRecentlyViewed ADD COLUMN subtitle TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE shoppingRecentlyViewed ADD COLUMN type TEXT NOT NULL DEFAULT 'AP_STORE'", null);
            }
            if (j <= 584 && j2 > 584) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectoryItem ADD COLUMN hideCloseButton INTEGER", null);
            }
            if (j <= 585 && j2 > 585) {
                androidSqliteDriver.execute(num15, "DELETE FROM investing_news_article WHERE kind = \"BitcoinPortfolio\"", null);
            }
            if (j <= 586 && j2 > 586) {
                androidSqliteDriver.execute(num15, "ALTER TABLE shoppingRecentlyViewed ADD COLUMN imageType TEXT NOT NULL DEFAULT 'AVATAR'", null);
            }
            if (j <= 587 && j2 > 587) {
                androidSqliteDriver.execute(num15, "ALTER TABLE accessSettings ADD COLUMN app_lock_activated INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 588 && j2 > 588) {
                androidSqliteDriver.execute(num15, "CREATE TABLE fullScreenMessage(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  video BLOB,\n  primaryAction BLOB,\n  secondaryAction BLOB,\n  primaryActionColor BLOB,\n  secondaryActionColor BLOB\n)", null);
            }
            if (j <= 589 && j2 > 589) {
                androidSqliteDriver.execute(num15, "ALTER TABLE businessGrants ADD COLUMN expires_at INTEGER", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE businessGrants ADD COLUMN client_id TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE businessGrants ADD COLUMN action_type TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE businessGrants ADD COLUMN account_reference_id TEXT", null);
            }
            if (j <= 590 && j2 > 590) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS accessSettings", null);
            }
            if (j <= 591 && j2 > 591) {
                androidSqliteDriver.execute(num15, "CREATE TABLE pendingSplit (\n  external_id TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL,\n  retry_at INTEGER NOT NULL,\n  retry_count INTEGER NOT NULL DEFAULT 0,\n  request BLOB NOT NULL,\n  amount BLOB NOT NULL,\n  succeeded INTEGER NOT NULL DEFAULT 0,\n  client_scenario TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW completedPendingSplits AS\nSELECT pendingSplit.external_id\nFROM pendingSplit\nWHERE succeeded = 1", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER deleteSuccessfulSplits\nAFTER UPDATE OF succeeded ON pendingSplit\nBEGIN\nDELETE FROM pendingSplit\nWHERE external_id IN completedPendingSplits;\nEND", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\nEND", null);
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS pending", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW pending AS\n  SELECT pendingPayment.external_id,\npendingPayment.request AS payment_request,\nNULL AS transfer_request,\nNULL AS split_request,\npendingPayment.created_at,\ncredit_card_fee_bps,\nrecipients\nFROM pendingPayment\n  LEFT JOIN payment ON pendingPayment.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL\n  UNION\nSELECT pendingTransfer.external_id,\nNULL AS payment_request,\npendingTransfer.request AS transfer_request,\nNULL AS split_request,\npendingTransfer.created_at,\ncredit_card_fee_bps,\n1 AS recipients\nFROM pendingTransfer\n  LEFT JOIN payment ON pendingTransfer.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL\n  UNION\nSELECT pendingSplit.external_id,\nNULL AS payment_request,\nNULL AS transfer_request,\npendingSplit.request AS split_request,\npendingSplit.created_at,\ncredit_card_fee_bps,\n1 AS recipients\nFROM pendingSplit\n  LEFT JOIN payment ON pendingSplit.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL", null);
            }
            if (j <= 592 && j2 > 592) {
                androidSqliteDriver.execute(num15, "CREATE INDEX sender_id_index ON payment(sender_id)", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX recipient_id_index ON payment(recipient_id)", null);
            }
            if (j <= 593 && j2 > 593) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS marketCapabilitiesConfig (\n  id TEXT PRIMARY KEY,\n  capabilities BLOB NOT NULL\n)", null);
            }
            if (j <= 594 && j2 > 594) {
                androidSqliteDriver.execute(num15, str61, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  avatar.is_cash_customer,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  associated_payment_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular,\n  is_hidden\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.is_cash_customer,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC, payment.token DESC", null);
            }
            if (j <= 595 && j2 > 595) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS lastSeenSavingsBalance(\n  balance BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "DELETE FROM lastSeenSavingsBalance", null);
                androidSqliteDriver.execute(num15, "INSERT INTO lastSeenSavingsBalance DEFAULT VALUES", null);
            }
            if (j <= 596 && j2 > 596) {
                androidSqliteDriver.execute(num15, "CREATE TABLE creditLine_new(\n  token TEXT NOT NULL PRIMARY KEY,\n  credit_limit BLOB NOT NULL,\n  available_amount BLOB,\n  outstanding_amount BLOB,\n  setup_fee_bps INTEGER NOT NULL,\n  quick_amounts BLOB,\n  minimum_loan_amount BLOB,\n  first_time_borrow_data BLOB,\n  instrument_display_name TEXT,\n  status_icon TEXT,\n  skip_loan_amount_selection INTEGER,\n  lending_product TEXT,\n  subtitle TEXT,\n  status_data BLOB,\n  limit_data BLOB,\n  alert BLOB\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO creditLine_new\nSELECT\n  token,\n  credit_limit,\n  available_amount,\n  outstanding_amount,\n  setup_fee_bps,\n  quick_amounts,\n  minimum_loan_amount,\n  first_time_borrow_data,\n  instrument_display_name,\n  status_icon,\n  skip_loan_amount_selection,\n  lending_product,\n  subtitle,\n  status_data,\n  limit_data,\n  alert\nFROM creditLine", null);
                androidSqliteDriver.execute(num15, "DROP TABLE creditLine", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE creditLine_new RENAME TO creditLine", null);
            }
            if (j <= 597 && j2 > 597) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS savingsGoalLocalStatus(\n  token TEXT NOT NULL PRIMARY KEY,\n  met INTEGER NOT NULL DEFAULT 0\n)", null);
            }
            if (j <= 598 && j2 > 598) {
                androidSqliteDriver.execute(num15, "ALTER TABLE savingsGoalLocalStatus ADD COLUMN celebration_shown INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 599 && j2 > 599) {
                androidSqliteDriver.execute(num15, "ALTER TABLE customerStatementType ADD COLUMN is_active_sponsored_account INTEGER DEFAULT NULL", null);
            }
            if (j <= 600 && j2 > 600) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS sync_value_issued_card", null);
            }
            if (j <= 601 && j2 > 601) {
                androidSqliteDriver.execute(num15, "ALTER TABLE reward ADD COLUMN user_agent TEXT", null);
            }
            if (j <= 602 && j2 > 602) {
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS recentRecipient", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW recentRecipient AS\nSELECT contact.display_name AS contact_display_name,\n       contact.lookup_key,\n       CASE already_invited WHEN 1 THEN 1\n         ELSE invite_entity_id IS NOT NULL END AS already_invited,\n       has_multiple_customers,\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer,\n       coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email,\n       customer_sms AS sms,\n       photo,\n       customer_display_name,\n       group_concat(email) AS email_addresses,\n       group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments,\n       coalesce(is_square, 0) AS is_square,\n       coalesce(credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       NULL AS reward_token\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON alias.hashed_alias = invite_hashed_alias\nWHERE merchant_data IS NULL\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       invite_entity_id IS NOT NULL,\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       is_cash_customer,\n       is_verified,\n       is_business,\n       email,\n       sms,\n       photo,\n       customer_display_name,\n       email,\n       sms,\n       can_accept_payments,\n       is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       NULL   -- reward_token\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON contact_alias.hashed_alias = invite_hashed_alias\nWHERE lookup_key IS NULL\nAND merchant_data IS NULL\nAND (can_accept_payments OR email IS NOT NULL OR sms IS NOT NULL)\n\nUNION ALL\n\n-- Customers that are merchants\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       0,    -- already_invited\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       customer.cashtag,\n       customer.is_cash_customer,\n       customer.is_verified,\n       customer.is_business,\n       NULL, -- email\n       NULL, -- sms\n       customer.photo,\n       customer.customer_display_name,\n       NULL, -- emails\n       NULL, -- sms(s)\n       customer.can_accept_payments,\n       customer.is_square,\n       coalesce(\n         customer.credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       customer.blocked,\n       customer.merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       reward_token\nFROM customer\nLEFT JOIN (\n  SELECT *\n  FROM rewardMerchant\n  GROUP BY merchant_token\n) ON customer.customer_id = merchant_token\nWHERE customer.merchant_data IS NOT NULL\nAND trim(customer.merchant_data) != \"\"\n-- De-duplicate merchants by verifying if a merchant is a parent merchant and not\n-- an orphaned child (data issue). We do this by checking if a merchant is linked to another\n-- merchant through `threaded_customer_id`. If an existing merchant is referenced through\n-- `threaded_customer_id` and it exists, then we include that merchant as part of this query\nAND customer.customer_id IN (\n  SELECT threaded_customer_id\n  FROM customer\n  WHERE merchant_data IS NOT NULL\n  AND threaded_customer_id IS NOT NULL\n)", null);
            }
            if (j <= 603 && j2 > 603) {
                androidSqliteDriver.execute(num15, str64, null);
                androidSqliteDriver.execute(num15, "CREATE TABLE tmp_investing_state(\n  has_active_brokerage_account INTEGER NOT NULL DEFAULT 0,\n  has_portfolio INTEGER NOT NULL DEFAULT 0,\n  has_holdings INTEGER\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO tmp_investing_state DEFAULT VALUES", null);
                androidSqliteDriver.execute(num15, "UPDATE tmp_investing_state\nSET\n  has_active_brokerage_account = IFNULL((SELECT investing_state.has_active_brokerage_account FROM investing_state), 0),\n  has_portfolio = IFNULL((SELECT investing_state.has_portfolio FROM investing_state), 0)", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS investing_state", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE tmp_investing_state RENAME TO investing_state", null);
                androidSqliteDriver.execute(num15, str65, null);
            }
            if (j <= 604 && j2 > 604) {
                androidSqliteDriver.execute(num15, "ALTER TABLE alias ADD COLUMN hashed_alias_id TEXT DEFAULT NULL", null);
            }
            if (j <= 605 && j2 > 605) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_state ADD COLUMN dividend_setting_type TEXT NOT NULL DEFAULT 'UNDEFINED'", null);
            }
            if (j <= 606 && j2 > 606) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN tileSection BLOB", null);
            }
            if (j <= 607 && j2 > 607) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS sync_value_instrument", null);
            }
            if (j <= 608 && j2 > 608) {
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS balanceSnapshotInstrument", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS balance_snapshot", null);
            }
            if (j <= 609 && j2 > 609) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS productsResultsSection(\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  type TEXT NOT NULL,\n  title BLOB,\n  subtitle BLOB,\n  layout TEXT\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS productsResultsItem(\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  sectionId INTEGER NOT NULL REFERENCES productsResultsSection(id),\n  position INTEGER NOT NULL,\n  title BLOB,\n  subtitle BLOB,\n  captionLeft BLOB,\n  captionRight BLOB,\n  actionUrl TEXT,\n  picture BLOB,\n  metadata BLOB\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS productsResultsPaginationToken(\n  token TEXT\n)", null);
            }
            if (j <= 610 && j2 > 610) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS treehouseAppConfig", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE treehouseAppConfig (\n  app_name TEXT DEFAULT NULL UNIQUE,\n  path TEXT DEFAULT NULL,\n  url TEXT DEFAULT NULL\n)", null);
            }
            if (j <= 611 && j2 > 611) {
                androidSqliteDriver.execute(num15, "ALTER TABLE productsResultsSection ADD COLUMN message BLOB", null);
            }
            if (j <= 612 && j2 > 612) {
                androidSqliteDriver.execute(num15, "ALTER TABLE productsResultsSection ADD COLUMN footerButton BLOB", null);
            }
            if (j <= 613 && j2 > 613) {
                androidSqliteDriver.execute(num15, "ALTER TABLE lendingConfig ADD COLUMN expires_at INTEGER DEFAULT NULL", null);
            }
            if (j <= 614 && j2 > 614) {
                androidSqliteDriver.execute(num15, "ALTER TABLE lendingConfig ADD COLUMN refresh_policy TEXT DEFAULT NULL", null);
            }
            if (j <= 615 && j2 > 615) {
                androidSqliteDriver.execute(num15, "CREATE TABLE treehouseAppConfigurations(\n  id TEXT PRIMARY KEY,\n  endpoint_type TEXT\n)", null);
            }
            if (j <= 616 && j2 > 616) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS treehouseConfig", null);
            }
            if (j <= 617 && j2 > 617) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN tapAction BLOB", null);
            }
            if (j > 618 || j2 <= 618) {
                str66 = str41;
            } else {
                androidSqliteDriver.execute(num15, str61, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  avatar.is_cash_customer,\n  avatar.can_accept_payments,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  associated_payment_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular,\n  is_hidden\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.is_cash_customer,\n    customer.can_accept_payments,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC, payment.token DESC", null);
                str66 = str41;
                androidSqliteDriver.execute(num15, str66, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW activityRecipient AS\nSELECT\n  contact.display_name AS contact_display_name,\n  contact.lookup_key,\n  already_invited,\n  has_multiple_customers,\n  customer.customer_id,\n  customer.threaded_customer_id,\n  cashtag,\n  is_cash_customer,\n  is_verified,\n  is_business,\n  email,\n  sms,\n  photo,\n  customer_display_name,\n  group_concat(email) AS email_addresses,\n  group_concat(sms) AS sms_numbers,\n  can_accept_payments,\n  is_square,\n  coalesce(credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0) AS credit_card_fee,\n  blocked,\n  merchant_data,\n  customer.themed_accent_color,\n  customer.region,\n  customer.category,\n  customer.investment_entity_token\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nGROUP BY customer.customer_id", null);
            }
            if (j <= 619 && j2 > 619) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS crypto_wallet", null);
            }
            if (j <= 620 && j2 > 620) {
                androidSqliteDriver.execute(num15, "CREATE TABLE tooltipMessage(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  placement TEXT,\n  arrowPosition TEXT,\n  tooltip BLOB\n)", null);
            }
            if (j <= 621 && j2 > 621) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS limitsPagelet(\n  entity_id TEXT PRIMARY KEY,\n  has_been_seen INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM limitsPagelet;\nEND", null);
            }
            if (j <= 622 && j2 > 622) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS limitsPagelet", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\nEND", null);
            }
            if (j <= 623 && j2 > 623) {
                androidSqliteDriver.execute(num15, "CREATE TABLE multiBlockerRequests(\n  group_id TEXT NOT NULL,\n  descriptor_id TEXT NOT NULL,\n  request BLOB NOT NULL,\n  PRIMARY KEY (group_id, descriptor_id)\n)", null);
            }
            if (j <= 624 && j2 > 624) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS atmWithdrawalAddressSearch(\n  identifier TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL DEFAULT 0,\n  formatted_address TEXT NOT NULL,\n  primary_text TEXT NOT NULL,\n  secondary_text TEXT,\n  latitude REAL,\n  longitude REAL\n)", null);
            }
            if (j <= 625 && j2 > 625) {
                androidSqliteDriver.execute(num15, str61, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  avatar.is_cash_customer,\n  avatar.can_accept_payments,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  associated_payment_token,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular,\n  is_hidden,\n  payment.orientation\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.is_cash_customer,\n    customer.can_accept_payments,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC, payment.token DESC", null);
                androidSqliteDriver.execute(num15, str66, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW activityRecipient AS\nSELECT\n  contact.display_name AS contact_display_name,\n  contact.lookup_key,\n  already_invited,\n  has_multiple_customers,\n  customer.customer_id,\n  customer.threaded_customer_id,\n  cashtag,\n  is_cash_customer,\n  is_verified,\n  is_business,\n  email,\n  sms,\n  photo,\n  customer_display_name,\n  group_concat(email) AS email_addresses,\n  group_concat(sms) AS sms_numbers,\n  can_accept_payments,\n  is_square,\n  coalesce(credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0) AS credit_card_fee,\n  blocked,\n  merchant_data,\n  customer.themed_accent_color,\n  customer.region,\n  customer.category,\n  customer.investment_entity_token\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nGROUP BY customer.customer_id", null);
            }
            if (j <= 626 && j2 > 626) {
                androidSqliteDriver.execute(num15, "CREATE TABLE userRewardsData (\n  new_to_boost INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO userRewardsData\nSELECT new_to_boost\nFROM rewardsData", null);
                androidSqliteDriver.execute(num15, "DROP TABLE rewardsData", null);
            }
            if (j <= 627 && j2 > 627) {
                androidSqliteDriver.execute(num15, "ALTER TABLE sync_entity ADD COLUMN sync_entity_version INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE payment ADD COLUMN sync_entity_version INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, str61, null);
                androidSqliteDriver.execute(num15, str62, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW payments_model AS\nSELECT\n  amount,\n  amount_currency,\n  entity_id,\n  token,\n  orientation,\n  role,\n  state,\n  payment.render_data AS payment_render_data,\n  sender.render_data AS sender_render_data,\n  recipient.render_data AS recipient_render_data,\n  recipient_id,\n  sender_id,\n  captured_at,\n  created_at,\n  their_id,\n  display_date,\n  _id,\n  sender_amount,\n  recipient_amount,\n  boost_amount,\n  paid_out_at,\n  refunded_at,\n  updated_at,\n  is_badged,\n  rollup_type,\n  investment_order_type,\n  payment_type,\n  gifted_investment_entity_token,\n  coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding,\n  external_id,\n  (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n  coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden,\n  loyalty.render_data AS loyalty_render_data,\n  lending_loan_token,\n  associated_payment_token,\n  sync_entity_version\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nLEFT JOIN loyaltyProgram AS loyalty ON (payment.recipient_id = loyalty.cash_merchant_token)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  avatar.is_cash_customer,\n  avatar.can_accept_payments,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  associated_payment_token,\n  sync_entity_version,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular,\n  is_hidden,\n  payment.orientation\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.is_cash_customer,\n    customer.can_accept_payments,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC, payment.token DESC", null);
            }
            if (j <= 628 && j2 > 628) {
                androidSqliteDriver.execute(num15, "ALTER TABLE document ADD COLUMN owner_token TEXT DEFAULT NULL", null);
            }
            if (j <= 629 && j2 > 629) {
                androidSqliteDriver.execute(num15, "CREATE TABLE crypto_statement(\n  token TEXT NOT NULL PRIMARY KEY,\n  category TEXT NOT NULL,\n  title TEXT NOT NULL,\n  document_date INTEGER NOT NULL,\n  url TEXT NOT NULL,\n  owner_token TEXT NOT NULL\n)", null);
            }
            if (j <= 630 && j2 > 630) {
                androidSqliteDriver.execute(num15, "CREATE TABLE activeRewardOverride(\n  reward_token TEXT NOT NULL REFERENCES reward(token)\n)", null);
            }
            if (j <= 631 && j2 > 631) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\nEND", null);
            }
            if (j <= 632 && j2 > 632) {
                androidSqliteDriver.execute(num15, "ALTER TABLE instrumentLinkingConfig RENAME TO instrumentLinkingConfig_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE instrumentLinkingConfig(\n  header_no_instrument_linked TEXT DEFAULT NULL,\n  description_no_instrument_linked TEXT DEFAULT NULL,\n  header_bank_account_linked TEXT DEFAULT NULL,\n  description_bank_account_linked TEXT DEFAULT NULL,\n  header_no_instrument_linked_personal TEXT DEFAULT NULL,\n  description_no_instrument_linked_personal TEXT DEFAULT NULL,\n  credit_card_fee_bps INTEGER DEFAULT NULL,\n  credit_card_linking_enabled INTEGER DEFAULT NULL,\n  max_credit_prompts INTEGER DEFAULT NULL,\n  cash_balance_enabled INTEGER DEFAULT NULL,\n  issued_cards_enabled INTEGER DEFAULT NULL,\n  bankbook_enabled INTEGER DEFAULT NULL,\n  issued_card_disabled_style TEXT DEFAULT NULL,\n  physical_issued_cards_enabled INTEGER DEFAULT NULL,\n  nfc_card_linking_enabled INTEGER DEFAULT 0,\n  bank_account_linking_config BLOB\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO instrumentLinkingConfig(\n  header_no_instrument_linked,\n  description_no_instrument_linked,\n  header_bank_account_linked,\n  description_bank_account_linked,\n  header_no_instrument_linked_personal,\n  description_no_instrument_linked_personal,\n  credit_card_fee_bps,\n  credit_card_linking_enabled,\n  max_credit_prompts,\n  cash_balance_enabled,\n  issued_cards_enabled,\n  bankbook_enabled,\n  issued_card_disabled_style,\n  physical_issued_cards_enabled,\n  nfc_card_linking_enabled,\n  bank_account_linking_config\n)\nSELECT\n  header_no_instrument_linked,\n  description_no_instrument_linked,\n  header_bank_account_linked,\n  description_bank_account_linked,\n  header_no_instrument_linked_personal,\n  description_no_instrument_linked_personal,\n  credit_card_fee_bps,\n  credit_card_linking_enabled,\n  max_credit_prompts,\n  cash_balance_enabled,\n  issued_cards_enabled,\n  bankbook_enabled,\n  issued_card_disabled_style,\n  physical_issued_cards_enabled,\n  nfc_card_linking_enabled,\n  bank_account_linking_config\nFROM instrumentLinkingConfig_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE instrumentLinkingConfig_old", null);
            }
            if (j <= 633 && j2 > 633) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_incentive;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\nEND", null);
            }
            if (j <= 634 && j2 > 634) {
                androidSqliteDriver.execute(num15, str61, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  avatar.is_cash_customer,\n  avatar.can_accept_payments,\n  avatar.is_business,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  associated_payment_token,\n  sync_entity_version,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular,\n  is_hidden,\n  payment.orientation\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.is_cash_customer,\n    customer.can_accept_payments,\n    customer.is_business,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC, payment.token DESC", null);
            }
            if (j <= 635 && j2 > 635) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\nEND", null);
                androidSqliteDriver.execute(num15, "DROP TABLE investment_incentive", null);
            }
            if (j <= 636 && j2 > 636) {
                androidSqliteDriver.execute(num15, "DROP TABLE investing_full_profile", null);
                androidSqliteDriver.execute(num15, "DROP TABLE investing_suggestions", null);
            }
            if (j <= 637 && j2 > 637) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS offersFilterGroupsSection(\n  filter_groups_section BLOB NOT NULL\n)", null);
            }
            if (j <= 638 && j2 > 638) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\nEND", null);
            }
            if (j <= 639 && j2 > 639) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS offersFilterGroupsSection", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS offersHome(\n  id INTEGER NOT NULL PRIMARY KEY,\n  ttl_in_millis INTEGER,\n  offers_home_response BLOB NOT NULL\n)", null);
            }
            if (j <= 640 && j2 > 640) {
                androidSqliteDriver.execute(num15, "CREATE TABLE threadMessage(\n  token TEXT NOT NULL PRIMARY KEY,\n  external_id TEXT NOT NULL,\n  timestamp_millis INTEGER NOT NULL DEFAULT 0,\n  stored_at INTEGER NOT NULL DEFAULT 0,\n  message BLOB,\n  page_cursor TEXT,\n  unread INTEGER NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE threadMessagePage(\n  external_id TEXT NOT NULL,\n  cursor TEXT NOT NULL,\n  page_index INTEGER NOT NULL DEFAULT 0,\n  next_cursor TEXT,\n  CONSTRAINT threadMessagePage_pk PRIMARY KEY (external_id, cursor, page_index)\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE threadMessageReaction(\n  token TEXT NOT NULL,\n  stored_at INTEGER NOT NULL DEFAULT CURRENT_TIMESTAMP,\n  owner_token TEXT NOT NULL,\n  reaction TEXT NOT NULL,\n  from_current_customer INTEGER NOT NULL DEFAULT 0,\n  CONSTRAINT threadMessageReaction_pk PRIMARY KEY (token, owner_token, reaction)\n)", null);
            }
            if (j <= 641 && j2 > 641) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessagePage;\n  DELETE FROM threadMessageReaction;\nEND", null);
            }
            if (j <= 642 && j2 > 642) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS offersSearch(\n  id INTEGER NOT NULL PRIMARY KEY,\n  offers_search_response BLOB NOT NULL\n)", null);
            }
            if (j <= 643 && j2 > 643) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS offersRecentlyViewed(\n  token TEXT NOT NULL PRIMARY KEY,\n  updated_at INTEGER NOT NULL\n)", null);
            }
            if (j <= 644 && j2 > 644) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS threadsReactionConfig (\n  reaction TEXT NOT NULL\n)", null);
            }
            if (j <= 645 && j2 > 645) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS offersRecentlyViewed", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE offersRecentlyViewed(\n  id INTEGER PRIMARY KEY,\n  token TEXT NOT NULL UNIQUE\n)", null);
            }
            if (j <= 646 && j2 > 646) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS offersCollectionDetail(\n  token TEXT NOT NULL PRIMARY KEY,\n  ttl_in_millis INTEGER,\n  offers_collection_response BLOB NOT NULL\n)", null);
            }
            if (j <= 647 && j2 > 647) {
                androidSqliteDriver.execute(num15, "ALTER TABLE threadMessage ADD COLUMN reaction_removed_in_session INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 648 && j2 > 648) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessagePage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\nEND", null);
            }
            if (j <= 649 && j2 > 649) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_discovery ADD COLUMN in_search_category INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 650 && j2 > 650) {
                androidSqliteDriver.execute(num15, "ALTER TABLE offersSearch ADD COLUMN expire_at_ms INTEGER", null);
            }
            if (j <= 651 && j2 > 651) {
                androidSqliteDriver.execute(num15, "DROP TABLE threadMessagePage", null);
                androidSqliteDriver.execute(num15, "DELETE FROM threadMessage", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE threadMessagePage(\n  external_id TEXT NOT NULL,\n-- Used to identify the page, used in composite primary key. \"first\" is the first page and \"last\" is the last page.\n  cursor TEXT NOT NULL,\n  page_index INTEGER NOT NULL DEFAULT 0,\n  next_cursor TEXT,\n  CONSTRAINT threadMessagePage_pk PRIMARY KEY (external_id, page_index)\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER deleteThreadMessagesOnThreadPageDelete\nAFTER DELETE ON threadMessagePage\nBEGIN\n  DELETE FROM threadMessage WHERE external_id = old.external_id AND page_cursor = old.cursor;\nEND", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER deleteThreadMessageReactionOnThreadMessageDelete\nAFTER DELETE ON threadMessage\nBEGIN\n  DELETE FROM threadMessageReaction WHERE token = old.token;\nEND", null);
            }
            if (j <= 652 && j2 > 652) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS creditHubEntryPoint(\n  parent_id TEXT NOT NULL,\n  nature TEXT NOT NULL,\n  type TEXT NOT NULL,\n  version_ranges TEXT NOT NULL,\n  title TEXT,\n  subtitle TEXT,\n  badged INTEGER NOT NULL,\n  client_route TEXT\n)", null);
            }
            if (j <= 653 && j2 > 653) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS offersRecentlyViewed", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE offersRecentlyViewed(\n  id INTEGER PRIMARY KEY,\n  token TEXT NOT NULL UNIQUE,\n  last_updated INTEGER NOT NULL\n)", null);
            }
            if (j <= 654 && j2 > 654) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS creditHubApplet(\n  parent_id TEXT NOT NULL PRIMARY KEY,\n  title TEXT NOT NULL\n)", null);
            }
            if (j <= 655 && j2 > 655) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS creditHubEntryPoint", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS creditHubApplet", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE borrowConfig(\n  parent_id TEXT NOT NULL PRIMARY KEY,\n  title TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE borrowEntryPoint(\n  parent_id TEXT NOT NULL,\n  nature TEXT NOT NULL,\n  type TEXT NOT NULL,\n  version_ranges TEXT NOT NULL,\n  title TEXT,\n  subtitle TEXT,\n  badged INTEGER NOT NULL,\n  client_route TEXT\n)", null);
            }
            if (j <= 656 && j2 > 656) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS offersSheet(\n  sheet_key BLOB NOT NULL PRIMARY KEY,\n  ttl_in_millis INTEGER,\n  offers_sheet_response BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investment_statement;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessagePage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\nEND", null);
            }
            if (j <= 657 && j2 > 657) {
                androidSqliteDriver.execute(num15, "CREATE TABLE borrowAppletVerticalLayout(\n  tile_type TEXT NOT NULL\n)", null);
            }
            if (j <= 658 && j2 > 658) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS globalConfig (\n  id TEXT PRIMARY KEY,\n  globalConfigItems BLOB NOT NULL,\n  stored_at INTEGER NOT NULL DEFAULT CURRENT_TIMESTAMP\n)", null);
            }
            if (j <= 659 && j2 > 659) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS offersSearch", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE offersSearch(\n  id INTEGER NOT NULL PRIMARY KEY,\n  offers_search_response BLOB NOT NULL,\n  expire_at_ms INTEGER,\n  last_updated INTEGER NOT NULL\n)", null);
            }
            if (j <= 660 && j2 > 660) {
                androidSqliteDriver.execute(num15, "CREATE TABLE borrowAppletTile(\n  type TEXT NOT NULL,\n  tile BLOB NOT NULL\n)", null);
            }
            if (j <= 661 && j2 > 661) {
                androidSqliteDriver.execute(num15, "DROP TABLE investment_statement", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessagePage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\nEND", null);
            }
            if (j <= 662 && j2 > 662) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS threadMessage", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS deleteThreadMessageReactionOnThreadMessageDelete", null);
                androidSqliteDriver.execute(num15, "DELETE FROM threadMessageReaction", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE threadMessage(\n  token TEXT NOT NULL PRIMARY KEY,\n  external_id TEXT NOT NULL,\n  timestamp_millis INTEGER NOT NULL DEFAULT 0,\n  -- Tracks when the message stored from the API, could be used to expire stale data.\n  stored_at INTEGER NOT NULL DEFAULT 0,\n  -- Temporarily store proto message as a blob until we can migrate to a better storage solution with an internal data model.\n  message BLOB,\n  unread INTEGER NOT NULL,\n  reaction_removed_in_session INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER deleteThreadMessageReactionOnThreadMessageDelete\nAFTER DELETE ON threadMessage\nBEGIN\n  DELETE FROM threadMessageReaction WHERE token = old.token;\nEND", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS threadMessagePage", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS deleteThreadMessagesOnThreadPageDelete", null);
            }
            if (j <= 663 && j2 > 663) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\nEND", null);
            }
            if (j <= 664 && j2 > 664) {
                androidSqliteDriver.execute(num15, "ALTER TABLE reward ADD COLUMN offerly_token TEXT", null);
            }
            if (j <= 665 && j2 > 665) {
                androidSqliteDriver.execute(num15, "CREATE TABLE supportedBorrowLocation(\n  country TEXT NOT NULL,\n  administrative_district TEXT NOT NULL\n)", null);
            }
            if (j <= 666 && j2 > 666) {
                androidSqliteDriver.execute(num15, "ALTER TABLE userRewardsData ADD COLUMN has_recently_used_boost INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 667 && j2 > 667) {
                androidSqliteDriver.execute(num15, "ALTER TABLE threadMessageReaction ADD COLUMN pending INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 668 && j2 > 668) {
                androidSqliteDriver.execute(num15, "ALTER TABLE rewardMerchant ADD COLUMN merchant_name TEXT", null);
            }
            if (j <= 669 && j2 > 669) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS profileDetails", null);
            }
            if (j <= 670 && j2 > 670) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS p2pSettings", null);
            }
            if (j <= 671 && j2 > 671) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS borrowConfig", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS borrowEntryPoint", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS borrowAppletVerticalLayout", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS borrowAppletTile", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS supportedBorrowLocation", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE borrowData(\n  parent_id TEXT NOT NULL PRIMARY KEY,\n  title TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE borrowEntryPoint(\n  parent_id TEXT NOT NULL,\n  nature TEXT NOT NULL,\n  type TEXT NOT NULL,\n  version_ranges TEXT NOT NULL,\n  title TEXT,\n  subtitle TEXT,\n  badged INTEGER NOT NULL,\n  client_route TEXT\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE borrowAppletVerticalLayout(\n  tile_type TEXT NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE borrowAppletTile(\n  type TEXT NOT NULL,\n  tile BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE supportedBorrowLocation(\n  country TEXT NOT NULL,\n  administrative_district TEXT NOT NULL\n)", null);
            }
            if (j <= 672 && j2 > 672) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_state ADD COLUMN brokerage_account_transfer_will_complete_at_utc INTEGER DEFAULT NULL", null);
            }
            if (j <= 673 && j2 > 673) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM pendingSplit;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM trusted_contact;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 674 && j2 > 674) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS bankingTab", null);
            }
            if (j <= 675 && j2 > 675) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS education_story (\n  id TEXT PRIMARY KEY,\n  url TEXT NOT NULL,\n  slug TEXT NOT NULL,\n  title TEXT NOT NULL,\n  thumbnail TEXT,\n  primaryColor INTEGER,\n  published_at_millis INTEGER NOT NULL\n)", null);
            }
            if (j <= 676 && j2 > 676) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS personalizePaymentBackgroundConfig (\n  id TEXT UNIQUE,\n  background_url TEXT,\n  carousel_url TEXT,\n  is_active INTEGER NOT NULL DEFAULT 0,\n  background_color BLOB,\n  sort_order INTEGER\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS personalizePaymentStickerConfig(\n  id TEXT UNIQUE,\n  svg_data TEXT,\n  is_active INTEGER NOT NULL DEFAULT 0,\n  sort_order INTEGER\n)", null);
            }
            if (j <= 677 && j2 > 677) {
                androidSqliteDriver.execute(num15, "CREATE INDEX IF NOT EXISTS education_story_slug ON education_story (slug)", null);
            }
            if (j <= 678 && j2 > 678) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN backgroundColor BLOB DEFAULT NULL", null);
            }
            if (j <= 679 && j2 > 679) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS globalBorrowData(\n  parent_id TEXT NOT NULL PRIMARY KEY,\n  fallback_client_route TEXT NOT NULL\n)", null);
            }
            if (j <= 680 && j2 > 680) {
                androidSqliteDriver.execute(num15, "ALTER TABLE personalizePaymentBackgroundConfig ADD COLUMN is_default INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 681 && j2 > 681) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS globalBorrowData", null);
            }
            if (j <= 682 && j2 > 682) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS globalBorrowData(\n  parent_id TEXT NOT NULL PRIMARY KEY,\n  fallback_client_route TEXT NOT NULL\n)", null);
            }
            if (j <= 683 && j2 > 683) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS pendingSplit", null);
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS completedPendingSplits", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS deleteSuccessfulSplits", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS pending", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW pending AS\nSELECT pendingPayment.external_id,\n       pendingPayment.request AS payment_request,\n       NULL AS transfer_request,\n       pendingPayment.created_at,\n       credit_card_fee_bps,\n       recipients\nFROM pendingPayment\nLEFT JOIN payment ON pendingPayment.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL\nUNION\nSELECT pendingTransfer.external_id,\n       NULL AS payment_request,\n       pendingTransfer.request AS transfer_request,\n       pendingTransfer.created_at,\n       credit_card_fee_bps,\n       1 AS recipients\nFROM pendingTransfer\nLEFT JOIN payment ON pendingTransfer.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM trusted_contact;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 684 && j2 > 684) {
                androidSqliteDriver.execute(num15, "ALTER TABLE payment ADD COLUMN transaction_type TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, str61, null);
                androidSqliteDriver.execute(num15, str62, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW payments_model AS\nSELECT\n  amount,\n  amount_currency,\n  entity_id,\n  token,\n  orientation,\n  role,\n  state,\n  payment.render_data AS payment_render_data,\n  sender.render_data AS sender_render_data,\n  recipient.render_data AS recipient_render_data,\n  recipient_id,\n  sender_id,\n  captured_at,\n  created_at,\n  their_id,\n  display_date,\n  _id,\n  sender_amount,\n  recipient_amount,\n  boost_amount,\n  paid_out_at,\n  refunded_at,\n  updated_at,\n  is_badged,\n  rollup_type,\n  investment_order_type,\n  payment_type,\n  gifted_investment_entity_token,\n  coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding,\n  external_id,\n  (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n  coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden,\n  loyalty.render_data AS loyalty_render_data,\n  lending_loan_token,\n  associated_payment_token,\n  sync_entity_version,\n  transaction_type\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nLEFT JOIN loyaltyProgram AS loyalty ON (payment.recipient_id = loyalty.cash_merchant_token)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  avatar.is_cash_customer,\n  avatar.can_accept_payments,\n  avatar.is_business,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  associated_payment_token,\n  sync_entity_version,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular,\n  is_hidden,\n  payment.orientation,\n  payment.transaction_type\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.is_cash_customer,\n    customer.can_accept_payments,\n    customer.is_business,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC, payment.token DESC", null);
            }
            if (j <= 685 && j2 > 685) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM trusted_contact;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM borrowAppletTile;\n  DELETE FROM borrowData;\n  DELETE FROM borrowEntryPoint;\n  DELETE FROM borrowAppletVerticalLayout;\n  DELETE FROM creditLine;\n  DELETE FROM globalBorrowData;\n  DELETE FROM lendingInfo;\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n  DELETE FROM supportedBorrowLocation;\n  -- LendingConfig is always non-null, so invalidate rather than delete:\n    UPDATE lendingConfig SET last_updated = -1;\nEND", null);
            }
            if (j <= 686 && j2 > 686) {
                androidSqliteDriver.execute(num15, "ALTER TABLE offersRecentlyViewed ADD COLUMN type TEXT NOT NULL DEFAULT 'BUSINESS'", null);
            }
            if (j <= 687 && j2 > 687) {
                androidSqliteDriver.execute(num15, "DELETE FROM profileDirectoryConfig", null);
                androidSqliteDriver.execute(num15, "DELETE FROM profileDirectorySection", null);
                androidSqliteDriver.execute(num15, "DELETE FROM profileDirectoryItem", null);
                androidSqliteDriver.execute(num15, "DELETE FROM productsResultsSection", null);
                androidSqliteDriver.execute(num15, "DELETE FROM productsResultsItem", null);
                androidSqliteDriver.execute(num15, "DELETE FROM productsResultsPaginationToken", null);
            }
            if (j <= 688 && j2 > 688) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS bankingConfig", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE bankingConfig (\n  main_screen_title TEXT DEFAULT NULL,\n  main_screen_balance_subtitle TEXT DEFAULT NULL,\n  recurring_deposits_dda_upsell BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO bankingConfig DEFAULT VALUES", null);
            }
            if (j <= 689 && j2 > 689) {
                androidSqliteDriver.execute(num15, "CREATE TABLE LegalDocument(\n  token TEXT NOT NULL PRIMARY KEY,\n  category TEXT NOT NULL,\n  title TEXT NOT NULL,\n  document_date INTEGER,\n  url TEXT NOT NULL,\n  owner_token TEXT\n)", null);
            }
            if (j <= 690 && j2 > 690) {
                androidSqliteDriver.execute(num15, str66, null);
                androidSqliteDriver.execute(num15, "CREATE VIEW activityRecipient AS\nSELECT\n  contact.display_name AS contact_display_name,\n  contact.lookup_key,\n  already_invited,\n  has_multiple_customers,\n  customer.customer_id,\n  customer.threaded_customer_id,\n  cashtag,\n  is_cash_customer,\n  is_verified,\n  is_business,\n  email,\n  sms,\n  photo,\n  customer_display_name,\n  group_concat(email) AS email_addresses,\n  group_concat(sms) AS sms_numbers,\n  can_accept_payments,\n  is_square,\n  coalesce(credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0) AS credit_card_fee,\n  blocked,\n  merchant_data,\n  customer.themed_accent_color,\n  customer.region,\n  customer.category,\n  customer.investment_entity_token,\n  customer.render_data\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nGROUP BY customer.customer_id", null);
            }
            if (j <= 691 && j2 > 691) {
                androidSqliteDriver.execute(num15, "ALTER TABLE pendingPayment ADD COLUMN personalization BLOB DEFAULT NULL", null);
            }
            if (j <= 692 && j2 > 692) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM trusted_contact;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM borrowAppletTile;\n  DELETE FROM borrowData;\n  DELETE FROM borrowEntryPoint;\n  DELETE FROM borrowAppletVerticalLayout;\n  DELETE FROM creditLine;\n  DELETE FROM globalBorrowData;\n  DELETE FROM lendingInfo;\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n  DELETE FROM supportedBorrowLocation;\n  -- LendingConfig is always non-null, so invalidate rather than delete:\n  UPDATE lendingConfig SET last_updated = -1;\nEND", null);
            }
            if (j <= 693 && j2 > 693) {
                androidSqliteDriver.execute(num15, "ALTER TABLE personalizePaymentBackgroundConfig ADD COLUMN default_text_format BLOB", null);
            }
            if (j <= 694 && j2 > 694) {
                androidSqliteDriver.execute(num15, "ALTER TABLE pendingPayment ADD COLUMN ready_for_removal INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "UPDATE pendingPayment\nSET succeeded = 0,\n ready_for_removal = 0\nWHERE succeeded = 1 AND ready_for_removal IS NULL", null);
                androidSqliteDriver.execute(num15, "DROP VIEW completedPendingPayments", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW completedPendingPayments AS\nSELECT pendingPayment.external_id\nFROM pendingPayment\nLEFT JOIN payment\nON pendingPayment.external_id = payment.external_id\nWHERE succeeded = 1 AND (payment.external_id IS NOT NULL OR ready_for_removal = 1)", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER deleteSuccessfulPayments", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER deleteSuccessfulPayments\nAFTER UPDATE OF succeeded, ready_for_removal ON pendingPayment\nBEGIN\nDELETE FROM pendingPayment\nWHERE external_id IN completedPendingPayments;\nEND", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE pendingTransfer ADD COLUMN ready_for_removal INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "UPDATE pendingTransfer\nSET succeeded = 0,\n ready_for_removal = 0\nWHERE succeeded = 1 AND ready_for_removal IS NULL", null);
                androidSqliteDriver.execute(num15, "DROP VIEW completedPendingTransfers", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW completedPendingTransfers AS\nSELECT pendingTransfer.external_id\nFROM pendingTransfer\nLEFT JOIN payment\nON pendingTransfer.external_id = payment.external_id\nWHERE succeeded = 1 AND (payment.external_id IS NOT NULL OR ready_for_removal = 1)", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER deleteSuccessfulTransfers", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER deleteSuccessfulTransfers\nAFTER UPDATE OF succeeded, ready_for_removal ON pendingTransfer\nBEGIN\nDELETE FROM pendingTransfer\nWHERE external_id IN completedPendingTransfers;\nEND", null);
            }
            if (j <= 695 && j2 > 695) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS locationConfig", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeLocationConfigWithProfile", null);
            }
            if (j <= 696 && j2 > 696) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS core_customer", null);
            }
            if (j <= 697 && j2 > 697) {
                androidSqliteDriver.execute(num15, "CREATE TABLE sync_pending_entity (\n  entity_id TEXT NOT NULL,\n  type TEXT NOT NULL,\n  PRIMARY KEY (entity_id, type)\n)", null);
            }
            if (j <= 698 && j2 > 698) {
                androidSqliteDriver.execute(num15, "DROP TABLE sync_pending_entity", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE sync_pending_entity (\n  entity_id TEXT NOT NULL,\n  type INTEGER NOT NULL,\n  PRIMARY KEY (entity_id, type)\n)", null);
            }
            if (j <= 699 && j2 > 699) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS dataPrivacySettings", null);
            }
            if (j <= 700 && j2 > 700) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM trusted_contact;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM borrowAppletTile;\n  DELETE FROM borrowData;\n  DELETE FROM borrowEntryPoint;\n  DELETE FROM borrowAppletVerticalLayout;\n  DELETE FROM creditLine;\n  DELETE FROM globalBorrowData;\n  DELETE FROM lendingInfo;\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n  DELETE FROM supportedBorrowLocation;\n  -- LendingConfig is always non-null, so invalidate rather than delete:\n  UPDATE lendingConfig SET last_updated = -1;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\nEND", null);
            }
            if (j <= 701 && j2 > 701) {
                androidSqliteDriver.execute(num15, "ALTER TABLE personalizePaymentBackgroundConfig ADD COLUMN effects BLOB", null);
            }
            if (j <= 702 && j2 > 702) {
                androidSqliteDriver.execute(num15, "CREATE TABLE family_tile(\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  family_tile_blob BLOB\n)", null);
            }
            if (j <= 703 && j2 > 703) {
                androidSqliteDriver.execute(num15, "CREATE TABLE businessEligibility (\n  customerToken TEXT NOT NULL,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyInvestingApplet BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB\n)", null);
            }
            if (j <= 704 && j2 > 704) {
                androidSqliteDriver.execute(num15, "DROP TABLE businessEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE businessEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyInvestingApplet BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB\n)", null);
            }
            if (j <= 705 && j2 > 705) {
                androidSqliteDriver.execute(num15, "ALTER TABLE businessEligibility RENAME TO singleAccountHolderEligibility", null);
            }
            if (j <= 706 && j2 > 706) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS lendingConfig", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM trusted_contact;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM borrowAppletTile;\n  DELETE FROM borrowData;\n  DELETE FROM borrowEntryPoint;\n  DELETE FROM borrowAppletVerticalLayout;\n  DELETE FROM creditLine;\n  DELETE FROM globalBorrowData;\n  DELETE FROM lendingInfo;\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n  DELETE FROM supportedBorrowLocation;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\nEND", null);
            }
            if (j <= 707 && j2 > 707) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS lendingInfo", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM trusted_contact;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM borrowAppletTile;\n  DELETE FROM borrowData;\n  DELETE FROM borrowEntryPoint;\n  DELETE FROM borrowAppletVerticalLayout;\n  DELETE FROM creditLine;\n  DELETE FROM globalBorrowData;\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n  DELETE FROM supportedBorrowLocation;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\nEND", null);
            }
            if (j <= 708 && j2 > 708) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_state RENAME TO investing_state_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE investing_state(\n  has_active_brokerage_account INTEGER NOT NULL DEFAULT 0,\n  has_portfolio INTEGER NOT NULL DEFAULT 0,\n  has_holdings INTEGER,\n  dividend_setting_type TEXT NOT NULL DEFAULT 'PAYOUT',\n  brokerage_account_transfer_will_complete_at_utc INTEGER DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO investing_state(\n  has_active_brokerage_account,\n  has_portfolio,\n  has_holdings,\n  dividend_setting_type,\n  brokerage_account_transfer_will_complete_at_utc\n)\nSELECT has_active_brokerage_account, has_portfolio, has_holdings, 'PAYOUT',\n\t       brokerage_account_transfer_will_complete_at_utc\nFROM investing_state_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE investing_state_old", null);
            }
            if (j <= 709 && j2 > 709) {
                androidSqliteDriver.execute(num15, "CREATE TABLE promotionDetails(\n  token TEXT NOT NULL PRIMARY KEY,\n  promotionDetails BLOB NOT NULL\n)", null);
            }
            if (j <= 710 && j2 > 710) {
                androidSqliteDriver.execute(num15, "DELETE FROM education_story", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE education_story ADD COLUMN priority INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 711 && j2 > 711) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS favorites", null);
            }
            if (j <= 712 && j2 > 712) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS borrowData", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS borrowEntryPoint", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS borrowAppletVerticalLayout", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS globalBorrowData", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS supportedBorrowLocation", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM trusted_contact;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM borrowAppletTile;\n  DELETE FROM creditLine;\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\nEND", null);
            }
            if (j <= 713 && j2 > 713) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS borrowAppletTile", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM trusted_contact;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM creditLine;\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\nEND", null);
            }
            if (j <= 714 && j2 > 714) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS atm_picker_options", null);
            }
            if (j <= 715 && j2 > 715) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS authenticatorInfo", null);
            }
            if (j <= 716 && j2 > 716) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS family_account", null);
            }
            if (j <= 717 && j2 > 717) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS family_tile", null);
            }
            if (j <= 718 && j2 > 718) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS loyaltyNotificationPreference", null);
            }
            if (j <= 719 && j2 > 719) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS status_and_limits", null);
            }
            if (j <= 720 && j2 > 720) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS threadsReactionConfig", null);
            }
            if (j <= 721 && j2 > 721) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS trusted_contact", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM creditLine;\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\nEND", null);
            }
            if (j <= 722 && j2 > 722) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN eyebrow BLOB DEFAULT NULL", null);
            }
            if (j <= 723 && j2 > 723) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyInvestingApplet BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB\n)", null);
            }
            if (j <= 724 && j2 > 724) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_roundups_automation ADD COLUMN entity_id TEXT", null);
            }
            if (j <= 725 && j2 > 725) {
                androidSqliteDriver.execute(num15, "ALTER TABLE pendingTransfer ADD COLUMN first_error_request_created_at INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE pendingTransfer ADD COLUMN first_error_response_created_at INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE pendingTransfer ADD COLUMN first_error_response_reason TEXT DEFAULT NULL", null);
            }
            if (j <= 726 && j2 > 726) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyInvestingApplet BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB\n)", null);
            }
            if (j <= 727 && j2 > 727) {
                androidSqliteDriver.execute(num15, "ALTER TABLE treehouseAppConfig ADD COLUMN minimal_commit_timestamp TEXT DEFAULT NULL", null);
            }
            if (j <= 728 && j2 > 728) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyInvestingApplet BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB\n)", null);
            }
            if (j <= 729 && j2 > 729) {
                androidSqliteDriver.execute(num15, "ALTER TABLE offlineConfig ADD COLUMN error_cash_out_status_result BLOB", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE offlineConfig ADD COLUMN error_add_cash_status_result BLOB", null);
            }
            if (j <= 730 && j2 > 730) {
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS pending", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW pending AS\nSELECT pendingPayment.external_id,\n       pendingPayment.request AS payment_request,\n       NULL AS transfer_request,\n       pendingPayment.created_at,\n       credit_card_fee_bps,\n       recipients,\n       NULL AS pending_reason\nFROM pendingPayment\nLEFT JOIN payment ON pendingPayment.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL\nUNION\nSELECT pendingTransfer.external_id,\n       NULL AS payment_request,\n       pendingTransfer.request AS transfer_request,\n       pendingTransfer.created_at,\n       credit_card_fee_bps,\n       1 AS recipients,\n       first_error_response_reason AS pending_reason\nFROM pendingTransfer\nLEFT JOIN payment ON pendingTransfer.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL", null);
            }
            if (j <= 731 && j2 > 731) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB\n)", null);
            }
            if (j <= 732 && j2 > 732) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS globalConfig", null);
            }
            if (j <= 733 && j2 > 733) {
                androidSqliteDriver.execute(num15, "CREATE TABLE badgeCount (\n  group_name TEXT NOT NULL PRIMARY KEY,\n  count INTEGER NOT NULL\n)", null);
            }
            if (j <= 734 && j2 > 734) {
                androidSqliteDriver.execute(num15, str63, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badgeCount;\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM creditLine;\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\nEND", null);
            }
            if (j <= 735 && j2 > 735) {
                androidSqliteDriver.execute(num15, "ALTER TABLE passwordInfo RENAME TO passwordInfoOld", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE passwordInfo (\n    version INTEGER NOT NULL,\n    info_id INTEGER NOT NULL PRIMARY KEY\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO passwordInfo(version, info_id)\nSELECT version, 1\nFROM passwordInfoOld", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS passwordInfoOld", null);
            }
            if (j <= 736 && j2 > 736) {
                androidSqliteDriver.execute(num15, "CREATE TABLE badge (\n  external_token TEXT NOT NULL,\n  item_type TEXT NOT NULL,\n  badge_version INTEGER NOT NULL,\n  cleared_version INTEGER,\n  cleared_at INTEGER,\n  clear_succeeded_at INTEGER,\n  PRIMARY KEY (external_token, item_type)\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE badgeGroup (\n  external_token TEXT NOT NULL,\n  item_type TEXT NOT NULL,\n  group_name TEXT NOT NULL,\n  PRIMARY KEY (external_token, item_type, group_name),\n  FOREIGN KEY(external_token, item_type) REFERENCES badge(external_token, item_type) ON DELETE CASCADE\n)", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX idx_badgeGroup_tokenType\nON badgeGroup(external_token, item_type)", null);
                androidSqliteDriver.execute(num15, str63, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM creditLine;\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\nEND", null);
            }
            if (j <= 737 && j2 > 737) {
                androidSqliteDriver.execute(num15, "ALTER TABLE treehouseAppConfigurations ADD COLUMN last_qr_code_manifest_url TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE treehouseAppConfigurations ADD COLUMN last_qr_code_scanned_at INTEGER", null);
            }
            if (j <= 738 && j2 > 738) {
                androidSqliteDriver.execute(num15, "ALTER TABLE offlineConfig ADD COLUMN offline_transfer_scenario_plan BLOB", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE offlineConfig ADD COLUMN error_transfer_scenario_plan BLOB", null);
            }
            if (j <= 739 && j2 > 739) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS education_story_scene_data (\n  id INTEGER PRIMARY KEY AUTOINCREMENT,\n  scene_index INTEGER NOT NULL,\n  backgroundColor INTEGER,\n  storyId TEXT NOT NULL REFERENCES education_story ON DELETE CASCADE\n)", null);
            }
            if (j <= 740 && j2 > 740) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB\n)", null);
            }
            if (j <= 741 && j2 > 741) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Clear thread messages\n  DELETE FROM threadMessage;\n  DELETE FROM threadMessageReaction;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM creditLine;\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\nEND", null);
            }
            if (j <= 742 && j2 > 742) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB\n)", null);
            }
            if (j <= 743 && j2 > 743) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS deleteThreadMessageReactionOnThreadMessageDelete", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS threadMessage", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS threadMessageReaction", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM creditLine;\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\nEND", null);
            }
            if (j <= 744 && j2 > 744) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS creditLine", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\nEND", null);
            }
            if (j <= 745 && j2 > 745) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS giftCard", null);
            }
            if (j <= 746 && j2 > 746) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investment_notification_option RENAME TO investment_notification_option_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE investment_notification_option (\n  id TEXT PRIMARY KEY NOT NULL,\n  enabled INTEGER DEFAULT NULL,\n  config BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO investment_notification_option\nSELECT id,\n       CASE enabled WHEN 1 THEN 1 ELSE NULL END,\n       config\nFROM investment_notification_option_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE investment_notification_option_old", null);
            }
            if (j <= 747 && j2 > 747) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS billsData (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  bills BLOB DEFAULT NULL,\n  upcoming_bills BLOB DEFAULT NULL\n)", null);
            }
            if (j <= 748 && j2 > 748) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS billsData", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS bills (\n  id TEXT NOT NULL PRIMARY KEY,\n  bill BLOB NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS upcomingBills (\n  id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  upcoming_bills BLOB DEFAULT NULL\n)", null);
            }
            if (j <= 749 && j2 > 749) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n\n  -- Delete bills data\n  DELETE FROM bills;\n  DELETE FROM upcomingBills;\n\nEND", null);
            }
            if (j <= 750 && j2 > 750) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB\n)", null);
            }
            if (j <= 751 && j2 > 751) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS crypto_payroll_preference", null);
            }
            if (j <= 752 && j2 > 752) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN footerButton BLOB DEFAULT NULL", null);
            }
            if (j <= 753 && j2 > 753) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB,\n  tapToPay BLOB\n)", null);
            }
            if (j <= 754 && j2 > 754) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS cardScheme", null);
            }
            if (j <= 755 && j2 > 755) {
                androidSqliteDriver.execute(num15, "ALTER TABLE profileDirectorySection ADD COLUMN renderSectionDivider INTEGER DEFAULT NULL", null);
            }
            if (j <= 756 && j2 > 756) {
                androidSqliteDriver.execute(num15, "CREATE TABLE gpsConfig(\n  consent_status TEXT DEFAULT NULL,\n  precise_enabled INTEGER DEFAULT NULL,\n  location_updated_at INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n\n  -- Delete bills data\n  DELETE FROM bills;\n  DELETE FROM upcomingBills;\n\n  -- Delete gps data\n  DELETE FROM gpsConfig;\n\nEND", null);
            }
            if (j <= 757 && j2 > 757) {
                androidSqliteDriver.execute(num15, "CREATE TABLE cardTabHeroState (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  card_token TEXT DEFAULT NULL,\n  rendering_info BLOB DEFAULT NULL,\n  facing_forward INTEGER DEFAULT 0,\n  enabled INTEGER DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete lending content\n  DELETE FROM loan;\n  DELETE FROM loanTransaction;\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n\n  -- Delete bills data\n  DELETE FROM bills;\n  DELETE FROM upcomingBills;\n\n  -- Delete gps data\n  DELETE FROM gpsConfig;\n\nEND", null);
            }
            if (j <= 758 && j2 > 758) {
                androidSqliteDriver.execute(num15, "ALTER TABLE savingsGoalLocalStatus ADD COLUMN completion_token TEXT DEFAULT NULL", null);
            }
            if (j <= 759 && j2 > 759) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB,\n  tapToPay BLOB,\n  sponsorEligible BLOB\n)", null);
            }
            if (j <= 760 && j2 > 760) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB,\n  tapToPay BLOB,\n  sponsorEligible BLOB,\n  moneyEarningsApplet BLOB\n)", null);
            }
            if (j <= 761 && j2 > 761) {
                androidSqliteDriver.execute(num15, "ALTER TABLE unhandled_sync_entity ADD COLUMN entity_version INTEGER", null);
            }
            if (j <= 762 && j2 > 762) {
                androidSqliteDriver.execute(num15, "CREATE TABLE new_sync_entity (\n  entity_id TEXT NOT NULL,\n  type INTEGER NOT NULL,\n  entity BLOB NOT NULL,\n  entity_processor_version INTEGER DEFAULT 0,\n  sync_value_type INTEGER DEFAULT NULL,\n  sync_entity_version INTEGER DEFAULT NULL,\n  PRIMARY KEY (entity_id, type)\n)", null);
            }
            if (j <= 763 && j2 > 763) {
                androidSqliteDriver.execute(num15, "DROP INDEX entity_processor_version_index", null);
                androidSqliteDriver.execute(num15, "DROP INDEX sync_value_types", null);
                androidSqliteDriver.execute(num15, "DROP TABLE sync_entity", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE new_sync_entity RENAME TO sync_entity", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX entity_processor_version_index ON sync_entity (entity_processor_version)", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX sync_value_types ON sync_entity (sync_value_type)", null);
            }
            if (j <= 764 && j2 > 764) {
                androidSqliteDriver.execute(num15, str63, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n\n  -- Delete bills data\n  DELETE FROM bills;\n  DELETE FROM upcomingBills;\n\n  -- Delete gps data\n  DELETE FROM gpsConfig;\nEND", null);
                androidSqliteDriver.execute(num15, str45, null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS loanTransaction", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS loan", null);
            }
            if (j <= 765 && j2 > 765) {
                androidSqliteDriver.execute(num15, "ALTER TABLE invitationConfig ADD COLUMN profile_row_title TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE invitationConfig ADD COLUMN profile_row_subtitle TEXT DEFAULT NULL", null);
            }
            if (j <= 766 && j2 > 766) {
                androidSqliteDriver.execute(num15, "CREATE TABLE sheetMessage (\n  message_token TEXT PRIMARY KEY NOT NULL,\n  campaign_token TEXT,\n  placement TEXT,\n  message_format BLOB NOT NULL\n)", null);
            }
            if (j <= 768 && j2 > 768) {
                androidSqliteDriver.execute(num15, "DROP TABLE unhandled_sync_entity", null);
            }
            if (j <= 769 && j2 > 769) {
                androidSqliteDriver.execute(num15, "CREATE TABLE afterpayApplet (\n  key INTEGER NOT NULL PRIMARY KEY,\n  ttl_in_millis INTEGER,\n  afterpay_applet_response BLOB NOT NULL\n)", null);
            }
            if (j <= 771 && j2 > 771) {
                androidSqliteDriver.execute(num15, "CREATE TABLE savingsTaxDocument(\n  document BLOB NOT NULL\n)", null);
            }
            if (j <= 773 && j2 > 773) {
                androidSqliteDriver.execute(num15, "ALTER TABLE popupMessage RENAME TO popupMessage_old", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE popupMessage(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  placement TEXT,\n  image BLOB,\n  title TEXT,\n  subtitle TEXT,\n  primaryNavigationAction BLOB,\n  secondaryNavigationAction BLOB,\n  animation BLOB,\n  insertedAtUtc INTEGER NOT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO popupMessage(\n  messageToken,\n  campaignToken,\n  isBadged,\n  placement,\n  image,\n  title,\n  subtitle,\n  primaryNavigationAction,\n  secondaryNavigationAction,\n  animation,\n  insertedAtUtc\n)\nSELECT\n  messageToken,\n  campaignToken,\n  isBadged,\n  placement,\n  image,\n  title,\n  subtitle,\n  primaryNavigationAction,\n  secondaryNavigationAction,\n  animation,\n  0 AS insertedAtUtc\nFROM popupMessage_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE popupMessage_old", null);
                androidSqliteDriver.execute(num15, "DROP TABLE sheetMessage", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE sheetMessage (\n  message_token TEXT PRIMARY KEY NOT NULL,\n  campaign_token TEXT,\n  placement TEXT NOT NULL,\n  message_format BLOB NOT NULL,\n  inserted_at_utc INTEGER NOT NULL\n)", null);
            }
            if (j <= 774 && j2 > 774) {
                androidSqliteDriver.execute(num15, "DROP TABLE sheetMessage", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE sheetMessage (\n  message_token TEXT PRIMARY KEY NOT NULL,\n  campaign_token TEXT,\n  message_format BLOB NOT NULL,\n  inserted_at_utc INTEGER NOT NULL\n)", null);
            }
            if (j <= 776 && j2 > 776) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n\n  -- Delete bills data\n  DELETE FROM bills;\n  DELETE FROM upcomingBills;\n\n  -- Delete gps data\n  DELETE FROM gpsConfig;\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\n\nEND", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE afterpayRecentlyViewedMerchant (\n  token TEXT NOT NULL PRIMARY KEY,\n  last_updated_at_ms INTEGER,\n  is_merchant_token INTEGER DEFAULT 0\n)", null);
            }
            if (j <= 777 && j2 > 777) {
                androidSqliteDriver.execute(num15, "CREATE TABLE weaverRecommendationsResponses(\n  key INTEGER NOT NULL PRIMARY KEY,\n  response BLOB NOT NULL\n)", null);
            }
            if (j <= 779 && j2 > 779) {
                androidSqliteDriver.execute(num15, "ALTER TABLE savingsGoalLocalStatus ADD COLUMN last_seen_balance BLOB DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE savingsGoalLocalStatus ADD COLUMN last_seen_remaining_balance BLOB DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE savingsGoalLocalStatus ADD COLUMN last_seen_progress_bps INTEGER DEFAULT NULL", null);
            }
            if (j <= 780 && j2 > 780) {
                androidSqliteDriver.execute(num15, "DELETE FROM gpsConfig", null);
                androidSqliteDriver.execute(num15, "INSERT INTO gpsConfig DEFAULT VALUES", null);
            }
            if (j <= 781 && j2 > 781) {
                androidSqliteDriver.execute(num15, "ALTER TABLE customer ADD COLUMN is_special_customer INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 784 && j2 > 784) {
                androidSqliteDriver.execute(num15, "CREATE TABLE local_market_screen(\n  feed BLOB NOT NULL\n)", null);
            }
            if (j <= 785 && j2 > 785) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS exchange_data", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE exchange_data(\n  base_currency_code TEXT NOT NULL,\n  quote_currency_code TEXT NOT NULL,\n  rates BLOB NOT NULL,\n  timestamp INTEGER NOT NULL,\n  PRIMARY KEY (base_currency_code, quote_currency_code)\n)", null);
            }
            if (j <= 786 && j2 > 786) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS local_market_screen", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE local_market_screen(\n  feed BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO local_market_screen DEFAULT VALUES", null);
            }
            if (j <= 787 && j2 > 787) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS local_market_screen", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE local_market_screen(\n  feed BLOB DEFAULT NULL,\n  expires_at INTEGER DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO local_market_screen DEFAULT VALUES", null);
            }
            if (j <= 788 && j2 > 788) {
                androidSqliteDriver.execute(num15, "DROP TABLE sheetMessage", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE sheetMessage (\n  message_token TEXT PRIMARY KEY NOT NULL,\n  campaign_token TEXT,\n  message_format BLOB NOT NULL,\n  inserted_at_utc INTEGER NOT NULL,\n  metadata_id TEXT\n)", null);
            }
            if (j <= 789 && j2 > 789) {
                androidSqliteDriver.execute(num15, "DROP TABLE sheetMessage", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE sheetMessage (\n  message_token TEXT PRIMARY KEY NOT NULL,\n  campaign_token TEXT,\n  is_badged INTEGER NOT NULL,\n  message_format BLOB NOT NULL,\n  inserted_at_utc INTEGER NOT NULL,\n  metadata_id TEXT\n)", null);
            }
            if (j <= 790 && j2 > 790) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB,\n  tapToPay BLOB,\n  sponsorEligible BLOB,\n  moneyEarningsApplet BLOB,\n  c4bPromotionVisibility BLOB\n)", null);
            }
            if (j <= 791 && j2 > 791) {
                androidSqliteDriver.execute(num15, "ALTER TABLE lastSeenSavingsBalance ADD COLUMN generalBalance BLOB DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "UPDATE lastSeenSavingsBalance SET generalBalance = NULL", null);
            }
            if (j <= 792 && j2 > 792) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS dependentLastSeenSavingsBalance", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE dependentLastSeenSavingsBalance(\n  customer_token TEXT NOT NULL PRIMARY KEY,\n  balance BLOB DEFAULT NULL,\n  general_balance BLOB DEFAULT NULL\n)", null);
            }
            if (j <= 793 && j2 > 793) {
                androidSqliteDriver.execute(num15, "ALTER TABLE fullScreenMessage ADD COLUMN priority INTEGER NOT NULL DEFAULT 1", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE inAppNotificationMessage ADD COLUMN priority INTEGER NOT NULL DEFAULT 1", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE inlineMessage ADD COLUMN priority INTEGER NOT NULL DEFAULT 1", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE popupMessage ADD COLUMN priority INTEGER NOT NULL DEFAULT 1", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE sheetMessage ADD COLUMN priority INTEGER NOT NULL DEFAULT 1", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE tooltipMessage ADD COLUMN priority INTEGER NOT NULL DEFAULT 1", null);
            }
            if (j <= 794 && j2 > 794) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS recipientRecommendation", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE recipientRecommendation(\n  recommendation BLOB NOT NULL\n)", null);
            }
            if (j <= 795 && j2 > 795) {
                androidSqliteDriver.execute(num15, "CREATE TABLE local_cash_detail_content(\n  content BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO local_cash_detail_content DEFAULT VALUES", null);
            }
            if (j <= 796 && j2 > 796) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS local_market_screen", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE local_market_screen(\n  feed BLOB DEFAULT NULL,\n  tiles BLOB DEFAULT NULL,\n  expires_at INTEGER DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO local_market_screen DEFAULT VALUES", null);
            }
            if (j <= 797 && j2 > 797) {
                androidSqliteDriver.execute(num15, "ALTER TABLE issuedCard ADD COLUMN physical_card_order_state TEXT DEFAULT NULL", null);
            }
            if (j <= 798 && j2 > 798) {
                androidSqliteDriver.execute(num15, "ALTER TABLE local_cash_detail_content ADD COLUMN activity BLOB DEFAULT NULL", null);
            }
            if (j <= 799 && j2 > 799) {
                androidSqliteDriver.execute(num15, "ALTER TABLE offersSheet ADD COLUMN offer_type TEXT", null);
            }
            if (j <= 800 && j2 > 800) {
                androidSqliteDriver.execute(num15, "ALTER TABLE entity_range ADD COLUMN topic INTEGER NOT NULL DEFAULT -1", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE sync_entity ADD COLUMN topic INTEGER NOT NULL DEFAULT -1", null);
            }
            if (j <= 801 && j2 > 801) {
                androidSqliteDriver.execute(num15, "CREATE TABLE cardCustomization (\n    path TEXT NOT NULL PRIMARY KEY,\n    customization_bitmap BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n\n  -- Delete bills data\n  DELETE FROM bills;\n  DELETE FROM upcomingBills;\n\n  -- Delete gps data\n  DELETE FROM gpsConfig;\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\n\nEND", null);
            }
            if (j <= 802 && j2 > 802) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS bills", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS upcomingBills", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n\n  -- Delete gps data\n  DELETE FROM gpsConfig;\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\n\nEND", null);
            }
            if (j <= 803 && j2 > 803) {
                androidSqliteDriver.execute(num15, "CREATE TABLE newFullScreenMessage(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  video BLOB,\n  primaryAction BLOB,\n  secondaryAction BLOB,\n  primaryActionColor BLOB,\n  secondaryActionColor BLOB,\n  priority INTEGER NOT NULL DEFAULT 1,\n  insertedAtUtc INTEGER NOT NULL,\n  placement TEXT\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO newFullScreenMessage (\n    messageToken,\n    campaignToken,\n    isBadged,\n    video,\n    primaryAction,\n    secondaryAction,\n    primaryActionColor,\n    secondaryActionColor,\n    priority,\n    insertedAtUtc,\n    placement\n)\nSELECT\n    messageToken,\n    campaignToken,\n    isBadged,\n    video,\n    primaryAction,\n    secondaryAction,\n    primaryActionColor,\n    secondaryActionColor,\n    priority,\n    0,\n    NULL\nFROM fullScreenMessage", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS fullScreenMessage", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE newFullScreenMessage RENAME TO fullScreenMessage", null);
            }
            if (j <= 804 && j2 > 804) {
                androidSqliteDriver.execute(num15, "DELETE FROM gpsConfig", null);
                androidSqliteDriver.execute(num15, "INSERT INTO gpsConfig DEFAULT VALUES", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM entity_config;\n  INSERT INTO entity_config (rowid) VALUES (NULL);\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n\n  -- Delete gps data and insert a single row into the empty table\n  DELETE FROM gpsConfig;\n  INSERT INTO gpsConfig (rowid) VALUES (NULL);\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\n\nEND", null);
            }
            if (j <= 805 && j2 > 805) {
                androidSqliteDriver.execute(num15, "ALTER TABLE rewardStatus ADD COLUMN code_entry_client_route TEXT", null);
            }
            if (j <= 806 && j2 > 806) {
                androidSqliteDriver.execute(num15, "ALTER TABLE rewardStatus ADD COLUMN referral_status_screen BLOB", null);
            }
            if (j <= 807 && j2 > 807) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS didvManualCaptureConfig", null);
            }
            if (j <= 808 && j2 > 808) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS clientRoutingConfig (\n  client_route_rules BLOB NOT NULL,\n  deep_link_rules BLOB NOT NULL\n)", null);
            }
            if (j <= 809 && j2 > 809) {
                androidSqliteDriver.execute(num15, "CREATE TABLE local_fulfillment_configuration (\n  brand_token TEXT NOT NULL PRIMARY KEY,\n  configuration BLOB\n)", null);
            }
            if (j <= 810 && j2 > 810) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS entity_config", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n\n  -- Delete gps data and insert a single row into the empty table\n  DELETE FROM gpsConfig;\n  INSERT INTO gpsConfig (rowid) VALUES (NULL);\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\n\nEND", null);
            }
            if (j <= 811 && j2 > 811) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS cardMessage(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  placement TEXT,\n  image BLOB,\n  title TEXT,\n  subtitle TEXT,\n  primaryNavigationAction BLOB,\n  animation BLOB,\n  priority INTEGER NOT NULL DEFAULT 1\n)", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n  DELETE FROM cardMessage;\n\n  -- Delete gps data and insert a single row into the empty table\n  DELETE FROM gpsConfig;\n  INSERT INTO gpsConfig (rowid) VALUES (NULL);\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\n\nEND", null);
            }
            if (j <= 812 && j2 > 812) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS inlineMessageV2(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  placement TEXT,\n  avatar BLOB,\n  title TEXT,\n  subtitle TEXT,\n  url TEXT,\n  priority INTEGER NOT NULL DEFAULT 1\n)", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM inlineMessageV2;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n  DELETE FROM cardMessage;\n\n  -- Delete gps data and insert a single row into the empty table\n  DELETE FROM gpsConfig;\n  INSERT INTO gpsConfig (rowid) VALUES (NULL);\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\n\nEND", null);
            }
            if (j <= 813 && j2 > 813) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS clientRoutingConfig", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE clientRoutingConfig (\n  client_route_rules BLOB DEFAULT NULL,\n  deep_link_rules BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO clientRoutingConfig DEFAULT VALUES", null);
            }
            if (j <= 814 && j2 > 814) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS local_fulfillment_configuration", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE local_fulfillment_configuration (\n  brand_token TEXT NOT NULL PRIMARY KEY,\n  type TEXT NOT NULL,\n  location_token TEXT,\n  delivery_quote BLOB\n)", null);
            }
            if (j <= 815 && j2 > 815) {
                androidSqliteDriver.execute(num15, "DELETE FROM cardCustomization\n WHERE length(customization_bitmap) = 0", null);
            }
            if (j <= 816 && j2 > 816) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS local_market_screen", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE local_market_screen(\n  tiles BLOB DEFAULT NULL,\n  expires_at INTEGER DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO local_market_screen DEFAULT VALUES", null);
            }
            if (j <= 817 && j2 > 817) {
                androidSqliteDriver.execute(num15, "ALTER TABLE issuedCard ADD COLUMN external_issuing_account_state TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE issuedCard ADD COLUMN is_expired INTEGER NOT NULL DEFAULT 0", null);
            }
            if (j <= 818 && j2 > 818) {
                androidSqliteDriver.execute(num15, "CREATE TABLE messageDelivered (\n  token TEXT PRIMARY KEY\n)", null);
            }
            if (j <= 819 && j2 > 819) {
                androidSqliteDriver.execute(num15, "ALTER TABLE inlineMessage ADD COLUMN messageType TEXT DEFAULT NULL", null);
            }
            if (j <= 820 && j2 > 820) {
                androidSqliteDriver.execute(num15, "CREATE TABLE supportConfig_new (\n  privacy_policy_url TEXT DEFAULT NULL,\n  terms_of_service_url TEXT DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO supportConfig_new (privacy_policy_url, terms_of_service_url)\nSELECT privacy_policy_url, terms_of_service_url\nFROM supportConfig", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS supportConfig", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE supportConfig_new RENAME TO supportConfig", null);
            }
            if (j <= 821 && j2 > 821) {
                androidSqliteDriver.execute(num15, "ALTER TABLE local_fulfillment_configuration ADD COLUMN scheduling_details BLOB", null);
            }
            if (j <= 822 && j2 > 822) {
                androidSqliteDriver.execute(num15, "DROP TABLE local_fulfillment_configuration", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE local_fulfillment_configuration (\n  brand_token TEXT NOT NULL PRIMARY KEY,\n  type TEXT NOT NULL,\n  location_token TEXT,\n  fulfillment BLOB,\n  delivery_fee BLOB\n)", null);
            }
            if (j <= 823 && j2 > 823) {
                androidSqliteDriver.execute(num15, "CREATE TABLE recentMoneybotSession(\n  session_id TEXT DEFAULT NULL,\n  last_updated_at_ms INTEGER DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM inlineMessageV2;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n  DELETE FROM cardMessage;\n\n  -- Delete gps data and insert a single row into the empty table\n  DELETE FROM gpsConfig;\n  INSERT INTO gpsConfig (rowid) VALUES (NULL);\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\n\n  -- Delete moneybot data\n  DELETE FROM recentMoneybotSession;\nEND", null);
            }
            if (j <= 824 && j2 > 824) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS afterpayAppletMerchantSheet(\n  token TEXT NOT NULL PRIMARY KEY,\n  last_updated_at_ms INTEGER,\n  sheet_response BLOB NOT NULL\n)", null);
            }
            if (j <= 825 && j2 > 825) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS recentMoneybotSession", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n  DELETE FROM investing_roundups_automation;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM inlineMessageV2;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n  DELETE FROM cardMessage;\n\n  -- Delete gps data and insert a single row into the empty table\n  DELETE FROM gpsConfig;\n  INSERT INTO gpsConfig (rowid) VALUES (NULL);\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\nEND", null);
            }
            if (j <= 826 && j2 > 826) {
                androidSqliteDriver.execute(num15, "ALTER TABLE reward ADD COLUMN is_custom_offer INTEGER NOT NULL DEFAULT 0", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE userRewardsData ADD COLUMN ytd_total_saving BLOB DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "UPDATE userRewardsData SET ytd_total_saving = NULL", null);
            }
            if (j <= 827 && j2 > 827) {
                androidSqliteDriver.execute(num15, "CREATE TABLE bitcoinMapAddressSearch (\n  identifier TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL DEFAULT 0,\n  formatted_address TEXT NOT NULL,\n  primary_text TEXT NOT NULL,\n  secondary_text TEXT,\n  latitude REAL,\n  longitude REAL\n)", null);
            }
            if (j <= 828 && j2 > 828) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB,\n  tapToPay BLOB,\n  sponsorEligible BLOB,\n  moneyEarningsApplet BLOB,\n  c4bPromotionVisibility BLOB,\n  moneybotVisibility BLOB\n)", null);
            }
            if (j <= 829 && j2 > 829) {
                androidSqliteDriver.execute(num15, "ALTER TABLE reward ADD COLUMN boost_detail_bottom_upsell BLOB DEFAULT NULL", null);
            }
            if (j <= 830 && j2 > 830) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS investing_roundups_automation", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS investing_roundups_onboarding_flow", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM issuedCard;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM inlineMessageV2;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n  DELETE FROM cardMessage;\n\n  -- Delete gps data and insert a single row into the empty table\n  DELETE FROM gpsConfig;\n  INSERT INTO gpsConfig (rowid) VALUES (NULL);\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\nEND", null);
            }
            if (j <= 831 && j2 > 831) {
                androidSqliteDriver.execute(num15, "ALTER TABLE businessGrants ADD COLUMN rendering_behavior TEXT", null);
            }
            if (j <= 832 && j2 > 832) {
                androidSqliteDriver.execute(num15, "DROP VIEW IF EXISTS ownedHoldings", null);
                androidSqliteDriver.execute(num15, "CREATE VIEW ownedHoldings AS\nSELECT *\nFROM investment_holding\nJOIN investment_entity USING (token)\nWHERE state = \"OWNED\"\nORDER BY invested_amount DESC", null);
            }
            if (j <= 833 && j2 > 833) {
                androidSqliteDriver.execute(num15, "ALTER TABLE popupMessage ADD COLUMN expiresAtUtc INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE fullScreenMessage ADD COLUMN expiresAtUtc INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE sheetMessage ADD COLUMN expiresAtUtc INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE inlineMessage ADD COLUMN expiresAtUtc INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE inlineMessageV2 ADD COLUMN expiresAtUtc INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE cardMessage ADD COLUMN expiresAtUtc INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE tooltipMessage ADD COLUMN expiresAtUtc INTEGER DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE inAppNotificationMessage ADD COLUMN expiresAtUtc INTEGER DEFAULT NULL", null);
            }
            if (j <= 834 && j2 > 834) {
                androidSqliteDriver.execute(num15, "ALTER TABLE reward ADD COLUMN redeemable_with_cash_app_pay INTEGER NOT NULL DEFAULT 0", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE reward ADD COLUMN redeemable_with_cash_card INTEGER NOT NULL DEFAULT 0", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE reward ADD COLUMN app_links BLOB DEFAULT NULL", null);
            }
            if (j <= 835 && j2 > 835) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS issuedCard", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n  DELETE FROM investment_notification_option;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM inlineMessageV2;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n  DELETE FROM cardMessage;\n\n  -- Delete gps data and insert a single row into the empty table\n  DELETE FROM gpsConfig;\n  INSERT INTO gpsConfig (rowid) VALUES (NULL);\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\nEND", null);
            }
            if (j <= 836 && j2 > 836) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS local_fulfillment_configuration", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE local_fulfillment_configuration (\n  brand_token TEXT NOT NULL PRIMARY KEY,\n  type TEXT NOT NULL,\n  location_token TEXT,\n  current_scheduling_mode TEXT NOT NULL,\n  asap_fulfillment BLOB,\n  scheduled_fulfillment BLOB,\n  delivery_fee BLOB\n)", null);
            }
            if (j <= 837 && j2 > 837) {
                androidSqliteDriver.execute(num15, "CREATE TABLE expressivePaymentsBackgroundConfig (\n  name TEXT UNIQUE,\n  main_url TEXT,\n  preview_url TEXT,\n  background_color BLOB,\n  default_text_format BLOB,\n  effects BLOB,\n  priority INTEGER,\n  release_state TEXT NOT NULL DEFAULT 'RELEASE_STATE_UNSPECIFIED',\n  tags BLOB,\n  is_default INTEGER NOT NULL DEFAULT 0\n)", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE expressivePaymentsStickerConfig (\n  name TEXT UNIQUE,\n  main_url TEXT,\n  preview_url TEXT,\n  effects BLOB,\n  priority INTEGER,\n  release_state TEXT NOT NULL DEFAULT 'RELEASE_STATE_UNSPECIFIED',\n  tags BLOB,\n  is_default INTEGER NOT NULL DEFAULT 0\n)", null);
            }
            if (j <= 838 && j2 > 838) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB,\n  tapToPay BLOB,\n  sponsorEligible BLOB,\n  moneyEarningsApplet BLOB,\n  c4bPromotionVisibility BLOB,\n  moneybotVisibility BLOB,\n  personalizedAdsToggle BLOB\n)", null);
            }
            if (j <= 839 && j2 > 839) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS personalizePaymentBackgroundConfig", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS personalizePaymentStickerConfig", null);
            }
            if (j <= 840 && j2 > 840) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS investment_notification_option", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM inlineMessageV2;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n  DELETE FROM cardMessage;\n\n  -- Delete gps data and insert a single row into the empty table\n  DELETE FROM gpsConfig;\n  INSERT INTO gpsConfig (rowid) VALUES (NULL);\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\nEND", null);
            }
            if (j <= 841 && j2 > 841) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB,\n  tapToPay BLOB,\n  sponsorEligible BLOB,\n  moneyEarningsApplet BLOB,\n  c4bPromotionVisibility BLOB,\n  moneybotVisibility BLOB,\n  personalizedAdsToggle BLOB,\n  poolsOnboardingVisibility BLOB\n)", null);
            }
            if (j <= 842 && j2 > 842) {
                androidSqliteDriver.execute(num15, "CREATE TABLE promotedAppletTiles (\n  appletId TEXT NOT NULL PRIMARY KEY,\n  sortOrder INTEGER NOT NULL,\n  title TEXT,\n  subtitle TEXT,\n  image BLOB\n)", null);
            }
            if (j <= 843 && j2 > 843) {
                androidSqliteDriver.execute(num15, "ALTER TABLE invitationConfig ADD COLUMN standalone_invite_friends_cta TEXT DEFAULT NULL", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE invitationConfig ADD COLUMN short_invite_friends_cta TEXT DEFAULT NULL", null);
            }
            if (j <= 844 && j2 > 844) {
                androidSqliteDriver.execute(num15, "CREATE INDEX sync_entity_type_index ON sync_entity (type)", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX contact_alias_lookup_key_index ON contact_alias (lookup_key)", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX payment_state_role_orientation_their_display_index\nON payment(state, role, orientation, their_id, display_date)", null);
                androidSqliteDriver.execute(num15, "CREATE INDEX payment_state_role_amount_currency_gifted_their_index\nON payment(state, role, amount_currency, gifted_investment_entity_token, their_id)", null);
            }
            if (j <= 845 && j2 > 845) {
                androidSqliteDriver.execute(num15, "CREATE TABLE local_tab_content (\n  onboarding_content BLOB DEFAULT NULL,\n  tab_content BLOB DEFAULT NULL,\n  expires_at INTEGER DEFAULT 0\n)", null);
            }
            if (j <= 846 && j2 > 846) {
                androidSqliteDriver.execute(num15, "DROP TABLE local_tab_content", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE local_tab_content (\n  response BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO local_tab_content DEFAULT VALUES", null);
            }
            if (j <= 847 && j2 > 847) {
                androidSqliteDriver.execute(num15, "ALTER TABLE expressivePaymentsBackgroundConfig ADD COLUMN accessibility_description TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE expressivePaymentsStickerConfig ADD COLUMN accessibility_description TEXT", null);
            }
            if (j <= 848 && j2 > 848) {
                androidSqliteDriver.execute(num15, "CREATE TABLE local_brand_collection (\n  response BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO local_brand_collection DEFAULT VALUES", null);
            }
            if (j <= 849 && j2 > 849) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS accepted_language_disclosure (\n  locale TEXT NOT NULL,\n  version TEXT\n)", null);
            }
            if (j <= 850 && j2 > 850) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN investing_home_disclosure_text TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN entity_details_disclosure_text TEXT", null);
            }
            if (j <= 851 && j2 > 851) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopHubBrowseDetails;\n  DELETE FROM shopBrowseCategoryDetails;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM inlineMessageV2;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n  DELETE FROM cardMessage;\n\n  -- Delete gps data and insert a single row into the empty table\n  DELETE FROM gpsConfig;\n  INSERT INTO gpsConfig (rowid) VALUES (NULL);\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\n\n  -- Neighborhoods.\n  DELETE FROM local_tab_content;\n  INSERT INTO local_tab_content (response) VALUES (NULL);\n  DELETE FROM local_market_screen;\n  INSERT INTO local_market_screen (tiles, expires_at) VALUES (NULL, 0);\n  DELETE FROM local_cash_detail_content;\n  INSERT INTO local_cash_detail_content (activity, content) VALUES (NULL, NULL);\n  DELETE FROM local_brand_collection;\n  INSERT INTO local_brand_collection (response) VALUES (NULL);\n  DELETE FROM local_fulfillment_configuration;\nEND", null);
            }
            if (j <= 852 && j2 > 852) {
                androidSqliteDriver.execute(num15, str49, null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS signOut", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS shopHubBrowseDetails", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS shopBrowseCategoryDetails", null);
                androidSqliteDriver.execute(num15, str50, null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM inlineMessageV2;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n  DELETE FROM cardMessage;\n\n  -- Delete gps data and insert a single row into the empty table\n  DELETE FROM gpsConfig;\n  INSERT INTO gpsConfig (rowid) VALUES (NULL);\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\n\n  -- Neighborhoods.\n  DELETE FROM local_tab_content;\n  INSERT INTO local_tab_content (response) VALUES (NULL);\n  DELETE FROM local_market_screen;\n  INSERT INTO local_market_screen (tiles, expires_at) VALUES (NULL, 0);\n  DELETE FROM local_cash_detail_content;\n  INSERT INTO local_cash_detail_content (activity, content) VALUES (NULL, NULL);\n  DELETE FROM local_brand_collection;\n  INSERT INTO local_brand_collection (response) VALUES (NULL);\n  DELETE FROM local_fulfillment_configuration;\nEND", null);
            }
            if (j <= 853 && j2 > 853) {
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN documents_disclosure_text TEXT", null);
                androidSqliteDriver.execute(num15, "ALTER TABLE investing_settings ADD COLUMN drip_disclosure_text TEXT", null);
            }
            if (j <= 854 && j2 > 854) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB,\n  tapToPay BLOB,\n  sponsorEligible BLOB,\n  moneyEarningsApplet BLOB,\n  c4bPromotionVisibility BLOB,\n  moneybotVisibility BLOB,\n  personalizedAdsToggle BLOB,\n  poolsOnboardingVisibility BLOB,\n  workAppletVisibility BLOB\n)", null);
            }
            if (j <= 855 && j2 > 855) {
                androidSqliteDriver.execute(num15, "ALTER TABLE local_cash_detail_content ADD COLUMN how_it_works BLOB DEFAULT NULL", null);
            }
            if (j <= 856 && j2 > 856) {
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeAppConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS ratePlanConfig", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS sharingConfig", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeAppConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM bankingConfig;\n  INSERT INTO bankingConfig (rowid) VALUES (NULL);\n\n  DELETE FROM blockersConfig;\n  INSERT INTO blockersConfig(rowid) VALUES (NULL);\n\n  DELETE FROM checkDepositConfig;\n  INSERT INTO checkDepositConfig (rowid) VALUES (NULL);\n\n  DELETE FROM cryptocurrencyConfig;\n  INSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\n\n  DELETE FROM instrumentLinkingConfig;\n  INSERT INTO instrumentLinkingConfig (rowid) VALUES (NULL);\n\n  DELETE FROM invitationConfig;\n  INSERT INTO invitationConfig (rowid) VALUES (NULL);\n\n  DELETE FROM offlineConfig;\n  INSERT INTO offlineConfig(rowid) VALUES (NULL);\n\n  DELETE FROM paymentHistoryConfig;\n  DELETE FROM transfer_customer_ids;\n  DELETE FROM banking_transaction_customer_ids;\n  DELETE FROM lending_transaction_customer_ids;\n  DELETE FROM referral_customer_ids;\n  INSERT INTO paymentHistoryConfig(rowid) VALUES (NULL);\n\n  DELETE FROM reactionConfig;\n  INSERT INTO reactionConfig(rowid) VALUES (NULL);\n\n  DELETE FROM recipientConfig;\n  INSERT INTO recipientConfig (rowid) VALUES (NULL);\n\n  DELETE FROM stampsConfig;\n  INSERT INTO stampsConfig (rowid) VALUES (NULL);\n\n  DELETE FROM supportConfig;\n  INSERT INTO supportConfig(rowid) VALUES (NULL);\n\n  DELETE FROM webLoginConfig;\n  INSERT INTO webLoginConfig(rowid) VALUES (NULL);\n\n  DELETE FROM bitcoinTransactionCustomerIds;\n\n  DELETE FROM institutionsConfig;\n  INSERT INTO institutionsConfig (rowid) VALUES (NULL);\nEND", null);
            }
            if (j <= 857 && j2 > 857) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS weaverRecommendationsResponses", null);
            }
            if (j <= 858 && j2 > 858) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB,\n  tapToPay BLOB,\n  sponsorEligible BLOB,\n  moneyEarningsApplet BLOB,\n  c4bPromotionVisibility BLOB,\n  moneybotVisibility BLOB,\n  personalizedAdsToggle BLOB,\n  poolsOnboardingVisibility BLOB,\n  workAppletVisibility BLOB,\n  nearbyPaymentFeatureVisibility BLOB\n)", null);
            }
            if (j <= 859 && j2 > 859) {
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS cashLiteConfig (\n  config BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO cashLiteConfig DEFAULT VALUES", null);
                androidSqliteDriver.execute(num15, "DROP TRIGGER IF EXISTS removeAppConfigWithProfile", null);
                androidSqliteDriver.execute(num15, "CREATE TRIGGER removeAppConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM bankingConfig;\n  INSERT INTO bankingConfig (rowid) VALUES (NULL);\n\n  DELETE FROM blockersConfig;\n  INSERT INTO blockersConfig(rowid) VALUES (NULL);\n\n  DELETE FROM cashLiteConfig;\n  INSERT INTO cashLiteConfig (rowid) VALUES (NULL);\n\n  DELETE FROM checkDepositConfig;\n  INSERT INTO checkDepositConfig (rowid) VALUES (NULL);\n\n  DELETE FROM cryptocurrencyConfig;\n  INSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\n\n  DELETE FROM instrumentLinkingConfig;\n  INSERT INTO instrumentLinkingConfig (rowid) VALUES (NULL);\n\n  DELETE FROM invitationConfig;\n  INSERT INTO invitationConfig (rowid) VALUES (NULL);\n\n  DELETE FROM offlineConfig;\n  INSERT INTO offlineConfig(rowid) VALUES (NULL);\n\n  DELETE FROM paymentHistoryConfig;\n  DELETE FROM transfer_customer_ids;\n  DELETE FROM banking_transaction_customer_ids;\n  DELETE FROM lending_transaction_customer_ids;\n  DELETE FROM referral_customer_ids;\n  INSERT INTO paymentHistoryConfig(rowid) VALUES (NULL);\n\n  DELETE FROM reactionConfig;\n  INSERT INTO reactionConfig(rowid) VALUES (NULL);\n\n  DELETE FROM recipientConfig;\n  INSERT INTO recipientConfig (rowid) VALUES (NULL);\n\n  DELETE FROM stampsConfig;\n  INSERT INTO stampsConfig (rowid) VALUES (NULL);\n\n  DELETE FROM supportConfig;\n  INSERT INTO supportConfig(rowid) VALUES (NULL);\n\n  DELETE FROM webLoginConfig;\n  INSERT INTO webLoginConfig(rowid) VALUES (NULL);\n\n  DELETE FROM bitcoinTransactionCustomerIds;\n\n  DELETE FROM institutionsConfig;\n  INSERT INTO institutionsConfig (rowid) VALUES (NULL);\nEND", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS cardTabNullStateSwipeConfig", null);
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS fullScreenAdConfig", null);
            }
            if (j <= 860 && j2 > 860) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB,\n  tapToPay BLOB,\n  sponsorEligible BLOB,\n  moneyEarningsApplet BLOB,\n  c4bPromotionVisibility BLOB,\n  moneybotVisibility BLOB,\n  personalizedAdsToggle BLOB,\n  poolsOnboardingVisibility BLOB,\n  workAppletVisibility BLOB,\n  nearbyPaymentFeatureVisibility BLOB,\n  bitcoinAutoInvest BLOB\n)", null);
            }
            if (j <= 861 && j2 > 861) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS accepted_language_disclosure", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE IF NOT EXISTS localizationConfig (\n  config BLOB DEFAULT NULL\n)", null);
                androidSqliteDriver.execute(num15, "INSERT INTO localizationConfig DEFAULT VALUES", null);
            }
            if (j <= 862 && j2 > 862) {
                androidSqliteDriver.execute(num15, "DROP TABLE IF EXISTS singleAccountHolderEligibility", null);
                androidSqliteDriver.execute(num15, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB,\n  tapToPay BLOB,\n  sponsorEligible BLOB,\n  moneyEarningsApplet BLOB,\n  c4bPromotionVisibility BLOB,\n  moneybotVisibility BLOB,\n  personalizedAdsToggle BLOB,\n  poolsOnboardingVisibility BLOB,\n  workAppletVisibility BLOB,\n  nearbyPaymentFeatureVisibility BLOB,\n  bitcoinAutoInvest BLOB,\n  recurringP2pPaymentFeatureVisibility BLOB\n)", null);
            }
            QueryResult.Companion.getClass();
            QueryResult.Companion companion = QueryResult.Companion.$$INSTANCE;
        }

        /* renamed from: migrateInternal-ElmaSbI$2, reason: not valid java name */
        public static void m3519migrateInternalElmaSbI$2(AndroidSqliteDriver androidSqliteDriver, long j, long j2) {
            if (j <= 2 && j2 > 2) {
                androidSqliteDriver.execute(null, "CREATE TABLE IF NOT EXISTS storage_link (\n  account_token TEXT,\n  guid TEXT\n)", null);
                androidSqliteDriver.execute(null, "CREATE UNIQUE INDEX IF NOT EXISTS idx_storage_link_token ON storage_link(account_token)", null);
                androidSqliteDriver.execute(null, "CREATE UNIQUE INDEX IF NOT EXISTS idx_storage_link_guid ON storage_link(guid)", null);
            }
            if (j <= 3 && j2 > 3) {
                androidSqliteDriver.execute(null, "DROP TABLE IF EXISTS storage_link", null);
                androidSqliteDriver.execute(null, "CREATE TABLE storage_link (\n  account_token TEXT,\n  id INTEGER PRIMARY KEY NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "CREATE UNIQUE INDEX idx_storage_link_token ON storage_link(account_token)", null);
            }
            if (j <= 4 && j2 > 4) {
                androidSqliteDriver.execute(null, "CREATE TABLE new_storage_link (\n  account_token TEXT,\n  id INTEGER PRIMARY KEY NOT NULL,\n  signin_group_id INTEGER NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT INTO new_storage_link\nSELECT account_token, id, 1\nFROM storage_link", null);
                androidSqliteDriver.execute(null, "DROP TABLE IF EXISTS storage_link", null);
                androidSqliteDriver.execute(null, "ALTER TABLE new_storage_link RENAME TO storage_link", null);
                androidSqliteDriver.execute(null, "CREATE UNIQUE INDEX idx_storage_link_token ON storage_link(account_token)", null);
            }
            if (j <= 5 && j2 > 5) {
                androidSqliteDriver.execute(null, "CREATE TABLE active_storage_link (\n  id INTEGER PRIMARY KEY NOT NULL,\n  storage_link_id INTEGER,\n  FOREIGN KEY(storage_link_id) REFERENCES storage_link(id) ON DELETE CASCADE\n)", null);
            }
            if (j <= 6 && j2 > 6) {
                androidSqliteDriver.execute(null, "CREATE TABLE session (\n  app_token TEXT,\n  account_token TEXT,\n  target_account_token TEXT,\n  session_token TEXT,\n  session_status INTEGER,\n  onboarded INTEGER NOT NULL,\n  id INTEGER PRIMARY KEY NOT NULL\n)", null);
                androidSqliteDriver.execute(null, "INSERT OR REPLACE INTO session VALUES (NULL, NULL, NULL, NULL, NULL, 0, 1)", null);
            }
            if (j <= 7 && j2 > 7) {
                androidSqliteDriver.execute(null, "ALTER TABLE storage_link ADD COLUMN created_at_ms INTEGER NOT NULL DEFAULT 0", null);
            }
            QueryResult.Companion.getClass();
            QueryResult.Companion companion = QueryResult.Companion.$$INSTANCE;
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final QueryResult.Value create(AndroidSqliteDriver androidSqliteDriver) {
            switch (this.$r8$classId) {
                case 0:
                    androidSqliteDriver.execute(null, "CREATE TABLE analytics_message(\n  message_uuid TEXT NOT NULL PRIMARY KEY,\n  recorded_at INTEGER NOT NULL,\n  payload BLOB NOT NULL\n)", null);
                    androidSqliteDriver.execute(null, "CREATE TABLE placeholder(\n  id INTEGER PRIMARY KEY\n)", null);
                    androidSqliteDriver.execute(null, "CREATE TABLE session (\n  app_token TEXT,\n  account_token TEXT,\n  target_account_token TEXT,\n  session_token TEXT,\n  session_status INTEGER,\n  onboarded INTEGER NOT NULL,\n  id INTEGER PRIMARY KEY NOT NULL\n)", null);
                    androidSqliteDriver.execute(null, "CREATE TABLE storage_link (\n  account_token TEXT,\n  id INTEGER PRIMARY KEY NOT NULL,\n  signin_group_id INTEGER NOT NULL,\n  created_at_ms INTEGER NOT NULL\n)", null);
                    androidSqliteDriver.execute(null, "CREATE TABLE active_storage_link (\n  id INTEGER PRIMARY KEY NOT NULL,\n  storage_link_id INTEGER,\n  FOREIGN KEY(storage_link_id) REFERENCES storage_link(id) ON DELETE CASCADE\n)", null);
                    androidSqliteDriver.execute(null, "CREATE INDEX idx_analyticsMessage_timestamp ON analytics_message (recorded_at)", null);
                    androidSqliteDriver.execute(null, "CREATE UNIQUE INDEX idx_storage_link_token ON storage_link(account_token)", null);
                    androidSqliteDriver.execute(null, "INSERT OR REPLACE INTO session VALUES (NULL, NULL, NULL, NULL, NULL, 0, 1)", null);
                    QueryResult.Companion.getClass();
                    return new QueryResult.Value(QueryResult.Companion.Unit);
                default:
                    return new QueryResult.Value(m3520create0iQ1z0(androidSqliteDriver));
            }
        }

        /* renamed from: create-0iQ1-z0, reason: not valid java name */
        public Object m3520create0iQ1z0(SqlDriver sqlDriver) {
            sqlDriver.execute(null, "CREATE TABLE activeRewardOverride (\n  reward_token TEXT NOT NULL REFERENCES reward(token)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE afterpayApplet (\n  key INTEGER NOT NULL PRIMARY KEY,\n  ttl_in_millis INTEGER,\n  afterpay_applet_response BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE afterpayAppletMerchantSheet (\n  token TEXT NOT NULL PRIMARY KEY,\n  last_updated_at_ms INTEGER,\n  sheet_response BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE afterpayRecentlyViewedMerchant (\n  token TEXT NOT NULL PRIMARY KEY,\n  last_updated_at_ms INTEGER,\n  is_merchant_token INTEGER DEFAULT 0\n)", null);
            sqlDriver.execute(null, "CREATE TABLE alias (\n  hashed_alias TEXT NOT NULL PRIMARY KEY,\n  email TEXT,\n  sms TEXT,\n  customer_id TEXT REFERENCES customer ON DELETE SET NULL,\n  sync_state TEXT,\n  hashed_alias_id TEXT DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE analytics_message(\n  message_uuid TEXT NOT NULL PRIMARY KEY,\n  recorded_at INTEGER NOT NULL,\n  payload BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE atmWithdrawalAddressSearch (\n  identifier TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL DEFAULT 0,\n  formatted_address TEXT NOT NULL,\n  primary_text TEXT NOT NULL,\n  secondary_text TEXT,\n  latitude REAL,\n  longitude REAL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE availableAccountStatement (\n  statement_token TEXT NOT NULL PRIMARY KEY,\n  display_name TEXT,\n  statement_url TEXT,\n  statementCoverage BLOB\n)", null);
            sqlDriver.execute(null, "CREATE TABLE badge (\n  external_token TEXT NOT NULL,\n  item_type TEXT NOT NULL,\n  badge_version INTEGER NOT NULL,\n  cleared_version INTEGER,\n  cleared_at INTEGER,\n  clear_succeeded_at INTEGER,\n  PRIMARY KEY (external_token, item_type)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE badgeCount (\n  group_name TEXT NOT NULL PRIMARY KEY,\n  count INTEGER NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE badgeGroup (\n  external_token TEXT NOT NULL,\n  item_type TEXT NOT NULL,\n  group_name TEXT NOT NULL,\n  PRIMARY KEY (external_token, item_type, group_name),\n  FOREIGN KEY(external_token, item_type) REFERENCES badge(external_token, item_type) ON DELETE CASCADE\n)", null);
            sqlDriver.execute(null, "CREATE TABLE balanceData (\n  cash_balance_home_screen_button_enabled INTEGER NOT NULL,\n  cash_balance_home_screen_button_priority INTEGER NOT NULL,\n  adding_cash_enabled INTEGER NOT NULL,\n  enable_cryptocurrency_transfer_out_status TEXT NOT NULL,\n  enable_cryptocurrency_transfer_out_button_text TEXT,\n  balance_limit_groups BLOB NOT NULL,\n  scheduled_reload_data BLOB DEFAULT NULL,\n  scheduled_reload_enabled INTEGER NOT NULL DEFAULT 0,\n  enable_cryptocurrency_transfer_in_status TEXT NOT NULL,\n  enable_cryptocurrency_transfer_in_button_text TEXT,\n  check_deposits_enabled INTEGER NOT NULL DEFAULT 0,\n  direct_deposit BLOB DEFAULT NULL,\n  deposit_check BLOB DEFAULT NULL,\n  dda_form BLOB DEFAULT NULL,\n  bitcoin_p2p_enabled INTEGER NOT NULL DEFAULT 0\n)", null);
            sqlDriver.execute(null, "CREATE TABLE bankingConfig (\n  main_screen_title TEXT DEFAULT NULL,\n  main_screen_balance_subtitle TEXT DEFAULT NULL,\n  recurring_deposits_dda_upsell BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE bitcoinMapAddressSearch (\n  identifier TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL DEFAULT 0,\n  formatted_address TEXT NOT NULL,\n  primary_text TEXT NOT NULL,\n  secondary_text TEXT,\n  latitude REAL,\n  longitude REAL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE bitcoinTransactionCustomerIds (\n  customer_id TEXT PRIMARY KEY\n)", null);
            sqlDriver.execute(null, "CREATE TABLE blockersConfig (\n  address_typeahead_enabled INTEGER DEFAULT NULL,\n  add_cash_header_text TEXT DEFAULT NULL,\n  target_balance_amount BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE boostConfig (\n  expirationHintThresholdBps INTEGER DEFAULT NULL,\n  bitcoinBoostUpsell BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE businessGrants(\n  id TEXT PRIMARY KEY,\n  merchant_id TEXT,\n  updated_at INTEGER,\n  created_at INTEGER,\n  expires_at INTEGER,\n  client_id TEXT,\n  action_type TEXT,\n  account_reference_id TEXT,\n  rendering_behavior TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE cardCustomization (\n  path TEXT NOT NULL PRIMARY KEY,\n  customization_bitmap BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE cardMessage(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  placement TEXT,\n  image BLOB,\n  title TEXT,\n  subtitle TEXT,\n  primaryNavigationAction BLOB,\n  animation BLOB,\n  priority INTEGER NOT NULL DEFAULT 1,\n  expiresAtUtc INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE cardStudio (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  touch_data BLOB DEFAULT NULL,\n  card_theme BLOB DEFAULT NULL,\n  cashtag_enabled INTEGER NOT NULL DEFAULT 0\n)", null);
            sqlDriver.execute(null, "CREATE TABLE cardTabHeroState (\n  _id INTEGER NOT NULL PRIMARY KEY DEFAULT 1,\n  card_token TEXT DEFAULT NULL,\n  rendering_info BLOB DEFAULT NULL,\n  facing_forward INTEGER DEFAULT 0,\n  enabled INTEGER DEFAULT 0\n)", null);
            sqlDriver.execute(null, "CREATE TABLE cashLiteConfig (\n  config BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE category (\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  token TEXT NOT NULL UNIQUE,\n  entity_id TEXT NOT NULL UNIQUE,\n  name TEXT NOT NULL,\n  description TEXT,\n  prefix_icon TEXT,\n  image_url TEXT,\n  accent_color TEXT,\n  parent_category_token TEXT,\n  type TEXT NOT NULL,\n  filter_description TEXT,\n  category_color BLOB,\n  ui_order INTEGER NOT NULL DEFAULT 0\n)", null);
            sqlDriver.execute(null, "CREATE TABLE category_in_filter_group(\n  filter_group_token TEXT NOT NULL,\n  category_token TEXT NOT NULL,\n  PRIMARY KEY (filter_group_token, category_token)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE checkDepositConfig (\n  light_image_url TEXT DEFAULT NULL,\n  dark_image_url TEXT DEFAULT NULL,\n  description TEXT DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE clientRoutingConfig (\n  client_route_rules BLOB DEFAULT NULL,\n  deep_link_rules BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE contact (\n  lookup_key TEXT PRIMARY KEY,\n  display_name TEXT,\n  has_multiple_customers INTEGER NOT NULL DEFAULT 0,\n  already_invited INTEGER NOT NULL DEFAULT 0,\n  in_address_book INTEGER NOT NULL DEFAULT 1\n)", null);
            sqlDriver.execute(null, "CREATE TABLE contact_alias (\n  hashed_alias TEXT NOT NULL REFERENCES alias ON DELETE CASCADE,\n  lookup_key TEXT NOT NULL REFERENCES contact ON DELETE CASCADE,\n  in_address_book INTEGER DEFAULT 1,\n  PRIMARY KEY (hashed_alias, lookup_key)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE contact_detailed_sync_state(\n  primary_key TEXT PRIMARY KEY,\n  latest_lookup_key TEXT NOT NULL,\n  row_id INTEGER,\n  hash TEXT NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE crypto_statement(\n  token TEXT NOT NULL PRIMARY KEY,\n  category TEXT NOT NULL,\n  title TEXT NOT NULL,\n  document_date INTEGER NOT NULL,\n  url TEXT NOT NULL,\n  owner_token TEXT NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE cryptocurrencyConfig (\n  btc_welcome_message TEXT DEFAULT NULL,\n  learn_about_btc_button_text TEXT DEFAULT NULL,\n  learn_about_btc_url TEXT DEFAULT NULL,\n  dismiss_button_text TEXT DEFAULT NULL,\n  minimum_withdrawal_limit_sats INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE customer (\n  customer_id TEXT PRIMARY KEY,\n  cashtag TEXT,\n  customer_display_name TEXT,\n  can_accept_payments INTEGER NOT NULL DEFAULT 0,\n  is_square INTEGER NOT NULL DEFAULT 0,\n  is_cash_customer INTEGER NOT NULL DEFAULT 0,\n  is_business INTEGER NOT NULL DEFAULT 0,\n  is_verified INTEGER NOT NULL DEFAULT 0,\n  credit_card_fee INTEGER,\n  render_data TEXT,\n  blocked TEXT NOT NULL,\n  threaded_customer_id TEXT,\n  merchant_data BLOB,\n  category TEXT,\n  investment_entity_token TEXT DEFAULT NULL,\n  region TEXT,\n  joined_on INTEGER DEFAULT NULL,\n  photo BLOB DEFAULT NULL,\n  themed_accent_color BLOB DEFAULT NULL,\n  is_special_customer INTEGER NOT NULL DEFAULT 0\n)", null);
            sqlDriver.execute(null, "CREATE TABLE effective_limits (\n  limited_action TEXT NOT NULL PRIMARY KEY,\n  limit_amount BLOB NOT NULL,\n  limit_exceeded_message TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE customerStatementType (\n  customer_token TEXT NOT NULL,\n  is_sponsored_account INTEGER,\n  display_name TEXT,\n  statement_type TEXT NOT NULL,\n  is_active_sponsored_account INTEGER DEFAULT NULL,\n  PRIMARY KEY (customer_token, statement_type)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE dependentLastSeenSavingsBalance(\n  customer_token TEXT NOT NULL PRIMARY KEY,\n  balance BLOB DEFAULT NULL,\n  general_balance BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE directDepositAccount (\n  routing_number TEXT NOT NULL,\n  account_number_prefix TEXT NOT NULL,\n  is_placeholder INTEGER NOT NULL,\n  explanation_text TEXT DEFAULT NULL,\n  display_complete_account_number INTEGER DEFAULT NULL,\n  support_node_token TEXT DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE IF NOT EXISTS profileDirectoryConfig (\n  id INTEGER NOT NULL PRIMARY KEY,\n  cacheTTLInMillis INTEGER\n)", null);
            sqlDriver.execute(null, "CREATE TABLE IF NOT EXISTS profileDirectorySection (\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  title BLOB,\n  subtitle BLOB,\n  type TEXT NOT NULL,\n  placeholderSection BLOB,\n  maxDisplayItems INTEGER,\n  informationButton BLOB,\n  embeddedImageSection BLOB,\n  headerText BLOB,\n  serverId TEXT DEFAULT NULL,\n  layout TEXT DEFAULT NULL,\n  tileSection BLOB,\n  tapAction BLOB,\n  backgroundColor BLOB DEFAULT NULL,\n  eyebrow BLOB DEFAULT NULL,\n  footerButton BLOB DEFAULT NULL,\n  renderSectionDivider INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE IF NOT EXISTS profileDirectoryItem (\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  title BLOB,\n  subtitle BLOB,\n  profileImage BLOB,\n  actionUrl TEXT,\n  header BLOB,\n  button BLOB,\n  section_id INTEGER NOT NULL REFERENCES profileDirectorySection ON DELETE CASCADE,\n  metadata BLOB,\n  picture BLOB,\n  isCardItem INTEGER,\n  layout TEXT DEFAULT NULL,\n  hideCloseButton INTEGER\n)", null);
            sqlDriver.execute(null, "CREATE TABLE document (\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  token TEXT NOT NULL,\n  category TEXT NOT NULL,\n  title TEXT NOT NULL,\n  display_date INTEGER,\n  client_route TEXT,\n  url TEXT,\n  version_data BLOB,\n  owner_token TEXT DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE documentCategory (\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  category_id TEXT NOT NULL,\n  parent_category_id TEXT NOT NULL,\n  display_name TEXT NOT NULL,\n  display_order INTEGER,\n  display_date INTEGER,\n  render_style TEXT,\n  version_data BLOB\n)", null);
            sqlDriver.execute(null, "CREATE TABLE entity_in_category(\n  category_token TEXT NOT NULL,\n  entity_token TEXT NOT NULL,\n  PRIMARY KEY (category_token, entity_token)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE entity_range (\n\trange BLOB UNIQUE,\n\ttopic INTEGER NOT NULL DEFAULT -1\n)", null);
            sqlDriver.execute(null, "CREATE TABLE exchange_data(\n  base_currency_code TEXT NOT NULL,\n  quote_currency_code TEXT NOT NULL,\n  rates BLOB NOT NULL,\n  timestamp INTEGER NOT NULL,\n  PRIMARY KEY (base_currency_code, quote_currency_code)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE expressivePaymentsBackgroundConfig (\n  name TEXT UNIQUE,\n  main_url TEXT,\n  preview_url TEXT,\n  background_color BLOB,\n  default_text_format BLOB,\n  effects BLOB,\n  priority INTEGER,\n  release_state TEXT NOT NULL DEFAULT 'RELEASE_STATE_UNSPECIFIED',\n  tags BLOB,\n  is_default INTEGER NOT NULL DEFAULT 0,\n  accessibility_description TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE expressivePaymentsStickerConfig (\n  name TEXT UNIQUE,\n  main_url TEXT,\n  preview_url TEXT,\n  effects BLOB,\n  priority INTEGER,\n  release_state TEXT NOT NULL DEFAULT 'RELEASE_STATE_UNSPECIFIED',\n  tags BLOB,\n  is_default INTEGER NOT NULL DEFAULT 0,\n  accessibility_description TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE extendedProfileDetails(\n  customer_token TEXT NOT NULL PRIMARY KEY,\n  get_profile_details_response BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE featureFlags (\n  name TEXT NOT NULL PRIMARY KEY,\n  flag BLOB NOT NULL,\n  local INTEGER NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE filter_group (\n  token TEXT NOT NULL PRIMARY KEY,\n  entity_id TEXT NOT NULL UNIQUE,\n  name TEXT NOT NULL,\n  can_select_multiple_categories INTEGER,\n  subfilters BLOB,\n  category_map BLOB,\n  name_plural TEXT,\n  join_type TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE filter_for_category(\n  category_token TEXT NOT NULL,\n  filter_token TEXT NOT NULL,\n  PRIMARY KEY (category_token, filter_token)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE fullScreenMessage(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  video BLOB,\n  primaryAction BLOB,\n  secondaryAction BLOB,\n  primaryActionColor BLOB,\n  secondaryActionColor BLOB,\n  priority INTEGER NOT NULL DEFAULT 1,\n  insertedAtUtc INTEGER NOT NULL,\n  placement TEXT,\n  expiresAtUtc INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE gpsConfig(\n  consent_status TEXT DEFAULT NULL,\n  precise_enabled INTEGER DEFAULT NULL,\n  location_updated_at INTEGER NOT NULL DEFAULT 0\n)", null);
            sqlDriver.execute(null, "CREATE TABLE inAppNotificationMessage (\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  duration INTEGER,\n  assetUrl TEXT,\n  action BLOB,\n  animation BLOB,\n  image BLOB,\n  avatar BLOB,\n  priority INTEGER NOT NULL DEFAULT 1,\n  expiresAtUtc INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE inlineMessage(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  placement TEXT,\n  image BLOB,\n  title TEXT,\n  subtitle TEXT,\n  primaryNavigationAction BLOB,\n  secondaryNavigationAction BLOB,\n  cannotBeDismissed INTEGER NOT NULL DEFAULT 0,\n  animation BLOB,\n  priority INTEGER NOT NULL DEFAULT 1,\n  messageType TEXT DEFAULT NULL,\n  expiresAtUtc INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE inlineMessageV2(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  placement TEXT,\n  avatar BLOB,\n  title TEXT,\n  subtitle TEXT,\n  url TEXT,\n  priority INTEGER NOT NULL DEFAULT 1,\n  expiresAtUtc INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE institutionsConfig (\n  institutions BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE instrument (\n  token TEXT NOT NULL PRIMARY KEY,\n  cash_instrument_type TEXT NOT NULL,\n  card_brand TEXT,\n  suffix TEXT,\n  bank_name TEXT,\n  icon_url TEXT,\n  balance_currency TEXT,\n  balance_amount INTEGER,\n  version INTEGER NOT NULL,\n  detail_icon_url TEXT,\n  display_name TEXT,\n  wallet_address TEXT,\n  pending_verification INTEGER DEFAULT NULL,\n  selection_icon_url TEXT,\n  -- Temporary data to identifty that this instrument came from a sync entity. This is also used as\n  -- a stop-gap to support deleting instrument sync entities until we build out proper support.\n  sync_entity_id TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE instrumentLinkingConfig (\n  header_no_instrument_linked TEXT DEFAULT NULL,\n  description_no_instrument_linked TEXT DEFAULT NULL,\n  header_bank_account_linked TEXT DEFAULT NULL,\n  description_bank_account_linked TEXT DEFAULT NULL,\n  header_no_instrument_linked_personal TEXT DEFAULT NULL,\n  description_no_instrument_linked_personal TEXT DEFAULT NULL,\n  credit_card_fee_bps INTEGER DEFAULT NULL,\n  credit_card_linking_enabled INTEGER DEFAULT NULL,\n  max_credit_prompts INTEGER DEFAULT NULL,\n  cash_balance_enabled INTEGER DEFAULT NULL,\n  issued_cards_enabled INTEGER DEFAULT NULL,\n  bankbook_enabled INTEGER DEFAULT NULL,\n  issued_card_disabled_style TEXT DEFAULT NULL,\n  physical_issued_cards_enabled INTEGER DEFAULT NULL,\n  nfc_card_linking_enabled INTEGER DEFAULT 0,\n  bank_account_linking_config BLOB\n)", null);
            sqlDriver.execute(null, "CREATE TABLE instrumentLinkingOption (\n  instrument_types TEXT NOT NULL,\n  title TEXT,\n  description TEXT,\n  fee_bps INTEGER NOT NULL DEFAULT 0,\n  show_in_instrument_selector INTEGER NOT NULL DEFAULT 0\n)", null);
            sqlDriver.execute(null, "CREATE TABLE investing_discovery (\n  category TEXT NOT NULL,\n  category_index INTEGER NOT NULL,\n  investment_entity_token TEXT NOT NULL,\n  category_description TEXT,\n  in_search_suggestion INTEGER,\n  in_search_category INTEGER NOT NULL DEFAULT 0,\n  PRIMARY KEY (category, investment_entity_token)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE investing_entity_price_cache(\n  token TEXT PRIMARY KEY,\n  price BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE investing_news_article (\n  kind TEXT NOT NULL,\n  provider TEXT NOT NULL,\n  provider_avatar BLOB NOT NULL,\n  headline TEXT NOT NULL,\n  published_at_millis INTEGER,\n  url TEXT,\n  display_in_carousel INTEGER NOT NULL,\n  saved_at_millis INTEGER NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE investing_stocks_portfolio_graph_cache(\n  range TEXT PRIMARY KEY NOT NULL,\n  data BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE investing_bitcoin_portfolio_graph_cache(\n  profileCurrency TEXT NOT NULL,\n  range TEXT NOT NULL,\n  data BLOB NOT NULL,\n  PRIMARY KEY (profileCurrency, range)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE investing_settings (\n  purchase_limit BLOB,\n  sell_limit BLOB,\n  equities_discovery_url TEXT,\n  bitcoin_discovery_url TEXT,\n  disclosures_web_url TEXT,\n  my_watchlist_description TEXT,\n  crypto_disclosure_url TEXT,\n  my_first_stock_configuration BLOB,\n  equities_discovery_stock_tiles BLOB,\n  my_first_bitcoin_configuration BLOB,\n  min_scheduled_btc_buy_amt BLOB,\n  min_scheduled_stock_buy_amt BLOB,\n  custom_order_configuration BLOB,\n  first_time_congrats_equity_title TEXT,\n  first_time_congrats_equity_text TEXT,\n  first_time_congrats_equity_detail_title TEXT,\n  first_time_congrats_equity_detail_text TEXT,\n  first_time_congrats_bitcoin_title TEXT,\n  first_time_congrats_bitcoin_text TEXT,\n  bitcoin_investment_entity_token TEXT,\n  trusted_contact_enabled INTEGER NOT NULL DEFAULT 0,\n  investing_home_disclosure_text TEXT,\n  entity_details_disclosure_text TEXT,\n  documents_disclosure_text TEXT,\n  drip_disclosure_text TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE investing_state(\n  has_active_brokerage_account INTEGER NOT NULL DEFAULT 0,\n  has_portfolio INTEGER NOT NULL DEFAULT 0,\n  has_holdings INTEGER,\n  dividend_setting_type TEXT NOT NULL DEFAULT 'PAYOUT',\n  brokerage_account_transfer_will_complete_at_utc INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE investment_entity(\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  token TEXT NOT NULL UNIQUE,\n  symbol TEXT NOT NULL,\n  type TEXT NOT NULL,\n  display_name TEXT NOT NULL,\n  icon_url TEXT,\n  outstanding_shares INTEGER,\n  color TEXT,\n  status TEXT NOT NULL,\n  about_text TEXT,\n  about_detail_rows BLOB DEFAULT NULL,\n  search_ordering INTEGER DEFAULT NULL,\n  delisted INTEGER NOT NULL DEFAULT 0,\n  entity_color BLOB,\n  icon BLOB,\n  release_stage TEXT DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE investment_holding(\n  token TEXT NOT NULL PRIMARY KEY,\n  units TEXT NOT NULL,\n  invested_amount INTEGER NOT NULL,\n  currency TEXT,\n  state TEXT NOT NULL,\n  daily_gain_params BLOB,\n  average_cost BLOB\n)", null);
            sqlDriver.execute(null, "CREATE TABLE investment_performance(\n  entity_token TEXT NOT NULL PRIMARY KEY,\n  title TEXT,\n  sections BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE invitationConfig (\n  enabled INTEGER DEFAULT NULL,\n  bounty_amount BLOB DEFAULT NULL,\n  welcome_amount BLOB DEFAULT NULL,\n  header TEXT DEFAULT NULL,\n  preview_message TEXT DEFAULT NULL,\n  message_template TEXT DEFAULT NULL,\n  invite_all_enabled INTEGER DEFAULT NULL,\n  reward_code TEXT DEFAULT NULL,\n  reward_code_url TEXT DEFAULT NULL,\n  share_text TEXT DEFAULT NULL,\n  header_link_display_text TEXT DEFAULT NULL,\n  profile_button_text TEXT DEFAULT NULL,\n  activity_button_text TEXT DEFAULT NULL,\n  preview_message_by_country BLOB DEFAULT NULL,\n  profile_row_title TEXT DEFAULT NULL,\n  profile_row_subtitle TEXT DEFAULT NULL,\n  standalone_invite_friends_cta TEXT DEFAULT NULL,\n  short_invite_friends_cta TEXT DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE invitationEntity(\n  entity_id TEXT PRIMARY KEY,\n  hashed_alias TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE itemizedReceipt (\n  token TEXT NOT NULL PRIMARY KEY,\n  transaction_token TEXT UNIQUE NOT NULL,\n  render_json TEXT NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE lastSeenSavingsBalance(\n  balance BLOB DEFAULT NULL,\n  generalBalance BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE LegalDocument(\n  token TEXT NOT NULL PRIMARY KEY,\n  category TEXT NOT NULL,\n  title TEXT NOT NULL,\n  document_date INTEGER,\n  url TEXT NOT NULL,\n  owner_token TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE localizationConfig (\n  config BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE loyaltyAccount (\n  account_id TEXT PRIMARY KEY,\n  customer_phone_number TEXT NOT NULL,\n  points_earned INTEGER NOT NULL DEFAULT 0,\n  last_time_visited INTEGER NOT NULL DEFAULT 0,\n  account_status_url TEXT,\n  loyalty_program_id TEXT NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE loyaltyHiddenPaymentTypes (\n  payment_type TEXT NOT NULL UNIQUE\n)", null);
            sqlDriver.execute(null, "CREATE TABLE loyaltyProgram(\n  program_id TEXT PRIMARY KEY,\n  cash_merchant_token TEXT NOT NULL,\n  program_rewards BLOB NOT NULL,\n  loyalty_unit BLOB NOT NULL,\n  render_data TEXT,\n  program_details TEXT,\n  deep_link_token TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE market_capabilities(\n  updated_at_millis INTEGER NOT NULL,\n  capabilities BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE IF NOT EXISTS marketCapabilitiesConfig (\n  id TEXT PRIMARY KEY,\n  capabilities BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE messageDelivered (\n  token TEXT PRIMARY KEY\n)", null);
            sqlDriver.execute(null, "CREATE TABLE multiBlockerRequests(\n  group_id TEXT NOT NULL,\n  descriptor_id TEXT NOT NULL,\n  request BLOB NOT NULL,\n  PRIMARY KEY (group_id, descriptor_id)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE notificationPreference (\n  canonical_text TEXT PRIMARY KEY NOT NULL,\n  enabled INTEGER NOT NULL,\n  type TEXT NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE offersCollectionDetail(\n  token TEXT NOT NULL PRIMARY KEY,\n  ttl_in_millis INTEGER,\n  offers_collection_response BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE offersHome(\n  id INTEGER NOT NULL PRIMARY KEY,\n  ttl_in_millis INTEGER,\n  offers_home_response BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE offersRecentlyViewed(\n  id INTEGER PRIMARY KEY,\n  token TEXT NOT NULL UNIQUE,\n  last_updated INTEGER NOT NULL,\n  type TEXT NOT NULL DEFAULT 'BUSINESS'\n)", null);
            sqlDriver.execute(null, "CREATE TABLE offersSearch(\n  id INTEGER NOT NULL PRIMARY KEY,\n  offers_search_response BLOB NOT NULL,\n  expire_at_ms INTEGER,\n  last_updated INTEGER NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE offersSheet(\n  sheet_key BLOB NOT NULL PRIMARY KEY,\n  ttl_in_millis INTEGER,\n  offers_sheet_response BLOB NOT NULL,\n  offer_type TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE offlineConfig (\n  enabled INTEGER NOT NULL DEFAULT 0,\n  external_status_url TEXT,\n  attempted_payment_status_result BLOB,\n  offline_payment_status_result BLOB,\n  attempted_bill_status_result BLOB,\n  offline_bill_status_result BLOB,\n  attempted_cash_out_status_result BLOB,\n  offline_cash_out_status_result BLOB,\n  attempted_add_cash_status_result BLOB,\n  offline_add_cash_status_result BLOB,\n  retry_intervals BLOB,\n  error_cash_out_status_result BLOB,\n  error_add_cash_status_result BLOB,\n  offline_transfer_scenario_plan BLOB,\n  error_transfer_scenario_plan BLOB\n)", null);
            sqlDriver.execute(null, "CREATE TABLE orderedRewardToken (\n  token TEXT PRIMARY KEY\n)", null);
            sqlDriver.execute(null, "CREATE TABLE passwordInfo (\n    version INTEGER NOT NULL,\n    info_id INTEGER NOT NULL PRIMARY KEY\n)", null);
            sqlDriver.execute(null, "CREATE TABLE payment (\n  _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  token TEXT NOT NULL UNIQUE,\n  orientation TEXT NOT NULL,\n  role TEXT,\n  sender_id TEXT NOT NULL,\n  recipient_id TEXT NOT NULL,\n  state TEXT,\n  amount INTEGER,\n  amount_currency TEXT,\n  sender_amount BLOB,\n  recipient_amount BLOB,\n  created_at INTEGER NOT NULL DEFAULT 0,\n  updated_at INTEGER NOT NULL DEFAULT 0,\n  captured_at INTEGER NOT NULL DEFAULT 0,\n  refunded_at INTEGER NOT NULL DEFAULT 0,\n  paid_out_at INTEGER NOT NULL DEFAULT 0,\n  display_date INTEGER NOT NULL DEFAULT 0,\n  is_badged INTEGER NOT NULL DEFAULT 0,\n  render_data TEXT,\n  their_id TEXT NOT NULL,\n  outstanding_until INTEGER,\n  external_id TEXT,\n  boost_amount BLOB,\n  scheduled_for INTEGER DEFAULT NULL,\n  scheduled_payment_token TEXT DEFAULT NULL,\n  hidden_until INTEGER,\n  rollup_type TEXT DEFAULT NULL,\n  investment_order_type TEXT DEFAULT NULL,\n  payment_type TEXT DEFAULT NULL,\n  gifted_investment_entity_token TEXT DEFAULT NULL,\n  lending_loan_token TEXT DEFAULT NULL,\n  entity_id TEXT DEFAULT NULL,\n  associated_payment_token TEXT DEFAULT NULL,\n  sync_entity_version INTEGER DEFAULT NULL,\n  transaction_type TEXT DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE paymentHistoryConfig (\n  script_url TEXT DEFAULT NULL,\n  search_url TEXT DEFAULT NULL,\n  top_level_feed_payment_type_deny_list BLOB DEFAULT NULL,\n  loyalty_merchant_hidden_payment_types BLOB DEFAULT NULL,\n  automated_investment_payment_types BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE transfer_customer_ids(\n  id TEXT NOT NULL PRIMARY KEY\n)", null);
            sqlDriver.execute(null, "CREATE TABLE banking_transaction_customer_ids(\n  id TEXT NOT NULL PRIMARY KEY\n)", null);
            sqlDriver.execute(null, "CREATE TABLE lending_transaction_customer_ids(\n  id TEXT NOT NULL PRIMARY KEY\n)", null);
            sqlDriver.execute(null, "CREATE TABLE referral_customer_ids(\n  id TEXT NOT NULL PRIMARY KEY\n)", null);
            sqlDriver.execute(null, "CREATE TABLE pendingPayment (\n  external_id TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL,\n  retry_at INTEGER NOT NULL,\n  retry_count INTEGER NOT NULL DEFAULT 0,\n  request BLOB NOT NULL,\n  amount BLOB NOT NULL,\n  orientation TEXT NOT NULL,\n  succeeded INTEGER NOT NULL DEFAULT 0,\n  recipients INTEGER NOT NULL DEFAULT 1,\n  invest_payment_data BLOB DEFAULT NULL,\n  client_scenario TEXT DEFAULT NULL,\n  personalization BLOB DEFAULT NULL,\n  -- Only should be NULL for DB migration\n  ready_for_removal INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE pendingTransfer (\n  external_id TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL,\n  retry_at INTEGER NOT NULL,\n  retry_count INTEGER NOT NULL DEFAULT 0,\n  request BLOB NOT NULL,\n  succeeded INTEGER NOT NULL DEFAULT 0,\n  type TEXT DEFAULT NULL,\n  -- Only should be NULL for DB migration\n  ready_for_removal INTEGER DEFAULT NULL,\n  first_error_request_created_at INTEGER DEFAULT NULL,\n  first_error_response_created_at INTEGER DEFAULT NULL,\n  first_error_response_reason TEXT DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE physicalDepositUsAddressSearch (\n  identifier TEXT NOT NULL PRIMARY KEY,\n  created_at INTEGER NOT NULL DEFAULT 0,\n  formatted_address TEXT NOT NULL,\n  primary_text TEXT NOT NULL,\n  secondary_text TEXT,\n  latitude REAL,\n  longitude REAL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE paperDepositBarcodeInfo (\n  updated_at INTEGER DEFAULT NULL,\n  expires_at INTEGER DEFAULT NULL,\n  success BLOB DEFAULT NULL,\n  failure BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE popupMessage(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  placement TEXT,\n  image BLOB,\n  title TEXT,\n  subtitle TEXT,\n  primaryNavigationAction BLOB,\n  secondaryNavigationAction BLOB,\n  animation BLOB,\n  insertedAtUtc INTEGER NOT NULL,\n  priority INTEGER NOT NULL DEFAULT 1,\n  expiresAtUtc INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE profile (\n  profile_id TEXT NOT NULL PRIMARY KEY,\n  full_name TEXT,\n  photo_url TEXT,\n  require_passcode_confirmation INTEGER NOT NULL,\n  has_passcode INTEGER NOT NULL,\n  nearby_visibility TEXT NOT NULL,\n  cashtag TEXT,\n  cashtag_url TEXT,\n  cashtag_url_display_text TEXT,\n  cashtag_url_enabled INTEGER NOT NULL DEFAULT 0,\n  rate_plan TEXT NOT NULL,\n  can_upgrade_to_business INTEGER NOT NULL DEFAULT 0,\n  is_verified_account INTEGER NOT NULL,\n  app_message_notifications_enabled INTEGER NOT NULL DEFAULT 0,\n  verification_instrument_token TEXT,\n  deposit_preference TEXT,\n  address BLOB,\n  deposit_preference_data BLOB,\n  request_minimum_note_length INTEGER NOT NULL DEFAULT 0,\n  country_code TEXT,\n  default_currency TEXT NOT NULL,\n  customer_since INTEGER,\n  profile_token TEXT DEFAULT NULL,\n  incoming_request_policy TEXT DEFAULT NULL,\n  has_passed_idv INTEGER DEFAULT NULL,\n  cashtag_qr_image_url TEXT DEFAULT NULL,\n  cashtag_with_currency_symbol TEXT DEFAULT NULL,\n  available_p2p_target_regions BLOB DEFAULT NULL,\n  printable_cashtag_qr_image_url TEXT DEFAULT NULL,\n  region TEXT,\n  direct_deposit_account_enabled INTEGER NOT NULL DEFAULT 0,\n  bitcoin_display_units TEXT,\n  bitcoin_amount_entry_currency_preference TEXT DEFAULT NULL\n  -- TODO tax stuff?\n)", null);
            sqlDriver.execute(null, "CREATE TABLE profileAlias (\n  canonical_text TEXT PRIMARY KEY NOT NULL,\n  verified INTEGER NOT NULL,\n  type TEXT NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE promotedAppletTiles(\n  appletId TEXT NOT NULL PRIMARY KEY,\n  sortOrder INTEGER NOT NULL,\n  title TEXT,\n  subtitle TEXT,\n  image BLOB\n)", null);
            sqlDriver.execute(null, "CREATE TABLE promotionDetails(\n  token TEXT NOT NULL PRIMARY KEY,\n  promotionDetails BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE reactionConfig (\n  maxEmojisPerReaction INTEGER NOT NULL DEFAULT 0,\n  extendedReactions BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE recipientConfig (\n  pay_data BLOB DEFAULT NULL,\n  request_data BLOB DEFAULT NULL,\n  confirm_cashtag_recipient INTEGER NOT NULL DEFAULT 0\n)", null);
            sqlDriver.execute(null, "CREATE TABLE recipientRecommendation(\n  recommendation BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE recurring_preference(\n  entity_id TEXT NOT NULL PRIMARY KEY,\n  enabled INTEGER NOT NULL,\n  amount BLOB NOT NULL,\n  schedule BLOB NOT NULL,\n  next_reload_at INTEGER,\n  type TEXT NOT NULL,\n  investment_entity_token TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE reward (\n  token TEXT NOT NULL PRIMARY KEY,\n  category TEXT,\n  avatars BLOB,\n  title TEXT,\n  main_text TEXT,\n  program_detail_rows BLOB,\n  footer_text TEXT,\n  boost_detail_rows BLOB,\n  boost_attributes BLOB,\n  full_title_text TEXT,\n  expiration_date_time_ms INTEGER,\n  activation_date_time_ms INTEGER,\n  discount_text TEXT,\n  reward_selection_state BLOB,\n  draggable INTEGER NOT NULL DEFAULT 1,\n  affiliate_link_url TEXT,\n  user_agent TEXT,\n  offerly_token TEXT,\n  is_custom_offer INTEGER NOT NULL DEFAULT 0,\n  boost_detail_bottom_upsell BLOB DEFAULT NULL,\n  redeemable_with_cash_app_pay INTEGER NOT NULL DEFAULT 0,\n  redeemable_with_cash_card INTEGER NOT NULL DEFAULT 0,\n  app_links BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE rewardMerchant(\n  reward_token TEXT NOT NULL REFERENCES reward(token),\n  merchant_token TEXT NOT NULL,\n  merchant_name TEXT,\n  PRIMARY KEY (reward_token, merchant_token)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE rewardSelection (\n  token TEXT NOT NULL PRIMARY KEY,\n  reward_token TEXT NOT NULL,\n  version INTEGER NOT NULL,\n  reward_selection BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE rewardSlot (\n  token TEXT NOT NULL PRIMARY KEY,\n  state TEXT NOT NULL,\n  selected_reward_token TEXT REFERENCES selectedReward(token)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE rewardStatus (\n  id INTEGER NOT NULL PRIMARY KEY,\n  code_entry_enabled INTEGER NOT NULL,\n  minimum_code_length INTEGER NOT NULL,\n  reward_screen_enabled INTEGER NOT NULL,\n  reward_button_text TEXT,\n  reward_button_priority INTEGER NOT NULL,\n  reward_header_text TEXT,\n  reward_main_text TEXT,\n  completed_reward_payments INTEGER NOT NULL,\n  available_reward_payments INTEGER NOT NULL,\n  reward_payment_amount BLOB NOT NULL,\n  expiration TEXT,\n  code_entry_client_route TEXT,\n  referral_status_screen BLOB\n)", null);
            sqlDriver.execute(null, "CREATE TABLE savingsGoalLocalStatus(\n  token TEXT NOT NULL PRIMARY KEY,\n  met INTEGER NOT NULL DEFAULT 0,\n  celebration_shown INTEGER NOT NULL DEFAULT 0,\n  completion_token TEXT DEFAULT NULL,\n  last_seen_balance BLOB DEFAULT NULL,\n  last_seen_remaining_balance BLOB DEFAULT NULL,\n  last_seen_progress_bps INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE savingsTaxDocument(\n  document BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE scenarioPlan (\n  client_scenario TEXT NOT NULL,\n  scenario_plan BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE education_story_scene_data (\n  id INTEGER PRIMARY KEY AUTOINCREMENT,\n  scene_index INTEGER NOT NULL,\n  backgroundColor INTEGER,\n  storyId TEXT NOT NULL REFERENCES education_story ON DELETE CASCADE\n)", null);
            sqlDriver.execute(null, "CREATE TABLE entity_lookup (\n  fts_docid INTEGER PRIMARY KEY,\n  entity_id TEXT NOT NULL,\n  customer_id TEXT,\n  entity_type INTEGER NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE selectableReward (\n  reward_token TEXT NOT NULL REFERENCES reward(token)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE selectedReward (\n  token TEXT NOT NULL PRIMARY KEY,\n  reward_token TEXT NOT NULL REFERENCES reward(token)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE sheetMessage (\n  message_token TEXT PRIMARY KEY NOT NULL,\n  campaign_token TEXT,\n  is_badged INTEGER NOT NULL,\n  message_format BLOB NOT NULL,\n  inserted_at_utc INTEGER NOT NULL,\n  metadata_id TEXT,\n  priority INTEGER NOT NULL DEFAULT 1,\n  expiresAtUtc INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE shopInfoDetails(\n  id INTEGER NOT NULL PRIMARY KEY,\n  ttl_in_millis INTEGER NOT NULL,\n  shop_info_response BLOB NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE IF NOT EXISTS productsResultsSection(\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  type TEXT NOT NULL,\n  title BLOB,\n  subtitle BLOB,\n  layout TEXT,\n  message BLOB,\n  footerButton BLOB\n)", null);
            sqlDriver.execute(null, "CREATE TABLE IF NOT EXISTS productsResultsItem(\n  id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n  sectionId INTEGER NOT NULL REFERENCES productsResultsSection(id),\n  position INTEGER NOT NULL,\n  title BLOB,\n  subtitle BLOB,\n  captionLeft BLOB,\n  captionRight BLOB,\n  actionUrl TEXT,\n  picture BLOB,\n  metadata BLOB\n)", null);
            sqlDriver.execute(null, "CREATE TABLE IF NOT EXISTS productsResultsPaginationToken(\n  token TEXT\n)", null);
            sqlDriver.execute(null, "CREATE TABLE shoppingRecentSearches (\n  search_text TEXT PRIMARY KEY COLLATE NOCASE,\n  updated_at INTEGER NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE shoppingRecentlyViewed (\n  token TEXT PRIMARY KEY,\n  title TEXT,\n  light_image_url TEXT,\n  dark_image_url TEXT,\n  action_url TEXT,\n  updated_at INTEGER NOT NULL,\n  accent_color BLOB DEFAULT NULL,\n  subtitle TEXT,\n  type TEXT NOT NULL DEFAULT 'AP_STORE',\n  imageType TEXT NOT NULL DEFAULT 'AVATAR'\n)", null);
            sqlDriver.execute(null, "CREATE TABLE singleAccountHolderEligibility (\n  customerToken TEXT NOT NULL PRIMARY KEY,\n  nextRefreshAtMillis INTEGER NOT NULL,\n  moneyBtcApplet BLOB,\n  moneyTaxesApplet BLOB,\n  moneyFamiliesApplet BLOB,\n  moneyGlobalBorrowApplet BLOB,\n  moneyInvestingApplet BLOB,\n  moneyTabHomeDesignSystem BLOB,\n  cashCardTab BLOB,\n  cashOffersTab BLOB,\n  paymentSendAsGiftCard BLOB,\n  paymentSendAsBtc BLOB,\n  paymentSendAsStock BLOB,\n  paymentPersonalToC4b BLOB,\n  settingsTaxPasswordAuthApp BLOB,\n  settingsInvestTrustedContactApp BLOB,\n  accountSwitcher BLOB,\n  activityTreehouse BLOB,\n  documentsBtc BLOB,\n  documentsStock BLOB,\n  documentsTaxes BLOB,\n  dda_tab BLOB,\n  remittanceSend BLOB,\n  tapToPay BLOB,\n  sponsorEligible BLOB,\n  moneyEarningsApplet BLOB,\n  c4bPromotionVisibility BLOB,\n  moneybotVisibility BLOB,\n  personalizedAdsToggle BLOB,\n  poolsOnboardingVisibility BLOB,\n  workAppletVisibility BLOB,\n  nearbyPaymentFeatureVisibility BLOB,\n  bitcoinAutoInvest BLOB,\n  recurringP2pPaymentFeatureVisibility BLOB\n)", null);
            sqlDriver.execute(null, "CREATE TABLE stampsConfig (\n  stamps BLOB\n)", null);
            sqlDriver.execute(null, "CREATE TABLE education_story (\n  id TEXT PRIMARY KEY,\n  url TEXT NOT NULL,\n  slug TEXT NOT NULL,\n  title TEXT NOT NULL,\n  thumbnail TEXT,\n  primaryColor INTEGER,\n  published_at_millis INTEGER NOT NULL,\n  priority INTEGER NOT NULL DEFAULT 0\n)", null);
            sqlDriver.execute(null, "CREATE TABLE supportConfig (\n  privacy_policy_url TEXT DEFAULT NULL,\n  terms_of_service_url TEXT DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE sync_details (\n  rate_limited_time INTEGER DEFAULT NULL,\n  sync_token TEXT DEFAULT NULL,\n  detailed_sync_token TEXT DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE sync_entity (\n  entity_id TEXT NOT NULL,\n  type INTEGER NOT NULL,\n  entity BLOB NOT NULL,\n  entity_processor_version INTEGER DEFAULT 0,\n  sync_value_type INTEGER DEFAULT NULL,\n  sync_entity_version INTEGER DEFAULT NULL,\n  topic INTEGER NOT NULL DEFAULT -1,\n  PRIMARY KEY (entity_id, type)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE sync_pending_entity (\n  entity_id TEXT NOT NULL,\n  type INTEGER NOT NULL,\n  PRIMARY KEY (entity_id, type)\n)", null);
            sqlDriver.execute(null, "CREATE TABLE tooltipMessage(\n  messageToken TEXT PRIMARY KEY NOT NULL,\n  campaignToken TEXT,\n  isBadged INTEGER NOT NULL,\n  placement TEXT,\n  arrowPosition TEXT,\n  tooltip BLOB,\n  priority INTEGER NOT NULL DEFAULT 1,\n  expiresAtUtc INTEGER DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE treehouseAppConfig (\n  app_name TEXT DEFAULT NULL UNIQUE,\n  path TEXT DEFAULT NULL,\n  url TEXT DEFAULT NULL,\n  minimal_commit_timestamp TEXT DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE treehouseAppConfigurations(\n  id TEXT PRIMARY KEY,\n  endpoint_type TEXT,\n  last_qr_code_manifest_url TEXT,\n  last_qr_code_scanned_at INTEGER\n)", null);
            sqlDriver.execute(null, "CREATE TABLE userRewardsData (\n  new_to_boost INTEGER NOT NULL DEFAULT 0,\n  has_recently_used_boost INTEGER NOT NULL DEFAULT 0,\n  ytd_total_saving BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE webLoginConfig (\n  token TEXT DEFAULT NULL,\n  expires_at INTEGER DEFAULT 0\n)", null);
            sqlDriver.execute(null, "CREATE TABLE local_brand_collection (\n  response BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE local_cash_detail_content (\n  content BLOB DEFAULT NULL,\n  activity BLOB DEFAULT NULL,\n  how_it_works BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE TABLE local_fulfillment_configuration (\n  brand_token TEXT NOT NULL PRIMARY KEY,\n  type TEXT NOT NULL,\n  location_token TEXT,\n  current_scheduling_mode TEXT NOT NULL,\n  asap_fulfillment BLOB,\n  scheduled_fulfillment BLOB,\n  delivery_fee BLOB\n)", null);
            sqlDriver.execute(null, "CREATE TABLE local_market_screen (\n  tiles BLOB DEFAULT NULL,\n  expires_at INTEGER DEFAULT 0\n)", null);
            sqlDriver.execute(null, "CREATE TABLE local_tab_content (\n  response BLOB DEFAULT NULL\n)", null);
            sqlDriver.execute(null, "CREATE VIEW customerRelation AS\nSELECT CASE\n WHEN threaded_customer_id IS NULL THEN customer_id\n ELSE threaded_customer_id\nEND AS parent_id, customer_id AS child_id\nFROM customer", null);
            sqlDriver.execute(null, "CREATE VIEW activityRecipient AS\nSELECT\n  contact.display_name AS contact_display_name,\n  contact.lookup_key,\n  already_invited,\n  has_multiple_customers,\n  customer.customer_id,\n  customer.threaded_customer_id,\n  cashtag,\n  is_cash_customer,\n  is_verified,\n  is_business,\n  email,\n  sms,\n  photo,\n  customer_display_name,\n  group_concat(email) AS email_addresses,\n  group_concat(sms) AS sms_numbers,\n  can_accept_payments,\n  is_square,\n  coalesce(credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0) AS credit_card_fee,\n  blocked,\n  merchant_data,\n  customer.themed_accent_color,\n  customer.region,\n  customer.category,\n  customer.investment_entity_token,\n  customer.render_data\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nGROUP BY customer.customer_id", null);
            sqlDriver.execute(null, "CREATE VIEW recipients AS\nSELECT contact.display_name AS contact_display_name,\n       contact.lookup_key,\n       CASE already_invited WHEN 1 THEN 1\n         ELSE invite_entity_id IS NOT NULL END AS already_invited,\n       has_multiple_customers,\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer,\n       coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email,\n       customer_sms AS sms,\n       photo,\n       customer_display_name,\n       group_concat(email) AS email_addresses,\n       group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments,\n       coalesce(is_square, 0) AS is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       CASE WHEN recent_customer_id IS NOT NULL THEN 1\n                          ELSE 0 END AS is_recent\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON alias.hashed_alias = invite_hashed_alias\nLEFT JOIN (SELECT activityRecipient.customer_id AS recent_customer_id\n FROM activityRecipient\n JOIN payment ON (customer_id = their_id)\n WHERE can_accept_payments\n AND is_cash_customer\n GROUP BY customer_id HAVING display_date = max(display_date)\n ORDER BY display_date DESC) ON customer_id = recent_customer_id\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       invite_entity_id IS NOT NULL,\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       is_cash_customer,\n       is_verified,\n       is_business,\n       email,\n       sms,\n       photo,\n       customer_display_name,\n       email,\n       sms,\n       can_accept_payments,\n       is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       CASE WHEN recent_customer_id IS NOT NULL THEN 1\n          ELSE 0 END AS is_recent\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON contact_alias.hashed_alias = invite_hashed_alias\nLEFT JOIN (SELECT activityRecipient.customer_id AS recent_customer_id\n FROM activityRecipient\n JOIN payment ON (customer_id = their_id)\n WHERE can_accept_payments\n AND is_cash_customer\n GROUP BY customer_id HAVING display_date = max(display_date)\n ORDER BY display_date DESC) ON customer_id = recent_customer_id\nWHERE lookup_key IS NULL", null);
            sqlDriver.execute(null, "CREATE VIEW customer_contact AS\nSELECT DISTINCT lookup_key\nFROM contact_alias\nJOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND customer_id IS NOT NULL)\nGROUP BY lookup_key\nHAVING count(*) > 1", null);
            sqlDriver.execute(null, "CREATE VIEW merchantIds AS\nSELECT customer_id\nFROM customer\nWHERE merchant_data IS NOT NULL", null);
            sqlDriver.execute(null, "CREATE VIEW ownedHoldings AS\nSELECT *\nFROM investment_holding\nJOIN investment_entity USING (token)\nWHERE state = \"OWNED\"\nORDER BY invested_amount DESC", null);
            sqlDriver.execute(null, "CREATE VIEW loyaltyData AS\nSELECT cash_merchant_token, account_status_url, customer_phone_number, last_time_visited,\n       points_earned, program_rewards, loyalty_unit, program_details, loyalty_program_id, account_id\nFROM loyaltyAccount\nJOIN loyaltyProgram ON loyalty_program_id = program_id", null);
            sqlDriver.execute(null, "CREATE VIEW pending AS\nSELECT pendingPayment.external_id,\n       pendingPayment.request AS payment_request,\n       NULL AS transfer_request,\n       pendingPayment.created_at,\n       credit_card_fee_bps,\n       recipients,\n       NULL AS pending_reason\nFROM pendingPayment\nLEFT JOIN payment ON pendingPayment.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL\nUNION\nSELECT pendingTransfer.external_id,\n       NULL AS payment_request,\n       pendingTransfer.request AS transfer_request,\n       pendingTransfer.created_at,\n       credit_card_fee_bps,\n       1 AS recipients,\n       first_error_response_reason AS pending_reason\nFROM pendingTransfer\nLEFT JOIN payment ON pendingTransfer.external_id = payment.external_id\nLEFT JOIN instrumentLinkingConfig\nWHERE payment.external_id IS NULL", null);
            sqlDriver.execute(null, "CREATE VIEW payments_model AS\nSELECT\n  amount,\n  amount_currency,\n  entity_id,\n  token,\n  orientation,\n  role,\n  state,\n  payment.render_data AS payment_render_data,\n  sender.render_data AS sender_render_data,\n  recipient.render_data AS recipient_render_data,\n  recipient_id,\n  sender_id,\n  captured_at,\n  created_at,\n  their_id,\n  display_date,\n  _id,\n  sender_amount,\n  recipient_amount,\n  boost_amount,\n  paid_out_at,\n  refunded_at,\n  updated_at,\n  is_badged,\n  rollup_type,\n  investment_order_type,\n  payment_type,\n  gifted_investment_entity_token,\n  coalesce((outstanding_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_outstanding,\n  external_id,\n  (sender_id IN bitcoinTransactionCustomerIds OR recipient_id IN bitcoinTransactionCustomerIds) AS is_bitcoin,\n  coalesce((scheduled_for > strftime('%s', 'now') * 1000), 0) == 1 AS is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  coalesce((hidden_until > strftime('%s', 'now') * 1000), 0) == 1 AS is_hidden,\n  loyalty.render_data AS loyalty_render_data,\n  lending_loan_token,\n  associated_payment_token,\n  sync_entity_version,\n  transaction_type\nFROM payment\nJOIN customer AS sender ON (payment.sender_id = sender.customer_id)\nJOIN customer AS recipient ON (payment.recipient_id = recipient.customer_id)\nLEFT JOIN loyaltyProgram AS loyalty ON (payment.recipient_id = loyalty.cash_merchant_token)\nWHERE payment.render_data IS NOT NULL\n  AND sender.render_data IS NOT NULL\n  AND recipient.render_data IS NOT NULL", null);
            sqlDriver.execute(null, "CREATE VIEW externalIds AS\nSELECT * FROM transfer_customer_ids\nUNION SELECT * FROM banking_transaction_customer_ids\nUNION SELECT * FROM lending_transaction_customer_ids\nUNION SELECT * FROM referral_customer_ids\nUNION SELECT * FROM bitcoinTransactionCustomerIds", null);
            sqlDriver.execute(null, "CREATE VIEW completedPendingPayments AS\nSELECT pendingPayment.external_id\nFROM pendingPayment\nLEFT JOIN payment\nON pendingPayment.external_id = payment.external_id\nWHERE succeeded = 1 AND (payment.external_id IS NOT NULL OR ready_for_removal = 1)", null);
            sqlDriver.execute(null, "CREATE VIEW completedPendingTransfers AS\nSELECT pendingTransfer.external_id\nFROM pendingTransfer\nLEFT JOIN payment\nON pendingTransfer.external_id = payment.external_id\nWHERE succeeded = 1 AND (payment.external_id IS NOT NULL OR ready_for_removal = 1)", null);
            sqlDriver.execute(null, "CREATE VIEW recentRecipient AS\nSELECT contact.display_name AS contact_display_name,\n       contact.lookup_key,\n       CASE already_invited WHEN 1 THEN 1\n         ELSE invite_entity_id IS NOT NULL END AS already_invited,\n       has_multiple_customers,\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       coalesce(is_cash_customer, 0) AS is_cash_customer,\n       coalesce(is_verified, 0) AS is_verified,\n       coalesce(is_business, 0) AS is_business,\n       customer_email AS email,\n       customer_sms AS sms,\n       photo,\n       customer_display_name,\n       group_concat(email) AS email_addresses,\n       group_concat(sms) AS sms_numbers,\n       coalesce(can_accept_payments, 1) AS can_accept_payments,\n       coalesce(is_square, 0) AS is_square,\n       coalesce(credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       NULL AS reward_token\nFROM (\n  -- If an alias already has a customer, this query does not modify that row and returns the\n  -- customer/contact/alias info as is. If an alias is without a customer it will check its\n  -- contact for other aliases. If the contact has a different alias with a customer id,\n  -- the alias is now associated with that customer. If it does not have a different alias\n  -- with a customer id, the row remains unchanged.\n  SELECT alias.hashed_alias, contact_alias.lookup_key,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.email\n           ELSE customer_alias.email END\n         AS customer_email, alias.email,\n         CASE\n           WHEN alias.customer_id IS NOT NULL OR customer_alias.customer_id IS NULL THEN alias.sms\n           ELSE customer_alias.sms END\n         AS customer_sms, alias.sms,\n         coalesce(alias.customer_id, customer_alias.customer_id) AS customer_id\n  FROM alias\n  JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN (\n    -- Local contacts that have a customer associated with an alias.\n    SELECT alias.*, lookup_key\n    FROM contact_alias\n    JOIN alias ON (contact_alias.hashed_alias = alias.hashed_alias AND alias.customer_id IS NOT NULL)\n  ) AS customer_alias\n  ON (\n    -- If this alias has no customer id, check if there is a different alias for the same\n    -- contact that does have a customer id.\n    alias.customer_id IS NULL -- No customer id\n    AND contact_alias.lookup_key = customer_alias.lookup_key -- Same contact\n    AND contact_alias.hashed_alias <> customer_alias.hashed_alias -- Different alias\n  )\n) AS alias\nJOIN contact USING (lookup_key)\nLEFT JOIN customer USING (customer_id)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON alias.hashed_alias = invite_hashed_alias\nWHERE merchant_data IS NULL\nGROUP BY contact.lookup_key, coalesce(customer.customer_id, alias.hashed_alias)\n\nUNION ALL\n\n-- Customers without a local contact.\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       invite_entity_id IS NOT NULL,\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       cashtag,\n       is_cash_customer,\n       is_verified,\n       is_business,\n       email,\n       sms,\n       photo,\n       customer_display_name,\n       email,\n       sms,\n       can_accept_payments,\n       is_square,\n       coalesce(\n         credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       blocked,\n       merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       NULL   -- reward_token\nFROM customer\nLEFT JOIN alias USING (customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN (\n  SELECT entity_id AS invite_entity_id,\n         hashed_alias AS invite_hashed_alias\n  FROM invitationEntity\n) ON contact_alias.hashed_alias = invite_hashed_alias\nWHERE lookup_key IS NULL\nAND merchant_data IS NULL\nAND (can_accept_payments OR email IS NOT NULL OR sms IS NOT NULL)\n\nUNION ALL\n\n-- Customers that are merchants\nSELECT NULL, -- contact_display_name\n       NULL, -- lookup_key\n       0,    -- already_invited\n       0,    -- has_multiple_customers\n       customer.customer_id,\n       customer.threaded_customer_id,\n       customer.cashtag,\n       customer.is_cash_customer,\n       customer.is_verified,\n       customer.is_business,\n       NULL, -- email\n       NULL, -- sms\n       customer.photo,\n       customer.customer_display_name,\n       NULL, -- emails\n       NULL, -- sms(s)\n       customer.can_accept_payments,\n       customer.is_square,\n       coalesce(\n         customer.credit_card_fee, (SELECT credit_card_fee_bps FROM instrumentLinkingConfig), 0\n       ) AS credit_card_fee,\n       customer.blocked,\n       customer.merchant_data,\n       customer.themed_accent_color,\n       customer.region,\n       customer.category,\n       customer.joined_on,\n       reward_token\nFROM customer\nLEFT JOIN (\n  SELECT *\n  FROM rewardMerchant\n  GROUP BY merchant_token\n) ON customer.customer_id = merchant_token\nWHERE customer.merchant_data IS NOT NULL\nAND trim(customer.merchant_data) != \"\"\n-- De-duplicate merchants by verifying if a merchant is a parent merchant and not\n-- an orphaned child (data issue). We do this by checking if a merchant is linked to another\n-- merchant through `threaded_customer_id`. If an existing merchant is referenced through\n-- `threaded_customer_id` and it exists, then we include that merchant as part of this query\nAND customer.customer_id IN (\n  SELECT threaded_customer_id\n  FROM customer\n  WHERE merchant_data IS NOT NULL\n  AND threaded_customer_id IS NOT NULL\n)", null);
            sqlDriver.execute(null, "CREATE VIEW rewardWithSelection AS\nSELECT reward.*, rewardSelection.reward_selection\nFROM reward\nLEFT JOIN rewardSelection ON reward.token = rewardSelection.reward_token\nGROUP BY reward.token", null);
            sqlDriver.execute(null, "CREATE VIEW activityCustomer AS\nSELECT parent.photo, parent.themed_accent_color, parent.customer_id,\n       parent.is_business = 1 AS is_business,\n       coalesce(contact.display_name, parent.customer_display_name, parent.cashtag, email, sms, '') AS display_name,\n       parent.merchant_data, contact.lookup_key, email, sms, parent.blocked,\n       max(display_date, coalesce(last_time_visited, 0)) AS display_date,\n       0 = 1 AS is_loyalty_only, parent.can_accept_payments,\n       cash_merchant_token IS NOT NULL AS has_loyalty_data,\n       (their_id NOT IN (SELECT * FROM externalIds) AND\n         child.merchant_data IS NULL AND\n         child.investment_entity_token IS NULL\n       ) = 1 AS isRegular\nFROM payments_model\nJOIN customer child ON their_id = child.customer_id\nJOIN customerRelation ON (child.customer_id = customerRelation.child_id)\nJOIN customer parent ON (parent.customer_id = customerRelation.parent_id)\nLEFT JOIN alias ON (parent.customer_id = alias.customer_id)\nLEFT JOIN contact_alias USING (hashed_alias)\nLEFT JOIN contact USING (lookup_key)\nLEFT JOIN loyaltyData ON (parent.customer_id = cash_merchant_token)\nWHERE payment_type IS NULL\nOR payment_type NOT IN (SELECT payment_type FROM loyaltyHiddenPaymentTypes)\nGROUP BY parent.customer_id\nHAVING display_date = max(display_date)\n\nUNION ALL\n\nSELECT photo, themed_accent_color, customer_id, is_business = 1 AS is_business,\n       coalesce(customer_display_name, '') AS display_name, merchant_data, NULL, NULL, NULL,\n       blocked, last_time_visited AS display_date, 1 = 1 AS is_loyalty_only, can_accept_payments, 0 == 0,\n       0 = 1\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE customer_id NOT IN (\n  SELECT parent_id\n  FROM customerRelation\n  WHERE child_id IN (\n    SELECT their_id\n    FROM payments_model\n    WHERE payment_type IS NULL\n    OR payment_type NOT IN (SELECT payment_type FROM loyaltyHiddenPaymentTypes)\n  )\n)\n\nORDER BY display_date DESC", null);
            sqlDriver.execute(null, "CREATE VIEW cashActivity AS\nSELECT\n  their_id,\n  is_outstanding,\n  _id,\n  payment.token,\n  payment_render_data,\n  sender_render_data,\n  recipient_render_data,\n  loyalty_render_data,\n  state,\n  role,\n  amount,\n  amount_currency,\n  is_badged,\n  is_bitcoin,\n  is_scheduled,\n  scheduled_for,\n  scheduled_payment_token,\n  avatar.photo,\n  avatar.themed_accent_color,\n  avatar.lookup_key,\n  coalesce(display_name, customer_display_name, cashtag, email, sms) AS display_name,\n  avatar.merchant_data,\n  avatar.email,\n  avatar.sms,\n  avatar.threaded_customer_id,\n  avatar.is_cash_customer,\n  avatar.can_accept_payments,\n  avatar.is_business,\n  display_date,\n  itemizedReceipt.render_json AS receipt_render_data,\n  payment.rollup_type AS rollup_type,\n  payment.investment_order_type AS investment_order_type,\n  payment.payment_type AS payment_type,\n  payment.gifted_investment_entity_token AS gifted_investment_entity_token,\n  lending_loan_token,\n  associated_payment_token,\n  sync_entity_version,\n  loyaltyHiddenPaymentTypes.payment_type IS NOT NULL AS loyalty_activity,\n  (their_id NOT IN (SELECT * FROM externalIds) AND\n    merchant_data IS NULL AND\n    investment_entity_token IS NULL\n  ) AS isRegular,\n  is_hidden,\n  payment.orientation,\n  payment.transaction_type\nFROM payments_model AS payment\nLEFT JOIN itemizedReceipt ON payment.token = itemizedReceipt.transaction_token\nLEFT JOIN loyaltyHiddenPaymentTypes ON loyaltyHiddenPaymentTypes.payment_type = payment.payment_type\nJOIN (\n  SELECT\n    display_name,\n    themed_accent_color,\n    photo,\n    customer_display_name,\n    cashtag,\n    email,\n    sms,\n    threaded_customer_id,\n    merchant_data,\n    customer.is_cash_customer,\n    customer.can_accept_payments,\n    customer.is_business,\n    customer.customer_id,\n    contact.lookup_key,\n    investment_entity_token\n  FROM customer\n  LEFT JOIN alias USING (customer_id)\n  LEFT JOIN contact_alias USING (hashed_alias)\n  LEFT JOIN contact USING (lookup_key)\n) AS avatar\nON avatar.customer_id = their_id\nGROUP BY payment.token, avatar.customer_id\nORDER BY display_date DESC, payment.token DESC", null);
            sqlDriver.execute(null, "CREATE INDEX idx_analyticsMessage_timestamp ON analytics_message (recorded_at)", null);
            sqlDriver.execute(null, "CREATE INDEX idx_badgeGroup_tokenType\nON badgeGroup(external_token, item_type)", null);
            sqlDriver.execute(null, "CREATE TRIGGER removeBalanceDataWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM balanceData;\nEND", null);
            sqlDriver.execute(null, "CREATE INDEX contact_alias_lookup_key_index ON contact_alias (lookup_key)", null);
            sqlDriver.execute(null, "CREATE INDEX IF NOT EXISTS idx_profileDirectoryItem_section_id ON profileDirectoryItem (section_id)", null);
            sqlDriver.execute(null, "CREATE INDEX entity_in_category_entity_token_index ON entity_in_category(entity_token)", null);
            sqlDriver.execute(null, "CREATE TRIGGER removeInstrumentLinkingOptionWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM instrumentLinkingOption;\nEND", null);
            sqlDriver.execute(null, "CREATE TRIGGER investment_entity_search_insertion\nAFTER INSERT ON investment_entity\nBEGIN\n  INSERT OR REPLACE INTO investing_search (docid, content)\n  VALUES (new.rowid, new.symbol || ' ' || new.display_name);\nEND", null);
            sqlDriver.execute(null, "CREATE TRIGGER investment_entity_search_deletion\nAFTER DELETE ON investment_entity\nBEGIN\n  DELETE FROM investing_search\n  WHERE docid = old.rowid;\nEND", null);
            sqlDriver.execute(null, "CREATE INDEX investment_entity_token_index ON investment_entity(token)", null);
            sqlDriver.execute(null, "CREATE TRIGGER removeNotificationPreferenceWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM notificationPreference;\nEND", null);
            sqlDriver.execute(null, "CREATE TRIGGER deleteDuplicatePayments\nAFTER INSERT ON payment\nBEGIN\nDELETE FROM pendingPayment\nWHERE external_id IN completedPendingPayments;\nDELETE FROM pendingTransfer\nWHERE external_id IN completedPendingTransfers;\nEND", null);
            sqlDriver.execute(null, "CREATE INDEX activity_index\nON payment(display_date)", null);
            sqlDriver.execute(null, "CREATE INDEX sender_id_index\nON payment(sender_id)", null);
            sqlDriver.execute(null, "CREATE INDEX recipient_id_index\nON payment(recipient_id)", null);
            sqlDriver.execute(null, "CREATE INDEX payment_state_role_orientation_their_display_index\nON payment(state, role, orientation, their_id, display_date)", null);
            sqlDriver.execute(null, "CREATE INDEX payment_state_role_amount_currency_gifted_their_index\nON payment(state, role, amount_currency, gifted_investment_entity_token, their_id)", null);
            sqlDriver.execute(null, "CREATE TRIGGER deleteSuccessfulPayments\nAFTER UPDATE OF succeeded, ready_for_removal ON pendingPayment\nBEGIN\nDELETE FROM pendingPayment\nWHERE external_id IN completedPendingPayments;\nEND", null);
            sqlDriver.execute(null, "CREATE TRIGGER deleteSuccessfulTransfers\nAFTER UPDATE OF succeeded, ready_for_removal ON pendingTransfer\nBEGIN\nDELETE FROM pendingTransfer\nWHERE external_id IN completedPendingTransfers;\nEND", null);
            sqlDriver.execute(null, "CREATE TRIGGER removeProfileAliasWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM profileAlias;\nEND", null);
            sqlDriver.execute(null, "CREATE TRIGGER removeScenarioPlanWithProfile\nAFTER DELETE ON profile\nBEGIN\nDELETE FROM scenarioPlan;\nEND", null);
            sqlDriver.execute(null, "CREATE INDEX customer_id_index ON entity_lookup (customer_id)", null);
            sqlDriver.execute(null, "CREATE TRIGGER signOut\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM pendingPayment;\n  DELETE FROM pendingTransfer;\n  DELETE FROM crypto_statement;\n  DELETE FROM availableAccountStatement;\n\n  -- Clear investing tables\n  DELETE FROM investing_discovery;\n  DELETE FROM investing_search;\n  DELETE FROM investing_settings;\n  DELETE FROM investment_entity;\n  DELETE FROM investment_holding;\n  DELETE FROM investing_news_article;\n\n  DELETE FROM badge;\n  DELETE FROM badgeCount;\n  DELETE FROM badgeGroup;\n  DELETE FROM cardStudio;\n  DELETE FROM cardTabHeroState;\n  DELETE FROM cardCustomization;\n\n  -- Delete cached Discover content\n  DELETE FROM profileDirectoryConfig;\n  DELETE FROM profileDirectorySection;\n  DELETE FROM profileDirectoryItem;\n\n  -- Delete cached Offers tab content\n  DELETE FROM offersHome;\n  DELETE FROM offersCollectionDetail;\n  DELETE FROM offersSheet;\n  DELETE FROM offersSearch;\n  DELETE FROM offersRecentlyViewed;\n\n  DELETE FROM instrument;\n  DELETE FROM directDepositAccount;\n  -- Delete remote flags.\n  DELETE FROM featureFlags WHERE local = 0;\n  DELETE FROM extendedProfileDetails;\n  DELETE FROM shoppingRecentSearches;\n  DELETE FROM shoppingRecentlyViewed;\n  DELETE FROM shopInfoDetails;\n  DELETE FROM marketCapabilitiesConfig;\n  DELETE FROM customerStatementType;\n\n  DELETE FROM investing_state;\n  INSERT INTO investing_state (rowid) VALUES (NULL);\n\n  -- Delete Legal documents\n  DELETE FROM LegalDocument;\n\n  -- Delete pending app messages\n  DELETE FROM inlineMessage;\n  DELETE FROM inlineMessageV2;\n  DELETE FROM popupMessage;\n  DELETE FROM inAppNotificationMessage;\n  DELETE FROM fullScreenMessage;\n  DELETE FROM tooltipMessage;\n  DELETE FROM cardMessage;\n\n  -- Delete gps data and insert a single row into the empty table\n  DELETE FROM gpsConfig;\n  INSERT INTO gpsConfig (rowid) VALUES (NULL);\n\n  -- Delete afterpay applet data\n  DELETE FROM afterpayApplet;\n\n  -- Neighborhoods.\n  DELETE FROM local_tab_content;\n  INSERT INTO local_tab_content (response) VALUES (NULL);\n  DELETE FROM local_market_screen;\n  INSERT INTO local_market_screen (tiles, expires_at) VALUES (NULL, 0);\n  DELETE FROM local_cash_detail_content;\n  INSERT INTO local_cash_detail_content (activity, content) VALUES (NULL, NULL);\n  DELETE FROM local_brand_collection;\n  INSERT INTO local_brand_collection (response) VALUES (NULL);\n  DELETE FROM local_fulfillment_configuration;\nEND", null);
            sqlDriver.execute(null, "CREATE TRIGGER removeAppConfigWithProfile\nAFTER DELETE ON profile\nBEGIN\n  DELETE FROM bankingConfig;\n  INSERT INTO bankingConfig (rowid) VALUES (NULL);\n\n  DELETE FROM blockersConfig;\n  INSERT INTO blockersConfig(rowid) VALUES (NULL);\n\n  DELETE FROM cashLiteConfig;\n  INSERT INTO cashLiteConfig (rowid) VALUES (NULL);\n\n  DELETE FROM checkDepositConfig;\n  INSERT INTO checkDepositConfig (rowid) VALUES (NULL);\n\n  DELETE FROM cryptocurrencyConfig;\n  INSERT INTO cryptocurrencyConfig (rowid) VALUES (NULL);\n\n  DELETE FROM instrumentLinkingConfig;\n  INSERT INTO instrumentLinkingConfig (rowid) VALUES (NULL);\n\n  DELETE FROM invitationConfig;\n  INSERT INTO invitationConfig (rowid) VALUES (NULL);\n\n  DELETE FROM offlineConfig;\n  INSERT INTO offlineConfig(rowid) VALUES (NULL);\n\n  DELETE FROM paymentHistoryConfig;\n  DELETE FROM transfer_customer_ids;\n  DELETE FROM banking_transaction_customer_ids;\n  DELETE FROM lending_transaction_customer_ids;\n  DELETE FROM referral_customer_ids;\n  INSERT INTO paymentHistoryConfig(rowid) VALUES (NULL);\n\n  DELETE FROM reactionConfig;\n  INSERT INTO reactionConfig(rowid) VALUES (NULL);\n\n  DELETE FROM recipientConfig;\n  INSERT INTO recipientConfig (rowid) VALUES (NULL);\n\n  DELETE FROM stampsConfig;\n  INSERT INTO stampsConfig (rowid) VALUES (NULL);\n\n  DELETE FROM supportConfig;\n  INSERT INTO supportConfig(rowid) VALUES (NULL);\n\n  DELETE FROM webLoginConfig;\n  INSERT INTO webLoginConfig(rowid) VALUES (NULL);\n\n  DELETE FROM bitcoinTransactionCustomerIds;\n\n  DELETE FROM institutionsConfig;\n  INSERT INTO institutionsConfig (rowid) VALUES (NULL);\nEND", null);
            sqlDriver.execute(null, "CREATE INDEX IF NOT EXISTS education_story_slug ON education_story (slug)", null);
            sqlDriver.execute(null, "CREATE INDEX entity_processor_version_index ON sync_entity (entity_processor_version)", null);
            sqlDriver.execute(null, "CREATE INDEX sync_value_types ON sync_entity (sync_value_type)", null);
            sqlDriver.execute(null, "CREATE INDEX sync_entity_type_index ON sync_entity (type)", null);
            sqlDriver.execute(null, "INSERT INTO bankingConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO blockersConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO boostConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO cashLiteConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO checkDepositConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO clientRoutingConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO cryptocurrencyConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO gpsConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO institutionsConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO instrumentLinkingConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "CREATE VIRTUAL TABLE investing_search USING fts4(\n  content TEXT\n)", null);
            sqlDriver.execute(null, "INSERT INTO investing_state DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO invitationConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO lastSeenSavingsBalance DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO localizationConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO offlineConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO paymentHistoryConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO paperDepositBarcodeInfo DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO reactionConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO recipientConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "CREATE VIRTUAL TABLE entity_fts USING fts4 (\n  tokenize=simple X \"$ *&#%\\'\"\"\\/(){}\\[]|=+-_,:;<>-?!\\t\\r\\n\",\n  text_content TEXT\n)", null);
            sqlDriver.execute(null, "INSERT INTO stampsConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO supportConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO sync_details DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO userRewardsData DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO webLoginConfig DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO local_brand_collection DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO local_cash_detail_content DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO local_market_screen DEFAULT VALUES", null);
            sqlDriver.execute(null, "INSERT INTO local_tab_content DEFAULT VALUES", null);
            QueryResult.Companion.getClass();
            return QueryResult.Companion.Unit;
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final long getVersion() {
            switch (this.$r8$classId) {
                case 0:
                    return 8L;
                default:
                    return 863L;
            }
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final QueryResult.Value migrate(AndroidSqliteDriver androidSqliteDriver, long j, long j2, AfterVersion[] afterVersionArr) {
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    int length = afterVersionArr.length;
                    while (i < length) {
                        AfterVersion afterVersion = afterVersionArr[i];
                        long j3 = afterVersion.afterVersion;
                        if (j <= j3 && j3 < j2) {
                            arrayList.add(afterVersion);
                        }
                        i++;
                    }
                    for (AfterVersion afterVersion2 : CollectionsKt.sortedWith(arrayList, new b.C0008b(11))) {
                        m3519migrateInternalElmaSbI$2(androidSqliteDriver, j, afterVersion2.afterVersion + 1);
                        afterVersion2.block.invoke(androidSqliteDriver);
                        j = afterVersion2.afterVersion + 1;
                    }
                    if (j < j2) {
                        m3519migrateInternalElmaSbI$2(androidSqliteDriver, j, j2);
                    }
                    QueryResult.Companion.getClass();
                    break;
                default:
                    ArrayList arrayList2 = new ArrayList();
                    int length2 = afterVersionArr.length;
                    while (i < length2) {
                        AfterVersion afterVersion3 = afterVersionArr[i];
                        long j4 = afterVersion3.afterVersion;
                        if (j <= j4 && j4 < j2) {
                            arrayList2.add(afterVersion3);
                        }
                        i++;
                    }
                    for (AfterVersion afterVersion4 : CollectionsKt.sortedWith(arrayList2, new b.C0008b(10))) {
                        m3518migrateInternalElmaSbI$1(androidSqliteDriver, j, afterVersion4.afterVersion + 1);
                        afterVersion4.block.invoke(androidSqliteDriver);
                        j = afterVersion4.afterVersion + 1;
                    }
                    if (j < j2) {
                        m3518migrateInternalElmaSbI$1(androidSqliteDriver, j, j2);
                    }
                    QueryResult.Companion.getClass();
                    break;
            }
            return new QueryResult.Value(QueryResult.Companion.Unit);
        }
    }

    public CashAppDatabaseImpl(AndroidSqliteDriver androidSqliteDriver) {
        super(androidSqliteDriver);
        this.analyticsMessageQueries = new SessionQueries(androidSqliteDriver);
        this.sessionQueries = new SessionQueries(androidSqliteDriver);
        this.storageLinkQueries = new SessionQueries(androidSqliteDriver);
    }
}
